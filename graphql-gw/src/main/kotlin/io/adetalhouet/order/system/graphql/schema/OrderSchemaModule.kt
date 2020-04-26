package io.adetalhouet.order.system.graphql.schema

import com.google.api.graphql.rejoiner.Query
import com.google.api.graphql.rejoiner.SchemaModule
import com.google.common.util.concurrent.ListenableFuture
import io.adetalhouet.order.system.order.OrderServiceGrpc
import io.adetalhouet.order.system.order.OrderServiceGrpcKt
import io.adetalhouet.order.system.order.PlaceOrderRequest
import io.adetalhouet.order.system.order.TrackOrderByIdRequest
import io.adetalhouet.order.system.order.TrackOrderByIdResponse
import io.adetalhouet.order.system.utils.Status

class OrderSchemaModule : SchemaModule() {

    @Query("placeOrder")
    fun placeOrder(client: OrderServiceGrpc.OrderServiceFutureStub,
                           request: PlaceOrderRequest): ListenableFuture<Status>? {
        return client.placeOrder(request)
    }

    @Query("trackOrderById")
    fun trackOrderById(client: OrderServiceGrpc.OrderServiceFutureStub,
                               request: TrackOrderByIdRequest): ListenableFuture<TrackOrderByIdResponse>? {
        return client.trackOrderById(request)
    }

}