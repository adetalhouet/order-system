package io.adetalhouet.order.system.order

import com.google.inject.Inject
import com.typesafe.config.Config
import com.typesafe.config.ConfigFactory
import io.adetalhouet.order.system.order.grpc.OrderServiceGrpcKt
import io.grpc.Server
import io.grpc.ServerBuilder
import org.slf4j.LoggerFactory
import java.io.IOException

class OrderServer {
    private val log = LoggerFactory.getLogger(OrderServer::class.java)

    @Inject
    private lateinit var orderService: OrderServiceGrpcKt.OrderServiceCoroutineImplBase

    private var server: Server? = null

    @Throws(IOException::class)
    fun start() {

        val conf: Config = ConfigFactory.load()
        server = ServerBuilder.forPort(conf.getInt("order.port"))
            .addService(orderService)
            .build()
            .start()
        log.info("Order server started")

        Runtime.getRuntime().addShutdownHook(object : Thread() {
            override fun run() {
                log.info("*** shutting down gRPC server since JVM is shutting down")
                this@OrderServer.stop()
            }
        })
    }

    fun stop() {
        server?.shutdown()
    }
}