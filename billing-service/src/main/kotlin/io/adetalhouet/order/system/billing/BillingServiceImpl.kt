package io.adetalhouet.order.system.billing

import io.adetalhouet.order.system.utils.Status

class BillingServiceImpl : BillingServiceGrpcKt.BillingServiceCoroutineImplBase() {

    override suspend fun addBill(request: Bill): Status {
        return super.addBill(request)
    }

    override suspend fun getBillByClient(request: GetBillByClientRequest): Bills {
        return super.getBillByClient(request)
    }

    override suspend fun getBillById(request: GetBillByIdRequest): Bill {
        return super.getBillById(request)
    }
}