package io.adetalhouet.order.system.graphql.schema

import com.google.api.graphql.rejoiner.Query
import com.google.api.graphql.rejoiner.SchemaModule
import com.google.common.util.concurrent.ListenableFuture
import com.google.protobuf.Empty
import io.adetalhouet.order.system.cart.grpc.CartId
import io.adetalhouet.order.system.cart.grpc.CartServiceGrpc
import io.adetalhouet.order.system.cart.grpc.UpdateCartRequest
import io.adetalhouet.order.system.graphql.mustBeSet
import io.adetalhouet.order.system.graphql.returnFailedFutureOnException

class CartSchemaModule : SchemaModule() {

    @Query("createCart")
    fun createCart(client: CartServiceGrpc.CartServiceFutureStub): ListenableFuture<CartId> =
        returnFailedFutureOnException {
            client.createCart(Empty.getDefaultInstance());
        }

    @Query("updateCart")
    fun updateCart(client: CartServiceGrpc.CartServiceFutureStub, request: UpdateCartRequest): ListenableFuture<Empty> =
        returnFailedFutureOnException {
            checkNotNull(request.cartId) { "Cart ID".mustBeSet() }
            client.updateCart(request)
        }

    @Query("deleteCart")
    fun deleteCart(client: CartServiceGrpc.CartServiceFutureStub,
                   request: CartId): ListenableFuture<Empty> = returnFailedFutureOnException {
        checkNotNull(request.cartId) { "Cart ID".mustBeSet() }
        client.deleteCart(request)
    }
}