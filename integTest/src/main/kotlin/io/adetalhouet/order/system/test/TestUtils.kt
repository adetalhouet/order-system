package io.adetalhouet.order.system.test

import com.google.common.io.Resources
import com.google.protobuf.util.JsonFormat
import io.adetalhouet.order.system.db.domain.Carts
import io.adetalhouet.order.system.db.domain.Clients
import io.adetalhouet.order.system.db.domain.Orders
import io.adetalhouet.order.system.nats.lib.message.toNatsMessage
import io.adetalhouet.order.system.db.domain.Products
import io.adetalhouet.order.system.product.grpc.Products as ProtoProducts
import io.adetalhouet.order.system.product.grpc.Product
import io.nats.client.Message
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.suspendCancellableCoroutine
import org.jetbrains.exposed.sql.SchemaUtils
import org.jetbrains.exposed.sql.deleteAll
import org.jetbrains.exposed.sql.insert
import org.jetbrains.exposed.sql.selectAll
import org.jetbrains.exposed.sql.transactions.transaction
import java.util.Optional
import kotlin.coroutines.Continuation
import kotlin.coroutines.intrinsics.COROUTINE_SUSPENDED
import kotlin.coroutines.resume
import kotlin.coroutines.resumeWithException

@Suppress("UNCHECKED_CAST")
fun <T : Any> runBlocking(lambda: (Continuation<T>) -> Any) = runBlocking {
    suspendCancellableCoroutine<T> { cont ->
        var result: Optional<Any> = Optional.of(COROUTINE_SUSPENDED)

        try {
            result = Optional.ofNullable(lambda(cont))
        } catch (e: Throwable) {
            cont.resumeWithException(e)
        }

        if (result.get() !== COROUTINE_SUSPENDED) cont.resume(result.get() as T)
    }
}

fun toNatsMessage(msg: Message) = msg.toNatsMessage()

fun loadProducts() {
    val products: MutableCollection<Product> =
        Resources.asByteSource(Resources.getResource("test/products.json")).asCharSource(Charsets.UTF_8)
            .openBufferedStream()
            .use { reader ->
                ProtoProducts.newBuilder().apply {
                    JsonFormat.parser().merge(reader, this)
                }.build().productsList
            }

    products.forEach { p ->
        transaction {
            Products.insert {
                it[id] = p.id
                it[name] = p.name
                it[price] = p.price
                it[quantity] = p.quantity
                it[lastUpdatedMillis] = System.currentTimeMillis()
            }
        }
    }
}

fun createTables() = transaction { SchemaUtils.create(Orders, Clients, Carts, Products) }

fun cleanTables() = transaction {
    Carts.deleteAll()
    Orders.deleteAll()
    Clients.deleteAll()
    Products.deleteAll()
}

fun getCartSize(): Int = transaction { Carts.selectAll().count() }