package io.adetalhouet.order.system.cart.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.28.0)",
    comments = "Source: cart.proto")
public final class CartServiceGrpc {

  private CartServiceGrpc() {}

  public static final String SERVICE_NAME = "io.adetalhouet.order.system.cart.grpc.CartService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      io.adetalhouet.order.system.cart.grpc.CartId> getCreateCartMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateCart",
      requestType = com.google.protobuf.Empty.class,
      responseType = io.adetalhouet.order.system.cart.grpc.CartId.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      io.adetalhouet.order.system.cart.grpc.CartId> getCreateCartMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, io.adetalhouet.order.system.cart.grpc.CartId> getCreateCartMethod;
    if ((getCreateCartMethod = CartServiceGrpc.getCreateCartMethod) == null) {
      synchronized (CartServiceGrpc.class) {
        if ((getCreateCartMethod = CartServiceGrpc.getCreateCartMethod) == null) {
          CartServiceGrpc.getCreateCartMethod = getCreateCartMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, io.adetalhouet.order.system.cart.grpc.CartId>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateCart"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.adetalhouet.order.system.cart.grpc.CartId.getDefaultInstance()))
              .setSchemaDescriptor(new CartServiceMethodDescriptorSupplier("CreateCart"))
              .build();
        }
      }
    }
    return getCreateCartMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.adetalhouet.order.system.cart.grpc.UpdateCartRequest,
      com.google.protobuf.Empty> getUpdateCartMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateCart",
      requestType = io.adetalhouet.order.system.cart.grpc.UpdateCartRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.adetalhouet.order.system.cart.grpc.UpdateCartRequest,
      com.google.protobuf.Empty> getUpdateCartMethod() {
    io.grpc.MethodDescriptor<io.adetalhouet.order.system.cart.grpc.UpdateCartRequest, com.google.protobuf.Empty> getUpdateCartMethod;
    if ((getUpdateCartMethod = CartServiceGrpc.getUpdateCartMethod) == null) {
      synchronized (CartServiceGrpc.class) {
        if ((getUpdateCartMethod = CartServiceGrpc.getUpdateCartMethod) == null) {
          CartServiceGrpc.getUpdateCartMethod = getUpdateCartMethod =
              io.grpc.MethodDescriptor.<io.adetalhouet.order.system.cart.grpc.UpdateCartRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateCart"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.adetalhouet.order.system.cart.grpc.UpdateCartRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new CartServiceMethodDescriptorSupplier("UpdateCart"))
              .build();
        }
      }
    }
    return getUpdateCartMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.adetalhouet.order.system.cart.grpc.CartId,
      com.google.protobuf.Empty> getDeleteCartMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteCart",
      requestType = io.adetalhouet.order.system.cart.grpc.CartId.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.adetalhouet.order.system.cart.grpc.CartId,
      com.google.protobuf.Empty> getDeleteCartMethod() {
    io.grpc.MethodDescriptor<io.adetalhouet.order.system.cart.grpc.CartId, com.google.protobuf.Empty> getDeleteCartMethod;
    if ((getDeleteCartMethod = CartServiceGrpc.getDeleteCartMethod) == null) {
      synchronized (CartServiceGrpc.class) {
        if ((getDeleteCartMethod = CartServiceGrpc.getDeleteCartMethod) == null) {
          CartServiceGrpc.getDeleteCartMethod = getDeleteCartMethod =
              io.grpc.MethodDescriptor.<io.adetalhouet.order.system.cart.grpc.CartId, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteCart"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.adetalhouet.order.system.cart.grpc.CartId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new CartServiceMethodDescriptorSupplier("DeleteCart"))
              .build();
        }
      }
    }
    return getDeleteCartMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.adetalhouet.order.system.cart.grpc.CartId,
      io.adetalhouet.order.system.cart.grpc.CartItems> getGetProductsByCartIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetProductsByCartId",
      requestType = io.adetalhouet.order.system.cart.grpc.CartId.class,
      responseType = io.adetalhouet.order.system.cart.grpc.CartItems.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.adetalhouet.order.system.cart.grpc.CartId,
      io.adetalhouet.order.system.cart.grpc.CartItems> getGetProductsByCartIdMethod() {
    io.grpc.MethodDescriptor<io.adetalhouet.order.system.cart.grpc.CartId, io.adetalhouet.order.system.cart.grpc.CartItems> getGetProductsByCartIdMethod;
    if ((getGetProductsByCartIdMethod = CartServiceGrpc.getGetProductsByCartIdMethod) == null) {
      synchronized (CartServiceGrpc.class) {
        if ((getGetProductsByCartIdMethod = CartServiceGrpc.getGetProductsByCartIdMethod) == null) {
          CartServiceGrpc.getGetProductsByCartIdMethod = getGetProductsByCartIdMethod =
              io.grpc.MethodDescriptor.<io.adetalhouet.order.system.cart.grpc.CartId, io.adetalhouet.order.system.cart.grpc.CartItems>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetProductsByCartId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.adetalhouet.order.system.cart.grpc.CartId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.adetalhouet.order.system.cart.grpc.CartItems.getDefaultInstance()))
              .setSchemaDescriptor(new CartServiceMethodDescriptorSupplier("GetProductsByCartId"))
              .build();
        }
      }
    }
    return getGetProductsByCartIdMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CartServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CartServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CartServiceStub>() {
        @java.lang.Override
        public CartServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CartServiceStub(channel, callOptions);
        }
      };
    return CartServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CartServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CartServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CartServiceBlockingStub>() {
        @java.lang.Override
        public CartServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CartServiceBlockingStub(channel, callOptions);
        }
      };
    return CartServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CartServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CartServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CartServiceFutureStub>() {
        @java.lang.Override
        public CartServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CartServiceFutureStub(channel, callOptions);
        }
      };
    return CartServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class CartServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void createCart(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<io.adetalhouet.order.system.cart.grpc.CartId> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateCartMethod(), responseObserver);
    }

    /**
     */
    public void updateCart(io.adetalhouet.order.system.cart.grpc.UpdateCartRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateCartMethod(), responseObserver);
    }

    /**
     */
    public void deleteCart(io.adetalhouet.order.system.cart.grpc.CartId request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteCartMethod(), responseObserver);
    }

    /**
     * <pre>
     * internal
     * </pre>
     */
    public void getProductsByCartId(io.adetalhouet.order.system.cart.grpc.CartId request,
        io.grpc.stub.StreamObserver<io.adetalhouet.order.system.cart.grpc.CartItems> responseObserver) {
      asyncUnimplementedUnaryCall(getGetProductsByCartIdMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateCartMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                io.adetalhouet.order.system.cart.grpc.CartId>(
                  this, METHODID_CREATE_CART)))
          .addMethod(
            getUpdateCartMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.adetalhouet.order.system.cart.grpc.UpdateCartRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_UPDATE_CART)))
          .addMethod(
            getDeleteCartMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.adetalhouet.order.system.cart.grpc.CartId,
                com.google.protobuf.Empty>(
                  this, METHODID_DELETE_CART)))
          .addMethod(
            getGetProductsByCartIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.adetalhouet.order.system.cart.grpc.CartId,
                io.adetalhouet.order.system.cart.grpc.CartItems>(
                  this, METHODID_GET_PRODUCTS_BY_CART_ID)))
          .build();
    }
  }

  /**
   */
  public static final class CartServiceStub extends io.grpc.stub.AbstractAsyncStub<CartServiceStub> {
    private CartServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CartServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CartServiceStub(channel, callOptions);
    }

    /**
     */
    public void createCart(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<io.adetalhouet.order.system.cart.grpc.CartId> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateCartMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateCart(io.adetalhouet.order.system.cart.grpc.UpdateCartRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateCartMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteCart(io.adetalhouet.order.system.cart.grpc.CartId request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteCartMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * internal
     * </pre>
     */
    public void getProductsByCartId(io.adetalhouet.order.system.cart.grpc.CartId request,
        io.grpc.stub.StreamObserver<io.adetalhouet.order.system.cart.grpc.CartItems> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetProductsByCartIdMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class CartServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<CartServiceBlockingStub> {
    private CartServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CartServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CartServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public io.adetalhouet.order.system.cart.grpc.CartId createCart(com.google.protobuf.Empty request) {
      return blockingUnaryCall(
          getChannel(), getCreateCartMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty updateCart(io.adetalhouet.order.system.cart.grpc.UpdateCartRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateCartMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty deleteCart(io.adetalhouet.order.system.cart.grpc.CartId request) {
      return blockingUnaryCall(
          getChannel(), getDeleteCartMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * internal
     * </pre>
     */
    public io.adetalhouet.order.system.cart.grpc.CartItems getProductsByCartId(io.adetalhouet.order.system.cart.grpc.CartId request) {
      return blockingUnaryCall(
          getChannel(), getGetProductsByCartIdMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class CartServiceFutureStub extends io.grpc.stub.AbstractFutureStub<CartServiceFutureStub> {
    private CartServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CartServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CartServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.adetalhouet.order.system.cart.grpc.CartId> createCart(
        com.google.protobuf.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateCartMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> updateCart(
        io.adetalhouet.order.system.cart.grpc.UpdateCartRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateCartMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteCart(
        io.adetalhouet.order.system.cart.grpc.CartId request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteCartMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * internal
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.adetalhouet.order.system.cart.grpc.CartItems> getProductsByCartId(
        io.adetalhouet.order.system.cart.grpc.CartId request) {
      return futureUnaryCall(
          getChannel().newCall(getGetProductsByCartIdMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_CART = 0;
  private static final int METHODID_UPDATE_CART = 1;
  private static final int METHODID_DELETE_CART = 2;
  private static final int METHODID_GET_PRODUCTS_BY_CART_ID = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CartServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CartServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_CART:
          serviceImpl.createCart((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<io.adetalhouet.order.system.cart.grpc.CartId>) responseObserver);
          break;
        case METHODID_UPDATE_CART:
          serviceImpl.updateCart((io.adetalhouet.order.system.cart.grpc.UpdateCartRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_DELETE_CART:
          serviceImpl.deleteCart((io.adetalhouet.order.system.cart.grpc.CartId) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_GET_PRODUCTS_BY_CART_ID:
          serviceImpl.getProductsByCartId((io.adetalhouet.order.system.cart.grpc.CartId) request,
              (io.grpc.stub.StreamObserver<io.adetalhouet.order.system.cart.grpc.CartItems>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class CartServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CartServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.adetalhouet.order.system.cart.grpc.CartOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CartService");
    }
  }

  private static final class CartServiceFileDescriptorSupplier
      extends CartServiceBaseDescriptorSupplier {
    CartServiceFileDescriptorSupplier() {}
  }

  private static final class CartServiceMethodDescriptorSupplier
      extends CartServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CartServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (CartServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CartServiceFileDescriptorSupplier())
              .addMethod(getCreateCartMethod())
              .addMethod(getUpdateCartMethod())
              .addMethod(getDeleteCartMethod())
              .addMethod(getGetProductsByCartIdMethod())
              .build();
        }
      }
    }
    return result;
  }
}
