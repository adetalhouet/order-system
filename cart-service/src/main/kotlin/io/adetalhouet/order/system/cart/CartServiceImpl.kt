package io.adetalhouet.order.system.cart

import com.google.protobuf.Empty

class CartServiceImpl : CartServiceGrpcKt.CartServiceCoroutineImplBase() {

    override suspend fun addToCart(request: UpdateCartRequest): Empty {
        return super.addToCart(request)
    }

    override suspend fun remoteFromCart(request: UpdateCartRequest): Empty {
        return super.remoteFromCart(request)
    }

}