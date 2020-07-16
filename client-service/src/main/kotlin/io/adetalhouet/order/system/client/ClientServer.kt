package io.adetalhouet.order.system.client

import com.google.inject.Inject
import com.typesafe.config.Config
import com.typesafe.config.ConfigFactory
import io.adetalhouet.order.system.client.grpc.ClientServiceGrpcKt
import io.grpc.Server
import io.grpc.ServerBuilder
import org.slf4j.LoggerFactory
import java.io.IOException

class ClientServer {
    private val log = LoggerFactory.getLogger(ClientServer::class.java)

    @Inject
    private lateinit var clientGrpcServer: ClientServiceGrpcKt.ClientServiceCoroutineImplBase
    private var server: Server? = null

    @Throws(IOException::class)
    fun start() {

        val conf: Config = ConfigFactory.load()
        server = ServerBuilder.forPort(conf.getInt("client.port"))
            .addService(clientGrpcServer)
            .build()
            .start()


        log.info("Client server started")

        Runtime.getRuntime().addShutdownHook(object : Thread() {
            override fun run() {
                log.info("*** shutting down gRPC server since JVM is shutting down")
                this@ClientServer.stop()
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
