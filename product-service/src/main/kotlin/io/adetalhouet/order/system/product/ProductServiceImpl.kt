package io.adetalhouet.order.system.product

import com.google.protobuf.Empty
import io.adetalhouet.order.system.utils.Status

class ProductServiceImpl : ProductServiceGrpcKt.ProductServiceCoroutineImplBase() {

    override suspend fun addProduct(request: Product): Status {
        return super.addProduct(request)
    }

    override suspend fun deleteProductById(request: DeleteProductByIdRequest): Status {
        return super.deleteProductById(request)
    }

    override suspend fun getProductById(request: GetProductByIdRequest): Product {
        return super.getProductById(request)
    }

    override suspend fun getProducts(request: Empty): Products {
        return super.getProducts(request)
    }
}