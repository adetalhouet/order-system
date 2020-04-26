package io.adetalhouet.order.system.graphql.di

import com.google.inject.AbstractModule
import io.adetalhouet.order.system.client.ClientServiceGrpc
import io.grpc.ManagedChannelBuilder

class ClientClientModule : AbstractModule() {

    override fun configure() {
        val channel = ManagedChannelBuilder.forAddress("localhost", 9091).usePlaintext().build()
        bind(ClientServiceGrpc.ClientServiceFutureStub::class.java).toInstance(ClientServiceGrpc.newFutureStub(channel))
    }
}