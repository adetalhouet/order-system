package io.adetalhouet.order.system.order

import com.google.inject.AbstractModule
import io.adetalhouet.order.system.order.grpc.OrderServiceGrpcKt

class OrderServerModule : AbstractModule() {
    override fun configure() {
        bind(OrderServiceGrpcKt.OrderServiceCoroutineImplBase::class.java).toInstance(OrderServiceImpl())
    }
}