// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: product.proto

package io.adetalhouet.order.system.product;

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
    internal_static_io_adetalhouet_order_system_product_GetProductByIdRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_io_adetalhouet_order_system_product_GetProductByIdRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_io_adetalhouet_order_system_product_DeleteProductByIdRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_io_adetalhouet_order_system_product_DeleteProductByIdRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_io_adetalhouet_order_system_product_Products_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_io_adetalhouet_order_system_product_Products_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_io_adetalhouet_order_system_product_Product_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_io_adetalhouet_order_system_product_Product_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\rproduct.proto\022#io.adetalhouet.order.sy" +
      "stem.product\032\013utils.proto\032\033google/protob" +
      "uf/empty.proto\032\037google/protobuf/timestam" +
      "p.proto\"#\n\025GetProductByIdRequest\022\n\n\002id\030\001" +
      " \001(\003\"&\n\030DeleteProductByIdRequest\022\n\n\002id\030\001" +
      " \001(\003\"J\n\010Products\022>\n\010products\030\001 \003(\0132,.io." +
      "adetalhouet.order.system.product.Product" +
      "\"\315\001\n\007Product\022\n\n\002id\030\001 \001(\003\022\014\n\004name\030\002 \001(\t\022\r" +
      "\n\005price\030\003 \001(\t\022\030\n\020number_available\030\004 \001(\005\022" +
      "\r\n\005weigh\030\005 \001(\t\022\014\n\004size\030\006 \001(\t\0220\n\014date_cre" +
      "ated\030\007 \001(\0132\032.google.protobuf.Timestamp\0220" +
      "\n\014last_updated\030\010 \001(\0132\032.google.protobuf.T" +
      "imestamp2\310\003\n\016ProductService\022e\n\nAddProduc" +
      "t\022,.io.adetalhouet.order.system.product." +
      "Product\032).io.adetalhouet.order.system.ut" +
      "ils.Status\022T\n\013GetProducts\022\026.google.proto" +
      "buf.Empty\032-.io.adetalhouet.order.system." +
      "product.Products\022z\n\016GetProductById\022:.io." +
      "adetalhouet.order.system.product.GetProd" +
      "uctByIdRequest\032,.io.adetalhouet.order.sy" +
      "stem.product.Product\022}\n\021DeleteProductByI" +
      "d\022=.io.adetalhouet.order.system.product." +
      "DeleteProductByIdRequest\032).io.adetalhoue" +
      "t.order.system.utils.StatusB\'\n#io.adetal" +
      "houet.order.system.productP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          io.adetalhouet.order.system.utils.Utils.getDescriptor(),
          com.google.protobuf.EmptyProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_io_adetalhouet_order_system_product_GetProductByIdRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_io_adetalhouet_order_system_product_GetProductByIdRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_io_adetalhouet_order_system_product_GetProductByIdRequest_descriptor,
        new java.lang.String[] { "Id", });
    internal_static_io_adetalhouet_order_system_product_DeleteProductByIdRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_io_adetalhouet_order_system_product_DeleteProductByIdRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_io_adetalhouet_order_system_product_DeleteProductByIdRequest_descriptor,
        new java.lang.String[] { "Id", });
    internal_static_io_adetalhouet_order_system_product_Products_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_io_adetalhouet_order_system_product_Products_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_io_adetalhouet_order_system_product_Products_descriptor,
        new java.lang.String[] { "Products", });
    internal_static_io_adetalhouet_order_system_product_Product_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_io_adetalhouet_order_system_product_Product_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_io_adetalhouet_order_system_product_Product_descriptor,
        new java.lang.String[] { "Id", "Name", "Price", "NumberAvailable", "Weigh", "Size", "DateCreated", "LastUpdated", });
    io.adetalhouet.order.system.utils.Utils.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
