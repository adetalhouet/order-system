package io.adetalhouet.order.system.cart

import io.adetalhouet.order.system.utils.Status

class CartServiceImpl : CartServiceGrpcKt.CartServiceCoroutineImplBase() {

    override suspend fun addToCart(request: CartItem): Status {
        return super.addToCart(request)
    }

    override suspend fun remoteFromCart(request: CartItem): Status {
        return super.remoteFromCart(request)
    }
}