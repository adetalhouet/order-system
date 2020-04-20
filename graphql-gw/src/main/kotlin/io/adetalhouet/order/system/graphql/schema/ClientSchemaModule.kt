package io.adetalhouet.order.system.graphql.schema

import com.google.api.graphql.rejoiner.Query
import com.google.api.graphql.rejoiner.SchemaModule
import io.adetalhouet.order.system.client.Client
import io.adetalhouet.order.system.client.ClientServiceGrpcKt
import io.adetalhouet.order.system.client.Clients
import io.adetalhouet.order.system.client.DeleteClientByIdRequest
import io.adetalhouet.order.system.client.GetClientByIdRequest
import io.adetalhouet.order.system.utils.Status

class ClientSchemaModule : SchemaModule() {
    @Query("addClient")
    suspend fun addClient(client: ClientServiceGrpcKt.ClientServiceCoroutineStub, request: Client): Status {
        return client.addClient(request)
    }

    @Query("deleteClientById")
    suspend fun deleteClientById(client: ClientServiceGrpcKt.ClientServiceCoroutineStub,
                                 request: DeleteClientByIdRequest): Status {
        return client.deleteClientById(request)
    }

    @Query("getClientById")
    suspend fun getClientById(client: ClientServiceGrpcKt.ClientServiceCoroutineStub,
                              request: GetClientByIdRequest): Client {
        return client.getClientById(request)
    }

    @Query("clients")
    suspend fun getClients(client: ClientServiceGrpcKt.ClientServiceCoroutineStub,
                           request: com.google.protobuf.Empty): Clients {
        return client.getClients(request)
    }
}