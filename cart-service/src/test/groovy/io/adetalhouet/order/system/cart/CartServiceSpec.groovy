package io.adetalhouet.order.system.cart

import com.google.inject.Inject
import io.adetalhouet.order.system.cart.di.TestModule
import io.adetalhouet.order.system.cart.grpc.CartId
import io.adetalhouet.order.system.cart.grpc.CartServiceServer
import io.adetalhouet.order.system.cart.utils.GrpcCallInterceptor
import io.adetalhouet.order.system.db.utils.DatabaseConfiguration
import spock.guice.UseModules
import spock.lang.Specification
import spock.lang.Unroll

@UseModules(TestModule)
class CartServiceSpec extends Specification {

    @Inject
    CartServiceServer server

    def setupSpec() {
        DatabaseConfiguration db = new DatabaseConfiguration("test-carts-service", "jdbc:h2:mem:carts", "org.h2.Driver")
        TestUtilsKt.createTables()
        TestUtilsKt.getCartSize()
        TestUtilsKt.cleanTables()
    }

    def cleanup() {
        TestUtilsKt.cleanTables()
    }

    def "create one cart"() {
        expect:
        server.createCart().cartId == 1
        GrpcCallInterceptor.instance.intercepted
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