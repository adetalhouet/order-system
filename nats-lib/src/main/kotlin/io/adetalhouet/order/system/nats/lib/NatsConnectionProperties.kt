package io.adetalhouet.order.system.nats.lib

open class NatsConnectionProperties {
    lateinit var host: String
    var pingInterval: Long = 0
    var pingsOut: Int = 0
    var maxReconnects: Int = 0
    var reconnectWait: Long = 0
    val connectionTimeout: Long = 0
    lateinit var connectionName: String
}

class BasicAuthNatsConnectionProperties : NatsConnectionProperties() {
    lateinit var username: String
    lateinit var password: String
}