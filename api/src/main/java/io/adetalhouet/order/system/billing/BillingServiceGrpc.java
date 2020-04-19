package io.adetalhouet.order.system.billing;

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
    comments = "Source: billing.proto")
public final class BillingServiceGrpc {

  private BillingServiceGrpc() {}

  public static final String SERVICE_NAME = "io.adetalhouet.order.system.billing.BillingService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.adetalhouet.order.system.billing.Bill,
      io.adetalhouet.order.system.utils.Status> getAddBillMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddBill",
      requestType = io.adetalhouet.order.system.billing.Bill.class,
      responseType = io.adetalhouet.order.system.utils.Status.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.adetalhouet.order.system.billing.Bill,
      io.adetalhouet.order.system.utils.Status> getAddBillMethod() {
    io.grpc.MethodDescriptor<io.adetalhouet.order.system.billing.Bill, io.adetalhouet.order.system.utils.Status> getAddBillMethod;
    if ((getAddBillMethod = BillingServiceGrpc.getAddBillMethod) == null) {
      synchronized (BillingServiceGrpc.class) {
        if ((getAddBillMethod = BillingServiceGrpc.getAddBillMethod) == null) {
          BillingServiceGrpc.getAddBillMethod = getAddBillMethod =
              io.grpc.MethodDescriptor.<io.adetalhouet.order.system.billing.Bill, io.adetalhouet.order.system.utils.Status>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddBill"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.adetalhouet.order.system.billing.Bill.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.adetalhouet.order.system.utils.Status.getDefaultInstance()))
              .setSchemaDescriptor(new BillingServiceMethodDescriptorSupplier("AddBill"))
              .build();
        }
      }
    }
    return getAddBillMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.adetalhouet.order.system.billing.GetBillByIdRequest,
      io.adetalhouet.order.system.billing.Bill> getGetBillByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetBillById",
      requestType = io.adetalhouet.order.system.billing.GetBillByIdRequest.class,
      responseType = io.adetalhouet.order.system.billing.Bill.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.adetalhouet.order.system.billing.GetBillByIdRequest,
      io.adetalhouet.order.system.billing.Bill> getGetBillByIdMethod() {
    io.grpc.MethodDescriptor<io.adetalhouet.order.system.billing.GetBillByIdRequest, io.adetalhouet.order.system.billing.Bill> getGetBillByIdMethod;
    if ((getGetBillByIdMethod = BillingServiceGrpc.getGetBillByIdMethod) == null) {
      synchronized (BillingServiceGrpc.class) {
        if ((getGetBillByIdMethod = BillingServiceGrpc.getGetBillByIdMethod) == null) {
          BillingServiceGrpc.getGetBillByIdMethod = getGetBillByIdMethod =
              io.grpc.MethodDescriptor.<io.adetalhouet.order.system.billing.GetBillByIdRequest, io.adetalhouet.order.system.billing.Bill>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetBillById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.adetalhouet.order.system.billing.GetBillByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.adetalhouet.order.system.billing.Bill.getDefaultInstance()))
              .setSchemaDescriptor(new BillingServiceMethodDescriptorSupplier("GetBillById"))
              .build();
        }
      }
    }
    return getGetBillByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.adetalhouet.order.system.billing.GetBillByClientRequest,
      io.adetalhouet.order.system.billing.Bills> getGetBillByClientMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetBillByClient",
      requestType = io.adetalhouet.order.system.billing.GetBillByClientRequest.class,
      responseType = io.adetalhouet.order.system.billing.Bills.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.adetalhouet.order.system.billing.GetBillByClientRequest,
      io.adetalhouet.order.system.billing.Bills> getGetBillByClientMethod() {
    io.grpc.MethodDescriptor<io.adetalhouet.order.system.billing.GetBillByClientRequest, io.adetalhouet.order.system.billing.Bills> getGetBillByClientMethod;
    if ((getGetBillByClientMethod = BillingServiceGrpc.getGetBillByClientMethod) == null) {
      synchronized (BillingServiceGrpc.class) {
        if ((getGetBillByClientMethod = BillingServiceGrpc.getGetBillByClientMethod) == null) {
          BillingServiceGrpc.getGetBillByClientMethod = getGetBillByClientMethod =
              io.grpc.MethodDescriptor.<io.adetalhouet.order.system.billing.GetBillByClientRequest, io.adetalhouet.order.system.billing.Bills>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetBillByClient"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.adetalhouet.order.system.billing.GetBillByClientRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.adetalhouet.order.system.billing.Bills.getDefaultInstance()))
              .setSchemaDescriptor(new BillingServiceMethodDescriptorSupplier("GetBillByClient"))
              .build();
        }
      }
    }
    return getGetBillByClientMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static BillingServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BillingServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BillingServiceStub>() {
        @java.lang.Override
        public BillingServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BillingServiceStub(channel, callOptions);
        }
      };
    return BillingServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static BillingServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BillingServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BillingServiceBlockingStub>() {
        @java.lang.Override
        public BillingServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BillingServiceBlockingStub(channel, callOptions);
        }
      };
    return BillingServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static BillingServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BillingServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BillingServiceFutureStub>() {
        @java.lang.Override
        public BillingServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BillingServiceFutureStub(channel, callOptions);
        }
      };
    return BillingServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class BillingServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void addBill(io.adetalhouet.order.system.billing.Bill request,
        io.grpc.stub.StreamObserver<io.adetalhouet.order.system.utils.Status> responseObserver) {
      asyncUnimplementedUnaryCall(getAddBillMethod(), responseObserver);
    }

    /**
     */
    public void getBillById(io.adetalhouet.order.system.billing.GetBillByIdRequest request,
        io.grpc.stub.StreamObserver<io.adetalhouet.order.system.billing.Bill> responseObserver) {
      asyncUnimplementedUnaryCall(getGetBillByIdMethod(), responseObserver);
    }

    /**
     */
    public void getBillByClient(io.adetalhouet.order.system.billing.GetBillByClientRequest request,
        io.grpc.stub.StreamObserver<io.adetalhouet.order.system.billing.Bills> responseObserver) {
      asyncUnimplementedUnaryCall(getGetBillByClientMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAddBillMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.adetalhouet.order.system.billing.Bill,
                io.adetalhouet.order.system.utils.Status>(
                  this, METHODID_ADD_BILL)))
          .addMethod(
            getGetBillByIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.adetalhouet.order.system.billing.GetBillByIdRequest,
                io.adetalhouet.order.system.billing.Bill>(
                  this, METHODID_GET_BILL_BY_ID)))
          .addMethod(
            getGetBillByClientMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.adetalhouet.order.system.billing.GetBillByClientRequest,
                io.adetalhouet.order.system.billing.Bills>(
                  this, METHODID_GET_BILL_BY_CLIENT)))
          .build();
    }
  }

  /**
   */
  public static final class BillingServiceStub extends io.grpc.stub.AbstractAsyncStub<BillingServiceStub> {
    private BillingServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BillingServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BillingServiceStub(channel, callOptions);
    }

    /**
     */
    public void addBill(io.adetalhouet.order.system.billing.Bill request,
        io.grpc.stub.StreamObserver<io.adetalhouet.order.system.utils.Status> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddBillMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getBillById(io.adetalhouet.order.system.billing.GetBillByIdRequest request,
        io.grpc.stub.StreamObserver<io.adetalhouet.order.system.billing.Bill> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetBillByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getBillByClient(io.adetalhouet.order.system.billing.GetBillByClientRequest request,
        io.grpc.stub.StreamObserver<io.adetalhouet.order.system.billing.Bills> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetBillByClientMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class BillingServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<BillingServiceBlockingStub> {
    private BillingServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BillingServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BillingServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public io.adetalhouet.order.system.utils.Status addBill(io.adetalhouet.order.system.billing.Bill request) {
      return blockingUnaryCall(
          getChannel(), getAddBillMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.adetalhouet.order.system.billing.Bill getBillById(io.adetalhouet.order.system.billing.GetBillByIdRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetBillByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.adetalhouet.order.system.billing.Bills getBillByClient(io.adetalhouet.order.system.billing.GetBillByClientRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetBillByClientMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class BillingServiceFutureStub extends io.grpc.stub.AbstractFutureStub<BillingServiceFutureStub> {
    private BillingServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BillingServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BillingServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.adetalhouet.order.system.utils.Status> addBill(
        io.adetalhouet.order.system.billing.Bill request) {
      return futureUnaryCall(
          getChannel().newCall(getAddBillMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.adetalhouet.order.system.billing.Bill> getBillById(
        io.adetalhouet.order.system.billing.GetBillByIdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetBillByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.adetalhouet.order.system.billing.Bills> getBillByClient(
        io.adetalhouet.order.system.billing.GetBillByClientRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetBillByClientMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ADD_BILL = 0;
  private static final int METHODID_GET_BILL_BY_ID = 1;
  private static final int METHODID_GET_BILL_BY_CLIENT = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final BillingServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(BillingServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ADD_BILL:
          serviceImpl.addBill((io.adetalhouet.order.system.billing.Bill) request,
              (io.grpc.stub.StreamObserver<io.adetalhouet.order.system.utils.Status>) responseObserver);
          break;
        case METHODID_GET_BILL_BY_ID:
          serviceImpl.getBillById((io.adetalhouet.order.system.billing.GetBillByIdRequest) request,
              (io.grpc.stub.StreamObserver<io.adetalhouet.order.system.billing.Bill>) responseObserver);
          break;
        case METHODID_GET_BILL_BY_CLIENT:
          serviceImpl.getBillByClient((io.adetalhouet.order.system.billing.GetBillByClientRequest) request,
              (io.grpc.stub.StreamObserver<io.adetalhouet.order.system.billing.Bills>) responseObserver);
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

  private static abstract class BillingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    BillingServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.adetalhouet.order.system.billing.Billing.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("BillingService");
    }
  }

  private static final class BillingServiceFileDescriptorSupplier
      extends BillingServiceBaseDescriptorSupplier {
    BillingServiceFileDescriptorSupplier() {}
  }

  private static final class BillingServiceMethodDescriptorSupplier
      extends BillingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    BillingServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (BillingServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new BillingServiceFileDescriptorSupplier())
              .addMethod(getAddBillMethod())
              .addMethod(getGetBillByIdMethod())
              .addMethod(getGetBillByClientMethod())
              .build();
        }
      }
    }
    return result;
  }
}
