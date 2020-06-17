package io.adetalhouet.order.system

import io.adetalhouet.order.system.db.lib.DatabaseConnectionProperties
import io.adetalhouet.order.system.db.lib.DatabaseServiceImpl
import io.adetalhouet.order.system.db.test.TestUtilsKt
import spock.lang.Specification

class OrderSystemSpec extends Specification {

    def setupSpec() {
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
}