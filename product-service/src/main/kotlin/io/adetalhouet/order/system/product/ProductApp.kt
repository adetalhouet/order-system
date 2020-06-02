package io.adetalhouet.order.system.product

import com.google.inject.Guice
import io.adetalhouet.order.system.cart.di.CartClientModule
import io.adetalhouet.order.system.db.lib.DatabaseModule
import io.adetalhouet.order.system.nats.lib.NatsModule
import io.adetalhouet.order.system.nats.lib.NatsService
import io.adetalhouet.order.system.product.di.ProductServerModule

fun main() {
    val injector = Guice.createInjector(ProductServerModule(), CartClientModule(), DatabaseModule(), NatsModule())

    val db = injector.getInstance(DatabaseModule.DEFAULT_INSTANCE)
    db.connect()

    val server = injector.getInstance(ProductServer::class.java)
    server.start()

    val nats = injector.getInstance(NatsService.DEFAULT_INSTANCE)

//    val messageHandler = nats.createDispatcher(messageHandler)
    nats.subscribe(NatsService.Inbox.PRODUCT.name)

    server.blockUntilShutdown()
}