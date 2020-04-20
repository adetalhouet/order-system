package io.adetalhouet.order.system.graphql.schema

import com.google.api.graphql.rejoiner.Schema
import com.google.api.graphql.rejoiner.SchemaProviderModule
import com.google.inject.Guice
import com.google.inject.Key
import graphql.schema.GraphQLSchema
import io.adetalhouet.order.system.graphql.di.BillingClientModule


object OrderSystemSchema {

    val schema: GraphQLSchema = Guice
        .createInjector(
            SchemaProviderModule(),
            BillingClientModule(),
            BillingSchemaModule()
//            CartClientModule(),
//            CartSchemaModule(),
//            ClientSchemaModule(),
//            ClientClientModule(),
//            OrderClientModule(),
//            OrderSchemaModule(),
//            OrderSystemSchemaModule()
        )
        .getInstance(Key.get(GraphQLSchema::class.java, Schema::class.java))
}