package io.adetalhouet.order.system.order

import com.google.inject.Inject
import com.google.inject.name.Named
import com.google.protobuf.Empty
import io.adetalhouet.order.system.db.domain.Orders
import io.adetalhouet.order.system.db.domain.toOrder
import io.adetalhouet.order.system.db.domain.toOrders
import io.adetalhouet.order.system.db.lib.DatabaseTransaction.dbQuery
import io.adetalhouet.order.system.nats.lib.message.dataAsString
import io.adetalhouet.order.system.nats.lib.service.NatsService
import io.adetalhouet.order.system.order.grpc.GetOrdersByClientRequest
import io.adetalhouet.order.system.order.grpc.Order
import io.adetalhouet.order.system.order.grpc.OrderServiceGrpcKt
import io.adetalhouet.order.system.order.grpc.Orders as ClientOrderList
import io.adetalhouet.order.system.order.grpc.TrackOrderByIdRequest
import io.adetalhouet.order.system.order.grpc.TrackOrderByIdResponse
import org.jetbrains.exposed.sql.insert
import org.jetbrains.exposed.sql.select

class OrderServiceImpl : OrderServiceGrpcKt.OrderServiceCoroutineImplBase() {

    @Inject
    @Named("Default")
    private lateinit var natsService: NatsService

    override suspend fun placeOrder(request: Order): Empty {

        val REQUEST_TIMEOUT_MILLIS = 30_000L

        // send message to product service to decrease inventory of product
        val inventoryResponse = natsService.requestAndGetOneReply(NatsService.Inbox.PRODUCT.name,
            request.toByteArray(),
            REQUEST_TIMEOUT_MILLIS)
        inventoryResponse.dataAsString()

        dbQuery {
            Orders.insert {
                it[id] = request.id
                it[clientId] = request.clientId
                it[cartId] = request.cartId
                it[state] = Order.State.PLACED
                it[dateCreatedMillis] = System.currentTimeMillis()
            }
        }

        return Empty.getDefaultInstance()
    }

    override suspend fun trackOrderById(request: TrackOrderByIdRequest): TrackOrderByIdResponse = dbQuery {
        val order = Orders.select { Orders.id eq request.id }.single().toOrder()
        TrackOrderByIdResponse.newBuilder().setId(request.id).setOrder(order).build()
    }

    override suspend fun getOrdersByClient(request: GetOrdersByClientRequest): ClientOrderList = dbQuery {
        Orders.select { Orders.clientId eq request.clientId }.map { it.toOrder() }.toList().toOrders()
    }
}