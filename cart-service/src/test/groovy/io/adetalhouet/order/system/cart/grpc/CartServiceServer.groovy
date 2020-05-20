package io.adetalhouet.order.system.cart.grpc

import com.google.protobuf.Empty
import io.adetalhouet.order.system.cart.CartServiceImpl
import io.adetalhouet.order.system.cart.TestUtilsKt
import io.adetalhouet.order.system.cart.utils.GrpcCallInterceptor
import io.grpc.ManagedChannel
import io.grpc.inprocess.InProcessChannelBuilder
import io.grpc.inprocess.InProcessServerBuilder
import io.grpc.testing.GrpcCleanupRule
import org.junit.Rule

class CartServiceServer {
    @Rule
    public final GrpcCleanupRule grpcCleanup = new GrpcCleanupRule();

    private CartServiceGrpcKt.CartServiceCoroutineStub stub

    CartServiceServer() {
        // Generate a unique in-process server name.
        String serverName = InProcessServerBuilder.generateName();

        // Create a server, add service, start, and register for automatic graceful shutdown.
        grpcCleanup
                .register(InProcessServerBuilder
                        .forName(serverName)
                        .directExecutor()
                        .intercept(GrpcCallInterceptor.instance)
                        .addService(new CartServiceImpl())
                        .build()
                        .start());

        // Create a client channel and register for automatic graceful shutdown.
        ManagedChannel channel = grpcCleanup
                .register(InProcessChannelBuilder
                        .forName(serverName)
                        .directExecutor()
                        .build())

        stub = new CartServiceGrpcKt.CartServiceCoroutineStub(channel)
    }

    CartId createCart() {
        return TestUtilsKt.runBlocking { cont ->
            stub.createCart(Empty.getDefaultInstance(), cont)
        }
    }

    def deleteCart(CartId cartId) {
        return TestUtilsKt.runBlocking { cont ->
            stub.deleteCart(cartId, cont)
        }
    }

}