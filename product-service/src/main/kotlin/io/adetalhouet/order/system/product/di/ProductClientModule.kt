package io.adetalhouet.order.system.product.di

import com.google.inject.AbstractModule
import com.typesafe.config.Config
import com.typesafe.config.ConfigFactory
import io.adetalhouet.order.system.product.grpc.ProductServiceGrpc
import io.grpc.ManagedChannelBuilder

class ProductClientModule : AbstractModule() {
    override fun configure() {
        val conf: Config = ConfigFactory.load()
        val channel = ManagedChannelBuilder
            .forAddress(conf.getString("product.url"), conf.getInt("product.port"))
            .usePlaintext()
            .build()
        bind(ProductServiceGrpc.ProductServiceFutureStub::class.java)
            .toInstance(ProductServiceGrpc.newFutureStub(channel))
    }
}