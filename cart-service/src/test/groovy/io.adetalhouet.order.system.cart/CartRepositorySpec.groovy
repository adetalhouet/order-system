package io.adetalhouet.order.system.cart

import io.adetalhouet.order.system.db.utils.DatabaseConfiguration

class CartRepositorySpec {

    DatabaseConfiguration db = new DatabaseConfiguration("test-carts-service", "jdbc:h2:mem:carts", "org.h2.Driver")


}