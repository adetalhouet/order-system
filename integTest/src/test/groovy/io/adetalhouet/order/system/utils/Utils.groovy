package io.adetalhouet.order.system.utils

import io.adetalhouet.order.system.db.lib.DatabaseConnectionProperties
import io.adetalhouet.order.system.db.lib.DatabaseServiceImpl
import io.adetalhouet.order.system.test.TestDBUtilsKt

class Utils {
    public static def setupDB() {
        DatabaseConnectionProperties props = new DatabaseConnectionProperties(
                "org.h2.Driver",
                "jdbc:h2:mem:order-system",
                "order-system",
                "Password123"
        )
        DatabaseServiceImpl db = new DatabaseServiceImpl(props)
        db.connect()

        TestDBUtilsKt.createTables()
        TestDBUtilsKt.cleanTables()
        TestDBUtilsKt.loadProducts()
    }
}
