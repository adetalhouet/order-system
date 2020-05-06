package io.adetalhouet.order.system.client.grpc

import com.google.protobuf.Empty
import io.adetalhouet.order.system.client.grpc.ClientServiceGrpc.getServiceDescriptor
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
 * io.adetalhouet.order.system.client.grpc.ClientService.
 */
object ClientServiceGrpcKt {
  /**
   * A stub for issuing RPCs to a(n) io.adetalhouet.order.system.client.grpc.ClientService service
   * as suspending coroutines.
   */
  @StubFor(ClientServiceGrpc::class)
  class ClientServiceCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT
  ) : AbstractCoroutineStub<ClientServiceCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions): ClientServiceCoroutineStub =
        ClientServiceCoroutineStub(channel, callOptions)

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
    suspend fun addClient(request: Client): Empty = unaryRpc(
      channel,
      ClientServiceGrpc.getAddClientMethod(),
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
    suspend fun getClients(request: Empty): Clients = unaryRpc(
      channel,
      ClientServiceGrpc.getGetClientsMethod(),
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
    suspend fun getClientById(request: GetClientByIdRequest): Client = unaryRpc(
      channel,
      ClientServiceGrpc.getGetClientByIdMethod(),
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
    suspend fun deleteClientById(request: DeleteClientByIdRequest): Empty = unaryRpc(
      channel,
      ClientServiceGrpc.getDeleteClientByIdMethod(),
      request,
      callOptions,
      Metadata()
    )}

  /**
   * Skeletal implementation of the io.adetalhouet.order.system.client.grpc.ClientService service
   * based on Kotlin coroutines.
   */
  abstract class ClientServiceCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for
     * io.adetalhouet.order.system.client.grpc.ClientService.AddClient.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun addClient(request: Client): Empty = throw
        StatusException(UNIMPLEMENTED.withDescription("Method io.adetalhouet.order.system.client.grpc.ClientService.AddClient is unimplemented"))

    /**
     * Returns the response to an RPC for
     * io.adetalhouet.order.system.client.grpc.ClientService.GetClients.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun getClients(request: Empty): Clients = throw
        StatusException(UNIMPLEMENTED.withDescription("Method io.adetalhouet.order.system.client.grpc.ClientService.GetClients is unimplemented"))

    /**
     * Returns the response to an RPC for
     * io.adetalhouet.order.system.client.grpc.ClientService.GetClientById.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun getClientById(request: GetClientByIdRequest): Client = throw
        StatusException(UNIMPLEMENTED.withDescription("Method io.adetalhouet.order.system.client.grpc.ClientService.GetClientById is unimplemented"))

    /**
     * Returns the response to an RPC for
     * io.adetalhouet.order.system.client.grpc.ClientService.DeleteClientById.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun deleteClientById(request: DeleteClientByIdRequest): Empty = throw
        StatusException(UNIMPLEMENTED.withDescription("Method io.adetalhouet.order.system.client.grpc.ClientService.DeleteClientById is unimplemented"))

    final override fun bindService(): ServerServiceDefinition = builder(getServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ClientServiceGrpc.getAddClientMethod(),
      implementation = ::addClient
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ClientServiceGrpc.getGetClientsMethod(),
      implementation = ::getClients
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ClientServiceGrpc.getGetClientByIdMethod(),
      implementation = ::getClientById
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ClientServiceGrpc.getDeleteClientByIdMethod(),
      implementation = ::deleteClientById
    )).build()
  }
}
