// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cart.proto

package io.adetalhouet.order.system.cart;

public interface CartOrBuilder extends
    // @@protoc_insertion_point(interface_extends:io.adetalhouet.order.system.cart.Cart)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int64 id = 1;</code>
   * @return The id.
   */
  long getId();

  /**
   * <code>repeated .io.adetalhouet.order.system.cart.CartItem items = 2;</code>
   */
  java.util.List<io.adetalhouet.order.system.cart.CartItem> 
      getItemsList();
  /**
   * <code>repeated .io.adetalhouet.order.system.cart.CartItem items = 2;</code>
   */
  io.adetalhouet.order.system.cart.CartItem getItems(int index);
  /**
   * <code>repeated .io.adetalhouet.order.system.cart.CartItem items = 2;</code>
   */
  int getItemsCount();
  /**
   * <code>repeated .io.adetalhouet.order.system.cart.CartItem items = 2;</code>
   */
  java.util.List<? extends io.adetalhouet.order.system.cart.CartItemOrBuilder> 
      getItemsOrBuilderList();
  /**
   * <code>repeated .io.adetalhouet.order.system.cart.CartItem items = 2;</code>
   */
  io.adetalhouet.order.system.cart.CartItemOrBuilder getItemsOrBuilder(
      int index);

  /**
   * <code>.google.protobuf.Timestamp date_created = 3;</code>
   * @return Whether the dateCreated field is set.
   */
  boolean hasDateCreated();
  /**
   * <code>.google.protobuf.Timestamp date_created = 3;</code>
   * @return The dateCreated.
   */
  com.google.protobuf.Timestamp getDateCreated();
  /**
   * <code>.google.protobuf.Timestamp date_created = 3;</code>
   */
  com.google.protobuf.TimestampOrBuilder getDateCreatedOrBuilder();
}
