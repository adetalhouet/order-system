package io.adetalhouet.order.system.product

import com.google.inject.Inject
import com.typesafe.config.Config
import com.typesafe.config.ConfigFactory
import io.adetalhouet.order.system.product.grpc.ProductServiceGrpcKt
import io.grpc.Server
import io.grpc.ServerBuilder
import org.slf4j.LoggerFactory
import java.io.IOException

class ProductServer {
    private val log = LoggerFactory.getLogger(ProductServer::class.java)

    @Inject
    private lateinit var productService: ProductServiceGrpcKt.ProductServiceCoroutineImplBase

    private var server: Server? = null

    @Throws(IOException::class)
    fun start() {
        val conf: Config = ConfigFactory.load()
        server = ServerBuilder.forPort(conf.getInt("product.port"))
            .addService(productService)
            .build()
            .start()
        log.info("Product server started")

        Runtime.getRuntime().addShutdownHook(object : Thread() {
            override fun run() {
                log.info("*** shutting down gRPC server since JVM is shutting down")
                this@ProductServer.stop()
            }
        })
    }

    fun stop() {
        server?.shutdown()
    }
}