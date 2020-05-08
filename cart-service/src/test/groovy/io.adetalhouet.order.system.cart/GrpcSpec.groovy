package io.adetalhouet.order.system.cart

import com.google.protobuf.Empty
import io.adetalhouet.order.system.cart.grpc.CartId
import io.adetalhouet.order.system.cart.grpc.CartServiceGrpcKt
import io.grpc.Channel
import io.grpc.Metadata
import io.grpc.ServerCall
import io.grpc.ServerCallHandler
import io.grpc.ServerInterceptor
import spock.lang.Specification

import javax.inject.Inject
import javax.inject.Singleton

class GrpcSpec extends Specification {
    @Inject
    TestBean testBean
    @Inject
    CartServiceImpl impl

    @Inject
    MyInterceptor myInterceptor

    def "test hello world grpc"() {
        expect:
        testBean.createCart().cartId == 1
        myInterceptor.intercepted
    }


    static class Clients {
        @Singleton
        CartServiceGrpcKt.CartServiceCoroutineStub coroutineStub(Channel channel) {
            CartServiceGrpcKt.CartServiceCoroutineStub(channel)
        }
    }

    @Singleton
    static class MyInterceptor implements ServerInterceptor {

        boolean intercepted = false

        @Override
        def <ReqT, RespT> ServerCall.Listener<ReqT> interceptCall(ServerCall<ReqT, RespT> call, Metadata headers,
                                                                  ServerCallHandler<ReqT, RespT> next) {
            intercepted = true
            return next.startCall(call, headers)
        }
    }

    @Singleton
    static class TestBean {
        @Inject
        CartServiceGrpcKt.CartServiceCoroutineStub coroutineStub

        CartId createCart() {
            return coroutineStub.createCart(Empty.getDefaultInstance()) as CartId
        }
    }

}