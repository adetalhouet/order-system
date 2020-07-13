package io.adetalhouet.order.system.graphql.app

import io.adetalhouet.order.system.graphql.GraphQLServer
import kotlinx.coroutines.runBlocking
import org.slf4j.LoggerFactory

class Server {
    private val log = LoggerFactory.getLogger(Server::class.java)

    private var graphql = GraphQLServer()

    fun start() {
        val port = 8080
        log.info("Start Graphql Server")
        graphql.start(port)

        Runtime.getRuntime().addShutdownHook(object : Thread() {
            override fun run() {
                log.info("*** shutting down GraphQL server since JVM is shutting down")
                this@Server.stop()
            }
        })
    }

    fun stop() {
        graphql.stop()
    }
}

fun main() = runBlocking {
    Server().start()
}