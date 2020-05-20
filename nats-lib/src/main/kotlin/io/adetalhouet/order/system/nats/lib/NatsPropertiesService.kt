package io.adetalhouet.order.system.nats.lib

import com.typesafe.config.Config
import com.typesafe.config.ConfigFactory
import io.github.config4k.extract
import java.lang.IllegalStateException

class NatsPropertiesService {

    private val conf: Config = ConfigFactory.load()

    fun natsService() {
        natsService(conf.extract<BasicAuthNatsConnectionProperties>())
    }

    private fun natsService(natsConnectionProperties: NatsConnectionProperties): NatsService {
        return when (natsConnectionProperties) {
            is BasicAuthNatsConnectionProperties -> {
                BasicAuthNatsService(natsConnectionProperties)
            }
            else -> {
                throw IllegalStateException("Couldn't get NATS service for properties $natsConnectionProperties")
            }
        }
    }
}