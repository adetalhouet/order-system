package io.adetalhouet.order.system

import groovyx.net.http.RESTClient
import io.adetalhouet.order.system.cart.CartAppKt
import io.adetalhouet.order.system.graphql.app.GraphQLAppKt
import io.adetalhouet.order.system.test.TestUtilsKt
import io.adetalhouet.order.system.utils.Utils
import spock.lang.Shared
import spock.lang.Specification
import spock.lang.Stepwise

import static groovyx.net.http.ContentType.JSON

@Stepwise
class CartServiceITSpec extends Specification {

    @Shared
    private def graphqlClient = new RESTClient("http://localhost:8080/graphql")


    def setupSpec() {
        Utils.setupDB()
        Thread.start { CartAppKt.main() }
        Thread.start { GraphQLAppKt.main() }

        // give time for the apps to start
        Thread.sleep(7000)
    }

    def 'create cart should return 200 code (OK) with Cart ID'() {
        when: 'try to create cart'

        def query = '{"query":' +
                '"{\n createCart {' +
                '    cartId \n' +
                '  }\n' +
                '}"}'

        def response = graphqlClient.post(
                body: query,
                requestContentType: JSON)

        then: 'server returns 200 code with cart id and cart is registered in DB'
        response.data["data"]["createCart"]["cartId"] == 1
        def carts = TestUtilsKt.getCarts()
        carts.size() == 1
        carts[0].id == 1

        and:
        assert response.status == 200
    }

    def 'add items to cart should return 200 code (OK) and save update to DB'() {
        when: 'try to update cart'

        def query = '{"query":' +
                '"{\n' +
                '  updateCart(\n' +
                '    input: {\n' +
                '      cart_id: ' + cartId + '\n' +
                '      item: { product_id: ' + id + ', quantity: ' + quantity + ', price: ' + price + ' }\n' +
                '      isAdd: true\n' +
                '    }\n' +
                '  ) {\n' +
                '    _\n' +
                '  }\n' +
                '}\n' +
                '"}'

        def response = graphqlClient.post(
                body: query,
                requestContentType: JSON)

        then: 'server returns 200 code and cart is updated in DB'
        if (iterationCount == 2) {
            def cart = TestUtilsKt.getCart(cartId)
            assert cart.cartItems.cartItemsList.size() == 2
            assert cart.totalPrice == 10 * 5 + 10 * 5
        }

        and:
        assert response.status == 200

        where:
        cartId = 1

        id | quantity | price
        1 | 5 | 10
        2 | 5 | 10
    }


    def 'delete cart should return 200 code (OK)'() {
        when: 'try to create cart'

        def query = '{"query":' +
                '"{\n deleteCart(input: {\\n' +
                ' cart_id: ' + id + '\n' +
                '  }) ' +
                '  {\n' +
                '    _\n' +
                '  }\n' +
                '}"}'

        def response = graphqlClient.post(
                body: query,
                requestContentType: JSON)

        then: 'server returns 200 code and cart is deleted from DB'
        def carts = TestUtilsKt.getCarts()
        carts.size() == 0

        and:
        assert response.status == 200

        where:
        id = 1
    }
}