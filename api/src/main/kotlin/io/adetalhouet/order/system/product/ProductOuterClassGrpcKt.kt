package io.adetalhouet.order.system.product

import com.google.protobuf.Empty
import io.adetalhouet.order.system.product.ProductServiceGrpc.getServiceDescriptor
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
 * io.adetalhouet.order.system.product.ProductService.
 */
object ProductServiceGrpcKt {
  /**
   * A stub for issuing RPCs to a(n) io.adetalhouet.order.system.product.ProductService service as
   * suspending coroutines.
   */
  @StubFor(ProductServiceGrpc::class)
  class ProductServiceCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT
  ) : AbstractCoroutineStub<ProductServiceCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions): ProductServiceCoroutineStub =
        ProductServiceCoroutineStub(channel, callOptions)

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
    suspend fun addProduct(request: Product): Empty = unaryRpc(
      channel,
      ProductServiceGrpc.getAddProductMethod(),
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
    suspend fun getProducts(request: Empty): Products = unaryRpc(
      channel,
      ProductServiceGrpc.getGetProductsMethod(),
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
    suspend fun getProductById(request: GetProductByIdRequest): Product = unaryRpc(
      channel,
      ProductServiceGrpc.getGetProductByIdMethod(),
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
    suspend fun deleteProductById(request: DeleteProductByIdRequest): Empty = unaryRpc(
      channel,
      ProductServiceGrpc.getDeleteProductByIdMethod(),
      request,
      callOptions,
      Metadata()
    )}

  /**
   * Skeletal implementation of the io.adetalhouet.order.system.product.ProductService service based
   * on Kotlin coroutines.
   */
  abstract class ProductServiceCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for
     * io.adetalhouet.order.system.product.ProductService.AddProduct.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun addProduct(request: Product): Empty = throw
        StatusException(UNIMPLEMENTED.withDescription("Method io.adetalhouet.order.system.product.ProductService.AddProduct is unimplemented"))

    /**
     * Returns the response to an RPC for
     * io.adetalhouet.order.system.product.ProductService.GetProducts.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun getProducts(request: Empty): Products = throw
        StatusException(UNIMPLEMENTED.withDescription("Method io.adetalhouet.order.system.product.ProductService.GetProducts is unimplemented"))

    /**
     * Returns the response to an RPC for
     * io.adetalhouet.order.system.product.ProductService.GetProductById.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun getProductById(request: GetProductByIdRequest): Product = throw
        StatusException(UNIMPLEMENTED.withDescription("Method io.adetalhouet.order.system.product.ProductService.GetProductById is unimplemented"))

    /**
     * Returns the response to an RPC for
     * io.adetalhouet.order.system.product.ProductService.DeleteProductById.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun deleteProductById(request: DeleteProductByIdRequest): Empty = throw
        StatusException(UNIMPLEMENTED.withDescription("Method io.adetalhouet.order.system.product.ProductService.DeleteProductById is unimplemented"))

    final override fun bindService(): ServerServiceDefinition = builder(getServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ProductServiceGrpc.getAddProductMethod(),
      implementation = ::addProduct
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ProductServiceGrpc.getGetProductsMethod(),
      implementation = ::getProducts
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ProductServiceGrpc.getGetProductByIdMethod(),
      implementation = ::getProductById
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ProductServiceGrpc.getDeleteProductByIdMethod(),
      implementation = ::deleteProductById
    )).build()
  }
}
