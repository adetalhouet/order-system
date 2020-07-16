package io.adetalhouet.order.system.cart.service

import com.google.protobuf.Empty
import io.adetalhouet.order.system.cart.grpc.CartId
import io.adetalhouet.order.system.cart.grpc.CartItems
import io.adetalhouet.order.system.cart.grpc.CartServiceGrpcKt
import io.adetalhouet.order.system.cart.grpc.UpdateCartRequest
import io.adetalhouet.order.system.db.domain.Carts
import io.adetalhouet.order.system.db.domain.toCart
import io.adetalhouet.order.system.db.domain.toJsonString
import io.adetalhouet.order.system.db.lib.DatabaseTransaction.dbQuery
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

    override suspend fun updateCart(request: UpdateCartRequest): Empty = dbQuery {
        val cartToUpdate = Carts.select(Carts.id eq request.cartId).single().toCart()

        val cartItemList = cartToUpdate.cartItems.cartItemsList.toMutableList()
        cartItemList.removeIf { it.productId == request.item.productId }
        if (request.isAdd) cartItemList.add(request.item)

        Carts.update {
            it[id] = request.cartId
            it[items] = CartItems.newBuilder().addAllCartItems(cartItemList).build().toJsonString()
            it[totalPrice] = cartItemList.sumByDouble { it.price * it.quantity }
            it[lastUpdatedMillis] = System.currentTimeMillis()
        }

        if (request.isAdd) log.debug("Added item(${request.item} to cart(id=${request.cartId}")
        else log.debug("Remove item(${request.item} from cart(id=${request.cartId}")

        Empty.getDefaultInstance()
    }

    override suspend fun getProductsByCartId(request: CartId): CartItems = dbQuery {
        Carts.select(Carts.id eq request.cartId).single().toCart().cartItems
    }
}
