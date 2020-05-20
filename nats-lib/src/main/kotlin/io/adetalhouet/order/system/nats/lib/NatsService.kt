package io.adetalhouet.order.system.nats.lib

import io.nats.client.Connection
import io.nats.client.Dispatcher
import io.nats.client.Message
import io.nats.client.MessageHandler
import io.nats.client.Subscription
import java.time.Duration

interface NatsService {

    fun connection(): Connection

    fun requestAndGetOneReply(subject: String, message: ByteArray, timeout: Long): Message {
        return connection().request(subject, message, Duration.ofMillis(timeout))
    }

    suspend fun requestAndGetMultipleReplies(subject: String, replySubject: String, message: ByteArray,
                                             messageHandler: MessageHandler) {
        val natsConnection = connection()
        val dispatcher = natsConnection.createDispatcher(messageHandler)
        dispatcher.subscribe(replySubject)
        natsConnection.publish(subject, replySubject, message)
    }

    suspend fun replySubscribe(subject: String, messageHandler: MessageHandler): Dispatcher {
        val dispatcher = connection().createDispatcher(messageHandler)
        return dispatcher.subscribe(subject)
    }

    suspend fun publish(subject: String, message: ByteArray) {
        connection().publish(subject, message)
    }

    suspend fun subscribe(subject: String, queueName: String): Subscription {
        return connection().subscribe(subject, queueName)
    }
}