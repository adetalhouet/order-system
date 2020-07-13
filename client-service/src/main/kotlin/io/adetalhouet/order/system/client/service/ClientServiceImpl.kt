package io.adetalhouet.order.system.client.service

import com.google.protobuf.Empty
import io.adetalhouet.order.system.client.grpc.Client
import io.adetalhouet.order.system.client.grpc.ClientId
import io.adetalhouet.order.system.client.grpc.ClientServiceGrpcKt
import io.adetalhouet.order.system.db.domain.Clients
import io.adetalhouet.order.system.db.domain.toClient
import io.adetalhouet.order.system.db.domain.toClients
import io.adetalhouet.order.system.db.lib.DatabaseTransaction.dbQuery
import io.grpc.Status
import io.grpc.StatusException
import org.jetbrains.exposed.sql.deleteWhere
import org.jetbrains.exposed.sql.insert
import org.jetbrains.exposed.sql.select
import org.jetbrains.exposed.sql.selectAll

class ClientServiceImpl : ClientServiceGrpcKt.ClientServiceCoroutineImplBase() {

    override suspend fun addClient(request: Client): ClientId = dbQuery {

        Clients.select { Clients.email eq request.email }.singleOrNull()?.let {
            throw StatusException(Status.ALREADY_EXISTS)
        }

        val clientId = Clients.insert {
            it[email] = request.email
            it[address] = request.address
            it[password] = request.password
            it[dateCreatedMillis] = System.currentTimeMillis()
        }[Clients.id]

        ClientId.newBuilder().setId(clientId).build()
    }

    override suspend fun deleteClientById(request: ClientId): Empty = dbQuery {
        Clients.deleteWhere { Clients.id eq request.id }
        Empty.getDefaultInstance()
    }

    override suspend fun getClientById(request: ClientId): Client = dbQuery {
        Clients.select { Clients.id eq request.id }.single().toClient()
    }

    override suspend fun getClients(request: Empty): io.adetalhouet.order.system.client.grpc.Clients = dbQuery {
        Clients.selectAll().map { it.toClient() }.toList().toClients()
    }
}