package io.adetalhouet.order.system.utils

import groovyx.net.http.RESTClient
import spock.lang.Shared
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

    def addItemToCart(long cartId, long productId, int quantity, double price) {
        def query = '{"query":' +
                '"{\n' +
                '  updateCart(\n' +
                '    input: {\n' +
                '      cart_id: ' + cartId + '\n' +
                '      item: { product_id: ' + productId + ', quantity: ' + quantity + ', price: ' + price + ' }\n' +
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

    def createClient(String address, String password, String email) {
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

        return client.post(
                body: query,
                requestContentType: JSON)
    }

    def deleteClient(int id) {
        def query = '{"query":' +
                '"{\n deleteClientById(input: {\n' +
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

    // --- ORDER QUERIES

    def placeOrder(int clientId, int cartId) {
        def query = '{"query":' +
                '"{\n placeOrder(\n' +
                '    input: {\n' +
                '      client_id: ' + clientId + '\n' +
                '      cart_id: ' + cartId + '\n' +
                '      state: PENDING\n' +
                '      id: 1\n' +
                '      date_created: { seconds: ' + System.currentTimeMillis() + ' }\n' +
                '    }\n' +
                '  )' +
                '  {\n' +
                '    _\n' +
                '  }\n' +
                '}"}'

        return client.post(
                body: query,
                requestContentType: JSON)
    }

    // -- PRODUCT QUERIES

    def addProduct(int productId, String name, double price, int quantity) {
        def query = '{"query":' +
                '"{\n addProduct(\n' +
                '    input: {\n' +
                '      id: ' + productId + '\n' +
                '      name: \\"' + name + '\\" \n' +
                '      price: ' + price + '\n' +
                '      quantity: ' + quantity + '\n' +
                '      last_updated: { seconds: ' + System.currentTimeMillis() + ' }\n' +
                '    }\n' +
                '  )' +
                '  {\n' +
                '    _\n' +
                '  }\n' +
                '}"}'

        return client.post(
                body: query,
                requestContentType: JSON)
    }
}
