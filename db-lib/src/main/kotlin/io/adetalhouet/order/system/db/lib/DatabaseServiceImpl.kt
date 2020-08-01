package io.adetalhouet.order.system.db.lib

import com.zaxxer.hikari.HikariConfig
import com.zaxxer.hikari.HikariDataSource
import org.slf4j.LoggerFactory

class DatabaseServiceImpl(private val databaseConnectionProperties: DatabaseConnectionProperties) :
    DatabaseService {
    private val log = LoggerFactory.getLogger(DatabaseServiceImpl::class.java)

    override fun dataSource(): HikariDataSource {
        log.info("Starting database connection")

        val usernameV: String = System.getenv("DB_USERNAME") ?: databaseConnectionProperties.username
        val passwordV: String = System.getenv("DB_PASSWORD") ?: databaseConnectionProperties.password

        val config = HikariConfig().apply {
            driverClassName = databaseConnectionProperties.driverName
            jdbcUrl = databaseConnectionProperties.url
            username = usernameV
            password = passwordV
            isAutoCommit = false
            transactionIsolation = "TRANSACTION_REPEATABLE_READ"
        }
        config.validate()
        return HikariDataSource(config)
    }

}
