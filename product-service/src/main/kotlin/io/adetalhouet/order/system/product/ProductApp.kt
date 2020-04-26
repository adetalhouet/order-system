package io.adetalhouet.order.system.order

import com.google.inject.Singleton
import io.adetalhouet.order.system.product.ProductServiceImpl
import io.grpc.Server
import io.grpc.ServerBuilder
import java.io.IOException

@Singleton
class ProductServer(private val port: Int) {
    private var server: Server? = null

    @Throws(IOException::class)
    fun start() {

        server = ServerBuilder.forPort(port)
            .addService(ProductServiceImpl())
            .build()
            .start()
        println("Order server started, listening on $port")

        Runtime.getRuntime().addShutdownHook(object : Thread() {
            override fun run() {
                println("*** shutting down gRPC server since JVM is shutting down")
                this@ProductServer.stop()
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
    val port = 9093
    val server = ProductServer(port)
    server.start()
    server.blockUntilShutdown()
}