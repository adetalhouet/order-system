package io.adetalhouet.order.system.graphql.schema

import com.google.api.graphql.rejoiner.Query
import com.google.api.graphql.rejoiner.SchemaModule
import com.google.common.util.concurrent.ListenableFuture
import io.adetalhouet.order.system.billing.Bill
import io.adetalhouet.order.system.billing.BillingServiceGrpc
import io.adetalhouet.order.system.utils.Status

class BillingSchemaModule : SchemaModule() {

//    @Query("addBill")
//    suspend fun addBill(client: BillingServiceGrpcKt.BillingServiceCoroutineStub, request: Bill): Status {
//        return client.addBill(request)
//    }
//
//    @Query("getBillByClient")
//    suspend fun getBillByClient(client: BillingServiceGrpcKt.BillingServiceCoroutineStub,
//                                request: GetBillByClientRequest): Bills {
//        return client.getBillByClient(request)
//    }
//
//    @Query("getBillById")
//    suspend fun getBillById(client: BillingServiceGrpcKt.BillingServiceCoroutineStub,
//                            request: GetBillByIdRequest): Bill {
//        return client.getBillById(request)
//    }

    @Query("addBill")
    fun addBill(client: BillingServiceGrpc.BillingServiceFutureStub, request: Bill): ListenableFuture<Status> {
        return client.addBill(request)
    }
}