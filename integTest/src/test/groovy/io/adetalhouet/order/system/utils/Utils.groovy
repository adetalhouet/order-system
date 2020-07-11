package io.adetalhouet.order.system.utils

import io.adetalhouet.order.system.db.lib.DatabaseConnectionProperties
import io.adetalhouet.order.system.db.lib.DatabaseServiceImpl
import io.adetalhouet.order.system.test.TestDBUtilsKt
import np.com.madanpokharel.embed.nats.EmbeddedNatsConfig
import np.com.madanpokharel.embed.nats.EmbeddedNatsServer
import np.com.madanpokharel.embed.nats.NatsServerConfig
import np.com.madanpokharel.embed.nats.NatsVersion
import np.com.madanpokharel.embed.nats.ServerType

class Utils {
    static def setupDB() {
        DatabaseConnectionProperties props = new DatabaseConnectionProperties(
                "org.h2.Driver",
                "jdbc:h2:mem:order-system",
                "order-system",
                "Password123"
        )
        DatabaseServiceImpl db = new DatabaseServiceImpl(props)
        db.connect()

        TestDBUtilsKt.createTables()
        TestDBUtilsKt.cleanTables()
    }

    static def setupNATS() {
        EmbeddedNatsConfig config = new EmbeddedNatsConfig.Builder()
                .withNatsServerConfig(
                        new NatsServerConfig.Builder()
                                .withServerType(ServerType.NATS)
                                .withNatsVersion(NatsVersion.V2_1_0)
                                .withConfigParam("--trace", "--trace")
                                .withConfigParam("--user", "order-system")
                                .withConfigParam("--pass", "Password123")
                                .build()
                )
                .build()
        EmbeddedNatsServer natsServer = new EmbeddedNatsServer(config)
        natsServer.startServer()
        return natsServer
    }
}
