package io.adetalhouet.order.system.graphql.schema

import com.google.api.graphql.rejoiner.Query
import com.google.api.graphql.rejoiner.SchemaModule
import com.google.common.util.concurrent.ListenableFuture
import io.adetalhouet.order.system.graphql.mustBeSet
import io.adetalhouet.order.system.graphql.returnFailedFutureOnException
import io.adetalhouet.order.system.order.grpc.Order
import io.adetalhouet.order.system.order.grpc.OrderId
import io.adetalhouet.order.system.order.grpc.OrderServiceGrpc
import io.adetalhouet.order.system.order.grpc.TrackOrderByIdResponse

class OrderSchemaModule : SchemaModule() {

    @Query("placeOrder")
    fun placeOrder(client: OrderServiceGrpc.OrderServiceFutureStub,
                   request: Order): ListenableFuture<OrderId> = returnFailedFutureOnException {
        checkNotNull(request.clientId) { "Client ID".mustBeSet() }
        checkNotNull(request.cartId) { "Cart ID".mustBeSet() }
        client.placeOrder(request)
    }

    @Query("trackOrderById")
    fun trackOrderById(client: OrderServiceGrpc.OrderServiceFutureStub,
                       request: OrderId): ListenableFuture<TrackOrderByIdResponse>? =
        returnFailedFutureOnException {
            checkNotNull(request.id) { "Order ID".mustBeSet() }
            client.trackOrderById(request)
        }

}