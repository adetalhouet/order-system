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
    internal_static_io_adetalhouet_order_system_order_grpc_OrderId_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_io_adetalhouet_order_system_order_grpc_OrderId_fieldAccessorTable;
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
      "em.order.grpc\032\037google/protobuf/timestamp" +
      ".proto\"\025\n\007OrderId\022\n\n\002id\030\001 \001(\003\"b\n\026TrackOr" +
      "derByIdResponse\022\n\n\002id\030\001 \001(\003\022<\n\005order\030\003 \001" +
      "(\0132-.io.adetalhouet.order.system.order.g" +
      "rpc.Order\"-\n\030GetOrdersByClientRequest\022\021\n" +
      "\tclient_id\030\001 \001(\003\"G\n\006Orders\022=\n\006orders\030\001 \003" +
      "(\0132-.io.adetalhouet.order.system.order.g" +
      "rpc.Order\"\356\001\n\005Order\022\n\n\002id\030\001 \001(\003\022B\n\005state" +
      "\030\002 \001(\01623.io.adetalhouet.order.system.ord" +
      "er.grpc.Order.State\022\021\n\tclient_id\030\003 \001(\003\022\017" +
      "\n\007cart_id\030\004 \001(\003\0220\n\014date_created\030\005 \001(\0132\032." +
      "google.protobuf.Timestamp\"?\n\005State\022\013\n\007PE" +
      "NDING\020\000\022\n\n\006PLACED\020\001\022\016\n\nIN_TRANSIT\020\002\022\r\n\tD" +
      "ELIVERED\020\0032\210\003\n\014OrderService\022l\n\nPlaceOrde" +
      "r\022-.io.adetalhouet.order.system.order.gr" +
      "pc.Order\032/.io.adetalhouet.order.system.o" +
      "rder.grpc.OrderId\022\201\001\n\016TrackOrderById\022/.i" +
      "o.adetalhouet.order.system.order.grpc.Or" +
      "derId\032>.io.adetalhouet.order.system.orde" +
      "r.grpc.TrackOrderByIdResponse\022\205\001\n\021GetOrd" +
      "ersByClient\022@.io.adetalhouet.order.syste" +
      "m.order.grpc.GetOrdersByClientRequest\032.." +
      "io.adetalhouet.order.system.order.grpc.O" +
      "rdersB*\n&io.adetalhouet.order.system.ord" +
      "er.grpcP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_io_adetalhouet_order_system_order_grpc_OrderId_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_io_adetalhouet_order_system_order_grpc_OrderId_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_io_adetalhouet_order_system_order_grpc_OrderId_descriptor,
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
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
