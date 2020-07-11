package io.adetalhouet.order.system.utils

import groovyx.net.http.RESTClient
import net.sf.json.JSON
import spock.lang.Shared

import static groovyx.net.http.ContentType.JSON
import static groovyx.net.http.ContentType.JSON
import static groovyx.net.http.ContentType.JSON
import static groovyx.net.http.ContentType.JSON

class QueryLibrary {

    @Shared
    private def client = new RESTClient("http://localhost:8080/graphql")


    // --------- CART QUERIES

    def createCart() {
        def query = '{"query":' +
                '"{\n createCart {' +
                '    cartId \n' +
                '  }\n' +
                '}"}'

        return client.post(
                body: query,
                requestContentType: JSON)
    }

    def addItemToCart(long cartId, long id, int quantity, double price) {
        def query = '{"query":' +
                '"{\n' +
                '  updateCart(\n' +
                '    input: {\n' +
                '      cart_id: ' + cartId + '\n' +
                '      item: { product_id: ' + id + ', quantity: ' + quantity + ', price: ' + price + ' }\n' +
                '      isAdd: true\n' +
                '    }\n' +
                '  ) {\n' +
                '    _\n' +
                '  }\n' +
                '}\n' +
                '"}'

        return client.post(
                body: query,
                requestContentType: JSON)
    }

    def deleteCart(long id) {
        def query = '{"query":' +
                '"{\n deleteCart(input: {\\n' +
                ' cart_id: ' + id + '\n' +
                '  }) ' +
                '  {\n' +
                '    _\n' +
                '  }\n' +
                '}"}'

        return client.post(
                body: query,
                requestContentType: JSON)
    }

    // ----- CLIENT QUERIES

    def addClient(String address, String password, String email) {
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

        return client.post(
                body: query,
                requestContentType: JSON)
    }

    def getClients() {
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

        return client.post(
                body: query,
                requestContentType: JSON)
    }

    def getClient(int id) {
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

        return query.post(
                body: query,
                requestContentType: JSON)
    }

    def deleteClient(int id) {
        def query = '{"query":' +
                '"{\n deleteClientById(input: {\\n' +
                ' id: ' + id + '\n' +
                '  }) ' +
                '  {\n' +
                '    _\n' +
                '  }\n' +
                '}"}'

        return client.post(
                body: query,
                requestContentType: JSON)
    }
}
