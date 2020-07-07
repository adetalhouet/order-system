package io.adetalhouet.order.system.cart.grpc

import com.google.protobuf.Empty
import io.adetalhouet.order.system.cart.service.CartServiceImpl
import io.adetalhouet.order.system.test.TestUtilsKt
import io.grpc.ManagedChannel
import io.grpc.inprocess.InProcessChannelBuilder
import io.grpc.inprocess.InProcessServerBuilder
import io.grpc.testing.GrpcCleanupRule
import org.junit.Rule

class CartService {
    @Rule
    public final GrpcCleanupRule server = new GrpcCleanupRule();
    private CartServiceGrpcKt.CartServiceCoroutineStub client

    CartService() {
        // Generate a unique in-process server name.
        String serverName = InProcessServerBuilder.generateName();

        // SERVER
        server.register(InProcessServerBuilder
                .forName(serverName)
                .directExecutor()
                .addService(new CartServiceImpl())
                .build()
                .start());

        // CLIENT
        ManagedChannel channel = server
                .register(InProcessChannelBuilder
                        .forName(serverName)
                        .directExecutor()
                        .build())
        client = new CartServiceGrpcKt.CartServiceCoroutineStub(channel)
    }

    CartId createCart() {
        return TestUtilsKt.runBlocking { cont ->
            client.createCart(Empty.getDefaultInstance(), cont)
        }
    }

    def deleteCart(CartId cartId) {
        return TestUtilsKt.runBlocking { cont ->
            client.deleteCart(cartId, cont)
        }
    }

}