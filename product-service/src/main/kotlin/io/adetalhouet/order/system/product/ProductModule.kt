package io.adetalhouet.order.system.product

import com.google.inject.AbstractModule
import io.adetalhouet.order.system.product.grpc.ProductServiceGrpcKt

class ProductModule : AbstractModule() {
    override fun configure() {
        bind(ProductServiceGrpcKt.ProductServiceCoroutineImplBase::class.java).toInstance(ProductServiceImpl())
    }
}