package io.adetalhouet.order.system.client.service

import com.google.protobuf.Empty
import io.adetalhouet.order.system.client.grpc.Client
import io.adetalhouet.order.system.client.grpc.ClientServiceGrpcKt
import io.adetalhouet.order.system.client.grpc.DeleteClientByIdRequest
import io.adetalhouet.order.system.client.grpc.GetClientByIdRequest
import io.adetalhouet.order.system.db.domain.Clients
import io.adetalhouet.order.system.db.domain.toClient
import io.adetalhouet.order.system.db.domain.toClients
import io.adetalhouet.order.system.db.lib.DatabaseTransaction.dbQuery
import org.jetbrains.exposed.sql.deleteWhere
import org.jetbrains.exposed.sql.insertIgnore
import org.jetbrains.exposed.sql.select
import org.jetbrains.exposed.sql.selectAll

class ClientServiceImpl : ClientServiceGrpcKt.ClientServiceCoroutineImplBase() {

    override suspend fun addClient(request: Client): Empty = dbQuery {
        Clients.insertIgnore {
            it[email] = request.email
            it[address] = request.address
            it[password] = request.password
            it[dateCreatedMillis] = System.currentTimeMillis()
        }
        Empty.getDefaultInstance()
    }

    override suspend fun deleteClientById(request: DeleteClientByIdRequest): Empty = dbQuery {
        Clients.deleteWhere { Clients.id eq request.id }
        Empty.getDefaultInstance()
    }

    override suspend fun getClientById(request: GetClientByIdRequest): Client = dbQuery {
        Clients.select { Clients.id eq request.id }.single().toClient()
    }

    override suspend fun getClients(request: Empty): io.adetalhouet.order.system.client.grpc.Clients = dbQuery {
        Clients.selectAll().map { it.toClient() }.toList().toClients()
    }
}