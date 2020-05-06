package io.adetalhouet.order.system.graphql.schema

import com.google.api.graphql.rejoiner.Query
import com.google.api.graphql.rejoiner.SchemaModule
import com.google.common.util.concurrent.ListenableFuture
import com.google.protobuf.Empty
import io.adetalhouet.order.system.product.grpc.DeleteProductByIdRequest
import io.adetalhouet.order.system.product.grpc.GetProductByIdRequest
import io.adetalhouet.order.system.product.grpc.Product
import io.adetalhouet.order.system.product.grpc.ProductServiceGrpc
import io.adetalhouet.order.system.product.grpc.Products

class ProductSchemaModule : SchemaModule() {

    @Query("addProduct")
    fun addProduct(client: ProductServiceGrpc.ProductServiceFutureStub, request: Product): ListenableFuture<Empty> {
        return client.addProduct(request)
    }

    @Query("deleteProductById")
    fun deleteProductById(client: ProductServiceGrpc.ProductServiceFutureStub,
                          request: DeleteProductByIdRequest): ListenableFuture<Empty> {
        return client.deleteProductById(request)
    }

    @Query("getProductById")
    fun getProductById(client: ProductServiceGrpc.ProductServiceFutureStub,
                       request: GetProductByIdRequest): ListenableFuture<Product>? {
        return client.getProductById(request)
    }

    @Query("getProducts")
    fun getProducts(client: ProductServiceGrpc.ProductServiceFutureStub,
                    request: Empty): ListenableFuture<Products>? {
        return client.getProducts(request)
    }
}