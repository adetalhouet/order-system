package io.adetalhouet.order.system.db

import com.typesafe.config.Config
import com.typesafe.config.ConfigFactory
import io.adetalhouet.order.system.db.domain.Carts
import io.adetalhouet.order.system.db.domain.Clients
import io.adetalhouet.order.system.db.domain.Orders
import io.adetalhouet.order.system.db.domain.Products
import io.adetalhouet.order.system.db.lib.DatabaseMigrate
import io.adetalhouet.order.system.db.lib.defaultDatabaseConnection
import io.github.config4k.extract
import org.jetbrains.exposed.sql.SchemaUtils
import org.jetbrains.exposed.sql.transactions.transaction

fun main() {
    // Run DB migration when necessary (TBD K8S job)
    val conf: Config = ConfigFactory.load()
    defaultDatabaseConnection().connect()

// As we are using Exposed, which doesn't support Flyway natively,
// we have to create the model dump manually before letting the
// migration do its job; at least for the first time.
    transaction {
        SchemaUtils.create(Orders, Clients, Carts, Products)
    }
}
