package io.adetalhouet.order.system.order.di

import com.google.inject.AbstractModule
import io.adetalhouet.order.system.order.OrderServer
import io.adetalhouet.order.system.order.OrderServiceImpl
import io.adetalhouet.order.system.order.grpc.OrderServiceGrpcKt

class OrderServerModule : AbstractModule() {
    override fun configure() {
        bind(OrderServiceGrpcKt.OrderServiceCoroutineImplBase::class.java).toInstance(OrderServiceImpl())
        bind(OrderServer::class.java).toInstance(OrderServer())
    }
}
