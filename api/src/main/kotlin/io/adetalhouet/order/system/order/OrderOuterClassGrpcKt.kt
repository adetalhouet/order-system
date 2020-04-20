package io.adetalhouet.order.system.order

import io.adetalhouet.order.system.order.OrderServiceGrpc.getServiceDescriptor
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
 * io.adetalhouet.order.system.order.OrderService.
 */
object OrderServiceGrpcKt {
  /**
   * A stub for issuing RPCs to a(n) io.adetalhouet.order.system.order.OrderService service as
   * suspending coroutines.
   */
  @StubFor(OrderServiceGrpc::class)
  class OrderServiceCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT
  ) : AbstractCoroutineStub<OrderServiceCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions): OrderServiceCoroutineStub =
        OrderServiceCoroutineStub(channel, callOptions)

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
    suspend fun placeOrder(request: PlaceOrderRequest): Status = unaryRpc(
      channel,
      OrderServiceGrpc.getPlaceOrderMethod(),
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
    suspend fun trackOrderById(request: TrackOrderByIdRequest): TrackOrderByIdResponse = unaryRpc(
      channel,
      OrderServiceGrpc.getTrackOrderByIdMethod(),
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
    suspend fun getOrdersByClient(request: GetOrdersByClientRequest): Orders = unaryRpc(
      channel,
      OrderServiceGrpc.getGetOrdersByClientMethod(),
      request,
      callOptions,
      Metadata()
    )}

  /**
   * Skeletal implementation of the io.adetalhouet.order.system.order.OrderService service based on
   * Kotlin coroutines.
   */
  abstract class OrderServiceCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for io.adetalhouet.order.system.order.OrderService.PlaceOrder.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun placeOrder(request: PlaceOrderRequest): Status = throw
        StatusException(UNIMPLEMENTED.withDescription("Method io.adetalhouet.order.system.order.OrderService.PlaceOrder is unimplemented"))

    /**
     * Returns the response to an RPC for
     * io.adetalhouet.order.system.order.OrderService.TrackOrderById.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun trackOrderById(request: TrackOrderByIdRequest): TrackOrderByIdResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method io.adetalhouet.order.system.order.OrderService.TrackOrderById is unimplemented"))

    /**
     * Returns the response to an RPC for
     * io.adetalhouet.order.system.order.OrderService.GetOrdersByClient.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun getOrdersByClient(request: GetOrdersByClientRequest): Orders = throw
        StatusException(UNIMPLEMENTED.withDescription("Method io.adetalhouet.order.system.order.OrderService.GetOrdersByClient is unimplemented"))

    final override fun bindService(): ServerServiceDefinition = builder(getServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = OrderServiceGrpc.getPlaceOrderMethod(),
      implementation = ::placeOrder
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = OrderServiceGrpc.getTrackOrderByIdMethod(),
      implementation = ::trackOrderById
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = OrderServiceGrpc.getGetOrdersByClientMethod(),
      implementation = ::getOrdersByClient
    )).build()
  }
}
