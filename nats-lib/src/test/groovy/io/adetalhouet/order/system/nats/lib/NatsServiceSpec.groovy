package io.adetalhouet.order.system.nats.lib

import com.typesafe.config.Config
import com.typesafe.config.ConfigBeanFactory
import com.typesafe.config.ConfigFactory
import io.adetalhouet.order.system.nats.lib.service.NatsPropertiesService
import io.adetalhouet.order.system.nats.lib.service.NatsService
import io.adetalhouet.order.system.test.TestUtilsKt
import io.nats.client.Dispatcher
import io.nats.client.Message
import io.nats.client.Subscription
import np.com.madanpokharel.embed.nats.*
import spock.lang.Shared
import spock.lang.Specification

import java.time.Duration

class NatsServiceSpec extends Specification {

    @Shared
    private EmbeddedNatsServer natsServer
    @Shared
    private NatsPropertiesService natsPropertiesService = new NatsPropertiesService()
    @Shared
    private NatsService natsClient

    def buildNatsProperties() {
        Config conf = ConfigFactory.load()
        return ConfigBeanFactory.create(conf.getConfig("nats"), BasicAuthNatsConnectionProperties.class)
    }

    def setupSpec() {
        def props = buildNatsProperties()
        natsClient = natsPropertiesService.natsService(props as NatsConnectionProperties)
        setupNATS()
        // give a sec for NATS to be ready
        Thread.sleep(1000)
    }

    def cleanupSpec() {
        natsClient.close()
        natsServer.stopServer()
    }

    def "send message and subscribe to mailbox"() {
        expect:
        TestUtilsKt.runBlocking { con ->
            Subscription sub = natsClient.subscribe("test", con) as Subscription
            natsClient.publish("test", "Test message".getBytes("UTF-8"), con)
            Message mes = sub.nextMessage Duration.ofSeconds(3)
            new String(mes.data) == "Test message"
        }
    }


    def "send message dispatch reply"() {
        expect:
        TestUtilsKt.runBlocking { con ->
            Dispatcher dispatcher = natsClient.createDispatcher({ m ->
                natsClient.publish(m.getReplyTo(), "pong".getBytes(), con)
            }, con)

            dispatcher.subscribe("hello")
            dispatcher.subscribe("world")

            Message msg = natsClient.requestAndGetOneReply("hello", "ping".getBytes("UTF-8"), 1000L)
            Message msg1 = natsClient.requestAndGetOneReply("world", "ping".getBytes("UTF-8"), 1000L)

            new String(msg.data) == "pong"
            new String(msg1.data) == "pong"
            dispatcher.getDeliveredCount() == 2
        }
    }

    def "send message and replyTo"() {
        expect:
        TestUtilsKt.runBlocking { con ->

            Dispatcher dispatcherReceiver = natsClient.createDispatcher({ m ->
                System.out.println("receiver ack")
                natsClient.publish(m.getReplyTo(), "receiver ack".getBytes(), con)
            }, con)
            dispatcherReceiver.subscribe("receiver")

            Dispatcher dispatcherSender = natsClient.createDispatcher({ m ->
                System.out.println("sender ack")
                natsClient.publish(m.getReplyTo(), "sender ack".getBytes(), con)
            }, con)
            dispatcherSender.subscribe("sender")

            natsClient.publish("receiver", "sender", "cdvs".bytes, con)

            Thread.sleep(500)

            dispatcherReceiver.getDeliveredCount() == 1
            dispatcherSender.getDeliveredCount() == 1
        }
    }

    private def setupNATS() {
        EmbeddedNatsConfig config = new EmbeddedNatsConfig.Builder()
                .withNatsServerConfig(
                        new NatsServerConfig.Builder()
                                .withServerType(ServerType.NATS)
                                .withNatsVersion(NatsVersion.V2_1_0)
                                .withConfigParam("--trace", "--trace")
                                .withConfigParam("--user", "order-system")
                                .withConfigParam("--pass", "Password123")
                                .build()
                )
                .build()
        natsServer = new EmbeddedNatsServer(config)
        natsServer.startServer()
    }
}