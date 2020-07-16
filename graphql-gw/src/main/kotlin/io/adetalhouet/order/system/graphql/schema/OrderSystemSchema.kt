package io.adetalhouet.order.system.graphql.schema

import com.google.api.graphql.rejoiner.Schema
import com.google.api.graphql.rejoiner.SchemaProviderModule
import com.google.inject.Guice
import com.google.inject.Key
import graphql.schema.GraphQLSchema
import io.adetalhouet.order.system.cart.di.CartClientModule
import io.adetalhouet.order.system.client.di.ClientClientModule
import io.adetalhouet.order.system.order.di.OrderClientModule
import io.adetalhouet.order.system.product.di.ProductClientModule

object OrderSystemSchema {
    val schema: GraphQLSchema = Guice
        .createInjector(
            // Guice module that provides the generated GraphQLSchema instance
            SchemaProviderModule(),

            // Install schema modules
            CartClientModule(),
            CartSchemaModule(),
            ClientSchemaModule(),
            ClientClientModule(),
            OrderClientModule(),
            OrderSchemaModule(),
            ProductClientModule(),
            ProductSchemaModule()
        )
        .getInstance(Key.get(GraphQLSchema::class.java, Schema::class.java))
}
