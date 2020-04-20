package io.adetalhouet.order.system.graphql.di

import com.google.inject.AbstractModule
import io.adetalhouet.order.system.client.ClientServiceGrpcKt
import io.adetalhouet.order.system.order.OrderServiceGrpc
import io.adetalhouet.order.system.order.OrderServiceGrpcKt
import io.grpc.ManagedChannelBuilder

class OrderClientModule : AbstractModule() {

    override fun configure() {
        val channel = ManagedChannelBuilder.forAddress("localhost", 9092).usePlaintext().build()
        bind(OrderServiceGrpcKt.OrderServiceCoroutineStub::class.java)
            .toInstance(OrderServiceGrpcKt.OrderServiceCoroutineStub(channel))
    }
}