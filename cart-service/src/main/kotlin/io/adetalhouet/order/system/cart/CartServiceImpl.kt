package io.adetalhouet.order.system.cart

import com.google.protobuf.Empty
import io.adetalhouet.order.system.cart.grpc.CartId
import io.adetalhouet.order.system.cart.grpc.CartItem
import io.adetalhouet.order.system.cart.grpc.CartItems
import io.adetalhouet.order.system.cart.grpc.CartServiceGrpcKt
import io.adetalhouet.order.system.cart.grpc.UpdateCartRequest
import io.adetalhouet.order.system.db.domain.Carts
import io.adetalhouet.order.system.db.domain.toCart
import io.adetalhouet.order.system.db.domain.toCartItems
import io.adetalhouet.order.system.db.domain.toJsonString
import io.adetalhouet.order.system.db.utils.DatabaseFactory.Grpc.dbQuery
import org.jetbrains.exposed.sql.SqlExpressionBuilder.eq
import org.jetbrains.exposed.sql.deleteWhere
import org.jetbrains.exposed.sql.insert
import org.jetbrains.exposed.sql.select
import org.jetbrains.exposed.sql.update
import org.slf4j.LoggerFactory

class CartServiceImpl : CartServiceGrpcKt.CartServiceCoroutineImplBase() {

    private val log = LoggerFactory.getLogger(CartServiceImpl::class.java)

    override suspend fun createCart(request: Empty): CartId = dbQuery {
        val cartId = Carts.insert {
            it[lastUpdatedMillis] = System.currentTimeMillis()
        }[Carts.id]

        log.debug("Created cart(id=$cartId")
        CartId.newBuilder().setCartId(cartId).build()
    }

    override suspend fun deleteCart(request: CartId): Empty = dbQuery {
        Carts.deleteWhere { Carts.id eq request.cartId }

        log.debug("Deleted cart(id=${request.cartId}")
        Empty.getDefaultInstance()
    }

    override suspend fun addToCart(request: UpdateCartRequest): Empty = dbQuery {
        val cartToUpdate = Carts.select(Carts.id eq request.cartId).single().toCart()
        var itemToAdd: CartItem = CartItem.getDefaultInstance()
        val cartItemList = cartToUpdate.cartItems.cartItemsList.toMutableList()

        var updated = false
        cartItemList.firstOrNull() { it.productId == request.item.productId }?.let {
            updated = true
            val newQuantity = it.quantity + request.item.quantity
            val newTotal = it.totalPrice + request.item.totalPrice

            itemToAdd = CartItem.newBuilder()
                .setProductId(it.productId)
                .setQuantity(newQuantity)
                .setTotalPrice(newTotal)
                .build()
        } ?: run {
            itemToAdd = request.item
        }

        if (updated) cartItemList.removeIf { it.productId == request.item.productId }
        cartItemList.add(itemToAdd)

        val itemList = CartItems.newBuilder()
            .addAllCartItems(cartItemList)
            .build()

        val newTotalPrice = cartItemList.sumByDouble { it.totalPrice }

        Carts.update {
            it[id] = request.cartId
            it[items] = itemList.toJsonString()
            it[totalPrice] = newTotalPrice
            it[lastUpdatedMillis] = System.currentTimeMillis()
        }

        log.debug("Added item(${request.item} to cart(id=${request.cartId}")
        Empty.getDefaultInstance()
    }

    override suspend fun remoteFromCart(request: UpdateCartRequest): Empty = dbQuery {
        val cartToUpdate = Carts.select(Carts.id eq request.cartId).single().toCart()
        val newTotalPrice = cartToUpdate.totalPrice - request.item.totalPrice

        val newItemList = cartToUpdate.cartItems.cartItemsList.toMutableList()
        newItemList.remove(request.item)

        Carts.update {
            it[id] = request.cartId
            it[items] = newItemList.toCartItems()
            it[totalPrice] = newTotalPrice
        }

        log.debug("Remove item(${request.item} from cart(id=${request.cartId}")
        Empty.getDefaultInstance()
    }

}