// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: product.proto

package io.adetalhouet.order.system.product.grpc;

public final class ProductOuterClass {
  private ProductOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_io_adetalhouet_order_system_product_grpc_GetProductByIdRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_io_adetalhouet_order_system_product_grpc_GetProductByIdRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_io_adetalhouet_order_system_product_grpc_DeleteProductByIdRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_io_adetalhouet_order_system_product_grpc_DeleteProductByIdRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_io_adetalhouet_order_system_product_grpc_Products_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_io_adetalhouet_order_system_product_grpc_Products_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_io_adetalhouet_order_system_product_grpc_Product_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_io_adetalhouet_order_system_product_grpc_Product_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\rproduct.proto\022(io.adetalhouet.order.sy" +
      "stem.product.grpc\032\033google/protobuf/empty" +
      ".proto\032\037google/protobuf/timestamp.proto\"" +
      "#\n\025GetProductByIdRequest\022\n\n\002id\030\001 \001(\003\"&\n\030" +
      "DeleteProductByIdRequest\022\n\n\002id\030\001 \001(\003\"O\n\010" +
      "Products\022C\n\010products\030\001 \003(\01321.io.adetalho" +
      "uet.order.system.product.grpc.Product\"v\n" +
      "\007Product\022\n\n\002id\030\001 \001(\003\022\014\n\004name\030\002 \001(\t\022\r\n\005pr" +
      "ice\030\003 \001(\t\022\020\n\010quantity\030\004 \001(\005\0220\n\014last_upda" +
      "ted\030\005 \001(\0132\032.google.protobuf.Timestamp2\274\003" +
      "\n\016ProductService\022W\n\nAddProduct\0221.io.adet" +
      "alhouet.order.system.product.grpc.Produc" +
      "t\032\026.google.protobuf.Empty\022Y\n\013GetProducts" +
      "\022\026.google.protobuf.Empty\0322.io.adetalhoue" +
      "t.order.system.product.grpc.Products\022\204\001\n" +
      "\016GetProductById\022?.io.adetalhouet.order.s" +
      "ystem.product.grpc.GetProductByIdRequest" +
      "\0321.io.adetalhouet.order.system.product.g" +
      "rpc.Product\022o\n\021DeleteProductById\022B.io.ad" +
      "etalhouet.order.system.product.grpc.Dele" +
      "teProductByIdRequest\032\026.google.protobuf.E" +
      "mptyB,\n(io.adetalhouet.order.system.prod" +
      "uct.grpcP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.EmptyProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_io_adetalhouet_order_system_product_grpc_GetProductByIdRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_io_adetalhouet_order_system_product_grpc_GetProductByIdRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_io_adetalhouet_order_system_product_grpc_GetProductByIdRequest_descriptor,
        new java.lang.String[] { "Id", });
    internal_static_io_adetalhouet_order_system_product_grpc_DeleteProductByIdRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_io_adetalhouet_order_system_product_grpc_DeleteProductByIdRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_io_adetalhouet_order_system_product_grpc_DeleteProductByIdRequest_descriptor,
        new java.lang.String[] { "Id", });
    internal_static_io_adetalhouet_order_system_product_grpc_Products_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_io_adetalhouet_order_system_product_grpc_Products_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_io_adetalhouet_order_system_product_grpc_Products_descriptor,
        new java.lang.String[] { "Products", });
    internal_static_io_adetalhouet_order_system_product_grpc_Product_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_io_adetalhouet_order_system_product_grpc_Product_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_io_adetalhouet_order_system_product_grpc_Product_descriptor,
        new java.lang.String[] { "Id", "Name", "Price", "Quantity", "LastUpdated", });
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}