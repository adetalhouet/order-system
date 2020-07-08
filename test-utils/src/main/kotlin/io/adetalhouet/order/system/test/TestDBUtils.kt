package io.adetalhouet.order.system.test

import com.google.common.io.Resources
import com.google.protobuf.util.JsonFormat
import io.adetalhouet.order.system.cart.grpc.Cart
import io.adetalhouet.order.system.client.grpc.Client
import io.adetalhouet.order.system.db.domain.Carts
import io.adetalhouet.order.system.db.domain.Clients
import io.adetalhouet.order.system.db.domain.Orders
import io.adetalhouet.order.system.db.domain.Products
import io.adetalhouet.order.system.db.domain.toCart
import io.adetalhouet.order.system.db.domain.toClient
import io.adetalhouet.order.system.nats.lib.message.toNatsMessage
import io.adetalhouet.order.system.product.grpc.Product
import io.nats.client.Message
import org.jetbrains.exposed.sql.SchemaUtils
import org.jetbrains.exposed.sql.SqlExpressionBuilder.eq
import org.jetbrains.exposed.sql.deleteAll
import org.jetbrains.exposed.sql.insert
import org.jetbrains.exposed.sql.select
import org.jetbrains.exposed.sql.selectAll
import org.jetbrains.exposed.sql.transactions.transaction
import io.adetalhouet.order.system.product.grpc.Products as ProtoProducts

fun toNatsMessage(msg: Message) = msg.toNatsMessage()

fun loadProducts() {
    val products: MutableCollection<Product> =
        Resources.asByteSource(Resources.getResource("test/products.json")).asCharSource(Charsets.UTF_8)
            .openBufferedStream()
            .use { reader ->
                ProtoProducts.newBuilder().apply {
                    JsonFormat.parser().merge(reader, this)
                }.build().productsList
            }

    products.forEach { p ->
        transaction {
            Products.insert {
                it[id] = p.id
                it[name] = p.name
                it[price] = p.price
                it[quantity] = p.quantity
                it[lastUpdatedMillis] = System.currentTimeMillis()
            }
        }
    }
}

fun createTables() = transaction { SchemaUtils.create(Orders, Clients, Carts, Products) }

fun cleanTables() = transaction {
    Carts.deleteAll()
    Orders.deleteAll()
    Clients.deleteAll()
    Products.deleteAll()
}

fun getClients(): List<Client> = transaction { Clients.selectAll().map { it.toClient() }.toList() }

fun getCarts(): List<Cart> = transaction { Carts.selectAll().map { it.toCart() }.toList() }
fun getCart(cartId: Long): Cart = transaction { Carts.select(Carts.id eq cartId).single().toCart() }
