package io.adetalhouet.order.system.client

import io.adetalhouet.order.system.utils.Status

class ClientServiceImpl : ClientServiceGrpcKt.ClientServiceCoroutineImplBase() {

    override suspend fun addClient(request: Client): Status {
        return super.addClient(request)
    }

    override suspend fun deleteClientById(request: DeleteClientByIdRequest): Status {
        return super.deleteClientById(request)
    }

    override suspend fun getClientById(request: GetClientByIdRequest): Client {
        return super.getClientById(request)
    }

    override suspend fun getClients(request: com.google.protobuf.Empty): Clients {
        return super.getClients(request)
    }
}