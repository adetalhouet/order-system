package io.adetalhouet.order.system.product

import com.google.protobuf.Empty
import io.adetalhouet.order.system.db.domain.Products
import io.adetalhouet.order.system.db.domain.toProduct
import io.adetalhouet.order.system.db.domain.toProducts
import io.adetalhouet.order.system.db.lib.DatabaseTransaction.dbQuery
import io.adetalhouet.order.system.product.grpc.Product
import io.adetalhouet.order.system.product.grpc.ProductId
import io.adetalhouet.order.system.product.grpc.ProductServiceGrpcKt
import org.jetbrains.exposed.sql.SqlExpressionBuilder.eq
import org.jetbrains.exposed.sql.deleteWhere
import org.jetbrains.exposed.sql.insert
import org.jetbrains.exposed.sql.select
import org.jetbrains.exposed.sql.selectAll
import io.adetalhouet.order.system.product.grpc.Products as ProductList

class ProductServiceImpl : ProductServiceGrpcKt.ProductServiceCoroutineImplBase() {

    override suspend fun addProduct(request: Product): ProductId = dbQuery {
        val id = Products.insert {
            it[name] = request.name
            it[price] = request.price
            it[quantity] = request.quantity
            it[lastUpdatedMillis] = System.currentTimeMillis()
        }[Products.id]
        ProductId.newBuilder().setId(id).build()
    }

    override suspend fun deleteProductById(request: ProductId): Empty = dbQuery {
        Products.deleteWhere { Products.id eq request.id }
        Empty.getDefaultInstance()
    }

    @Throws(NoSuchElementException::class)
    override suspend fun getProductById(request: ProductId): Product = dbQuery {
        Products.select(Products.id eq request.id).single().toProduct()
    }

    override suspend fun getProducts(request: Empty): ProductList = dbQuery {
        Products.selectAll().map { it.toProduct() }.toList().toProducts()
    }
}