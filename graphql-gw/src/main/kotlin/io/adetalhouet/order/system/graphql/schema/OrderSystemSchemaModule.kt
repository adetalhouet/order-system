package io.adetalhouet.order.system.graphql.schema

import com.google.api.graphql.rejoiner.SchemaModification
import com.google.api.graphql.rejoiner.SchemaModule
import io.adetalhouet.order.system.client.Client
import io.adetalhouet.order.system.order.GetOrdersByClientRequest
import io.adetalhouet.order.system.order.OrderServiceGrpcKt
import io.adetalhouet.order.system.order.Orders

class OrderSystemSchemaModule : SchemaModule() {

    @SchemaModification(addField = "orders", onType = Client::class)
    suspend fun getOrdersPerClient(customer: Client,
                                   client: OrderServiceGrpcKt.OrderServiceCoroutineStub): Orders {
        return client.getOrdersByClient(GetOrdersByClientRequest.newBuilder().setClient(customer).build())
    }
}