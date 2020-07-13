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

        def response = sendQuery(query)

        assert response.status == 200

        return response.data["data"]["createCart"]["cartId"] as int
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

        return sendQuery(query)
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

        return sendQuery(query)
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
                '    id\n' +
                '  }\n' +
                '}"}'

        return sendQuery(query)
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

        return sendQuery(query)
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

        return sendQuery(query)
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

        return sendQuery(query)
    }

    // --- ORDER QUERIES

    def placeOrder(int clientId, int cartId) {
        def query = '{"query":' +
                '"{\n placeOrder(\n' +
                '    input: {\n' +
                '      client_id: ' + clientId + '\n' +
                '      cart_id: ' + cartId + '\n' +
                '      state: PENDING\n' +
                '      date_created: { seconds: ' + System.currentTimeMillis() + ' }\n' +
                '    }\n' +
                '  )' +
                '  {\n' +
                '    id\n' +
                '  }\n' +
                '}"}'

        def response = sendQuery(query)

        assert response.status == 200

        return response.data["data"]["placeOrder"]["id"] as int
    }

    def trackOrder(int orderId) {

        def query = '{"query":' +
                '"{\n trackOrderById(input: {\\n' +
                ' id: ' + orderId + '\n' +
                '  }) ' +
                '  {\n' +
                '    order {\n' +
                '      clientId\n' +
                '      cartId\n' +
                '      state\n' +
                '    }' +
                '  }\n' +
                '}"}'

        return sendQuery(query)
    }

    // -- PRODUCT QUERIES

    def addProduct(String name, double price, int quantity) {
        def query = '{"query":' +
                '"{\n addProduct(\n' +
                '    input: {\n' +
                '      name: \\"' + name + '\\" \n' +
                '      price: ' + price + '\n' +
                '      quantity: ' + quantity + '\n' +
                '      last_updated: { seconds: ' + System.currentTimeMillis() + ' }\n' +
                '    }\n' +
                '  )' +
                '  {\n' +
                '    id\n' +
                '  }\n' +
                '}"}'

        def response = sendQuery(query)

        assert response.status == 200

        return response.data["data"]["addProduct"]["id"] as int
    }

    def getProduct(int productId) {
        def query = '{"query":' +
                '"{\n getProductById(input: {\\n' +
                ' id: ' + productId + '\n' +
                '  }) ' +
                '  {\n' +
                '    name\n' +
                '    quantity\n' +
                '    price\n' +
                '  }\n' +
                '}"}'
        return sendQuery(query)
    }

    def getProducts() {
        def query = '{"query":' +
                '"{\n getProducts {' +
                '    products {\n' +
                '      name\n' +
                '      quantity\n' +
                '      price\n' +
                '    }' +
                '  }\n' +
                '}"}'

        return sendQuery(query)
    }

    def deleteProduct(int id) {
        def query = '{"query":' +
                '"{\n deleteProductById(input: {\n' +
                ' id: ' + id + '\n' +
                '  }) ' +
                '  {\n' +
                '    _\n' +
                '  }\n' +
                '}"}'

        return sendQuery(query)
    }


    private def sendQuery(String query) {
        return client.post(
                body: query,
                requestContentType: JSON)
    }
}
