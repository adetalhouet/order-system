package io.adetalhouet.order.system

import io.adetalhouet.order.system.utils.ITSetup
import org.junit.runner.RunWith
import org.junit.runners.Suite

@RunWith(Suite.class)
@Suite.SuiteClasses([ClientServiceITSpec, CartServiceITSpec, OrderServiceITSpec, ProductServiceITSpec])
class OrderSystemITSpec {

    def setupSpec() {
        ITSetup.setupOnce()
    }
}
