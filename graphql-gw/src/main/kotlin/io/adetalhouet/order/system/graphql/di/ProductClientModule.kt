package io.adetalhouet.order.system.graphql.di

import com.google.inject.AbstractModule
import io.adetalhouet.order.system.product.grpc.ProductServiceGrpc
import io.grpc.ManagedChannelBuilder

class ProductClientModule : AbstractModule() {

    override fun configure() {
        val channel = ManagedChannelBuilder.forAddress("localhost", 9093).usePlaintext().build()
        bind(ProductServiceGrpc.ProductServiceFutureStub::class.java).toInstance(ProductServiceGrpc.newFutureStub(
            channel))
    }
}