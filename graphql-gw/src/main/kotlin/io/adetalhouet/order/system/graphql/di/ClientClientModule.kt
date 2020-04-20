package io.adetalhouet.order.system.graphql.di

import com.google.inject.AbstractModule
import io.adetalhouet.order.system.client.ClientServiceGrpcKt
import io.grpc.ManagedChannelBuilder

class ClientClientModule : AbstractModule() {

    override fun configure() {
        val channel = ManagedChannelBuilder.forAddress("localhost", 9091).usePlaintext().build()
        bind(ClientServiceGrpcKt.ClientServiceCoroutineStub::class.java)
            .toInstance(ClientServiceGrpcKt.ClientServiceCoroutineStub(channel))
    }
}