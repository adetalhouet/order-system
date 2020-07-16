package io.adetalhouet.order.system.db.lib

import org.flywaydb.core.Flyway
import org.flywaydb.core.api.FlywayException
import org.slf4j.LoggerFactory

class DatabaseMigrate(private val databaseConnectionProperties: DatabaseConnectionProperties) {
    private val log = LoggerFactory.getLogger(DatabaseMigrate::class.java)

    init {
        migrate()
    }

    private fun migrate() {
        log.info("Database migration started")
        val flyway = Flyway
            .configure()
            .baselineOnMigrate(true)
            .dataSource(databaseConnectionProperties.url,
                databaseConnectionProperties.username,
                databaseConnectionProperties.password)
            .load()
        try {
            flyway.migrate()
        } catch (e: FlywayException) {
            log.error("Database migration failed with error: ${e.message}", e)
            return
        }
        log.info("Database migration finished successfully")
    }
}
