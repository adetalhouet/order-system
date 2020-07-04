package io.adetalhouet.order.system

import io.adetalhouet.order.system.cart.CartAppKt
import io.adetalhouet.order.system.client.ClientAppKt
import io.adetalhouet.order.system.db.lib.DatabaseConnectionProperties
import io.adetalhouet.order.system.db.lib.DatabaseServiceImpl
import io.adetalhouet.order.system.graphql.app.GraphQLAppKt
import io.adetalhouet.order.system.order.OrderAppKt
import io.adetalhouet.order.system.product.ProductAppKt
import io.adetalhouet.order.system.test.TestUtilsKt
import np.com.madanpokharel.embed.nats.EmbeddedNatsConfig
import np.com.madanpokharel.embed.nats.EmbeddedNatsServer
import np.com.madanpokharel.embed.nats.NatsServerConfig
import np.com.madanpokharel.embed.nats.NatsVersion
import np.com.madanpokharel.embed.nats.ServerType
import spock.lang.Specification

class OrderSystemSpec extends Specification {

    static EmbeddedNatsServer natsServer

    def setupSpec() {
        setupDB()
        setupNATS()
        Thread.start { CartAppKt.main() }
        Thread.start { ClientAppKt.main() }
        Thread.start { OrderAppKt.main() }
        Thread.start { ProductAppKt.main() }
        Thread.start { GraphQLAppKt.main() }

        // give time for the app to start
        Thread.sleep(10000)
    }

    def cleanupSpec() {
        natsServer.stopServer()
    }

    def "cds"() {
        expect:
        1 == 1
    }

    private static def setupDB() {
        DatabaseConnectionProperties props = new DatabaseConnectionProperties(
                "org.h2.Driver",
                "jdbc:h2:mem:order-system",
                "order-system",
                "Password123"
        )
        DatabaseServiceImpl db = new DatabaseServiceImpl(props)
        db.connect()

        TestUtilsKt.createTables()
        TestUtilsKt.cleanTables()
        TestUtilsKt.loadProducts()
    }

    private def setupNATS() {
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