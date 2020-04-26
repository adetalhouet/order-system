package io.adetalhouet.order.system.graphql.di

import com.google.inject.AbstractModule
import io.adetalhouet.order.system.order.OrderServiceGrpc
import io.grpc.ManagedChannelBuilder

class OrderClientModule : AbstractModule() {

    override fun configure() {
        val channel = ManagedChannelBuilder.forAddress("localhost", 9092).usePlaintext().build()
        bind(OrderServiceGrpc.OrderServiceFutureStub::class.java).toInstance(OrderServiceGrpc.newFutureStub(channel))
    }
}