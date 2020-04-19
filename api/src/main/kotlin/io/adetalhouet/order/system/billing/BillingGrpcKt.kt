package io.adetalhouet.order.system.billing

import io.adetalhouet.order.system.billing.BillingServiceGrpc.getServiceDescriptor
import io.adetalhouet.order.system.utils.Status
import io.grpc.CallOptions
import io.grpc.CallOptions.DEFAULT
import io.grpc.Channel
import io.grpc.Metadata
import io.grpc.ServerServiceDefinition
import io.grpc.ServerServiceDefinition.builder
import io.grpc.Status.UNIMPLEMENTED
import io.grpc.StatusException
import io.grpc.kotlin.AbstractCoroutineServerImpl
import io.grpc.kotlin.AbstractCoroutineStub
import io.grpc.kotlin.ClientCalls
import io.grpc.kotlin.ClientCalls.unaryRpc
import io.grpc.kotlin.ServerCalls
import io.grpc.kotlin.ServerCalls.unaryServerMethodDefinition
import io.grpc.kotlin.StubFor
import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext
import kotlin.jvm.JvmOverloads

/**
 * Holder for Kotlin coroutine-based client and server APIs for
 * io.adetalhouet.order.system.billing.BillingService.
 */
object BillingServiceGrpcKt {
  /**
   * A stub for issuing RPCs to a(n) io.adetalhouet.order.system.billing.BillingService service as
   * suspending coroutines.
   */
  @StubFor(BillingServiceGrpc::class)
  class BillingServiceCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT
  ) : AbstractCoroutineStub<BillingServiceCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions): BillingServiceCoroutineStub =
        BillingServiceCoroutineStub(channel, callOptions)

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @return The single response from the server.
     */
    suspend fun addBill(request: Bill): Status = unaryRpc(
      channel,
      BillingServiceGrpc.getAddBillMethod(),
      request,
      callOptions,
      Metadata()
    )
    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @return The single response from the server.
     */
    suspend fun getBillById(request: GetBillByIdRequest): Bill = unaryRpc(
      channel,
      BillingServiceGrpc.getGetBillByIdMethod(),
      request,
      callOptions,
      Metadata()
    )
    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @return The single response from the server.
     */
    suspend fun getBillByClient(request: GetBillByClientRequest): Bills = unaryRpc(
      channel,
      BillingServiceGrpc.getGetBillByClientMethod(),
      request,
      callOptions,
      Metadata()
    )}

  /**
   * Skeletal implementation of the io.adetalhouet.order.system.billing.BillingService service based
   * on Kotlin coroutines.
   */
  abstract class BillingServiceCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for
     * io.adetalhouet.order.system.billing.BillingService.AddBill.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun addBill(request: Bill): Status = throw
        StatusException(UNIMPLEMENTED.withDescription("Method io.adetalhouet.order.system.billing.BillingService.AddBill is unimplemented"))

    /**
     * Returns the response to an RPC for
     * io.adetalhouet.order.system.billing.BillingService.GetBillById.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun getBillById(request: GetBillByIdRequest): Bill = throw
        StatusException(UNIMPLEMENTED.withDescription("Method io.adetalhouet.order.system.billing.BillingService.GetBillById is unimplemented"))

    /**
     * Returns the response to an RPC for
     * io.adetalhouet.order.system.billing.BillingService.GetBillByClient.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun getBillByClient(request: GetBillByClientRequest): Bills = throw
        StatusException(UNIMPLEMENTED.withDescription("Method io.adetalhouet.order.system.billing.BillingService.GetBillByClient is unimplemented"))

    final override fun bindService(): ServerServiceDefinition = builder(getServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = BillingServiceGrpc.getAddBillMethod(),
      implementation = ::addBill
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = BillingServiceGrpc.getGetBillByIdMethod(),
      implementation = ::getBillById
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = BillingServiceGrpc.getGetBillByClientMethod(),
      implementation = ::getBillByClient
    )).build()
  }
}
