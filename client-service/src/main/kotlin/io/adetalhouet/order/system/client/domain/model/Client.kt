package io.adetalhouet.order.system.client.domain.model

import com.google.protobuf.Timestamp
import org.jetbrains.exposed.dao.LongEntity
import org.jetbrains.exposed.dao.LongEntityClass
import org.jetbrains.exposed.dao.id.EntityID
import org.jetbrains.exposed.dao.id.LongIdTable

object Clients : LongIdTable("Clients") {
    var email = varchar("email", length = 100)
    var password = varchar("password", 100)
    var address = varchar("address", 300)
    var dateCreated = long("date_created")
}

class Client(id: EntityID<Long>) : LongEntity(id) {
    companion object : LongEntityClass<Client>(Clients)

    var email by Clients.email
    var password by Clients.password
    var address by Clients.address
    var dateCreated by Clients.dateCreated

    // to proto domain
    fun toClient(): io.adetalhouet.order.system.client.Client = io.adetalhouet.order.system.client.Client.newBuilder()
        .setEmail(email)
        .setPassword(password)
        .setAddress(address)
        .setDateCreated(Timestamp.newBuilder().setSeconds(dateCreated))
        .build()
}

// to proto domain
fun List<io.adetalhouet.order.system.client.Client>.toClients(): io.adetalhouet.order.system.client.Clients =
    io.adetalhouet.order.system.client.Clients.newBuilder().addAllClients(this).build()