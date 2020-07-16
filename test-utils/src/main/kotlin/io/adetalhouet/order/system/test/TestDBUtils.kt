package io.adetalhouet.order.system.test

import io.adetalhouet.order.system.cart.grpc.Cart
import io.adetalhouet.order.system.client.grpc.Client
import io.adetalhouet.order.system.db.domain.Carts
import io.adetalhouet.order.system.db.domain.Clients
import io.adetalhouet.order.system.db.domain.Orders
import io.adetalhouet.order.system.db.domain.Products
import io.adetalhouet.order.system.db.domain.toCart
import io.adetalhouet.order.system.db.domain.toClient
import io.adetalhouet.order.system.db.domain.toOrder
import io.adetalhouet.order.system.db.domain.toProduct
import io.adetalhouet.order.system.order.grpc.Order
import io.adetalhouet.order.system.product.grpc.Product
import org.jetbrains.exposed.sql.SchemaUtils
import org.jetbrains.exposed.sql.SqlExpressionBuilder.eq
import org.jetbrains.exposed.sql.deleteAll
import org.jetbrains.exposed.sql.select
import org.jetbrains.exposed.sql.selectAll
import org.jetbrains.exposed.sql.transactions.transaction

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

fun getProducts(): List<Product> = transaction { Products.selectAll().map { it.toProduct() }.toList() }
fun getProduct(productId: Long): Product =
    transaction { Products.select(Products.id eq productId).single().toProduct() }

fun getOrder(orderId: Long): Order = transaction { Orders.select(Orders.id eq orderId).single().toOrder() }
