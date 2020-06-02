package io.adetalhouet.order.system.client.di

import com.google.inject.AbstractModule
import io.adetalhouet.order.system.client.ClientServer
import io.adetalhouet.order.system.client.ClientServiceImpl
import io.adetalhouet.order.system.client.grpc.ClientServiceGrpcKt

class ClientServerModule : AbstractModule() {
    override fun configure() {
        bind(ClientServiceGrpcKt.ClientServiceCoroutineImplBase::class.java).toInstance(ClientServiceImpl())
        bind(ClientServer::class.java).toInstance(ClientServer())
    }
}