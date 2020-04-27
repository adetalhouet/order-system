package io.adetalhouet.order.system.utils.db

import com.typesafe.config.Config
import com.typesafe.config.ConfigFactory
import com.zaxxer.hikari.HikariConfig
import com.zaxxer.hikari.HikariDataSource
import org.jetbrains.exposed.sql.Database
import org.jetbrains.exposed.sql.SqlLogger
import org.jetbrains.exposed.sql.Transaction
import org.jetbrains.exposed.sql.addLogger
import org.jetbrains.exposed.sql.statements.StatementContext
import org.jetbrains.exposed.sql.statements.expandArgs
import org.jetbrains.exposed.sql.transactions.experimental.newSuspendedTransaction
import org.slf4j.LoggerFactory

class DatabaseConfiguration(serviceName: String) {
    private val log = LoggerFactory.getLogger(DatabaseConfiguration::class.java)

    init {
        log.info("$serviceName: Order System database connection started")
        Database.connect(hikari())
    }

    private fun hikari(): HikariDataSource {
        val conf: Config = ConfigFactory.load()

        val config = HikariConfig().apply {
            driverClassName = "org.postgresql.Driver"
            jdbcUrl = conf.getString("postgres.url")
            username = conf.getString("postgres.username")
            password = conf.getString("postgres.password")
            isAutoCommit = false
            transactionIsolation = "TRANSACTION_REPEATABLE_READ"
        }
        config.validate()
        return HikariDataSource(config)
    }
}

object DatabaseFactory {
    suspend fun <T> dbQuery(block: () -> T): T = newSuspendedTransaction {
        addLogger(SqlLogger(block.javaClass.name))
        block()
    }
}

private class SqlLogger(private val name: String) : SqlLogger {
    private val log = LoggerFactory.getLogger(name)

    override
    fun log(context: StatementContext, transaction: Transaction) {
        log.info("SQL: ${context.expandArgs(transaction)}")
    }
}

