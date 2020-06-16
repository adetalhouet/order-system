package io.adetalhouet.order.system.nats.lib.message

import com.google.gson.Gson
import io.nats.client.Message
import java.nio.charset.StandardCharsets

enum class NatsMessageStatus {
    SUCCESS,
    FAILURE,
    INVALID,
    INSUFFISANT_QUANTITY
}

data class NatsMessage(val status: NatsMessageStatus, val message: String = "")

fun NatsMessage.toByteArray() = Gson().toJson(this).toByteArray(StandardCharsets.UTF_8)
fun Message.toNatsMessage(): NatsMessage =
    Gson().fromJson(this.data.toString(StandardCharsets.UTF_8), NatsMessage::class.java)

fun receivedEmptyMessage() =
    NatsMessage(NatsMessageStatus.INVALID,
        "Received message is null, or content is empty").toByteArray()