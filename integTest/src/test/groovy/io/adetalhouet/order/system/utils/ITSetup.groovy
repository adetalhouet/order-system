package io.adetalhouet.order.system.utils

import io.adetalhouet.order.system.cart.CartAppKt
import io.adetalhouet.order.system.client.ClientAppKt
import io.adetalhouet.order.system.db.lib.DatabaseConnectionProperties
import io.adetalhouet.order.system.db.lib.DatabaseServiceImpl
import io.adetalhouet.order.system.graphql.app.GraphQLAppKt
import io.adetalhouet.order.system.order.OrderAppKt
import io.adetalhouet.order.system.product.ProductAppKt
import io.adetalhouet.order.system.test.TestDBUtilsKt
import np.com.madanpokharel.embed.nats.*
import org.jetbrains.exposed.sql.Database

class ITSetup {

    private static EmbeddedNatsServer natsServer = null
    private static Database db = null
    private static isAppsStarted = false

    static def setupOnce() {
        setupDB()
        setupNATS()

        if (!isAppsStarted) {
            Thread.start { ClientAppKt.main() }
            Thread.start { CartAppKt.main() }
            Thread.start { OrderAppKt.main() }
            Thread.start { ProductAppKt.main() }
            Thread.start { GraphQLAppKt.main() }

            // give time for the apps to start
            Thread.sleep(10000)
            isAppsStarted = true
        }
    }

    static def setupDB() {
        if (db == null) {
            DatabaseConnectionProperties props = new DatabaseConnectionProperties(
                    "org.h2.Driver",
                    "jdbc:h2:mem:order-system",
                    "order-system",
                    "Password123"
            )
            DatabaseServiceImpl dbService = new DatabaseServiceImpl(props)
            db = dbService.connect()
            TestDBUtilsKt.createTables()
        }
    }

    static def setupNATS() {
        if (natsServer == null) {
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
            natsServer = new EmbeddedNatsServer(config)
            natsServer.startServer()
        }
    }
}
