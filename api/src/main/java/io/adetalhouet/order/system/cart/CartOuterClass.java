// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cart.proto

package io.adetalhouet.order.system.cart;

public final class CartOuterClass {
  private CartOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_io_adetalhouet_order_system_cart_GetClientByIdRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_io_adetalhouet_order_system_cart_GetClientByIdRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_io_adetalhouet_order_system_cart_DeleteClientByIdRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_io_adetalhouet_order_system_cart_DeleteClientByIdRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_io_adetalhouet_order_system_cart_CartItem_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_io_adetalhouet_order_system_cart_CartItem_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_io_adetalhouet_order_system_cart_Cart_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_io_adetalhouet_order_system_cart_Cart_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\ncart.proto\022 io.adetalhouet.order.syste" +
      "m.cart\032\013utils.proto\032\rproduct.proto\032\037goog" +
      "le/protobuf/timestamp.proto\"\"\n\024GetClient" +
      "ByIdRequest\022\n\n\002id\030\001 \001(\003\"%\n\027DeleteClientB" +
      "yIdRequest\022\n\n\002id\030\001 \001(\003\"p\n\010CartItem\022=\n\007pr" +
      "oduct\030\001 \001(\0132,.io.adetalhouet.order.syste" +
      "m.product.Product\022\020\n\010quantity\030\002 \001(\005\022\023\n\013t" +
      "otal_price\030\003 \001(\002\"\177\n\004Cart\022\n\n\002id\030\001 \001(\003\0229\n\005" +
      "items\030\002 \003(\0132*.io.adetalhouet.order.syste" +
      "m.cart.CartItem\0220\n\014date_created\030\003 \001(\0132\032." +
      "google.protobuf.Timestamp2\332\001\n\013CartServic" +
      "e\022b\n\tAddToCart\022*.io.adetalhouet.order.sy" +
      "stem.cart.CartItem\032).io.adetalhouet.orde" +
      "r.system.utils.Status\022g\n\016RemoteFromCart\022" +
      "*.io.adetalhouet.order.system.cart.CartI" +
      "tem\032).io.adetalhouet.order.system.utils." +
      "StatusB$\n io.adetalhouet.order.system.ca" +
      "rtP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          io.adetalhouet.order.system.utils.Utils.getDescriptor(),
          io.adetalhouet.order.system.product.ProductOuterClass.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_io_adetalhouet_order_system_cart_GetClientByIdRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_io_adetalhouet_order_system_cart_GetClientByIdRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_io_adetalhouet_order_system_cart_GetClientByIdRequest_descriptor,
        new java.lang.String[] { "Id", });
    internal_static_io_adetalhouet_order_system_cart_DeleteClientByIdRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_io_adetalhouet_order_system_cart_DeleteClientByIdRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_io_adetalhouet_order_system_cart_DeleteClientByIdRequest_descriptor,
        new java.lang.String[] { "Id", });
    internal_static_io_adetalhouet_order_system_cart_CartItem_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_io_adetalhouet_order_system_cart_CartItem_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_io_adetalhouet_order_system_cart_CartItem_descriptor,
        new java.lang.String[] { "Product", "Quantity", "TotalPrice", });
    internal_static_io_adetalhouet_order_system_cart_Cart_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_io_adetalhouet_order_system_cart_Cart_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_io_adetalhouet_order_system_cart_Cart_descriptor,
        new java.lang.String[] { "Id", "Items", "DateCreated", });
    io.adetalhouet.order.system.utils.Utils.getDescriptor();
    io.adetalhouet.order.system.product.ProductOuterClass.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}