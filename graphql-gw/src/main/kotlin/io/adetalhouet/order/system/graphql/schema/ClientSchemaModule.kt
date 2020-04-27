package io.adetalhouet.order.system.graphql.schema

import com.google.api.graphql.rejoiner.Query
import com.google.api.graphql.rejoiner.SchemaModule
import com.google.common.util.concurrent.ListenableFuture
import com.google.protobuf.Empty
import graphql.GraphQLError
import graphql.language.SourceLocation
import io.adetalhouet.order.system.client.Client
import io.adetalhouet.order.system.client.ClientServiceGrpc
import io.adetalhouet.order.system.client.Clients
import io.adetalhouet.order.system.client.DeleteClientByIdRequest
import io.adetalhouet.order.system.client.GetClientByIdRequest
import io.adetalhouet.order.system.graphql.GraphQLException


class ClientSchemaModule : SchemaModule() {

    @Query("addClient")
    fun addClient(client: ClientServiceGrpc.ClientServiceFutureStub, request: Client): ListenableFuture<Empty> {
        try {
            return client.addClient(request)
        } catch (e: Exception) {
            throw GraphQLException(e.message)
        }
    }

    @Query("deleteClientById")
    fun deleteClientById(client: ClientServiceGrpc.ClientServiceFutureStub,
                         request: DeleteClientByIdRequest): ListenableFuture<Empty> {
        return client.deleteClientById(request)
    }

    @Query("getClientById")
    fun getClientById(client: ClientServiceGrpc.ClientServiceFutureStub,
                      request: GetClientByIdRequest): ListenableFuture<Client>? {
        return client.getClientById(request)
    }

    @Query("clients")
    fun getClients(client: ClientServiceGrpc.ClientServiceFutureStub,
                   request: com.google.protobuf.Empty): ListenableFuture<Clients>? {
        return client.getClients(request)
    }
}