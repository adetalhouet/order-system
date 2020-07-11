package io.adetalhouet.order.system

import com.google.inject.Inject
import io.adetalhouet.order.system.cart.CartAppKt
import io.adetalhouet.order.system.client.ClientAppKt
import io.adetalhouet.order.system.graphql.app.GraphQLAppKt
import io.adetalhouet.order.system.nats.lib.di.NatsModule
import io.adetalhouet.order.system.nats.lib.service.NatsService
import io.adetalhouet.order.system.order.OrderAppKt
import io.adetalhouet.order.system.order.grpc.Order
import io.adetalhouet.order.system.product.ProductAppKt
import io.adetalhouet.order.system.test.TestDBUtilsKt
import io.adetalhouet.order.system.utils.QueryLibrary
import io.adetalhouet.order.system.utils.Utils
import np.com.madanpokharel.embed.nats.EmbeddedNatsServer
import spock.guice.UseModules
import spock.lang.Shared
import spock.lang.Specification
import spock.lang.Stepwise

import javax.inject.Named

@Stepwise
@UseModules(NatsModule)
class OrderServiceITSpec extends Specification {

    @Shared
    private def query = new QueryLibrary()
    @Shared
    private EmbeddedNatsServer natsServer

    @Inject
    @Named("Default")
    @Shared
    private NatsService natsClient

    private int clientId = 1
    private int cartId = 1
    @Shared
    private int initialProductQuantity = 100

    def setupSpec() {
        Utils.setupDB()
        natsServer = Utils.setupNATS()
        Thread.start { ClientAppKt.main() }
        Thread.start { CartAppKt.main() }
        Thread.start { OrderAppKt.main() }
        Thread.start { ProductAppKt.main() }
        Thread.start { GraphQLAppKt.main() }

        // give time for the apps to start
        Thread.sleep(8000)

        query.createClient("Montreal", "1983453.8", "admin@mtl.ca")
        query.addProduct(1, "Baseball", 10.0, initialProductQuantity)
        query.addProduct(2, "Mask", 3.75, initialProductQuantity)
        query.createCart()
        query.addItemToCart(1, 1, 5, 10)
        query.addItemToCart(1, 2, 1, 3.75)
    }

    def cleanupSpec() {
        natsServer.stopServer()
    }


    def 'place order and expect product inventory update and order status change'() {
        when: 'try to place order'
        def response = query.placeOrder(clientId, cartId)

        then: 'server returns 200 code'
        // check product quantity has been decreased in the inventory
        assert TestDBUtilsKt.getProduct(1).quantity == initialProductQuantity - 5
        assert TestDBUtilsKt.getProduct(2).quantity == initialProductQuantity - 1
        // check order status
        assert TestDBUtilsKt.getOrder(1).state == Order.State.PLACED

        assert response.status == 200
    }
}