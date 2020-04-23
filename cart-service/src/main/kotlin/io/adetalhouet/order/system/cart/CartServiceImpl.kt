package io.adetalhouet.order.system.cart

import io.adetalhouet.order.system.utils.Status

class CartServiceImpl : CartServiceGrpcKt.CartServiceCoroutineImplBase() {

    override suspend fun addToCart(request: UpdateCartRequest): Status {
        return super.addToCart(request)
    }

    override suspend fun remoteFromCart(request: UpdateCartRequest): Status {
        return super.remoteFromCart(request)
    }

}