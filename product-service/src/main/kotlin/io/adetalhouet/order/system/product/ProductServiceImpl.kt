package io.adetalhouet.order.system.product

import com.google.common.io.Resources
import com.google.protobuf.Empty
import com.google.protobuf.util.JsonFormat
import io.adetalhouet.order.system.db.domain.Products
import io.adetalhouet.order.system.db.domain.toProduct
import io.adetalhouet.order.system.db.domain.toProducts
import io.adetalhouet.order.system.db.lib.DatabaseTransaction.dbQuery
import io.adetalhouet.order.system.product.grpc.DeleteProductByIdRequest
import io.adetalhouet.order.system.product.grpc.GetProductByIdRequest
import io.adetalhouet.order.system.product.grpc.Product
import io.adetalhouet.order.system.product.grpc.ProductServiceGrpcKt
import org.jetbrains.exposed.sql.deleteWhere
import org.jetbrains.exposed.sql.insert
import org.jetbrains.exposed.sql.select
import org.jetbrains.exposed.sql.selectAll
import io.adetalhouet.order.system.product.grpc.Products as ProductList

class ProductServiceImpl : ProductServiceGrpcKt.ProductServiceCoroutineImplBase() {

    private val products: MutableCollection<Product> =
        Resources.asByteSource(Resources.getResource("products.json")).asCharSource(Charsets.UTF_8)
            .openBufferedStream()
            .use { reader ->
                ProductList.newBuilder().apply {
                    JsonFormat.parser().merge(reader, this)
                }.build().productsList
            }


    override suspend fun addProduct(request: Product): Empty = dbQuery {
        Products.insert {
            it[id] = request.id
            it[name] = request.name
            it[price] = request.price
            it[quantity] = request.quantity
            it[lastUpdatedMillis] = System.currentTimeMillis()
        }
        Empty.getDefaultInstance()
    }

    override suspend fun deleteProductById(request: DeleteProductByIdRequest): Empty = dbQuery {
        Products.deleteWhere { Products.id eq request.id }
        Empty.getDefaultInstance()
    }

    @Throws(NoSuchElementException::class)
    override suspend fun getProductById(request: GetProductByIdRequest): Product = dbQuery {
        Products.select { Products.id eq request.id }.single().toProduct()
    }

    override suspend fun getProducts(request: Empty): ProductList = dbQuery {
        Products.selectAll().map { it.toProduct() }.toList().toProducts()
    }
}