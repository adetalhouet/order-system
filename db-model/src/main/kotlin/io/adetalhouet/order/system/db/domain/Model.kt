package io.adetalhouet.order.system.db.domain

import com.google.protobuf.Timestamp
import com.google.protobuf.util.JsonFormat
import io.adetalhouet.order.system.cart.Cart
import io.adetalhouet.order.system.cart.CartItems
import io.adetalhouet.order.system.client.Client
import io.adetalhouet.order.system.order.Order
import org.jetbrains.exposed.sql.ResultRow
import org.jetbrains.exposed.sql.Table


object Orders : Table() {
    val id = long("id").autoIncrement()
    val state = enumeration("state", Order.State::class)
    val clientId = (long("client_id") references Clients.id)
    val cartId = (long("cart_id") references Carts.id)
    val dateCreated = long("date_created")

    override val primaryKey = PrimaryKey(id, name = "PK_Orders_ID")
}


fun ResultRow.toOrder(): Order =
    Order.newBuilder()
        .setId(this[Orders.id])
        .setCartId(this[Orders.cartId])
        .setClientId(this[Orders.clientId])
        .setState(this[Orders.state])
        .setDateCreated(Timestamp.newBuilder().setSeconds(this[Orders.dateCreated]))
        .build()

fun List<Order>.toOrders(): io.adetalhouet.order.system.order.Orders =
    io.adetalhouet.order.system.order.Orders.newBuilder().addAllOrders(this).build()

object Clients : Table() {
    val id = long("id").autoIncrement()
    val email = varchar("email", 80)
    val password = varchar("password", 20)
    val address = varchar("address", 100)
    val dateCreated = long("date_created")

    override val primaryKey = PrimaryKey(id, name = "PK_Clients_ID")
}

fun ResultRow.toClient(): Client =
    Client.newBuilder()
        .setEmail(this[Clients.email])
        .setPassword(this[Clients.password])
        .setAddress(this[Clients.address])
        .setDateCreated(Timestamp.newBuilder().setSeconds(this[Clients.dateCreated]))
        .build()

fun List<Client>.toClients(): io.adetalhouet.order.system.client.Clients =
    io.adetalhouet.order.system.client.Clients.newBuilder().addAllClients(this).build()

object Carts : Table() {
    val id = long("id").autoIncrement()
    val items = text("items") // JSON representation of List<CartItem>
    val totalPrice = double("total_price")

    override val primaryKey = PrimaryKey(id, name = "PK_Carts_ID")
}

fun ResultRow.toCart(): Cart {
    val cartItemsBuilder = CartItems.newBuilder()
    JsonFormat.parser().merge(this[Carts.items], cartItemsBuilder)

    return Cart.newBuilder()
        .setId(this[Carts.id])
        .setCartItems(cartItemsBuilder.build())
        .setTotalPrice(this[Carts.totalPrice])
        .build()
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