package io.adetalhouet.order.system.nats.lib

import java.lang.IllegalStateException

class NatsPropertiesService {
    fun natsService(natsConnectionProperties: NatsConnectionProperties): NatsService {
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