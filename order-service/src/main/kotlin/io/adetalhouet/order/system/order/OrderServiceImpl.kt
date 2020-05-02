package io.adetalhouet.order.system.order

import com.google.protobuf.Empty

class OrderServiceImpl : OrderServiceGrpcKt.OrderServiceCoroutineImplBase() {

    override suspend fun placeOrder(request: Order): Empty {
        return super.placeOrder(request)
    }

    override suspend fun trackOrderById(request: TrackOrderByIdRequest): TrackOrderByIdResponse {
        return super.trackOrderById(request)
    }

    override suspend fun getOrdersByClient(request: GetOrdersByClientRequest): Orders {
        return super.getOrdersByClient(request)
    }
}