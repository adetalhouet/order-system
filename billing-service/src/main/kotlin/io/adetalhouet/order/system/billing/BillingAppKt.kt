package io.adetalhouet.order.system.billing

import io.grpc.Server
import io.grpc.ServerBuilder
import java.io.IOException

class BillingServer(private val port: Int) {
    private var server: Server? = null

    @Throws(IOException::class)
    fun start() {

        server = ServerBuilder.forPort(port)
            .addService(BillingServiceImpl())
            .build()
            .start()

        Runtime.getRuntime().addShutdownHook(object : Thread() {
            override fun run() {
                println("*** shutting down gRPC server since JVM is shutting down")
                this@BillingServer.stop()
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
    val server = BillingServer(port)
    server.start()
    server.blockUntilShutdown()
}