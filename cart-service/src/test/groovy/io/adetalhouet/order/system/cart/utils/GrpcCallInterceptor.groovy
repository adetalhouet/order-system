package io.adetalhouet.order.system.cart.utils

import io.grpc.Metadata
import io.grpc.ServerCall
import io.grpc.ServerCallHandler
import io.grpc.ServerInterceptor

@Singleton
class GrpcCallInterceptor implements ServerInterceptor {

    boolean intercepted = false

    @Override
    def <ReqT, RespT> ServerCall.Listener<ReqT> interceptCall(ServerCall<ReqT, RespT> call, Metadata headers,
                                                              ServerCallHandler<ReqT, RespT> next) {
        intercepted = true
        return next.startCall(call, headers)
    }

    public def reset() {
        intercepted = false
    }
}