package io.adetalhouet.order.system.db.lib

import com.zaxxer.hikari.HikariConfig
import com.zaxxer.hikari.HikariDataSource
import org.slf4j.LoggerFactory

class DatabaseServiceImpl(private val databaseConnectionProperties: DatabaseConnectionProperties) :
    DatabaseService {
    private val log = LoggerFactory.getLogger(DatabaseServiceImpl::class.java)

    override fun dataSource(): HikariDataSource {
        log.info("Starting database connection")
        val config = HikariConfig().apply {
            driverClassName = databaseConnectionProperties.driverName
            jdbcUrl = databaseConnectionProperties.url
            username = databaseConnectionProperties.username
            password = databaseConnectionProperties.password
            isAutoCommit = false
            transactionIsolation = "TRANSACTION_REPEATABLE_READ"
        }
        config.validate()
        return HikariDataSource(config)
    }

}