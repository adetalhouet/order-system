package io.adetalhouet.order.system.nats.lib

import io.nats.client.Connection
import io.nats.client.Nats
import io.nats.client.Options
import java.time.Duration

class BasicAuthNatsService(private val natsConnectionProperties: BasicAuthNatsConnectionProperties) : NatsService {

    lateinit var natsServer: Connection

    override fun connection(): Connection {
        if (!::natsServer.isInitialized) {
            val options: Options =
                Options.Builder()
                    .server(natsConnectionProperties.host)
                    .userInfo(natsConnectionProperties.username.toCharArray(),
                        natsConnectionProperties.password.toCharArray())
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