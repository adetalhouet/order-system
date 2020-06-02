package io.adetalhouet.order.system.cart

import com.google.inject.Guice
import io.adetalhouet.order.system.cart.di.CartServerModule
import io.adetalhouet.order.system.db.lib.DatabaseModule

fun main() {
    val injector = Guice.createInjector(CartServerModule(), DatabaseModule())

    val db = injector.getInstance(DatabaseModule.DEFAULT_INSTANCE)
    db.connect()

    val server = injector.getInstance(CartServer::class.java)
    server.start()
    server.blockUntilShutdown()
}
