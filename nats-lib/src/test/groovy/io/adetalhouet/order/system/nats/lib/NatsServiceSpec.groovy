package io.adetalhouet.order.system.nats.lib

import com.typesafe.config.Config
import com.typesafe.config.ConfigBeanFactory
import com.typesafe.config.ConfigFactory
import io.nats.client.Dispatcher
import io.nats.client.Message
import io.nats.client.Subscription
import spock.lang.Ignore
import spock.lang.Shared
import spock.lang.Specification
import java.time.Duration

@Ignore
class NatsServiceSpec extends Specification {

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
    }

    def cleanupSpec() {
        natsClient.close()
    }

    // MUST RUN NATS LOCALLY
    // $ nats-server --user order-system --pass Password123
    def "send message and subscribe to mailbox"() {
        expect:
        TestUtilsKt.runBlocking { con ->
            Subscription sub = natsClient.subscribe("test", con) as Subscription
            natsClient.publish("test", "Test message".getBytes("UTF-8"), con)
            Message mes = sub.nextMessage Duration.ofSeconds(3)
            new String(mes.data) == "Test message"
        }
    }

    // MUST RUN NATS LOCALLY
    // $ nats-server --user order-system --pass Password123
    def "send message dispatch reply"() {
        expect:
        TestUtilsKt.runBlocking { con ->
            Dispatcher dispatcher = natsClient.createDispatcher({ m ->
                natsClient.publish(m.getReplyTo(), "pong".getBytes(), con)
            }, con)

            dispatcher.subscribe("hello")
            dispatcher.subscribe("world")

            Message msg = natsClient.requestAndGetOneReply("hello", "ping".getBytes("UTF-8"), 1000)
            Message msg1 = natsClient.requestAndGetOneReply("world", "ping".getBytes("UTF-8"), 1000)

            new String(msg.data) == "pong"
            new String(msg1.data) == "pong"
            dispatcher.getDeliveredCount() == 2
        }
    }

    // MUST RUN NATS LOCALLY
    // $ nats-server --user order-system --pass Password123
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
}