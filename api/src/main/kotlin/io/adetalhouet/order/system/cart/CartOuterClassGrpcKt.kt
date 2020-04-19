package io.adetalhouet.order.system.cart

import io.adetalhouet.order.system.cart.CartServiceGrpc.getServiceDescriptor
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
 * io.adetalhouet.order.system.cart.CartService.
 */
object CartServiceGrpcKt {
  /**
   * A stub for issuing RPCs to a(n) io.adetalhouet.order.system.cart.CartService service as
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
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @return The single response from the server.
     */
    suspend fun addToCart(request: CartItem): Status = unaryRpc(
      channel,
      CartServiceGrpc.getAddToCartMethod(),
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
    suspend fun remoteFromCart(request: CartItem): Status = unaryRpc(
      channel,
      CartServiceGrpc.getRemoteFromCartMethod(),
      request,
      callOptions,
      Metadata()
    )}

  /**
   * Skeletal implementation of the io.adetalhouet.order.system.cart.CartService service based on
   * Kotlin coroutines.
   */
  abstract class CartServiceCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for io.adetalhouet.order.system.cart.CartService.AddToCart.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun addToCart(request: CartItem): Status = throw
        StatusException(UNIMPLEMENTED.withDescription("Method io.adetalhouet.order.system.cart.CartService.AddToCart is unimplemented"))

    /**
     * Returns the response to an RPC for
     * io.adetalhouet.order.system.cart.CartService.RemoteFromCart.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun remoteFromCart(request: CartItem): Status = throw
        StatusException(UNIMPLEMENTED.withDescription("Method io.adetalhouet.order.system.cart.CartService.RemoteFromCart is unimplemented"))

    final override fun bindService(): ServerServiceDefinition = builder(getServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = CartServiceGrpc.getAddToCartMethod(),
      implementation = ::addToCart
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = CartServiceGrpc.getRemoteFromCartMethod(),
      implementation = ::remoteFromCart
    )).build()
  }
}
