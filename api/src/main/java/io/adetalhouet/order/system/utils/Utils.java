// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: utils.proto

package io.adetalhouet.order.system.utils;

public final class Utils {
  private Utils() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_io_adetalhouet_order_system_utils_Status_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_io_adetalhouet_order_system_utils_Status_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\013utils.proto\022!io.adetalhouet.order.syst" +
      "em.utils\"l\n\006Status\022?\n\006status\030\001 \001(\0162/.io." +
      "adetalhouet.order.system.utils.Status.St" +
      "ate\"!\n\005State\022\013\n\007SUCCESS\020\000\022\013\n\007FAILURE\020\001B%" +
      "\n!io.adetalhouet.order.system.utilsP\001b\006p" +
      "roto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_io_adetalhouet_order_system_utils_Status_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_io_adetalhouet_order_system_utils_Status_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_io_adetalhouet_order_system_utils_Status_descriptor,
        new java.lang.String[] { "Status", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
