package io.adetalhouet.order.system.graphql.di

import com.google.inject.AbstractModule
import io.adetalhouet.order.system.cart.CartServiceGrpcKt
import io.grpc.ManagedChannelBuilder

class CartClientModule : AbstractModule() {

    override fun configure() {
        val channel = ManagedChannelBuilder.forAddress("localhost", 9090).usePlaintext().build()
        bind(CartServiceGrpcKt.CartServiceCoroutineStub::class.java)
            .toInstance(CartServiceGrpcKt.CartServiceCoroutineStub(channel))
    }
}