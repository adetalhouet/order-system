package io.adetalhouet.order.system.client.di

import com.google.inject.AbstractModule
import com.typesafe.config.Config
import com.typesafe.config.ConfigFactory
import io.adetalhouet.order.system.client.grpc.ClientServiceGrpc
import io.adetalhouet.order.system.client.grpc.ClientServiceGrpcKt
import io.grpc.ManagedChannelBuilder

class ClientClientModule : AbstractModule() {
    override fun configure() {
        val conf: Config = ConfigFactory.load()
        val channel = ManagedChannelBuilder
            .forAddress(conf.getString("client.url"), conf.getString("client.port").toInt())
            .usePlaintext()
            .build()
        bind(ClientServiceGrpc.ClientServiceFutureStub::class.java)
            .toInstance(ClientServiceGrpc.newFutureStub(channel))
        bind(ClientServiceGrpcKt.ClientServiceCoroutineStub::class.java)
            .toInstance(ClientServiceGrpcKt.ClientServiceCoroutineStub(channel))
    }
}
