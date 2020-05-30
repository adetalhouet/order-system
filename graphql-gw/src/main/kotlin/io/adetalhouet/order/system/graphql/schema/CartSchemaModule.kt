package io.adetalhouet.order.system.graphql.schema

import com.google.api.graphql.rejoiner.Query
import com.google.api.graphql.rejoiner.SchemaModule
import com.google.common.util.concurrent.ListenableFuture
import com.google.protobuf.Empty
import io.adetalhouet.order.system.cart.grpc.CartId
import io.adetalhouet.order.system.cart.grpc.CartServiceGrpc
import io.adetalhouet.order.system.cart.grpc.UpdateCartRequest

class CartSchemaModule : SchemaModule() {

    @Query("createCart")
    fun createCart(client: CartServiceGrpc.CartServiceFutureStub): ListenableFuture<CartId> {
        return client.createCart(Empty.getDefaultInstance());
    }

    @Query("updateCart")
    fun updateCart(client: CartServiceGrpc.CartServiceFutureStub, request: UpdateCartRequest): ListenableFuture<Empty> {
        return client.updateCart(request)
    }

    @Query("deleteCart")
    fun deleteCart(client: CartServiceGrpc.CartServiceFutureStub,
                   request: CartId): ListenableFuture<Empty> {
        return client.deleteCart(request)
    }
}