package io.adetalhouet.order.system.product.di

import com.google.inject.AbstractModule
import io.adetalhouet.order.system.product.event.NewOrderEvent
import io.adetalhouet.order.system.product.ProductServer
import io.adetalhouet.order.system.product.ProductServiceImpl
import io.adetalhouet.order.system.product.grpc.ProductServiceGrpcKt

class ProductServerModule : AbstractModule() {
    override fun configure() {
        bind(ProductServiceGrpcKt.ProductServiceCoroutineImplBase::class.java).toInstance(ProductServiceImpl())
        bind(ProductServer::class.java).toInstance(ProductServer())
        bind(NewOrderEvent::class.java).toInstance(
            NewOrderEvent())
    }
}