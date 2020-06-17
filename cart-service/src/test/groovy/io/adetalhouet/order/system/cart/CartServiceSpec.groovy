package io.adetalhouet.order.system.cart

import io.adetalhouet.order.system.cart.grpc.CartId
import io.adetalhouet.order.system.cart.grpc.CartService
import io.adetalhouet.order.system.db.lib.DatabaseConnectionProperties
import io.adetalhouet.order.system.db.lib.DatabaseServiceImpl
import io.adetalhouet.order.system.db.test.TestUtilsKt
import spock.lang.Specification

class CartServiceSpec extends Specification {

    private CartService server = new CartService()

    def setupSpec() {
        DatabaseConnectionProperties props = new DatabaseConnectionProperties(
                "org.h2.Driver",
                "jdbc:h2:mem:carts",
                "order-system",
                "Password123"
        )
        DatabaseServiceImpl db = new DatabaseServiceImpl(props)
        db.connect()

        TestUtilsKt.createTables()
        TestUtilsKt.cleanTables()
    }

    def cleanup() {
        TestUtilsKt.cleanTables()
    }

    def "create one cart"() {
        expect:
        server.createCart().cartId == 1
    }

    def "create 10 carts"() {
        given:
        def numberOfCartToCreate = 10

        when:
        numberOfCartToCreate.times { server.createCart() }

        then:
        TestUtilsKt.getCartSize() == numberOfCartToCreate
    }

    def "delete one cart when no cart exist should work"() {
        expect:
        CartId cartId = CartId.newBuilder().build()
        server.deleteCart(cartId)
    }
}