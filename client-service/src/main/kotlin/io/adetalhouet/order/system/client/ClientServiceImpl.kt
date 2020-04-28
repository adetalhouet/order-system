package io.adetalhouet.order.system.client

import com.google.common.io.Resources
import com.google.protobuf.Empty
import com.google.protobuf.util.JsonFormat
import io.adetalhouet.order.system.client.domain.model.Client
import io.adetalhouet.order.system.client.domain.model.toClients
import io.adetalhouet.order.system.db.utils.DatabaseFactory.dbQuery
import java.sql.SQLDataException

class ClientServiceImpl : ClientServiceGrpcKt.ClientServiceCoroutineImplBase() {

    private var db: Collection<io.adetalhouet.order.system.client.Client> =
        Resources.asByteSource(Resources.getResource("clients.json")).asCharSource(Charsets.UTF_8)
            .openBufferedStream()
            .use { reader ->
                Clients.newBuilder().apply {
                    JsonFormat.parser().merge(reader, this)
                }.build().clientsList
            }

    override suspend fun addClient(request: io.adetalhouet.order.system.client.Client): Empty = dbQuery {
        Client.find { io.adetalhouet.order.system.client.domain.model.Clients.email eq request.email }
            .count().let {
                if (it > 0) throw SQLDataException("Client (email=${request.email} already exist")
                else {
                    Client.new {
                        email = request.email
                        address = request.address
                        password = request.password
                        dateCreated = request.dateCreated.seconds
                    }
                }
                Empty.getDefaultInstance()
            }
    }

    override suspend fun deleteClientById(request: DeleteClientByIdRequest): Empty = dbQuery {
        Client.findById(request.id)?.delete()
        Empty.getDefaultInstance()
    }

    override suspend fun getClientById(request: GetClientByIdRequest): io.adetalhouet.order.system.client.Client =
        dbQuery {
            Client.findById(request.id)?.toClient()
                ?: throw NoSuchElementException("Client (id=${request.id}) not found")
        }

    override suspend fun getClients(request: Empty): Clients = dbQuery {
        Client.all().map { it.toClient() }.toClients()
    }
}