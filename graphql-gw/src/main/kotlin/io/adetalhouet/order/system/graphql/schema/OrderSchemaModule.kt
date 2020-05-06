package io.adetalhouet.order.system.graphql.schema

import com.google.api.graphql.rejoiner.Query
import com.google.api.graphql.rejoiner.SchemaModule
import com.google.common.util.concurrent.ListenableFuture
import com.google.protobuf.Empty
import io.adetalhouet.order.system.order.grpc.Order
import io.adetalhouet.order.system.order.grpc.OrderServiceGrpc
import io.adetalhouet.order.system.order.grpc.TrackOrderByIdRequest
import io.adetalhouet.order.system.order.grpc.TrackOrderByIdResponse

class OrderSchemaModule : SchemaModule() {

    @Query("placeOrder")
    fun placeOrder(client: OrderServiceGrpc.OrderServiceFutureStub,
                   request: Order): ListenableFuture<Empty> {
        return client.placeOrder(request)
    }

    @Query("trackOrderById")
    fun trackOrderById(client: OrderServiceGrpc.OrderServiceFutureStub,
                       request: TrackOrderByIdRequest): ListenableFuture<TrackOrderByIdResponse>? {
        return client.trackOrderById(request)
    }

}