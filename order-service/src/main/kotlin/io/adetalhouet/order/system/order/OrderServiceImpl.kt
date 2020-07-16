package io.adetalhouet.order.system.order

import com.google.inject.Inject
import com.google.inject.name.Named
import io.adetalhouet.order.system.db.domain.Orders
import io.adetalhouet.order.system.db.domain.toOrder
import io.adetalhouet.order.system.db.domain.toOrders
import io.adetalhouet.order.system.db.lib.DatabaseTransaction.dbQuery
import io.adetalhouet.order.system.nats.lib.NatsInbox
import io.adetalhouet.order.system.nats.lib.message.NatsMessageStatus
import io.adetalhouet.order.system.nats.lib.message.toNatsMessage
import io.adetalhouet.order.system.nats.lib.service.NatsService
import io.adetalhouet.order.system.order.grpc.GetOrdersByClientRequest
import io.adetalhouet.order.system.order.grpc.Order
import io.adetalhouet.order.system.order.grpc.OrderId
import io.adetalhouet.order.system.order.grpc.OrderServiceGrpcKt
import io.adetalhouet.order.system.order.grpc.TrackOrderByIdResponse
import io.grpc.Status
import io.grpc.StatusException
import org.jetbrains.exposed.sql.insert
import org.jetbrains.exposed.sql.select
import io.adetalhouet.order.system.order.grpc.Orders as ClientOrderList

class OrderServiceImpl : OrderServiceGrpcKt.OrderServiceCoroutineImplBase() {

    companion object {
        private const val TIMEOUT = 10000L
    }

    @Inject
    @Named("Default")
    private lateinit var natsService: NatsService

    override suspend fun placeOrder(request: Order): OrderId = dbQuery {

        // TODO add client validation

        validateInventoryOrThrow(request)

        val id = Orders.insert {
            it[clientId] = request.clientId
            it[cartId] = request.cartId
            it[state] = Order.State.PLACED
            it[dateCreatedMillis] = System.currentTimeMillis()
        }[Orders.id]

        OrderId.newBuilder().setId(id).build()
    }

    override suspend fun trackOrderById(request: OrderId): TrackOrderByIdResponse = dbQuery {
        val order = Orders.select { Orders.id eq request.id }.single().toOrder()
        TrackOrderByIdResponse.newBuilder().setId(request.id).setOrder(order).build()
    }

    override suspend fun getOrdersByClient(request: GetOrdersByClientRequest): ClientOrderList = dbQuery {
        Orders.select { Orders.clientId eq request.clientId }.map { it.toOrder() }.toList().toOrders()
    }

    @Suppress("ThrowsCount")
    private fun validateInventoryOrThrow(request: Order) {
        val message = natsService.requestAndGetOneReply(NatsInbox.PRODUCT.name, request.toByteArray(), TIMEOUT)
        val domainMessage = message.toNatsMessage()
        when (domainMessage.status) {
            NatsMessageStatus.SUCCESS -> return
            NatsMessageStatus.FAILURE -> throw StatusException(Status.INTERNAL.withDescription(domainMessage.message))
            NatsMessageStatus.INVALID -> throw StatusException(Status.INVALID_ARGUMENT.withDescription(
                domainMessage.message))
            NatsMessageStatus.INSUFFISANT_QUANTITY -> throw StatusException(Status.FAILED_PRECONDITION.withDescription(
                domainMessage.message))
        }
    }
}
