package io.adetalhouet.order.system.graphql.schema

import com.google.api.graphql.rejoiner.Query
import com.google.api.graphql.rejoiner.SchemaModule
import io.adetalhouet.order.system.cart.CartItem
import io.adetalhouet.order.system.cart.CartServiceGrpcKt
import io.adetalhouet.order.system.cart.UpdateCartRequest
import io.adetalhouet.order.system.utils.Status

class CartSchemaModule : SchemaModule() {

    @Query("addToCart")
    suspend fun addToCart(client: CartServiceGrpcKt.CartServiceCoroutineStub, request: UpdateCartRequest): Status {
        return client.addToCart(request)
    }

    @Query("remoteFromCart")
    suspend fun remoteFromCart(client: CartServiceGrpcKt.CartServiceCoroutineStub, request: UpdateCartRequest): Status {
        return client.remoteFromCart(request)
    }
}