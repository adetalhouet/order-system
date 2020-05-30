package io.adetalhouet.order.system.order

import com.google.inject.Guice
import com.google.inject.Inject
import io.adetalhouet.order.system.db.lib.DatabaseConnectionConfiguration
import io.adetalhouet.order.system.nats.lib.NatsModule
import io.adetalhouet.order.system.nats.lib.NatsService

class OrderApp {

    @Inject
    lateinit var natsService: NatsService

    init {
        Guice.createInjector(OrderServerModule(), NatsModule())
        startApp()
    }

    private fun startApp() {
        DatabaseConnectionConfiguration("order-service")

        val port = 9092
        val server = OrderServer(port)
        server.start()
        server.blockUntilShutdown()
//        natsService.
    }
}