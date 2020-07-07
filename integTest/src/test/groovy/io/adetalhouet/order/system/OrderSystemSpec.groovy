package io.adetalhouet.order.system

import groovyx.net.http.RESTClient
import io.adetalhouet.order.system.client.ClientAppKt
import io.adetalhouet.order.system.db.lib.DatabaseConnectionProperties
import io.adetalhouet.order.system.db.lib.DatabaseServiceImpl
import io.adetalhouet.order.system.graphql.app.GraphQLAppKt
import io.adetalhouet.order.system.test.TestUtilsKt
import np.com.madanpokharel.embed.nats.EmbeddedNatsConfig
import np.com.madanpokharel.embed.nats.EmbeddedNatsServer
import np.com.madanpokharel.embed.nats.NatsServerConfig
import np.com.madanpokharel.embed.nats.NatsVersion
import np.com.madanpokharel.embed.nats.ServerType
import spock.lang.Shared
import spock.lang.Specification
import spock.lang.Stepwise
import spock.lang.Unroll
import static groovyx.net.http.ContentType.JSON

@Stepwise
class OrderSystemSpec extends Specification {

    @Shared
    private EmbeddedNatsServer natsServer

    @Shared
    private def graphqlClient = new RESTClient("http://localhost:8080/graphql")


    def setupSpec() {
        setupDB()
//        setupNATS()
//        Thread.start { CartAppKt.main() }
        Thread.start { ClientAppKt.main() }
//        Thread.start { OrderAppKt.main() }
//        Thread.start { ProductAppKt.main() }
        Thread.start { GraphQLAppKt.main() }

        // give time for the apps to start
        Thread.sleep(10000)
    }

    def cleanupSpec() {
//        natsServer.stopServer()
    }

    @Unroll
    def 'add client with missing field should return 200 code (OK) with errors'() {
        when: 'try to save add client with missing fields'

        def query = '{"query":' +
                '"{\n  addClient(input: {\n' +
                '    address: \\"' + address + '\\" \n' +
                '    password: \\"' + password + '\\" \n' +
                '    email: \\"' + email + '\\" \n' +
                '    date_created :{\n' +
                '      seconds: ' + System.currentTimeMillis() + '\n' +
                '    }\n' +
                '  }) ' +
                '  {\n' +
                '    _\n' +
                '  }\n' +
                '}"}'

        def response = graphqlClient.post(
                body: query,
                requestContentType: JSON)

        then: 'server returns 200 code with embedded error'
        response.data["errors"].toString().contains("Password must be set").or(response.data["errors"].toString().contains("Email must be set"))

        and:
        assert response.status == 200

        where:
        address                         | password | email
        "9 Okload Street, Kawai, Hawai" | ""       | 'joe@black.ca'
        "9 Okload Street, Kawai, Hawai" | "vwqv"   | ''
    }

    @Unroll
    def 'add client should return 200 code (OK)'() {
        when: 'try to add client with all required fields'

        def query = '{"query":' +
                '"{\n  addClient(input: {\n' +
                '    address: \\"' + address + '\\" \n' +
                '    password: \\"' + password + '\\" \n' +
                '    email: \\"' + email + '\\" \n' +
                '    date_created :{\n' +
                '      seconds: ' + System.currentTimeMillis() + '\n' +
                '    }\n' +
                '  }) ' +
                '  {\n' +
                '    _\n' +
                '  }\n' +
                '}"}'

        def response = graphqlClient.post(
                body: query,
                requestContentType: JSON)

        then: 'server returns 200 code and clients are registered in the database'
        def clients = TestUtilsKt.getClients()
        if (clients.size() == 1) {
            assert clients.get(0).getEmail().equals('joe@black.ca')
            assert clients.get(0).getPassword().equals('Passwr1')
            assert clients.get(0).getAddress().equals('9 Okload Street, Kawai, Hawai')
        } else if (clients.size() == 2) {
            assert clients.get(1).getEmail().equals('mike@bol.or')
            assert clients.get(1).getPassword().equals('Passwr2')
            assert clients.get(1).getAddress().equals('9 Okload Street, Kawai, Hawai')
        } else false

        and:
        assert response.status == 200

        where:
        address                         | password  | email
        "9 Okload Street, Kawai, Hawai" | "Passwr1" | 'joe@black.ca'
        "9 Okload Street, Kawai, Hawai" | "Passwr2" | 'mike@bol.or'
    }


    def 'get all clients email/id/password/address should return 200 code (OK)'() {
        when: 'try to get all clients'

        def query = '{"query":' +
                '"{\n getClients {' +
                '    clients {\n' +
                '      email\n' +
                '      id\n' +
                '      password\n' +
                '      address\n' +
                '    }' +
                '  }\n' +
                '}"}'

        def response = graphqlClient.post(
                body: query,
                requestContentType: JSON)

        then: 'server returns 200 code and client information as request'
        assert response.data["data"]["getClients"]["clients"][0]["email"].equals('joe@black.ca')
        assert response.data["data"]["getClients"]["clients"][0]["password"].equals('Passwr1')
        assert response.data["data"]["getClients"]["clients"][0]["address"].equals('9 Okload Street, Kawai, Hawai')
        assert response.data["data"]["getClients"]["clients"][1]["email"].equals('mike@bol.or')
        assert response.data["data"]["getClients"]["clients"][1]["password"].equals('Passwr2')
        assert response.data["data"]["getClients"]["clients"][1]["address"].equals('9 Okload Street, Kawai, Hawai')
    }

    def 'delete client should return 200 code (OK)'() {
        when: 'try to delete client when two exist'

        def query = '{"query":' +
                '"{\n deleteClientById(input: {\\n' +
                ' id: ' + id + '\n' +
                '  }) ' +
                '  {\n' +
                '    _\n' +
                '  }\n' +
                '}"}'

        graphqlClient.post(
                body: query,
                requestContentType: JSON)

        then: 'server returns 200 code and clients there is only one remaining client'
        assert TestUtilsKt.getClients().size() == 1

        where:
        id = 2
    }

    def 'get client email/id/password/address by ID should return 200 code (OK)'() {
        when: 'try to get client by ID'

        def query = '{"query":' +
                '"{\n getClientById(input: {\\n' +
                ' id: ' + id + '\n' +
                '  }) ' +
                '  {\n' +
                '    email\n' +
                '    id\n' +
                '    password\n' +
                '    address\n' +
                '  }\n' +
                '}"}'

        def response = graphqlClient.post(
                body: query,
                requestContentType: JSON)

        then: 'server returns 200 code and client information as request'
        assert response.data["data"]["getClientById"]["email"].equals('joe@black.ca')
        assert response.data["data"]["getClientById"]["password"].equals('Passwr1')
        assert response.data["data"]["getClientById"]["address"].equals('9 Okload Street, Kawai, Hawai')

        where:
        id = 1
    }

    def 'get client by ID with invalid ID should return 200 code (OK) with errors'() {
        when: 'try to get client by ID'

        def query = '{"query":' +
                '"{\n getClientById(input: {\\n' +
                ' id: ' + id + '\n' +
                '  }) ' +
                '  {\n' +
                '    email\n' +
                '    id\n' +
                '    password\n' +
                '    address\n' +
                '  }\n' +
                '}"}'

        def response = graphqlClient.post(
                body: query,
                requestContentType: JSON)

        then: 'server returns 200 code with an error'
        assert response.data["errors"].toString().contains("Exception while fetching data (/getClientById) : INTERNAL: Collection is empty.")

        where:
        id | _
        -1 | _
        9  | _
        13 | _
    }

    private static def setupDB() {
        DatabaseConnectionProperties props = new DatabaseConnectionProperties(
                "org.h2.Driver",
                "jdbc:h2:mem:order-system",
                "order-system",
                "Password123"
        )
        DatabaseServiceImpl db = new DatabaseServiceImpl(props)
        db.connect()

        TestUtilsKt.createTables()
        TestUtilsKt.cleanTables()
        TestUtilsKt.loadProducts()
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