package io.adetalhouet.order.system.client;

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
    comments = "Source: client.proto")
public final class ClientServiceGrpc {

  private ClientServiceGrpc() {}

  public static final String SERVICE_NAME = "io.adetalhouet.order.system.client.ClientService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.adetalhouet.order.system.client.Client,
      io.adetalhouet.order.system.utils.Status> getAddClientMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddClient",
      requestType = io.adetalhouet.order.system.client.Client.class,
      responseType = io.adetalhouet.order.system.utils.Status.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.adetalhouet.order.system.client.Client,
      io.adetalhouet.order.system.utils.Status> getAddClientMethod() {
    io.grpc.MethodDescriptor<io.adetalhouet.order.system.client.Client, io.adetalhouet.order.system.utils.Status> getAddClientMethod;
    if ((getAddClientMethod = ClientServiceGrpc.getAddClientMethod) == null) {
      synchronized (ClientServiceGrpc.class) {
        if ((getAddClientMethod = ClientServiceGrpc.getAddClientMethod) == null) {
          ClientServiceGrpc.getAddClientMethod = getAddClientMethod =
              io.grpc.MethodDescriptor.<io.adetalhouet.order.system.client.Client, io.adetalhouet.order.system.utils.Status>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddClient"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.adetalhouet.order.system.client.Client.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.adetalhouet.order.system.utils.Status.getDefaultInstance()))
              .setSchemaDescriptor(new ClientServiceMethodDescriptorSupplier("AddClient"))
              .build();
        }
      }
    }
    return getAddClientMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      io.adetalhouet.order.system.client.Clients> getGetClientsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetClients",
      requestType = com.google.protobuf.Empty.class,
      responseType = io.adetalhouet.order.system.client.Clients.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      io.adetalhouet.order.system.client.Clients> getGetClientsMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, io.adetalhouet.order.system.client.Clients> getGetClientsMethod;
    if ((getGetClientsMethod = ClientServiceGrpc.getGetClientsMethod) == null) {
      synchronized (ClientServiceGrpc.class) {
        if ((getGetClientsMethod = ClientServiceGrpc.getGetClientsMethod) == null) {
          ClientServiceGrpc.getGetClientsMethod = getGetClientsMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, io.adetalhouet.order.system.client.Clients>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetClients"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.adetalhouet.order.system.client.Clients.getDefaultInstance()))
              .setSchemaDescriptor(new ClientServiceMethodDescriptorSupplier("GetClients"))
              .build();
        }
      }
    }
    return getGetClientsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.adetalhouet.order.system.client.GetClientByIdRequest,
      io.adetalhouet.order.system.client.Client> getGetClientByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetClientById",
      requestType = io.adetalhouet.order.system.client.GetClientByIdRequest.class,
      responseType = io.adetalhouet.order.system.client.Client.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.adetalhouet.order.system.client.GetClientByIdRequest,
      io.adetalhouet.order.system.client.Client> getGetClientByIdMethod() {
    io.grpc.MethodDescriptor<io.adetalhouet.order.system.client.GetClientByIdRequest, io.adetalhouet.order.system.client.Client> getGetClientByIdMethod;
    if ((getGetClientByIdMethod = ClientServiceGrpc.getGetClientByIdMethod) == null) {
      synchronized (ClientServiceGrpc.class) {
        if ((getGetClientByIdMethod = ClientServiceGrpc.getGetClientByIdMethod) == null) {
          ClientServiceGrpc.getGetClientByIdMethod = getGetClientByIdMethod =
              io.grpc.MethodDescriptor.<io.adetalhouet.order.system.client.GetClientByIdRequest, io.adetalhouet.order.system.client.Client>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetClientById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.adetalhouet.order.system.client.GetClientByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.adetalhouet.order.system.client.Client.getDefaultInstance()))
              .setSchemaDescriptor(new ClientServiceMethodDescriptorSupplier("GetClientById"))
              .build();
        }
      }
    }
    return getGetClientByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.adetalhouet.order.system.client.DeleteClientByIdRequest,
      io.adetalhouet.order.system.utils.Status> getDeleteClientByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteClientById",
      requestType = io.adetalhouet.order.system.client.DeleteClientByIdRequest.class,
      responseType = io.adetalhouet.order.system.utils.Status.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.adetalhouet.order.system.client.DeleteClientByIdRequest,
      io.adetalhouet.order.system.utils.Status> getDeleteClientByIdMethod() {
    io.grpc.MethodDescriptor<io.adetalhouet.order.system.client.DeleteClientByIdRequest, io.adetalhouet.order.system.utils.Status> getDeleteClientByIdMethod;
    if ((getDeleteClientByIdMethod = ClientServiceGrpc.getDeleteClientByIdMethod) == null) {
      synchronized (ClientServiceGrpc.class) {
        if ((getDeleteClientByIdMethod = ClientServiceGrpc.getDeleteClientByIdMethod) == null) {
          ClientServiceGrpc.getDeleteClientByIdMethod = getDeleteClientByIdMethod =
              io.grpc.MethodDescriptor.<io.adetalhouet.order.system.client.DeleteClientByIdRequest, io.adetalhouet.order.system.utils.Status>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteClientById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.adetalhouet.order.system.client.DeleteClientByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.adetalhouet.order.system.utils.Status.getDefaultInstance()))
              .setSchemaDescriptor(new ClientServiceMethodDescriptorSupplier("DeleteClientById"))
              .build();
        }
      }
    }
    return getDeleteClientByIdMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ClientServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ClientServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ClientServiceStub>() {
        @java.lang.Override
        public ClientServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ClientServiceStub(channel, callOptions);
        }
      };
    return ClientServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ClientServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ClientServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ClientServiceBlockingStub>() {
        @java.lang.Override
        public ClientServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ClientServiceBlockingStub(channel, callOptions);
        }
      };
    return ClientServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ClientServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ClientServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ClientServiceFutureStub>() {
        @java.lang.Override
        public ClientServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ClientServiceFutureStub(channel, callOptions);
        }
      };
    return ClientServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class ClientServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void addClient(io.adetalhouet.order.system.client.Client request,
        io.grpc.stub.StreamObserver<io.adetalhouet.order.system.utils.Status> responseObserver) {
      asyncUnimplementedUnaryCall(getAddClientMethod(), responseObserver);
    }

    /**
     */
    public void getClients(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<io.adetalhouet.order.system.client.Clients> responseObserver) {
      asyncUnimplementedUnaryCall(getGetClientsMethod(), responseObserver);
    }

    /**
     */
    public void getClientById(io.adetalhouet.order.system.client.GetClientByIdRequest request,
        io.grpc.stub.StreamObserver<io.adetalhouet.order.system.client.Client> responseObserver) {
      asyncUnimplementedUnaryCall(getGetClientByIdMethod(), responseObserver);
    }

    /**
     */
    public void deleteClientById(io.adetalhouet.order.system.client.DeleteClientByIdRequest request,
        io.grpc.stub.StreamObserver<io.adetalhouet.order.system.utils.Status> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteClientByIdMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAddClientMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.adetalhouet.order.system.client.Client,
                io.adetalhouet.order.system.utils.Status>(
                  this, METHODID_ADD_CLIENT)))
          .addMethod(
            getGetClientsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                io.adetalhouet.order.system.client.Clients>(
                  this, METHODID_GET_CLIENTS)))
          .addMethod(
            getGetClientByIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.adetalhouet.order.system.client.GetClientByIdRequest,
                io.adetalhouet.order.system.client.Client>(
                  this, METHODID_GET_CLIENT_BY_ID)))
          .addMethod(
            getDeleteClientByIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.adetalhouet.order.system.client.DeleteClientByIdRequest,
                io.adetalhouet.order.system.utils.Status>(
                  this, METHODID_DELETE_CLIENT_BY_ID)))
          .build();
    }
  }

  /**
   */
  public static final class ClientServiceStub extends io.grpc.stub.AbstractAsyncStub<ClientServiceStub> {
    private ClientServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ClientServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ClientServiceStub(channel, callOptions);
    }

    /**
     */
    public void addClient(io.adetalhouet.order.system.client.Client request,
        io.grpc.stub.StreamObserver<io.adetalhouet.order.system.utils.Status> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddClientMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getClients(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<io.adetalhouet.order.system.client.Clients> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetClientsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getClientById(io.adetalhouet.order.system.client.GetClientByIdRequest request,
        io.grpc.stub.StreamObserver<io.adetalhouet.order.system.client.Client> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetClientByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteClientById(io.adetalhouet.order.system.client.DeleteClientByIdRequest request,
        io.grpc.stub.StreamObserver<io.adetalhouet.order.system.utils.Status> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteClientByIdMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ClientServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<ClientServiceBlockingStub> {
    private ClientServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ClientServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ClientServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public io.adetalhouet.order.system.utils.Status addClient(io.adetalhouet.order.system.client.Client request) {
      return blockingUnaryCall(
          getChannel(), getAddClientMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.adetalhouet.order.system.client.Clients getClients(com.google.protobuf.Empty request) {
      return blockingUnaryCall(
          getChannel(), getGetClientsMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.adetalhouet.order.system.client.Client getClientById(io.adetalhouet.order.system.client.GetClientByIdRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetClientByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.adetalhouet.order.system.utils.Status deleteClientById(io.adetalhouet.order.system.client.DeleteClientByIdRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteClientByIdMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ClientServiceFutureStub extends io.grpc.stub.AbstractFutureStub<ClientServiceFutureStub> {
    private ClientServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ClientServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ClientServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.adetalhouet.order.system.utils.Status> addClient(
        io.adetalhouet.order.system.client.Client request) {
      return futureUnaryCall(
          getChannel().newCall(getAddClientMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.adetalhouet.order.system.client.Clients> getClients(
        com.google.protobuf.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getGetClientsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.adetalhouet.order.system.client.Client> getClientById(
        io.adetalhouet.order.system.client.GetClientByIdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetClientByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.adetalhouet.order.system.utils.Status> deleteClientById(
        io.adetalhouet.order.system.client.DeleteClientByIdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteClientByIdMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ADD_CLIENT = 0;
  private static final int METHODID_GET_CLIENTS = 1;
  private static final int METHODID_GET_CLIENT_BY_ID = 2;
  private static final int METHODID_DELETE_CLIENT_BY_ID = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ClientServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ClientServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ADD_CLIENT:
          serviceImpl.addClient((io.adetalhouet.order.system.client.Client) request,
              (io.grpc.stub.StreamObserver<io.adetalhouet.order.system.utils.Status>) responseObserver);
          break;
        case METHODID_GET_CLIENTS:
          serviceImpl.getClients((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<io.adetalhouet.order.system.client.Clients>) responseObserver);
          break;
        case METHODID_GET_CLIENT_BY_ID:
          serviceImpl.getClientById((io.adetalhouet.order.system.client.GetClientByIdRequest) request,
              (io.grpc.stub.StreamObserver<io.adetalhouet.order.system.client.Client>) responseObserver);
          break;
        case METHODID_DELETE_CLIENT_BY_ID:
          serviceImpl.deleteClientById((io.adetalhouet.order.system.client.DeleteClientByIdRequest) request,
              (io.grpc.stub.StreamObserver<io.adetalhouet.order.system.utils.Status>) responseObserver);
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

  private static abstract class ClientServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ClientServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.adetalhouet.order.system.client.ClientOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ClientService");
    }
  }

  private static final class ClientServiceFileDescriptorSupplier
      extends ClientServiceBaseDescriptorSupplier {
    ClientServiceFileDescriptorSupplier() {}
  }

  private static final class ClientServiceMethodDescriptorSupplier
      extends ClientServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ClientServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ClientServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ClientServiceFileDescriptorSupplier())
              .addMethod(getAddClientMethod())
              .addMethod(getGetClientsMethod())
              .addMethod(getGetClientByIdMethod())
              .addMethod(getDeleteClientByIdMethod())
              .build();
        }
      }
    }
    return result;
  }
}
