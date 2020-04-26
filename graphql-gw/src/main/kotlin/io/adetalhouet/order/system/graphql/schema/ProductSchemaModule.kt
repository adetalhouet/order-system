package io.adetalhouet.order.system.graphql.schema

import com.google.api.graphql.rejoiner.Query
import com.google.api.graphql.rejoiner.SchemaModule
import com.google.common.util.concurrent.ListenableFuture
import com.google.protobuf.Empty
import io.adetalhouet.order.system.product.DeleteProductByIdRequest
import io.adetalhouet.order.system.product.GetProductByIdRequest
import io.adetalhouet.order.system.product.Product
import io.adetalhouet.order.system.product.ProductServiceGrpc
import io.adetalhouet.order.system.product.ProductServiceGrpcKt
import io.adetalhouet.order.system.product.Products
import io.adetalhouet.order.system.utils.Status

class ProductSchemaModule : SchemaModule() {

    @Query("addProduct")
    fun addProduct(client: ProductServiceGrpc.ProductServiceFutureStub,
                   request: Product): ListenableFuture<Status>? {
        return client.addProduct(request)
    }

    @Query("deleteProductById")
    fun deleteProductById(client: ProductServiceGrpc.ProductServiceFutureStub,
                          request: DeleteProductByIdRequest): ListenableFuture<Status>? {
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