package io.adetalhouet.order.system.nats.lib

import com.google.inject.AbstractModule
import com.google.inject.name.Names

class NatsModule : AbstractModule() {
    override fun configure() {
        val natsPropertiesService = NatsPropertiesService()
        bind(NatsPropertiesService::class.java).toInstance(NatsPropertiesService())
        bind(NatsService::class.java)
            .annotatedWith(Names.named("Default"))
            .toInstance(defaultNatsInstance(natsPropertiesService))
    }
}