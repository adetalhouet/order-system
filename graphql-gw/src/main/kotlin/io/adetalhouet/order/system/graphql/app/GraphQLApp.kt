package io.adetalhouet.order.system.graphql.app

import com.typesafe.config.Config
import com.typesafe.config.ConfigFactory
import io.adetalhouet.order.system.graphql.GraphQLServer
import kotlinx.coroutines.runBlocking
import org.slf4j.LoggerFactory

class GraphQLApp {
    private val log = LoggerFactory.getLogger(GraphQLApp::class.java)

    private var graphql = GraphQLServer()

    fun start() {
        val conf: Config = ConfigFactory.load()

        val port = conf.getString("api-gw.port").toInt()
        log.info("Start Graphql Server")
        graphql.start(port)

        Runtime.getRuntime().addShutdownHook(object : Thread() {
            override fun run() {
                log.info("*** shutting down GraphQL server since JVM is shutting down")
                this@GraphQLApp.stop()
            }
        })
    }

    fun stop() {
        graphql.stop()
    }
}

fun main() = runBlocking {
    GraphQLApp().start()
}
