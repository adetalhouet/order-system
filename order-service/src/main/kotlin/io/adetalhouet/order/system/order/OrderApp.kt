package io.adetalhouet.order.system.order

import com.google.inject.Guice
import io.adetalhouet.order.system.db.lib.DatabaseModule
import io.adetalhouet.order.system.nats.lib.NatsModule
import io.adetalhouet.order.system.order.di.OrderServerModule

fun main() {
    val injector = Guice.createInjector(OrderServerModule(), DatabaseModule(), NatsModule())

    val db = injector.getInstance(DatabaseModule.DEFAULT_INSTANCE)
    db.connect()

    val server = injector.getInstance(OrderServer::class.java)
    server.start()
    server.blockUntilShutdown()
}