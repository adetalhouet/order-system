package io.adetalhouet.order.system.product

import com.google.common.io.Resources
import com.google.protobuf.Empty
import com.google.protobuf.util.JsonFormat
import io.adetalhouet.order.system.utils.Status

class ProductServiceImpl : ProductServiceGrpcKt.ProductServiceCoroutineImplBase() {

    private val products: Collection<Product> =
        Resources.asByteSource(Resources.getResource("products.json")).asCharSource(Charsets.UTF_8)
            .openBufferedStream()
            .use { reader ->
                Products.newBuilder().apply {
                    JsonFormat.parser().merge(reader, this)
                }.build().productsList
            }


    override suspend fun addProduct(request: Product): Status {
        return super.addProduct(request)
    }

    override suspend fun deleteProductById(request: DeleteProductByIdRequest): Status {
        return super.deleteProductById(request)
    }

    @Throws(NoSuchElementException::class)
    override suspend fun getProductById(request: GetProductByIdRequest): Product {
        return products.single { it.id == request.id }
    }

    override suspend fun getProducts(request: Empty): Products {
        return Products.newBuilder().addAllProducts(products).build()
    }
}