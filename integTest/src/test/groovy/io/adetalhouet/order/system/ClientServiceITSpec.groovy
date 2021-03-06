package io.adetalhouet.order.system

import io.adetalhouet.order.system.test.TestDBUtilsKt
import io.adetalhouet.order.system.utils.ITSetup
import io.adetalhouet.order.system.utils.QueryLibrary
import spock.lang.Shared
import spock.lang.Specification
import spock.lang.Stepwise
import spock.lang.Unroll

@Stepwise
class ClientServiceITSpec extends Specification {

    @Shared
    private def query = new QueryLibrary()

    def setupSpec() {
        ITSetup.setupOnce()
    }

    @Unroll
    def 'add client with missing field should return 200 code (OK) with errors'() {
        when: 'try to save add client with missing fields'
        def response = query.createClient(address, password, email)

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
        def response = query.createClient(address, password, email)
        def clientId = response.data["data"]["addClient"]["id"] as int

        then: 'server returns 200 code and clients are registered in the database'
        def clients = TestDBUtilsKt.getClients()
        assert clientId == iterationCount + 1
        assert clients.get(iterationCount).getEmail() == email
        assert clients.get(iterationCount).getPassword() == password
        assert clients.get(iterationCount).getAddress() == address

        and:
        assert response.status == 200

        where:
        address                         | password  | email
        "9 Okload Street, Kawai, Hawai" | "Passwr1" | 'joe@black.ca'
        "9 Okload Street, Kawai, Hawai" | "Passwr2" | 'mike@bol.or'
    }

    def 'get all clients email/id/password/address should return 200 code (OK)'() {
        when: 'try to get all clients'
        def response = query.getClients()

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
        query.deleteClient(id)

        then: 'server returns 200 code and clients there is only one remaining client'
        assert TestDBUtilsKt.getClients().size() == 1

        where:
        id = 2
    }

    def 'get client email/id/password/address by ID should return 200 code (OK)'() {
        when: 'try to get client by ID'
        def response = query.getClient(id)

        then: 'server returns 200 code and client information as request'
        assert response.data["data"]["getClientById"]["email"].equals('joe@black.ca')
        assert response.data["data"]["getClientById"]["password"].equals('Passwr1')
        assert response.data["data"]["getClientById"]["address"].equals('9 Okload Street, Kawai, Hawai')

        where:
        id = 1
    }

    def 'get client by ID with invalid ID should return 200 code (OK) with errors'() {
        when: 'try to get client by ID'
        def response = query.getClient(id)

        then: 'server returns 200 code with an error'
        assert response.data["errors"].toString().contains("Exception while fetching data (/getClientById) : INTERNAL: Collection is empty.")

        where:
        id | _
        -1 | _
        9  | _
        13 | _
    }
}