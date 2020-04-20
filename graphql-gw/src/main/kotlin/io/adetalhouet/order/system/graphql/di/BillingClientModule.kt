package io.adetalhouet.order.system.graphql.di

import com.google.inject.AbstractModule
import io.adetalhouet.order.system.billing.BillingServiceGrpc
import io.adetalhouet.order.system.billing.BillingServiceGrpcKt
import io.grpc.ManagedChannelBuilder

class BillingClientModule : AbstractModule() {

    override fun configure() {
        val channel = ManagedChannelBuilder.forAddress("localhost", 9093).usePlaintext().build()
//        bind(BillingServiceGrpcKt.BillingServiceCoroutineStub::class.java)
//            .toInstance(BillingServiceGrpcKt.BillingServiceCoroutineStub(channel))

        bind(BillingServiceGrpc.BillingServiceFutureStub::class.java).toInstance(BillingServiceGrpc.newFutureStub(channel))
    }
}