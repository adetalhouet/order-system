package io.adetalhouet.order.system.product

import com.google.inject.Singleton
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