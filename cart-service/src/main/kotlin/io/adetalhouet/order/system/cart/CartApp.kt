package io.adetalhouet.order.system.cart

import com.google.inject.Singleton
import io.adetalhouet.order.system.db.utils.DatabaseConfiguration
import io.grpc.Server
import io.grpc.ServerBuilder
import java.io.IOException

@Singleton
class CartServer(private val port: Int) {
    private var server: Server? = null

    @Throws(IOException::class)
    fun start() {

        server = ServerBuilder.forPort(port)
            .addService(CartServiceImpl())
            .build()
            .start()
        println("Cart server started, listening on $port")
        Runtime.getRuntime().addShutdownHook(object : Thread() {
            override fun run() {
                println("*** shutting down gRPC server since JVM is shutting down")
                this@CartServer.stop()
            }
        })
    }

    fun stop() {
        server?.shutdown()
    }

    @Throws(InterruptedException::class)
    fun blockUntilShutdown() {
        server?.awaitTermination()
    }
}

fun main(args: Array<String>) {
    val port = 9090
    val server = CartServer(port)
    server.start()

    DatabaseConfiguration("cart-service")

    server.blockUntilShutdown()
}