package io.adetalhouet.order.system.order

import io.grpc.Server
import io.grpc.ServerBuilder
import java.io.IOException

class OrderServer(private val port: Int) {
    private var server: Server? = null

    @Throws(IOException::class)
    fun start() {

        server = ServerBuilder.forPort(port)
            .addService(OrderServiceImpl())
            .build()
            .start()

        Runtime.getRuntime().addShutdownHook(object : Thread() {
            override fun run() {
                println("*** shutting down gRPC server since JVM is shutting down")
                this@OrderServer.stop()
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
    val port = 9092
    val server = OrderServer(port)
    server.start()
    server.blockUntilShutdown()
}