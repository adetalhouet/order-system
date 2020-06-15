package io.adetalhouet.order.system.nats.lib.di

import com.google.inject.AbstractModule
import com.google.inject.name.Names
import io.adetalhouet.order.system.nats.lib.service.NatsPropertiesService
import io.adetalhouet.order.system.nats.lib.service.NatsService
import io.adetalhouet.order.system.nats.lib.service.defaultNatsInstance

class NatsModule : AbstractModule() {
    override fun configure() {
        val natsPropertiesService =
            NatsPropertiesService()
        bind(NatsPropertiesService::class.java).toInstance(
            NatsPropertiesService())
        bind(NatsService::class.java)
            .annotatedWith(Names.named("Default"))
            .toInstance(defaultNatsInstance(
                natsPropertiesService))
    }
}