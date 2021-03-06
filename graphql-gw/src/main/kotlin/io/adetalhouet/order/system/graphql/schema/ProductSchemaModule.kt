package io.adetalhouet.order.system.graphql.schema

import com.google.api.graphql.rejoiner.Query
import com.google.api.graphql.rejoiner.SchemaModule
import com.google.common.util.concurrent.ListenableFuture
import com.google.protobuf.Empty
import io.adetalhouet.order.system.graphql.checkNullOrEmpty
import io.adetalhouet.order.system.graphql.mustBeSet
import io.adetalhouet.order.system.graphql.returnFailedFutureOnException
import io.adetalhouet.order.system.product.grpc.Product
import io.adetalhouet.order.system.product.grpc.ProductId
import io.adetalhouet.order.system.product.grpc.ProductServiceGrpc
import io.adetalhouet.order.system.product.grpc.Products

class ProductSchemaModule : SchemaModule() {

    @Query("addProduct")
    fun addProduct(client: ProductServiceGrpc.ProductServiceFutureStub, request: Product): ListenableFuture<ProductId> =
        returnFailedFutureOnException {
            checkNullOrEmpty(request.name) { "Name".mustBeSet() }
            checkNotNull(request.price) { "Price".mustBeSet() }
            checkNotNull(request.quantity) { "Quantity".mustBeSet() }
            client.addProduct(request)
        }

    @Query("deleteProductById")
    fun deleteProductById(client: ProductServiceGrpc.ProductServiceFutureStub,
                          request: ProductId): ListenableFuture<Empty> =
        returnFailedFutureOnException {
            checkNotNull(request.id) { "Product ID".mustBeSet() }
            client.deleteProductById(request)
        }

    @Query("getProductById")
    fun getProductById(client: ProductServiceGrpc.ProductServiceFutureStub,
                       request: ProductId): ListenableFuture<Product>? =
        returnFailedFutureOnException {
            checkNotNull(request.id) { "Product ID".mustBeSet() }
            client.getProductById(request)
        }

    @Query("getProducts")
    fun getProducts(client: ProductServiceGrpc.ProductServiceFutureStub,
                    request: Empty): ListenableFuture<Products>? =
        returnFailedFutureOnException {
            client.getProducts(request)
        }
}
