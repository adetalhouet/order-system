package io.adetalhouet.order.system

import io.adetalhouet.order.system.test.TestDBUtilsKt
import io.adetalhouet.order.system.utils.ITSetup
import io.adetalhouet.order.system.utils.QueryLibrary
import spock.lang.Shared
import spock.lang.Specification
import spock.lang.Stepwise

@Stepwise
class ProductServiceITSpec extends Specification {

    @Shared
    private def query = new QueryLibrary()

    String name = "Headset"
    int price = 234
    int quantity = 24
    @Shared
    int productId = -1

    def setupSpec() {
        ITSetup.setupOnce()
    }

    def 'add product should return 200 code (OK), save in DB and return product ID'() {
        when: 'try to add product'
        productId = query.addProduct(name, price, quantity)

        then: 'server returns 200 code with product id and product is registered in DB'
        def product = TestDBUtilsKt.getProduct(productId)
        assert product.quantity == quantity
        assert product.price == price
    }

    def 'get product by ID should return 200 code (OK) with product details'() {
        when: 'try to get product'
        def response = query.getProduct(productId)

        then: 'server returns 200 code with product id and product is registered in DB'

        assert response.data["data"]["getProductById"]["name"] == name
        assert response.data["data"]["getProductById"]["quantity"] == quantity
        assert response.data["data"]["getProductById"]["price"] == price
    }

    def 'get products should return 200 code (OK)'() {
        when: 'try to delete product'
        def response = query.getProducts()

        then: 'server returns 200 code'
        // offset by 1 as list start at index 0
        assert response.data["data"]["getProducts"]["products"][productId - 1]["name"] == name
        assert response.data["data"]["getProducts"]["products"][productId - 1]["quantity"] == quantity
        assert response.data["data"]["getProducts"]["products"][productId - 1]["price"] == price
    }

    def 'delete product should return 200 code (OK) and remove from db'() {
        when: 'try to delete product'
        query.deleteProduct(productId)

        then: 'server returns 200 code and product has been removed from db'
        TestDBUtilsKt.getProducts().forEach { p ->
            if (p.id == productId) {
                assert false, "Expect product to be deleted"
            }
        }
    }
}
