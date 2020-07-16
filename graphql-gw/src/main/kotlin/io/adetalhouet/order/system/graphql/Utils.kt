package io.adetalhouet.order.system.graphql

import com.google.common.util.concurrent.Futures
import com.google.common.util.concurrent.ListenableFuture

fun String.mustBeSet() = "$this must be set"

fun checkNullOrEmpty(string: String, lazyMessage: () -> String) {
    if (string.isEmpty()) throw IllegalStateException(lazyMessage())
}

@Suppress("TooGenericExceptionCaught")
fun <T> returnFailedFutureOnException(block: () -> ListenableFuture<T>): ListenableFuture<T> =
    try {
        block()
    } catch (e: Exception) {
        Futures.immediateFailedFuture(e)
    }
