package io.adetalhouet.order.system.nats.lib.service

import io.adetalhouet.order.system.nats.lib.BasicAuthNatsConnectionProperties
import io.adetalhouet.order.system.nats.lib.NatsConnectionProperties

class NatsPropertiesService {
    fun natsService(natsConnectionProperties: NatsConnectionProperties): NatsService {
        return when (natsConnectionProperties) {
            is BasicAuthNatsConnectionProperties -> {
                BasicAuthNatsService(
                    natsConnectionProperties)
            }
            else -> {
                error("Couldn't get NATS service for properties $natsConnectionProperties")
            }
        }
    }
}
