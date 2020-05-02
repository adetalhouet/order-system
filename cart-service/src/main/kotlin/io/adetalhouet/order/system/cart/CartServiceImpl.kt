package io.adetalhouet.order.system.cart

import com.google.protobuf.Empty
import com.google.protobuf.util.JsonFormat
import io.adetalhouet.order.system.db.domain.Carts
import io.adetalhouet.order.system.db.domain.toCart
import org.jetbrains.exposed.sql.SqlExpressionBuilder.eq
import org.jetbrains.exposed.sql.insert
import org.jetbrains.exposed.sql.select
import org.jetbrains.exposed.sql.update
import java.util.*

private fun CartItems.toJsonString(): String = JsonFormat.printer().print(this)

class CartServiceImpl : CartServiceGrpcKt.CartServiceCoroutineImplBase() {

    override suspend fun addToCart(request: UpdateCartRequest): Empty {

        if (Objects.isNull(request.cartId)) {
            val itemList = CartItems.newBuilder().addCartItems(request.item).build()
            Carts.insert {
                it[items] = itemList.toJsonString()
                it[totalPrice] = request.item.totalPrice
            }
        } else {

            // FIXME convert items list from Json string to array for persistence

            val cartToUpdate = Carts.select(Carts.id eq request.cartId).single().toCart()

            val itemList = CartItems.newBuilder()
                .addAllCartItems(cartToUpdate.cartItems.cartItemsList)
                .addCartItems(request.item)
                .build()

            val newTotalPrice = cartToUpdate.totalPrice + (request.item.totalPrice * request.item.quantity)

            Carts.update {
                it[id] = request.cartId
                it[items] = itemList.toJsonString()
                it[totalPrice] = newTotalPrice
            }
        }
        return Empty.getDefaultInstance()
    }

    override suspend fun remoteFromCart(request: UpdateCartRequest): Empty {

        val cartToUpdate = Carts.select(Carts.id eq request.cartId).single().toCart()

        val newTotalPrice = cartToUpdate.totalPrice - (request.item.totalPrice * request.item.quantity)

        val newItemList = cartToUpdate.cartItems.cartItemsList
        newItemList.remove(request.item)

        Carts.update {
            it[id] = request.cartId
            it[items] = CartItems.newBuilder().addAllCartItems(newItemList).build().toJsonString()
            it[totalPrice] = newTotalPrice
        }

        return Empty.getDefaultInstance()
    }
}