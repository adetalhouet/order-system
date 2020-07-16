package io.adetalhouet.order.system.client

import com.google.inject.Guice
import io.adetalhouet.order.system.client.di.ClientServerModule
import io.adetalhouet.order.system.db.lib.DatabaseModule
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withContext

fun main() = runBlocking<Unit> {
    val injector = Guice.createInjector(ClientServerModule(), DatabaseModule())

    val db = injector.getInstance(DatabaseModule.DEFAULT_INSTANCE)
    db.connect()

    val server = injector.getInstance(ClientServer::class.java)
    withContext(Dispatchers.IO) {
        server.start()
        server.blockUntilShutdown()
    }
}
