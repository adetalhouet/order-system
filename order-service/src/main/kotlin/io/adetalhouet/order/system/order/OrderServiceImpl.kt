package io.adetalhouet.order.system.order

import io.adetalhouet.order.system.utils.Status

class OrderServiceImpl : OrderServiceGrpcKt.OrderServiceCoroutineImplBase() {

    override suspend fun placeOrder(request: PlaceOrderRequest): Status {
        return super.placeOrder(request)
    }

    override suspend fun trackOrderById(request: TrackOrderByIdRequest): TrackOrderByIdResponse {
        return super.trackOrderById(request)
    }

    override suspend fun getOrdersByClient(request: GetOrdersByClientRequest): Orders {
        return super.getOrdersByClient(request)
    }
}