package io.adetalhouet.order.system.test

import kotlinx.coroutines.suspendCancellableCoroutine
import java.util.*
import kotlin.coroutines.Continuation
import kotlin.coroutines.intrinsics.COROUTINE_SUSPENDED
import kotlin.coroutines.resume
import kotlin.coroutines.resumeWithException

@Suppress("UNCHECKED_CAST")
fun <T : Any> runBlocking(lambda: (Continuation<T>) -> Any) = kotlinx.coroutines.runBlocking {
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