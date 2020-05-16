package io.adetalhouet.order.system.cart

import io.adetalhouet.order.system.db.domain.Carts
import io.adetalhouet.order.system.db.domain.Clients
import io.adetalhouet.order.system.db.domain.Orders
import io.adetalhouet.order.system.db.domain.Products
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.suspendCancellableCoroutine
import org.jetbrains.exposed.sql.SchemaUtils

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

fun createTables() = transaction { SchemaUtils.create(Orders, Clients, Carts, Products) }