package io.adetalhouet.order.system.graphql.schema

import com.google.api.graphql.rejoiner.Query
import com.google.api.graphql.rejoiner.SchemaModule
import com.google.common.util.concurrent.ListenableFuture
import com.google.protobuf.Empty
import io.adetalhouet.order.system.client.grpc.Client
import io.adetalhouet.order.system.client.grpc.ClientId
import io.adetalhouet.order.system.client.grpc.ClientServiceGrpc
import io.adetalhouet.order.system.client.grpc.Clients
import io.adetalhouet.order.system.graphql.checkNullOrEmpty
import io.adetalhouet.order.system.graphql.mustBeSet
import io.adetalhouet.order.system.graphql.returnFailedFutureOnException

class ClientSchemaModule : SchemaModule() {

    @Query("addClient")
    fun addClient(client: ClientServiceGrpc.ClientServiceFutureStub, request: Client): ListenableFuture<ClientId> =
        returnFailedFutureOnException {
            checkNullOrEmpty(request.email) { "Email".mustBeSet() }
            checkNullOrEmpty(request.password) { "Password".mustBeSet() }
            client.addClient(request)
        }

    @Query("deleteClientById")
    fun deleteClientById(client: ClientServiceGrpc.ClientServiceFutureStub,
                         request: ClientId): ListenableFuture<Empty> = returnFailedFutureOnException {
        checkNotNull(request.id) { "Id".mustBeSet() }
        client.deleteClientById(request)
    }

    @Query("getClientById")
    fun getClientById(client: ClientServiceGrpc.ClientServiceFutureStub,
                      request: ClientId): ListenableFuture<Client>? = returnFailedFutureOnException {
        checkNotNull(request.id) { "Id".mustBeSet() }
        client.getClientById(request)
    }

    @Query("getClients")
    fun getClients(client: ClientServiceGrpc.ClientServiceFutureStub,
                   request: Empty): ListenableFuture<Clients>? = returnFailedFutureOnException {
        client.getClients(request)
    }
}
