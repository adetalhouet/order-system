package io.adetalhouet.order.system.db.lib

import com.typesafe.config.Config
import com.typesafe.config.ConfigFactory
import com.zaxxer.hikari.HikariDataSource
import io.github.config4k.extract
import org.jetbrains.exposed.sql.Database

internal fun defaultDatabaseConnection(): DatabaseService {
    val conf: Config = ConfigFactory.load()
    return DatabaseServiceImpl(conf.extract("postgres"))
}

interface DatabaseService {
    fun connect() {
        Database.connect(dataSource())
    }

    fun dataSource(): HikariDataSource
}

