package io.adetalhouet.order.system.cart.grpc

import com.google.protobuf.Empty
import io.adetalhouet.order.system.cart.grpc.CartServiceGrpc.getServiceDescriptor
import io.grpc.CallOptions
import io.grpc.CallOptions.DEFAULT
import io.grpc.Channel
import io.grpc.Metadata
import io.grpc.ServerServiceDefinition
import io.grpc.ServerServiceDefinition.builder
import io.grpc.Status
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
 * io.adetalhouet.order.system.cart.grpc.CartService.
 */
object CartServiceGrpcKt {
  /**
   * A stub for issuing RPCs to a(n) io.adetalhouet.order.system.cart.grpc.CartService service as
   * suspending coroutines.
   */
  @StubFor(CartServiceGrpc::class)
  class CartServiceCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT
  ) : AbstractCoroutineStub<CartServiceCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions): CartServiceCoroutineStub =
        CartServiceCoroutineStub(channel, callOptions)

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][Status].  If the RPC completes with another status, a corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @return The single response from the server.
     */
    suspend fun createCart(request: Empty): CartId = unaryRpc(
      channel,
      CartServiceGrpc.getCreateCartMethod(),
      request,
      callOptions,
      Metadata()
    )
    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][Status].  If the RPC completes with another status, a corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @return The single response from the server.
     */
    suspend fun updateCart(request: UpdateCartRequest): Empty = unaryRpc(
      channel,
      CartServiceGrpc.getUpdateCartMethod(),
      request,
      callOptions,
      Metadata()
    )
    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][Status].  If the RPC completes with another status, a corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @return The single response from the server.
     */
    suspend fun deleteCart(request: CartId): Empty = unaryRpc(
      channel,
      CartServiceGrpc.getDeleteCartMethod(),
      request,
      callOptions,
      Metadata()
    )
    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][Status].  If the RPC completes with another status, a corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @return The single response from the server.
     */
    suspend fun getProductsByCartId(request: CartId): CartItems = unaryRpc(
      channel,
      CartServiceGrpc.getGetProductsByCartIdMethod(),
      request,
      callOptions,
      Metadata()
    )}

  /**
   * Skeletal implementation of the io.adetalhouet.order.system.cart.grpc.CartService service based
   * on Kotlin coroutines.
   */
  abstract class CartServiceCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for
     * io.adetalhouet.order.system.cart.grpc.CartService.CreateCart.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun createCart(request: Empty): CartId = throw
        StatusException(UNIMPLEMENTED.withDescription("Method io.adetalhouet.order.system.cart.grpc.CartService.CreateCart is unimplemented"))

    /**
     * Returns the response to an RPC for
     * io.adetalhouet.order.system.cart.grpc.CartService.UpdateCart.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun updateCart(request: UpdateCartRequest): Empty = throw
        StatusException(UNIMPLEMENTED.withDescription("Method io.adetalhouet.order.system.cart.grpc.CartService.UpdateCart is unimplemented"))

    /**
     * Returns the response to an RPC for
     * io.adetalhouet.order.system.cart.grpc.CartService.DeleteCart.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun deleteCart(request: CartId): Empty = throw
        StatusException(UNIMPLEMENTED.withDescription("Method io.adetalhouet.order.system.cart.grpc.CartService.DeleteCart is unimplemented"))

    /**
     * Returns the response to an RPC for
     * io.adetalhouet.order.system.cart.grpc.CartService.GetProductsByCartId.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun getProductsByCartId(request: CartId): CartItems = throw
        StatusException(UNIMPLEMENTED.withDescription("Method io.adetalhouet.order.system.cart.grpc.CartService.GetProductsByCartId is unimplemented"))

    final override fun bindService(): ServerServiceDefinition = builder(getServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = CartServiceGrpc.getCreateCartMethod(),
      implementation = ::createCart
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = CartServiceGrpc.getUpdateCartMethod(),
      implementation = ::updateCart
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = CartServiceGrpc.getDeleteCartMethod(),
      implementation = ::deleteCart
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = CartServiceGrpc.getGetProductsByCartIdMethod(),
      implementation = ::getProductsByCartId
    )).build()
  }
}
