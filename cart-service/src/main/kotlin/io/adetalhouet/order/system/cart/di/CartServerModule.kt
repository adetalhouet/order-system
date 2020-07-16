package io.adetalhouet.order.system.cart.di

import com.google.inject.AbstractModule
import io.adetalhouet.order.system.cart.CartServer
import io.adetalhouet.order.system.cart.grpc.CartServiceGrpcKt
import io.adetalhouet.order.system.cart.service.CartServiceImpl

class CartServerModule : AbstractModule() {
    override fun configure() {
        bind(CartServiceGrpcKt.CartServiceCoroutineImplBase::class.java).toInstance(CartServiceImpl())
        bind(CartServer::class.java).toInstance(CartServer())
    }
}
