package io.adetalhouet.order.system.utils.db

import com.zaxxer.hikari.HikariConfig
import com.zaxxer.hikari.HikariDataSource
import org.jetbrains.exposed.sql.Database
import org.jetbrains.exposed.sql.transactions.experimental.newSuspendedTransaction
import org.slf4j.LoggerFactory

class DatabaseConfiguration {

    private val dbUrl = System.getenv("DB_URL")
    private val dbUser = System.getenv("DB_USER")
    private val dbPassword = System.getenv("DB_PASSWORD")

    private val log = LoggerFactory.getLogger(DatabaseConfiguration::class.java)

    init {
        log.info("STARTED")
        Database.connect(hikari())
    }

    private fun hikari(): HikariDataSource {
        val config = HikariConfig().apply {
            driverClassName = "com.mysql.cj.jdbc.Driver"
            jdbcUrl = dbUrl
            username = dbUser
            password = dbPassword
            isAutoCommit = false
            transactionIsolation = "TRANSACTION_REPEATABLE_READ"
        }
        config.validate()
        return HikariDataSource(config)
    }
}

object DatabaseFactory {
    suspend fun <T> dbQuery(block: () -> T): T = newSuspendedTransaction { block() }
}
