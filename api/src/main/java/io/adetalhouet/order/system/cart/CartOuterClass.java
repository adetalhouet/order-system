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
    internal_static_io_adetalhouet_order_system_cart_UpdateCartRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_io_adetalhouet_order_system_cart_UpdateCartRequest_fieldAccessorTable;
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
      "le/protobuf/timestamp.proto\"^\n\021UpdateCar" +
      "tRequest\022\017\n\007cart_id\030\001 \001(\003\0228\n\004item\030\002 \001(\0132" +
      "*.io.adetalhouet.order.system.cart.CartI" +
      "tem\"p\n\010CartItem\022=\n\007product\030\001 \001(\0132,.io.ad" +
      "etalhouet.order.system.product.Product\022\020" +
      "\n\010quantity\030\002 \001(\005\022\023\n\013total_price\030\003 \001(\002\"b\n" +
      "\004Cart\022\n\n\002id\030\001 \001(\003\0229\n\005items\030\002 \003(\0132*.io.ad" +
      "etalhouet.order.system.cart.CartItem\022\023\n\013" +
      "total_price\030\003 \001(\0012\354\001\n\013CartService\022k\n\tAdd" +
      "ToCart\0223.io.adetalhouet.order.system.car" +
      "t.UpdateCartRequest\032).io.adetalhouet.ord" +
      "er.system.utils.Status\022p\n\016RemoteFromCart" +
      "\0223.io.adetalhouet.order.system.cart.Upda" +
      "teCartRequest\032).io.adetalhouet.order.sys" +
      "tem.utils.StatusB$\n io.adetalhouet.order" +
      ".system.cartP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          io.adetalhouet.order.system.utils.Utils.getDescriptor(),
          io.adetalhouet.order.system.product.ProductOuterClass.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_io_adetalhouet_order_system_cart_UpdateCartRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_io_adetalhouet_order_system_cart_UpdateCartRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_io_adetalhouet_order_system_cart_UpdateCartRequest_descriptor,
        new java.lang.String[] { "CartId", "Item", });
    internal_static_io_adetalhouet_order_system_cart_CartItem_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_io_adetalhouet_order_system_cart_CartItem_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_io_adetalhouet_order_system_cart_CartItem_descriptor,
        new java.lang.String[] { "Product", "Quantity", "TotalPrice", });
    internal_static_io_adetalhouet_order_system_cart_Cart_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_io_adetalhouet_order_system_cart_Cart_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_io_adetalhouet_order_system_cart_Cart_descriptor,
        new java.lang.String[] { "Id", "Items", "TotalPrice", });
    io.adetalhouet.order.system.utils.Utils.getDescriptor();
    io.adetalhouet.order.system.product.ProductOuterClass.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
