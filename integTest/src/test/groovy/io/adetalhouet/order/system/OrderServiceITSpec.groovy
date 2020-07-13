package io.adetalhouet.order.system

import io.adetalhouet.order.system.order.grpc.Order
import io.adetalhouet.order.system.test.TestDBUtilsKt
import io.adetalhouet.order.system.utils.ITSetup
import io.adetalhouet.order.system.utils.QueryLibrary
import spock.lang.Shared
import spock.lang.Specification
import spock.lang.Stepwise

@Stepwise
class OrderServiceITSpec extends Specification {

    @Shared
    private def query = new QueryLibrary()

    @Shared
    private int clientId
    @Shared
    private int cartId
    @Shared
    private int orderId

    def setupSpec() {
        ITSetup.setupOnce()
    }

    def 'place order and expect product inventory update and order status change'() {
        when: 'try to place order'
        int initialProductQuantity = 100
        clientId = query.createClient("Montreal", "1983453.8", "admin@mtl.ca")
                .data["data"]["addClient"]["id"] as int
        def productId1 = query.addProduct("Baseball", 10.0, initialProductQuantity)
        def productId2 = query.addProduct("Mask", 3.75, initialProductQuantity)
        cartId = query.createCart()
        query.addItemToCart(cartId, productId1, 5, 10)
        query.addItemToCart(cartId, productId2, 1, 3.75)
        orderId = query.placeOrder(clientId, cartId)

        then: 'server returns 200 code'
        // check product quantity has been decreased in the inventory
        assert TestDBUtilsKt.getProduct(productId1).quantity == initialProductQuantity - 5
        assert TestDBUtilsKt.getProduct(productId2).quantity == initialProductQuantity - 1
        // check order status
        assert orderId == 1
        assert TestDBUtilsKt.getOrder(orderId).state == Order.State.PLACED
    }

    def 'track placed order should provide status and order information'() {
        when: 'track order'
        def response = query.trackOrder(orderId)

        then: 'server returns 200 code with order details'
        assert response.status == 200

        assert response.data["data"]["trackOrderById"]["order"]["clientId"] == clientId
        assert response.data["data"]["trackOrderById"]["order"]["cartId"] == cartId
        assert response.data["data"]["trackOrderById"]["order"]["state"] == "PLACED"
    }
}