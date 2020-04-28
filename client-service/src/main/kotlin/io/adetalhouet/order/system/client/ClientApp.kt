package io.adetalhouet.order.system.client

import com.google.inject.Singleton
import io.adetalhouet.order.system.client.domain.model.Clients
import io.adetalhouet.order.system.db.utils.DatabaseConfiguration
import io.grpc.Server
import io.grpc.ServerBuilder
import org.jetbrains.exposed.sql.SchemaUtils
import org.jetbrains.exposed.sql.transactions.transaction
import java.io.IOException

@Singleton
class CartServer(private val port: Int) {
    private var server: Server? = null

    @Throws(IOException::class)
    fun start() {

        server = ServerBuilder.forPort(port)
            .addService(ClientServiceImpl())
            .build()
            .start()


        println("Client server started, listening on $port")

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
    val service = "client-service"

    val port = 9091
    val server = CartServer(port)
    server.start()

    DatabaseConfiguration(service)
    transaction {
        SchemaUtils.create(Clients)
    }

    server.blockUntilShutdown()
}