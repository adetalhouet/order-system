package io.adetalhouet.order.system.db.utils

import com.typesafe.config.Config
import com.typesafe.config.ConfigFactory
import com.zaxxer.hikari.HikariConfig
import com.zaxxer.hikari.HikariDataSource
import io.grpc.Status
import io.grpc.StatusException
import org.flywaydb.core.Flyway
import org.flywaydb.core.api.FlywayException
import org.jetbrains.exposed.sql.Database
import org.jetbrains.exposed.sql.SqlLogger
import org.jetbrains.exposed.sql.Transaction
import org.jetbrains.exposed.sql.addLogger
import org.jetbrains.exposed.sql.statements.StatementContext
import org.jetbrains.exposed.sql.statements.expandArgs
import org.jetbrains.exposed.sql.transactions.experimental.newSuspendedTransaction
import org.slf4j.LoggerFactory

class DatabaseConfiguration {
    private val log = LoggerFactory.getLogger(DatabaseConfiguration::class.java)

    private val conf: Config = ConfigFactory.load()
    private val dbUsername = conf.getString("postgres.username")
    private val dbPassword = conf.getString("postgres.password")
    private var driverName: String
    private var dbUrl: String
    private val serviceName: String

    constructor(serviceName: String) : this(serviceName, "", "org.postgresql.Driver")

    constructor(serviceName: String, url: String, driver: String) {
        this.serviceName = serviceName
        this.dbUrl = if (url.isBlank()) conf.getString("postgres.url") else url
        this.driverName = driver
        Database.connect(hikari())
        log.info("$serviceName: Order System database connection started")
    }

    private fun hikari(): HikariDataSource {
        val config = HikariConfig().apply {
            driverClassName = driverName
            jdbcUrl = dbUrl
            username = dbUsername
            password = dbPassword
            isAutoCommit = false
            transactionIsolation = "TRANSACTION_REPEATABLE_READ"
        }
        config.validate()
        return HikariDataSource(config)
    }

    fun migrate() {
        log.info("$serviceName: Database migration started")
        val flyway = Flyway
            .configure()
            .baselineOnMigrate(true)
            .dataSource(dbUrl, dbUsername, dbPassword)
            .load()
        try {
            flyway.migrate()
        } catch (e: FlywayException) {
            log.error("$serviceName: Database migration failed with error: ${e.message}", e)
            return
        }
        log.info("$serviceName: Database migration finished successfully")
    }
}

object DatabaseFactory {

    private val log = LoggerFactory.getLogger(DatabaseFactory::class.java)

    suspend fun <T> dbQuery(block: () -> T): T = newSuspendedTransaction {
        addLogger(SqlLogger(block.javaClass.name))
        block()
    }

    object Grpc {
        @Throws(StatusException::class)
        suspend fun <T> dbQuery(block: () -> T): T = newSuspendedTransaction {
            addLogger(SqlLogger(block.javaClass.name))

            try {
                block()
            } catch (e: Exception) {
                log.error("SQL(id=${this.id}) failed", e)
                throw StatusException(Status.INTERNAL.withDescription("Fail to perform database transaction(id= ${this.id})"))
            }
        }
    }
}

private class SqlLogger(name: String) : SqlLogger {
    private val log = LoggerFactory.getLogger(name)

    override
    fun log(context: StatementContext, transaction: Transaction) {
        log.info("SQL(id=${transaction.id}): ${context.expandArgs(transaction)}")
    }
}