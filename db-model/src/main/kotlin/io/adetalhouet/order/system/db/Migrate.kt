package io.adetalhouet.order.system.db

import io.adetalhouet.order.system.db.utils.DatabaseConfiguration

fun main() {
    // Run DB migration when necessary (TBD K8S job)
    DatabaseConfiguration("db-migration-service").migrate()

// As we are using Exposed, which doesn't support Flyway natively,
// we have to create the model dump manually before letting the
// migration do its job; at least for the first time.
//    transaction {
//        SchemaUtils.create(Orders, Clients, Carts, CartItems, Products)
//    }
}