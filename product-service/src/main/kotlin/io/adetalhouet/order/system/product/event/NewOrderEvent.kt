package io.adetalhouet.order.system.product.event

import com.google.inject.Inject
import com.google.inject.name.Named
import io.adetalhouet.order.system.cart.grpc.CartId
import io.adetalhouet.order.system.cart.grpc.CartItems
import io.adetalhouet.order.system.cart.grpc.CartServiceGrpcKt
import io.adetalhouet.order.system.db.domain.Products
import io.adetalhouet.order.system.db.domain.toProduct
import io.adetalhouet.order.system.nats.lib.message.NatsMessage
import io.adetalhouet.order.system.nats.lib.message.NatsMessageStatus
import io.adetalhouet.order.system.nats.lib.message.receivedEmptyMessage
import io.adetalhouet.order.system.nats.lib.message.toByteArray
import io.adetalhouet.order.system.nats.lib.service.NatsService
import io.adetalhouet.order.system.order.grpc.Order
import io.nats.client.Message
import io.nats.client.MessageHandler
import kotlinx.coroutines.CoroutineName
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import org.jetbrains.exposed.sql.select
import kotlin.coroutines.CoroutineContext

class NewOrderEvent : MessageHandler, CoroutineScope {
    override val coroutineContext: CoroutineContext
        get() = CoroutineName("new-order-notification")

    @Inject
    @Named("Default")
    private lateinit var natsService: NatsService

    @Inject
    private lateinit var cartService: CartServiceGrpcKt.CartServiceCoroutineStub

    override fun onMessage(msg: Message?) {
        launch(Dispatchers.IO) {
            handleMessage(msg)
        }
    }

    private suspend fun handleMessage(msg: Message?) {
        if (msg == null || msg.data.isEmpty()) {
            natsService.publish(NatsService.Inbox.ORDER.name, receivedEmptyMessage())
            return
        }

        withContext(Dispatchers.IO) {
            val order = Order.newBuilder().mergeFrom(msg.data).build()
            val products = cartService.getProductsByCartId(CartId.newBuilder().setCartId(order.cartId).build())
            checkProductsAvailability(products)
            // decrementInventory
        }
    }

    private suspend fun checkProductsAvailability(products: CartItems) {
        products.cartItemsList?.forEach { item ->
            val product = Products.select { Products.id eq item.productId }.single().toProduct()
            if (item.quantity > product.quantity) {
                natsService.publish(NatsService.Inbox.ORDER.name,
                    NatsMessage(NatsMessageStatus.INSUFFISANT_QUANTITY,
                        "${product.name}: Only ${product.quantity} remaining.").toByteArray())
            }
        }
    }
}