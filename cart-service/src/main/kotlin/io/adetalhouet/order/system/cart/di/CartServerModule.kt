package io.adetalhouet.order.system.cart.di

import com.google.inject.AbstractModule
import io.adetalhouet.order.system.cart.CartServiceImpl
import io.adetalhouet.order.system.cart.grpc.CartServiceGrpcKt

class CartServerModule : AbstractModule() {
    override fun configure() {
        bind(CartServiceGrpcKt.CartServiceCoroutineImplBase::class.java).toInstance(CartServiceImpl())
    }
}