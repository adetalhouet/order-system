package io.adetalhouet.order.system

import io.adetalhouet.order.system.test.TestDBUtilsKt
import io.adetalhouet.order.system.utils.ITSetup
import io.adetalhouet.order.system.utils.QueryLibrary
import spock.lang.Shared
import spock.lang.Specification
import spock.lang.Stepwise

@Stepwise
class CartServiceITSpec extends Specification {

    @Shared
    private def query = new QueryLibrary()

    def setupSpec() {
        ITSetup.setupOnce()
    }

    def 'create cart should return 200 code (OK) with Cart ID'() {
        when: 'try to create cart'
        def cartId = query.createCart()

        then: 'server returns 200 code with cart id and cart is registered in DB'
        cartId == 1
        def carts = TestDBUtilsKt.getCarts()
        carts.size() == 1
        carts[0].id == 1
    }

    def 'add items to cart should return 200 code (OK) and save update to DB'() {
        when: 'try to update cart'
        def response = query.addItemToCart(cartId, id, quantity, price)

        then: 'server returns 200 code and cart is updated in DB'
        if (iterationCount == 2) {
            def cart = TestDBUtilsKt.getCart(cartId)
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
        def response = query.deleteCart(id)

        then: 'server returns 200 code and cart is deleted from DB'
        def carts = TestDBUtilsKt.getCarts()
        carts.size() == 0

        and:
        assert response.status == 200

        where:
        id = 1
    }
}