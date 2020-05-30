package io.adetalhouet.order.system.product

import com.google.inject.Inject
import io.adetalhouet.order.system.cart.grpc.CartServiceGrpc
import io.adetalhouet.order.system.nats.lib.NatsMessage.receivedEmptyMessage
import io.adetalhouet.order.system.nats.lib.NatsService
import io.adetalhouet.order.system.order.grpc.Order
import io.nats.client.Message
import io.nats.client.MessageHandler

class NewOrderNotification : MessageHandler {

    @Inject
    private lateinit var natsService: NatsService

    @Inject
    private lateinit var cartService: CartServiceGrpc.CartServiceImplBase

    override fun onMessage(msg: Message?) {

        if (msg == null || msg.data.isEmpty()) {
            natsService.publish(NatsService.Inbox.ORDER.name, receivedEmptyMessage())
            return
        }

        val order = Order.newBuilder().mergeFrom(msg.data).build()

        //        cartService.getProductByCartId order.cartId
    }

}