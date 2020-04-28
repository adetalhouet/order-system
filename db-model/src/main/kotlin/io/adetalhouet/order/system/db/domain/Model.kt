package io.adetalhouet.order.system.db.domain

import io.adetalhouet.order.system.order.Order
import org.jetbrains.exposed.sql.Table


object Orders : Table() {
    val id = long("id").autoIncrement()
    val state = enumeration("state", Order.State::class)
    val clientId = (long("client_id") references Clients.id).nullable()
    val cartId = (long("cart_id") references Carts.id).nullable()
    val dateCreated = long("date_created")

    override val primaryKey = PrimaryKey(id, name = "PK_Orders_ID")
}

object Clients : Table() {
    val id = long("id").autoIncrement()
    val email = varchar("email", 80)
    val password = varchar("password", 20)
    val address = varchar("address", 100)
    val dateCreated = long("date_created")

    override val primaryKey = PrimaryKey(id, name = "PK_Clients_ID")
}

object Carts : Table() {
    val id = long("id").autoIncrement()
    val items = text("items") // JSON representation of List<CartItem>
    val totalPrice = double("total_price")

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
    val name = varchar("name", 80)
    val price = double("price")
    val quantity = integer("quantity")
    val lastUpdated = long("last_updated")

    override val primaryKey = PrimaryKey(id, name = "PK_Products_ID")
}