package io.adetalhouet.order.system.order

import com.google.protobuf.Empty
import io.adetalhouet.order.system.order.grpc.GetOrdersByClientRequest
import io.adetalhouet.order.system.order.grpc.Order
import io.adetalhouet.order.system.order.grpc.OrderServiceGrpcKt
import io.adetalhouet.order.system.order.grpc.Orders
import io.adetalhouet.order.system.order.grpc.TrackOrderByIdRequest
import io.adetalhouet.order.system.order.grpc.TrackOrderByIdResponse

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