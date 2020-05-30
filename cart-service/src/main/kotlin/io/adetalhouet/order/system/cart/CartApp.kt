package io.adetalhouet.order.system.cart

import com.google.inject.Guice
import io.adetalhouet.order.system.cart.di.CartServerModule
import io.adetalhouet.order.system.db.lib.DatabaseConnectionConfiguration
import io.adetalhouet.order.system.nats.lib.NatsModule

class CartApp {

    init {

        Guice.createInjector(CartServerModule(), NatsModule())
        val server = CartServer()
        server.start()

        DatabaseConnectionConfiguration("cart-service")

        server.blockUntilShutdown()
    }
}