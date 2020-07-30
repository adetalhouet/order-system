package io.adetalhouet.order.system.cart.di

import com.google.inject.AbstractModule
import com.typesafe.config.Config
import com.typesafe.config.ConfigFactory
import io.adetalhouet.order.system.cart.grpc.CartServiceGrpc
import io.adetalhouet.order.system.cart.grpc.CartServiceGrpcKt
import io.grpc.ManagedChannelBuilder

class CartClientModule : AbstractModule() {
    override fun configure() {
        val conf: Config = ConfigFactory.load()
        val channel = ManagedChannelBuilder
            .forAddress(conf.getString("cart.url"), conf.getString("cart.port").toInt())
            .usePlaintext()
            .build()
        bind(CartServiceGrpc.CartServiceFutureStub::class.java).toInstance(CartServiceGrpc.newFutureStub(channel))
        bind(CartServiceGrpcKt.CartServiceCoroutineStub::class.java)
            .toInstance(CartServiceGrpcKt.CartServiceCoroutineStub(channel))
    }
}
