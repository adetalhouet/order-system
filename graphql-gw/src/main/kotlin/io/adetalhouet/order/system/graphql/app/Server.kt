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
    }
}

fun main() = runBlocking {
    Server().start()
}