package io.adetalhouet.order.system.nats.lib

import java.nio.charset.Charset

object NatsMessage {
    fun receivedEmptyMessage() = "Received message is null, or content is empty".toByteArray(Charset.defaultCharset())
}