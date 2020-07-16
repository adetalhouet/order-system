package io.adetalhouet.order.system.db.domain

import com.google.protobuf.Timestamp
import com.google.protobuf.util.JsonFormat
import io.adetalhouet.order.system.cart.grpc.Cart
import io.adetalhouet.order.system.cart.grpc.CartItem
import io.adetalhouet.order.system.client.grpc.Client
import io.adetalhouet.order.system.order.grpc.Order
import io.adetalhouet.order.system.product.grpc.Product
import org.jetbrains.exposed.sql.ResultRow
import java.util.concurrent.TimeUnit

fun Long.toTimestamp(): Timestamp = Timestamp
    .newBuilder()
    .setSeconds(TimeUnit.MILLISECONDS.toSeconds(this))
    .build()

fun ResultRow.toOrder(): Order =
    Order.newBuilder()
        .setId(this[Orders.id])
        .setCartId(this[Orders.cartId])
        .setClientId(this[Orders.clientId])
        .setState(this[Orders.state])
        .setDateCreated(this[Orders.dateCreatedMillis].toTimestamp())
        .build()

fun List<Order>.toOrders(): io.adetalhouet.order.system.order.grpc.Orders =
    io.adetalhouet.order.system.order.grpc.Orders.newBuilder().addAllOrders(this).build()

fun ResultRow.toClient(): Client =
    Client.newBuilder()
        .setId(this[Clients.id])
        .setEmail(this[Clients.email])
        .setPassword(this[Clients.password])
        .setAddress(this[Clients.address])
        .setDateCreated(this[Clients.dateCreatedMillis].toTimestamp())
        .build()

fun List<Client>.toClients(): io.adetalhouet.order.system.client.grpc.Clients =
    io.adetalhouet.order.system.client.grpc.Clients.newBuilder().addAllClients(this).build()

fun ResultRow.toCart(): Cart {
    val cartItemsBuilder = io.adetalhouet.order.system.cart.grpc.CartItems.newBuilder()
    this[Carts.items]?.let {
        JsonFormat.parser().merge(this[Carts.items], cartItemsBuilder)
    }

    return Cart.newBuilder()
        .setId(this[Carts.id])
        .setCartItems(cartItemsBuilder.build())
        .setTotalPrice(this[Carts.totalPrice] ?: 0.0)
        .setLastUpdated(this[Carts.lastUpdatedMillis].toTimestamp())
        .build()
}

fun List<CartItem>.toCartItems(): String = io.adetalhouet.order.system.cart.grpc.CartItems
    .newBuilder().addAllCartItems(this).build().toJsonString()

fun io.adetalhouet.order.system.cart.grpc.CartItems.toJsonString(): String = JsonFormat.printer().print(this)

fun ResultRow.toProduct(): Product =
    Product.newBuilder()
        .setId(this[Products.id])
        .setQuantity(this[Products.quantity])
        .setName(this[Products.name])
        .setPrice(this[Products.price])
        .setLastUpdated(this[Products.lastUpdatedMillis].toTimestamp())
        .build()

fun List<Product>.toProducts(): io.adetalhouet.order.system.product.grpc.Products =
    io.adetalhouet.order.system.product.grpc.Products.newBuilder().addAllProducts(this).build()
