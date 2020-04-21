package io.adetalhouet.order.system.billing

import io.adetalhouet.order.system.utils.Status
import org.slf4j.LoggerFactory

class BillingServiceImpl : BillingServiceGrpcKt.BillingServiceCoroutineImplBase() {

    val log = LoggerFactory.getLogger(BillingServiceImpl::class.java)

    override suspend fun addBill(request: Bill): Status {
        log.info("Add bill")
        return Status.newBuilder().setStatus(Status.State.SUCCESS).build()
    }

    override suspend fun getBillByClient(request: GetBillByClientRequest): Bills {
        return super.getBillByClient(request)
    }

    override suspend fun getBillById(request: GetBillByIdRequest): Bill {
        return super.getBillById(request)
    }
}