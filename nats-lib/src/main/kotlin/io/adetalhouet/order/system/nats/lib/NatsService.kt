package io.adetalhouet.order.system.nats.lib

import io.nats.client.Connection
import io.nats.client.Dispatcher
import io.nats.client.Message
import io.nats.client.MessageHandler
import io.nats.client.Subscription
import java.time.Duration

interface NatsService : AutoCloseable {

    fun connection(): Connection

    fun requestAndGetOneReply(subject: String, message: ByteArray, timeout: Long): Message {
        return connection().request(subject, message, Duration.ofMillis(timeout))
    }

    suspend fun createDispatcher(messageHandler: MessageHandler): Dispatcher {
        return connection().createDispatcher(messageHandler)
    }

    suspend fun publish(subject: String, message: ByteArray) {
        connection().publish(subject, message)
    }

    suspend fun publish(subject: String, replyTo: String, message: ByteArray) {
        connection().publish(subject, replyTo, message)
    }

    suspend fun subscribe(subject: String): Subscription {
        return connection().subscribe(subject)
    }

    fun flush(duration: Duration) {
        connection().flush(duration)
    }

    override fun close() {
        connection().close()
    }
}