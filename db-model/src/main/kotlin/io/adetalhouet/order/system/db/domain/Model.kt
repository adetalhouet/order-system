package io.adetalhouet.order.system.db.domain

import io.adetalhouet.order.system.order.grpc.Order
import org.jetbrains.exposed.sql.Table

object DBStringSize {
    const val MAX_EMAIL_SIZE = 80
    const val MAX_PASSWORD_SIZE = 20
    const val MAX_ADDRESS_SIZE = 100
    const val MAX_NAME_SIZE = 80
}

object Orders : Table() {
    val id = long("id").autoIncrement()
    val state = enumeration("state", Order.State::class)
    val clientId = long("client_id") references Clients.id
    val cartId = long("cart_id") references Carts.id
    val dateCreatedMillis = long("date_created")

    override val primaryKey = PrimaryKey(id, name = "PK_Orders_ID")
}

object Clients : Table() {
    val id = long("id").autoIncrement()
    val email = varchar("email", DBStringSize.MAX_EMAIL_SIZE)
    val password = varchar("password", DBStringSize.MAX_PASSWORD_SIZE)
    val address = varchar("address", DBStringSize.MAX_ADDRESS_SIZE)
    val dateCreatedMillis = long("date_created")

    override val primaryKey = PrimaryKey(id, name = "PK_Clients_ID")
}

object Carts : Table() {
    val id = long("id").autoIncrement()
    val items = text("items").nullable() // JSON representation of List<CartItem>
    val totalPrice = double("total_price").nullable()
    val lastUpdatedMillis = long("last_updated")

    override val primaryKey = PrimaryKey(id, name = "PK_Carts_ID")
}

object CartItems : Table() {
    val id = long("id").autoIncrement()
    val productId = (long("product_id") references Products.id).nullable()
    val quantity = integer("quantity")
    val totalPrice = double("total_price")

    override val primaryKey = PrimaryKey(id, name = "PK_CartItems_ID")
}

object Products : Table() {
    val id = long("id").autoIncrement()
    val name = varchar("name", DBStringSize.MAX_NAME_SIZE)
    val price = double("price")
    val quantity = integer("quantity")
    val lastUpdatedMillis = long("last_updated")

    override val primaryKey = PrimaryKey(id, name = "PK_Products_ID")
}
