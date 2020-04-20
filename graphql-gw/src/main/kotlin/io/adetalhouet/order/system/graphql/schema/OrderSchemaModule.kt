package io.adetalhouet.order.system.graphql.schema

import com.google.api.graphql.rejoiner.Query
import com.google.api.graphql.rejoiner.SchemaModule
import io.adetalhouet.order.system.order.OrderServiceGrpcKt
import io.adetalhouet.order.system.order.PlaceOrderRequest
import io.adetalhouet.order.system.order.TrackOrderByIdRequest
import io.adetalhouet.order.system.order.TrackOrderByIdResponse
import io.adetalhouet.order.system.utils.Status

class OrderSchemaModule : SchemaModule() {

    @Query("placeOrder")
    suspend fun placeOrder(client: OrderServiceGrpcKt.OrderServiceCoroutineStub, request: PlaceOrderRequest): Status {
        return client.placeOrder(request)
    }

    @Query("trackOrderById")
    suspend fun trackOrderById(client: OrderServiceGrpcKt.OrderServiceCoroutineStub,
                               request: TrackOrderByIdRequest): TrackOrderByIdResponse {
        return client.trackOrderById(request)
    }

}