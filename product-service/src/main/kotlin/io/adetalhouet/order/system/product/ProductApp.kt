package io.adetalhouet.order.system.product

import com.google.inject.Guice
import io.adetalhouet.order.system.cart.di.CartClientModule
import io.adetalhouet.order.system.db.lib.DatabaseModule
import io.adetalhouet.order.system.nats.lib.NatsInbox
import io.adetalhouet.order.system.nats.lib.di.NatsModule
import io.adetalhouet.order.system.nats.lib.service.NatsService
import io.adetalhouet.order.system.product.di.ProductServerModule
import io.adetalhouet.order.system.product.event.NewOrderEventHandler
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withContext

fun main() = runBlocking {
    val injector = Guice.createInjector(ProductServerModule(), CartClientModule(), DatabaseModule(),
        NatsModule())

    val db = injector.getInstance(DatabaseModule.DEFAULT_INSTANCE)
    db.connect()

    val nats = injector.getInstance(NatsService.DEFAULT_INSTANCE)
    val newOrderEventHandler = injector.getInstance(NewOrderEventHandler::class.java)
    val natsDispatcher = nats.createDispatcher(newOrderEventHandler)
    natsDispatcher.subscribe(NatsInbox.PRODUCT.name)

    withContext(Dispatchers.IO) {
        val server = injector.getInstance(ProductServer::class.java)
        server.start()
    }
}
