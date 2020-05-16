package io.adetalhouet.order.system.cart

import com.google.inject.Inject
import io.adetalhouet.order.system.cart.di.TestModule
import io.adetalhouet.order.system.cart.grpc.CartServiceServer
import io.adetalhouet.order.system.cart.utils.GrpcCallInterceptor
import io.adetalhouet.order.system.db.utils.DatabaseConfiguration
import spock.guice.UseModules
import spock.lang.Specification

@UseModules(TestModule)
class CartServiceSpec extends Specification {

    @Inject
    CartServiceServer server

    def setupSpec() {
        DatabaseConfiguration db = new DatabaseConfiguration("test-carts-service", "jdbc:h2:mem:carts", "org.h2.Driver")
        TestUtilsKt.createTables()
    }

    def "test create cart"() {
        expect:
        server.createCart().cartId == 1
        GrpcCallInterceptor.instance.intercepted
    }
}