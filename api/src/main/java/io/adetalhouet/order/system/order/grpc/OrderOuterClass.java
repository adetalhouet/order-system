// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: order.proto

package io.adetalhouet.order.system.order.grpc;

public final class OrderOuterClass {
  private OrderOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_io_adetalhouet_order_system_order_grpc_TrackOrderByIdRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_io_adetalhouet_order_system_order_grpc_TrackOrderByIdRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_io_adetalhouet_order_system_order_grpc_TrackOrderByIdResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_io_adetalhouet_order_system_order_grpc_TrackOrderByIdResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_io_adetalhouet_order_system_order_grpc_GetOrdersByClientRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_io_adetalhouet_order_system_order_grpc_GetOrdersByClientRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_io_adetalhouet_order_system_order_grpc_Orders_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_io_adetalhouet_order_system_order_grpc_Orders_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_io_adetalhouet_order_system_order_grpc_Order_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_io_adetalhouet_order_system_order_grpc_Order_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\013order.proto\022&io.adetalhouet.order.syst" +
      "em.order.grpc\032\033google/protobuf/empty.pro" +
      "to\032\037google/protobuf/timestamp.proto\"#\n\025T" +
      "rackOrderByIdRequest\022\n\n\002id\030\001 \001(\003\"b\n\026Trac" +
      "kOrderByIdResponse\022\n\n\002id\030\001 \001(\003\022<\n\005order\030" +
      "\003 \001(\0132-.io.adetalhouet.order.system.orde" +
      "r.grpc.Order\"-\n\030GetOrdersByClientRequest" +
      "\022\021\n\tclient_id\030\001 \001(\003\"G\n\006Orders\022=\n\006orders\030" +
      "\001 \003(\0132-.io.adetalhouet.order.system.orde" +
      "r.grpc.Order\"\356\001\n\005Order\022\n\n\002id\030\001 \001(\003\022B\n\005st" +
      "ate\030\002 \001(\01623.io.adetalhouet.order.system." +
      "order.grpc.Order.State\022\021\n\tclient_id\030\003 \001(" +
      "\003\022\017\n\007cart_id\030\004 \001(\003\0220\n\014date_created\030\005 \001(\013" +
      "2\032.google.protobuf.Timestamp\"?\n\005State\022\013\n" +
      "\007PENDING\020\000\022\n\n\006PLACED\020\001\022\016\n\nIN_TRANSIT\020\002\022\r" +
      "\n\tDELIVERED\020\0032\375\002\n\014OrderService\022S\n\nPlaceO" +
      "rder\022-.io.adetalhouet.order.system.order" +
      ".grpc.Order\032\026.google.protobuf.Empty\022\217\001\n\016" +
      "TrackOrderById\022=.io.adetalhouet.order.sy" +
      "stem.order.grpc.TrackOrderByIdRequest\032>." +
      "io.adetalhouet.order.system.order.grpc.T" +
      "rackOrderByIdResponse\022\205\001\n\021GetOrdersByCli" +
      "ent\022@.io.adetalhouet.order.system.order." +
      "grpc.GetOrdersByClientRequest\032..io.adeta" +
      "lhouet.order.system.order.grpc.OrdersB*\n" +
      "&io.adetalhouet.order.system.order.grpcP" +
      "\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.EmptyProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_io_adetalhouet_order_system_order_grpc_TrackOrderByIdRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_io_adetalhouet_order_system_order_grpc_TrackOrderByIdRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_io_adetalhouet_order_system_order_grpc_TrackOrderByIdRequest_descriptor,
        new java.lang.String[] { "Id", });
    internal_static_io_adetalhouet_order_system_order_grpc_TrackOrderByIdResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_io_adetalhouet_order_system_order_grpc_TrackOrderByIdResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_io_adetalhouet_order_system_order_grpc_TrackOrderByIdResponse_descriptor,
        new java.lang.String[] { "Id", "Order", });
    internal_static_io_adetalhouet_order_system_order_grpc_GetOrdersByClientRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_io_adetalhouet_order_system_order_grpc_GetOrdersByClientRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_io_adetalhouet_order_system_order_grpc_GetOrdersByClientRequest_descriptor,
        new java.lang.String[] { "ClientId", });
    internal_static_io_adetalhouet_order_system_order_grpc_Orders_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_io_adetalhouet_order_system_order_grpc_Orders_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_io_adetalhouet_order_system_order_grpc_Orders_descriptor,
        new java.lang.String[] { "Orders", });
    internal_static_io_adetalhouet_order_system_order_grpc_Order_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_io_adetalhouet_order_system_order_grpc_Order_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_io_adetalhouet_order_system_order_grpc_Order_descriptor,
        new java.lang.String[] { "Id", "State", "ClientId", "CartId", "DateCreated", });
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}