package io.adetalhouet.order.system.product

import com.google.common.io.Resources
import com.google.inject.Guice
import com.google.protobuf.util.JsonFormat
import io.adetalhouet.order.system.cart.di.CartClientModule
import io.adetalhouet.order.system.db.lib.DatabaseModule
import io.adetalhouet.order.system.db.lib.DatabaseTransaction.dbQuery
import io.adetalhouet.order.system.nats.lib.di.NatsModule
import io.adetalhouet.order.system.nats.lib.service.NatsService
import io.adetalhouet.order.system.product.di.ProductServerModule
import io.adetalhouet.order.system.product.event.NewOrderEvent
import io.adetalhouet.order.system.product.grpc.Product
import io.adetalhouet.order.system.product.grpc.Products
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withContext
import org.jetbrains.exposed.sql.insert

fun main() = runBlocking<Unit> {
    val injector = Guice.createInjector(ProductServerModule(), CartClientModule(), DatabaseModule(),
        NatsModule())

    val db = injector.getInstance(DatabaseModule.DEFAULT_INSTANCE)
    db.connect()

    val nats = injector.getInstance(NatsService.DEFAULT_INSTANCE)
    val newOrderNotification = injector.getInstance(NewOrderEvent::class.java)
    val natsDispatcher = nats.createDispatcher(newOrderNotification)
    natsDispatcher.subscribe(NatsService.Inbox.PRODUCT.name)

    val products: MutableCollection<Product> =
        Resources.asByteSource(Resources.getResource("products.json")).asCharSource(Charsets.UTF_8)
            .openBufferedStream()
            .use { reader ->
                Products.newBuilder().apply {
                    JsonFormat.parser().merge(reader, this)
                }.build().productsList
            }

    products.forEach { p ->
        dbQuery {
            io.adetalhouet.order.system.db.domain.Products.insert {
                it[id] = p.id
                it[name] = p.name
                it[price] = p.price
                it[quantity] = p.quantity
                it[lastUpdatedMillis] = System.currentTimeMillis()
            }
        }
    }

    withContext(Dispatchers.IO) {
        val server = injector.getInstance(ProductServer::class.java)
        server.start()
        server.blockUntilShutdown()
    }
}