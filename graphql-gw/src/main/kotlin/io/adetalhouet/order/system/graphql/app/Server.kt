package io.adetalhouet.order.system.graphql.app

import io.adetalhouet.order.system.graphql.GraphQLServer

class Server {

    private var graphql = GraphQLServer()

    fun start() {
        val port = 8080
        println("Start Graphql Server")
        graphql.start(port)
    }
}

fun main(args: Array<String>) {
    Server().start()
}