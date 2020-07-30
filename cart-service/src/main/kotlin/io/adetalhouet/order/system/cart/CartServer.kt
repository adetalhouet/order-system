package io.adetalhouet.order.system.cart

import com.google.inject.Inject
import com.typesafe.config.Config
import com.typesafe.config.ConfigFactory
import io.adetalhouet.order.system.cart.grpc.CartServiceGrpcKt
import io.grpc.Server
import io.grpc.ServerBuilder
import org.slf4j.LoggerFactory
import java.io.IOException

class CartServer {
    private val log = LoggerFactory.getLogger(CartServer::class.java)

    @Inject
    private lateinit var cartService: CartServiceGrpcKt.CartServiceCoroutineImplBase
    private var server: Server? = null

    @Throws(IOException::class)
    fun start() {

        val conf: Config = ConfigFactory.load()
        server = ServerBuilder.forPort(conf.getString("cart.port").toInt())
            .addService(cartService)
            .build()
            .start()
        log.info("Cart server started")
        Runtime.getRuntime().addShutdownHook(object : Thread() {
            override fun run() {
                log.info("*** shutting down gRPC server since JVM is shutting down")
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
