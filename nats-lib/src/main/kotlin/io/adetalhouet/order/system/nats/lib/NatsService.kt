package io.adetalhouet.order.system.nats.lib

import com.google.inject.Key
import com.google.inject.name.Names
import com.typesafe.config.Config
import com.typesafe.config.ConfigFactory
import io.github.config4k.extract
import io.nats.client.Connection
import io.nats.client.Dispatcher
import io.nats.client.Message
import io.nats.client.MessageHandler
import io.nats.client.Subscription
import java.time.Duration

internal fun defaultNatsInstance(natsPropertiesService: NatsPropertiesService): NatsService {
    val conf: Config = ConfigFactory.load()
    // for some reason *extract* needs data class, which doesn't play nice with design - building manually
    val props = BasicAuthNatsConnectionProperties()
    props.host = conf.getString("nats.host")
    props.pingInterval = conf.getLong("nats.pingInterval")
    props.maxPingsOut = conf.getInt("nats.maxPingsOut")
    props.maxReconnects = conf.getInt("nats.maxReconnects")
    props.reconnectWait = conf.getLong("nats.reconnectWait")
    props.connectionTimeout = conf.getLong("nats.connectionTimeout")
    props.connectionName = conf.getString("nats.connectionName")
    props.username = conf.getString("nats.username")
    props.password = conf.getString("nats.password")

    return natsPropertiesService.natsService(props)
}

interface NatsService : AutoCloseable {

    companion object {
        val DEFAULT_INSTANCE: Key<NatsService> = Key.get(NatsService::class.java, Names.named("Default"))
    }

    enum class Inbox {
        ORDER, PRODUCT
    }

    fun connection(): Connection

    fun requestAndGetOneReply(subject: String, message: ByteArray, timeout: Long): Message {
        return connection().request(subject, message, Duration.ofMillis(timeout))
    }

    suspend fun createDispatcher(messageHandler: MessageHandler): Dispatcher {
        return connection().createDispatcher(messageHandler)
    }

    fun publish(subject: String, message: ByteArray) {
        connection().publish(subject, message)
    }

    suspend fun publish(subject: String, replyTo: String, message: ByteArray) {
        connection().publish(subject, replyTo, message)
    }

    fun subscribe(subject: String): Subscription {
        return connection().subscribe(subject)
    }

    fun flush(duration: Duration) {
        connection().flush(duration)
    }

    override fun close() {
        connection().close()
    }
}