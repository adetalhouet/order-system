package io.adetalhouet.order.system.product.grpc;

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
    comments = "Source: product.proto")
public final class ProductServiceGrpc {

  private ProductServiceGrpc() {}

  public static final String SERVICE_NAME = "io.adetalhouet.order.system.product.grpc.ProductService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.adetalhouet.order.system.product.grpc.Product,
      com.google.protobuf.Empty> getAddProductMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddProduct",
      requestType = io.adetalhouet.order.system.product.grpc.Product.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.adetalhouet.order.system.product.grpc.Product,
      com.google.protobuf.Empty> getAddProductMethod() {
    io.grpc.MethodDescriptor<io.adetalhouet.order.system.product.grpc.Product, com.google.protobuf.Empty> getAddProductMethod;
    if ((getAddProductMethod = ProductServiceGrpc.getAddProductMethod) == null) {
      synchronized (ProductServiceGrpc.class) {
        if ((getAddProductMethod = ProductServiceGrpc.getAddProductMethod) == null) {
          ProductServiceGrpc.getAddProductMethod = getAddProductMethod =
              io.grpc.MethodDescriptor.<io.adetalhouet.order.system.product.grpc.Product, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddProduct"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.adetalhouet.order.system.product.grpc.Product.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new ProductServiceMethodDescriptorSupplier("AddProduct"))
              .build();
        }
      }
    }
    return getAddProductMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      io.adetalhouet.order.system.product.grpc.Products> getGetProductsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetProducts",
      requestType = com.google.protobuf.Empty.class,
      responseType = io.adetalhouet.order.system.product.grpc.Products.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      io.adetalhouet.order.system.product.grpc.Products> getGetProductsMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, io.adetalhouet.order.system.product.grpc.Products> getGetProductsMethod;
    if ((getGetProductsMethod = ProductServiceGrpc.getGetProductsMethod) == null) {
      synchronized (ProductServiceGrpc.class) {
        if ((getGetProductsMethod = ProductServiceGrpc.getGetProductsMethod) == null) {
          ProductServiceGrpc.getGetProductsMethod = getGetProductsMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, io.adetalhouet.order.system.product.grpc.Products>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetProducts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.adetalhouet.order.system.product.grpc.Products.getDefaultInstance()))
              .setSchemaDescriptor(new ProductServiceMethodDescriptorSupplier("GetProducts"))
              .build();
        }
      }
    }
    return getGetProductsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.adetalhouet.order.system.product.grpc.GetProductByIdRequest,
      io.adetalhouet.order.system.product.grpc.Product> getGetProductByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetProductById",
      requestType = io.adetalhouet.order.system.product.grpc.GetProductByIdRequest.class,
      responseType = io.adetalhouet.order.system.product.grpc.Product.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.adetalhouet.order.system.product.grpc.GetProductByIdRequest,
      io.adetalhouet.order.system.product.grpc.Product> getGetProductByIdMethod() {
    io.grpc.MethodDescriptor<io.adetalhouet.order.system.product.grpc.GetProductByIdRequest, io.adetalhouet.order.system.product.grpc.Product> getGetProductByIdMethod;
    if ((getGetProductByIdMethod = ProductServiceGrpc.getGetProductByIdMethod) == null) {
      synchronized (ProductServiceGrpc.class) {
        if ((getGetProductByIdMethod = ProductServiceGrpc.getGetProductByIdMethod) == null) {
          ProductServiceGrpc.getGetProductByIdMethod = getGetProductByIdMethod =
              io.grpc.MethodDescriptor.<io.adetalhouet.order.system.product.grpc.GetProductByIdRequest, io.adetalhouet.order.system.product.grpc.Product>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetProductById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.adetalhouet.order.system.product.grpc.GetProductByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.adetalhouet.order.system.product.grpc.Product.getDefaultInstance()))
              .setSchemaDescriptor(new ProductServiceMethodDescriptorSupplier("GetProductById"))
              .build();
        }
      }
    }
    return getGetProductByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.adetalhouet.order.system.product.grpc.DeleteProductByIdRequest,
      com.google.protobuf.Empty> getDeleteProductByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteProductById",
      requestType = io.adetalhouet.order.system.product.grpc.DeleteProductByIdRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.adetalhouet.order.system.product.grpc.DeleteProductByIdRequest,
      com.google.protobuf.Empty> getDeleteProductByIdMethod() {
    io.grpc.MethodDescriptor<io.adetalhouet.order.system.product.grpc.DeleteProductByIdRequest, com.google.protobuf.Empty> getDeleteProductByIdMethod;
    if ((getDeleteProductByIdMethod = ProductServiceGrpc.getDeleteProductByIdMethod) == null) {
      synchronized (ProductServiceGrpc.class) {
        if ((getDeleteProductByIdMethod = ProductServiceGrpc.getDeleteProductByIdMethod) == null) {
          ProductServiceGrpc.getDeleteProductByIdMethod = getDeleteProductByIdMethod =
              io.grpc.MethodDescriptor.<io.adetalhouet.order.system.product.grpc.DeleteProductByIdRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteProductById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.adetalhouet.order.system.product.grpc.DeleteProductByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new ProductServiceMethodDescriptorSupplier("DeleteProductById"))
              .build();
        }
      }
    }
    return getDeleteProductByIdMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ProductServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProductServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProductServiceStub>() {
        @java.lang.Override
        public ProductServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProductServiceStub(channel, callOptions);
        }
      };
    return ProductServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ProductServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProductServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProductServiceBlockingStub>() {
        @java.lang.Override
        public ProductServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProductServiceBlockingStub(channel, callOptions);
        }
      };
    return ProductServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ProductServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProductServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProductServiceFutureStub>() {
        @java.lang.Override
        public ProductServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProductServiceFutureStub(channel, callOptions);
        }
      };
    return ProductServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class ProductServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void addProduct(io.adetalhouet.order.system.product.grpc.Product request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getAddProductMethod(), responseObserver);
    }

    /**
     */
    public void getProducts(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<io.adetalhouet.order.system.product.grpc.Products> responseObserver) {
      asyncUnimplementedUnaryCall(getGetProductsMethod(), responseObserver);
    }

    /**
     */
    public void getProductById(io.adetalhouet.order.system.product.grpc.GetProductByIdRequest request,
        io.grpc.stub.StreamObserver<io.adetalhouet.order.system.product.grpc.Product> responseObserver) {
      asyncUnimplementedUnaryCall(getGetProductByIdMethod(), responseObserver);
    }

    /**
     */
    public void deleteProductById(io.adetalhouet.order.system.product.grpc.DeleteProductByIdRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteProductByIdMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAddProductMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.adetalhouet.order.system.product.grpc.Product,
                com.google.protobuf.Empty>(
                  this, METHODID_ADD_PRODUCT)))
          .addMethod(
            getGetProductsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                io.adetalhouet.order.system.product.grpc.Products>(
                  this, METHODID_GET_PRODUCTS)))
          .addMethod(
            getGetProductByIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.adetalhouet.order.system.product.grpc.GetProductByIdRequest,
                io.adetalhouet.order.system.product.grpc.Product>(
                  this, METHODID_GET_PRODUCT_BY_ID)))
          .addMethod(
            getDeleteProductByIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.adetalhouet.order.system.product.grpc.DeleteProductByIdRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_DELETE_PRODUCT_BY_ID)))
          .build();
    }
  }

  /**
   */
  public static final class ProductServiceStub extends io.grpc.stub.AbstractAsyncStub<ProductServiceStub> {
    private ProductServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProductServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProductServiceStub(channel, callOptions);
    }

    /**
     */
    public void addProduct(io.adetalhouet.order.system.product.grpc.Product request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddProductMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getProducts(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<io.adetalhouet.order.system.product.grpc.Products> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetProductsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getProductById(io.adetalhouet.order.system.product.grpc.GetProductByIdRequest request,
        io.grpc.stub.StreamObserver<io.adetalhouet.order.system.product.grpc.Product> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetProductByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteProductById(io.adetalhouet.order.system.product.grpc.DeleteProductByIdRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteProductByIdMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ProductServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<ProductServiceBlockingStub> {
    private ProductServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProductServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProductServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.google.protobuf.Empty addProduct(io.adetalhouet.order.system.product.grpc.Product request) {
      return blockingUnaryCall(
          getChannel(), getAddProductMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.adetalhouet.order.system.product.grpc.Products getProducts(com.google.protobuf.Empty request) {
      return blockingUnaryCall(
          getChannel(), getGetProductsMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.adetalhouet.order.system.product.grpc.Product getProductById(io.adetalhouet.order.system.product.grpc.GetProductByIdRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetProductByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty deleteProductById(io.adetalhouet.order.system.product.grpc.DeleteProductByIdRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteProductByIdMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ProductServiceFutureStub extends io.grpc.stub.AbstractFutureStub<ProductServiceFutureStub> {
    private ProductServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProductServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProductServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> addProduct(
        io.adetalhouet.order.system.product.grpc.Product request) {
      return futureUnaryCall(
          getChannel().newCall(getAddProductMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.adetalhouet.order.system.product.grpc.Products> getProducts(
        com.google.protobuf.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getGetProductsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.adetalhouet.order.system.product.grpc.Product> getProductById(
        io.adetalhouet.order.system.product.grpc.GetProductByIdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetProductByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteProductById(
        io.adetalhouet.order.system.product.grpc.DeleteProductByIdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteProductByIdMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ADD_PRODUCT = 0;
  private static final int METHODID_GET_PRODUCTS = 1;
  private static final int METHODID_GET_PRODUCT_BY_ID = 2;
  private static final int METHODID_DELETE_PRODUCT_BY_ID = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ProductServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ProductServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ADD_PRODUCT:
          serviceImpl.addProduct((io.adetalhouet.order.system.product.grpc.Product) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_GET_PRODUCTS:
          serviceImpl.getProducts((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<io.adetalhouet.order.system.product.grpc.Products>) responseObserver);
          break;
        case METHODID_GET_PRODUCT_BY_ID:
          serviceImpl.getProductById((io.adetalhouet.order.system.product.grpc.GetProductByIdRequest) request,
              (io.grpc.stub.StreamObserver<io.adetalhouet.order.system.product.grpc.Product>) responseObserver);
          break;
        case METHODID_DELETE_PRODUCT_BY_ID:
          serviceImpl.deleteProductById((io.adetalhouet.order.system.product.grpc.DeleteProductByIdRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
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

  private static abstract class ProductServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ProductServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.adetalhouet.order.system.product.grpc.ProductOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ProductService");
    }
  }

  private static final class ProductServiceFileDescriptorSupplier
      extends ProductServiceBaseDescriptorSupplier {
    ProductServiceFileDescriptorSupplier() {}
  }

  private static final class ProductServiceMethodDescriptorSupplier
      extends ProductServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ProductServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ProductServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ProductServiceFileDescriptorSupplier())
              .addMethod(getAddProductMethod())
              .addMethod(getGetProductsMethod())
              .addMethod(getGetProductByIdMethod())
              .addMethod(getDeleteProductByIdMethod())
              .build();
        }
      }
    }
    return result;
  }
}
