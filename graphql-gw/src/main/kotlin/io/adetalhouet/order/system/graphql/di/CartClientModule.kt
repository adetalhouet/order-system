package io.adetalhouet.order.system.graphql.di

import com.google.inject.AbstractModule
import io.adetalhouet.order.system.cart.grpc.CartServiceGrpc
import io.grpc.ManagedChannelBuilder

class CartClientModule : AbstractModule() {

    override fun configure() {
        val channel = ManagedChannelBuilder.forAddress("localhost", 9090).usePlaintext().build()
        bind(CartServiceGrpc.CartServiceFutureStub::class.java).toInstance(CartServiceGrpc.newFutureStub(channel))
    }
}