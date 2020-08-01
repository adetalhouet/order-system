package io.adetalhouet.order.system.nats.lib.service

import io.adetalhouet.order.system.nats.lib.BasicAuthNatsConnectionProperties
import io.nats.client.Connection
import io.nats.client.Nats
import io.nats.client.Options
import java.time.Duration

class BasicAuthNatsService(private val natsConnectionProperties: BasicAuthNatsConnectionProperties) :
    NatsService {

    lateinit var natsServer: Connection

    override fun connection(): Connection {

        val usernameV: String = System.getenv("NATS_USERNAME") ?: natsConnectionProperties.username
        val passwordV: String = System.getenv("NATS_PASSWORD") ?: natsConnectionProperties.password

        if (!::natsServer.isInitialized) {
            val options: Options =
                Options.Builder()
                    .server(natsConnectionProperties.host)
                    .userInfo(usernameV.toCharArray(), passwordV.toCharArray())
                    .connectionTimeout(Duration.ofSeconds(natsConnectionProperties.connectionTimeout))
                    .pingInterval(Duration.ofSeconds(natsConnectionProperties.pingInterval))
                    .maxPingsOut(natsConnectionProperties.maxPingsOut)
                    .maxReconnects(natsConnectionProperties.maxReconnects)
                    .reconnectWait(Duration.ofSeconds(natsConnectionProperties.reconnectWait))
                    .connectionName(natsConnectionProperties.connectionName)
                    .build()

            natsServer = Nats.connect(options)
        }
        return natsServer
    }
}
