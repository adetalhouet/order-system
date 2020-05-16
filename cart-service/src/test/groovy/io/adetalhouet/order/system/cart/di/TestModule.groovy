package io.adetalhouet.order.system.cart.di

import com.google.inject.AbstractModule
import io.adetalhouet.order.system.cart.grpc.CartServiceServer

class TestModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(CartServiceServer.class).toInstance(new CartServiceServer())
    }
}