package io.adetalhouet.order.system.product

import com.google.inject.Guice
import com.google.inject.Inject
import io.adetalhouet.order.system.cart.di.CartClientModule
import io.nats.client.MessageHandler
import io.adetalhouet.order.system.db.lib.DatabaseConnectionConfiguration
import io.adetalhouet.order.system.nats.lib.NatsModule
import io.adetalhouet.order.system.nats.lib.NatsService
import io.adetalhouet.order.system.order.grpc.Order

class ProductApp {
    @Inject
    lateinit var natsService: NatsService

    init {
        Guice.createInjector(ProductModule(), NatsModule(), CartClientModule())
        startApp()
    }

    fun startApp() {
        DatabaseConnectionConfiguration("order-service")

        val port = 9093
        val server = ProductServer(port)
        server.start()
        server.blockUntilShutdown()

//        val messageHandler =
//        natsService.createDispatcher(messageHandler)

        natsService.subscribe(NatsService.Inbox.PRODUCT.name)
    }
}