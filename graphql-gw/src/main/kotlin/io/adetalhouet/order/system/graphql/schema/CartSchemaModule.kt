package io.adetalhouet.order.system.graphql.schema

import com.google.api.graphql.rejoiner.Query
import com.google.api.graphql.rejoiner.SchemaModule
import com.google.common.util.concurrent.ListenableFuture
import io.adetalhouet.order.system.cart.CartServiceGrpc
import io.adetalhouet.order.system.cart.UpdateCartRequest
import io.adetalhouet.order.system.utils.Status

class CartSchemaModule : SchemaModule() {

    @Query("addToCart")
    fun addToCart(client: CartServiceGrpc.CartServiceFutureStub,
                  request: UpdateCartRequest): ListenableFuture<Status>? {
        return client.addToCart(request)
    }

    @Query("remoteFromCart")
    fun remoteFromCart(client: CartServiceGrpc.CartServiceFutureStub,
                       request: UpdateCartRequest): ListenableFuture<Status>? {
        return client.remoteFromCart(request)
    }
}