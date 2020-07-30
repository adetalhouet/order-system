package io.adetalhouet.order.system.order.di

import com.google.inject.AbstractModule
import com.typesafe.config.Config
import com.typesafe.config.ConfigFactory
import io.adetalhouet.order.system.order.grpc.OrderServiceGrpc
import io.adetalhouet.order.system.order.grpc.OrderServiceGrpcKt
import io.grpc.ManagedChannelBuilder

class OrderClientModule : AbstractModule() {
    override fun configure() {
        val conf: Config = ConfigFactory.load()
        val channel = ManagedChannelBuilder
            .forAddress(conf.getString("order.url"), conf.getString("order.port").toInt())
            .usePlaintext()
            .build()
        bind(OrderServiceGrpc.OrderServiceFutureStub::class.java)
            .toInstance(OrderServiceGrpc.newFutureStub(channel))
        bind(OrderServiceGrpcKt.OrderServiceCoroutineStub::class.java)
            .toInstance(OrderServiceGrpcKt.OrderServiceCoroutineStub(channel))
    }
}
