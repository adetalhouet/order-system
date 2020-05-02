package io.adetalhouet.order.system.order;

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
    comments = "Source: order.proto")
public final class OrderServiceGrpc {

  private OrderServiceGrpc() {}

  public static final String SERVICE_NAME = "io.adetalhouet.order.system.order.OrderService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.adetalhouet.order.system.order.Order,
      com.google.protobuf.Empty> getPlaceOrderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PlaceOrder",
      requestType = io.adetalhouet.order.system.order.Order.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.adetalhouet.order.system.order.Order,
      com.google.protobuf.Empty> getPlaceOrderMethod() {
    io.grpc.MethodDescriptor<io.adetalhouet.order.system.order.Order, com.google.protobuf.Empty> getPlaceOrderMethod;
    if ((getPlaceOrderMethod = OrderServiceGrpc.getPlaceOrderMethod) == null) {
      synchronized (OrderServiceGrpc.class) {
        if ((getPlaceOrderMethod = OrderServiceGrpc.getPlaceOrderMethod) == null) {
          OrderServiceGrpc.getPlaceOrderMethod = getPlaceOrderMethod =
              io.grpc.MethodDescriptor.<io.adetalhouet.order.system.order.Order, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PlaceOrder"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.adetalhouet.order.system.order.Order.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new OrderServiceMethodDescriptorSupplier("PlaceOrder"))
              .build();
        }
      }
    }
    return getPlaceOrderMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.adetalhouet.order.system.order.TrackOrderByIdRequest,
      io.adetalhouet.order.system.order.TrackOrderByIdResponse> getTrackOrderByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TrackOrderById",
      requestType = io.adetalhouet.order.system.order.TrackOrderByIdRequest.class,
      responseType = io.adetalhouet.order.system.order.TrackOrderByIdResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.adetalhouet.order.system.order.TrackOrderByIdRequest,
      io.adetalhouet.order.system.order.TrackOrderByIdResponse> getTrackOrderByIdMethod() {
    io.grpc.MethodDescriptor<io.adetalhouet.order.system.order.TrackOrderByIdRequest, io.adetalhouet.order.system.order.TrackOrderByIdResponse> getTrackOrderByIdMethod;
    if ((getTrackOrderByIdMethod = OrderServiceGrpc.getTrackOrderByIdMethod) == null) {
      synchronized (OrderServiceGrpc.class) {
        if ((getTrackOrderByIdMethod = OrderServiceGrpc.getTrackOrderByIdMethod) == null) {
          OrderServiceGrpc.getTrackOrderByIdMethod = getTrackOrderByIdMethod =
              io.grpc.MethodDescriptor.<io.adetalhouet.order.system.order.TrackOrderByIdRequest, io.adetalhouet.order.system.order.TrackOrderByIdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TrackOrderById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.adetalhouet.order.system.order.TrackOrderByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.adetalhouet.order.system.order.TrackOrderByIdResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrderServiceMethodDescriptorSupplier("TrackOrderById"))
              .build();
        }
      }
    }
    return getTrackOrderByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.adetalhouet.order.system.order.GetOrdersByClientRequest,
      io.adetalhouet.order.system.order.Orders> getGetOrdersByClientMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetOrdersByClient",
      requestType = io.adetalhouet.order.system.order.GetOrdersByClientRequest.class,
      responseType = io.adetalhouet.order.system.order.Orders.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.adetalhouet.order.system.order.GetOrdersByClientRequest,
      io.adetalhouet.order.system.order.Orders> getGetOrdersByClientMethod() {
    io.grpc.MethodDescriptor<io.adetalhouet.order.system.order.GetOrdersByClientRequest, io.adetalhouet.order.system.order.Orders> getGetOrdersByClientMethod;
    if ((getGetOrdersByClientMethod = OrderServiceGrpc.getGetOrdersByClientMethod) == null) {
      synchronized (OrderServiceGrpc.class) {
        if ((getGetOrdersByClientMethod = OrderServiceGrpc.getGetOrdersByClientMethod) == null) {
          OrderServiceGrpc.getGetOrdersByClientMethod = getGetOrdersByClientMethod =
              io.grpc.MethodDescriptor.<io.adetalhouet.order.system.order.GetOrdersByClientRequest, io.adetalhouet.order.system.order.Orders>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetOrdersByClient"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.adetalhouet.order.system.order.GetOrdersByClientRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.adetalhouet.order.system.order.Orders.getDefaultInstance()))
              .setSchemaDescriptor(new OrderServiceMethodDescriptorSupplier("GetOrdersByClient"))
              .build();
        }
      }
    }
    return getGetOrdersByClientMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static OrderServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<OrderServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<OrderServiceStub>() {
        @java.lang.Override
        public OrderServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new OrderServiceStub(channel, callOptions);
        }
      };
    return OrderServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static OrderServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<OrderServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<OrderServiceBlockingStub>() {
        @java.lang.Override
        public OrderServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new OrderServiceBlockingStub(channel, callOptions);
        }
      };
    return OrderServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static OrderServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<OrderServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<OrderServiceFutureStub>() {
        @java.lang.Override
        public OrderServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new OrderServiceFutureStub(channel, callOptions);
        }
      };
    return OrderServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class OrderServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void placeOrder(io.adetalhouet.order.system.order.Order request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getPlaceOrderMethod(), responseObserver);
    }

    /**
     */
    public void trackOrderById(io.adetalhouet.order.system.order.TrackOrderByIdRequest request,
        io.grpc.stub.StreamObserver<io.adetalhouet.order.system.order.TrackOrderByIdResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getTrackOrderByIdMethod(), responseObserver);
    }

    /**
     */
    public void getOrdersByClient(io.adetalhouet.order.system.order.GetOrdersByClientRequest request,
        io.grpc.stub.StreamObserver<io.adetalhouet.order.system.order.Orders> responseObserver) {
      asyncUnimplementedUnaryCall(getGetOrdersByClientMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getPlaceOrderMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.adetalhouet.order.system.order.Order,
                com.google.protobuf.Empty>(
                  this, METHODID_PLACE_ORDER)))
          .addMethod(
            getTrackOrderByIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.adetalhouet.order.system.order.TrackOrderByIdRequest,
                io.adetalhouet.order.system.order.TrackOrderByIdResponse>(
                  this, METHODID_TRACK_ORDER_BY_ID)))
          .addMethod(
            getGetOrdersByClientMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.adetalhouet.order.system.order.GetOrdersByClientRequest,
                io.adetalhouet.order.system.order.Orders>(
                  this, METHODID_GET_ORDERS_BY_CLIENT)))
          .build();
    }
  }

  /**
   */
  public static final class OrderServiceStub extends io.grpc.stub.AbstractAsyncStub<OrderServiceStub> {
    private OrderServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OrderServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new OrderServiceStub(channel, callOptions);
    }

    /**
     */
    public void placeOrder(io.adetalhouet.order.system.order.Order request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPlaceOrderMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void trackOrderById(io.adetalhouet.order.system.order.TrackOrderByIdRequest request,
        io.grpc.stub.StreamObserver<io.adetalhouet.order.system.order.TrackOrderByIdResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getTrackOrderByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getOrdersByClient(io.adetalhouet.order.system.order.GetOrdersByClientRequest request,
        io.grpc.stub.StreamObserver<io.adetalhouet.order.system.order.Orders> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetOrdersByClientMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class OrderServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<OrderServiceBlockingStub> {
    private OrderServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OrderServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new OrderServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.google.protobuf.Empty placeOrder(io.adetalhouet.order.system.order.Order request) {
      return blockingUnaryCall(
          getChannel(), getPlaceOrderMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.adetalhouet.order.system.order.TrackOrderByIdResponse trackOrderById(io.adetalhouet.order.system.order.TrackOrderByIdRequest request) {
      return blockingUnaryCall(
          getChannel(), getTrackOrderByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.adetalhouet.order.system.order.Orders getOrdersByClient(io.adetalhouet.order.system.order.GetOrdersByClientRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetOrdersByClientMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class OrderServiceFutureStub extends io.grpc.stub.AbstractFutureStub<OrderServiceFutureStub> {
    private OrderServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OrderServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new OrderServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> placeOrder(
        io.adetalhouet.order.system.order.Order request) {
      return futureUnaryCall(
          getChannel().newCall(getPlaceOrderMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.adetalhouet.order.system.order.TrackOrderByIdResponse> trackOrderById(
        io.adetalhouet.order.system.order.TrackOrderByIdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getTrackOrderByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.adetalhouet.order.system.order.Orders> getOrdersByClient(
        io.adetalhouet.order.system.order.GetOrdersByClientRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetOrdersByClientMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PLACE_ORDER = 0;
  private static final int METHODID_TRACK_ORDER_BY_ID = 1;
  private static final int METHODID_GET_ORDERS_BY_CLIENT = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final OrderServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(OrderServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_PLACE_ORDER:
          serviceImpl.placeOrder((io.adetalhouet.order.system.order.Order) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_TRACK_ORDER_BY_ID:
          serviceImpl.trackOrderById((io.adetalhouet.order.system.order.TrackOrderByIdRequest) request,
              (io.grpc.stub.StreamObserver<io.adetalhouet.order.system.order.TrackOrderByIdResponse>) responseObserver);
          break;
        case METHODID_GET_ORDERS_BY_CLIENT:
          serviceImpl.getOrdersByClient((io.adetalhouet.order.system.order.GetOrdersByClientRequest) request,
              (io.grpc.stub.StreamObserver<io.adetalhouet.order.system.order.Orders>) responseObserver);
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

  private static abstract class OrderServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    OrderServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.adetalhouet.order.system.order.OrderOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("OrderService");
    }
  }

  private static final class OrderServiceFileDescriptorSupplier
      extends OrderServiceBaseDescriptorSupplier {
    OrderServiceFileDescriptorSupplier() {}
  }

  private static final class OrderServiceMethodDescriptorSupplier
      extends OrderServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    OrderServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (OrderServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new OrderServiceFileDescriptorSupplier())
              .addMethod(getPlaceOrderMethod())
              .addMethod(getTrackOrderByIdMethod())
              .addMethod(getGetOrdersByClientMethod())
              .build();
        }
      }
    }
    return result;
  }
}
