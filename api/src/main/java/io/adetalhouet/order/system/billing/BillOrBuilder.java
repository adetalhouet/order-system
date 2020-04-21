// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: billing.proto

package io.adetalhouet.order.system.billing;

public interface BillOrBuilder extends
    // @@protoc_insertion_point(interface_extends:io.adetalhouet.order.system.billing.Bill)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int64 id = 1;</code>
   * @return The id.
   */
  long getId();

  /**
   * <code>.google.protobuf.Timestamp date_created = 2;</code>
   * @return Whether the dateCreated field is set.
   */
  boolean hasDateCreated();
  /**
   * <code>.google.protobuf.Timestamp date_created = 2;</code>
   * @return The dateCreated.
   */
  com.google.protobuf.Timestamp getDateCreated();
  /**
   * <code>.google.protobuf.Timestamp date_created = 2;</code>
   */
  com.google.protobuf.TimestampOrBuilder getDateCreatedOrBuilder();

  /**
   * <code>int64 client_id = 3;</code>
   * @return The clientId.
   */
  long getClientId();

  /**
   * <code>repeated int64 product_ids = 4;</code>
   * @return A list containing the productIds.
   */
  java.util.List<java.lang.Long> getProductIdsList();
  /**
   * <code>repeated int64 product_ids = 4;</code>
   * @return The count of productIds.
   */
  int getProductIdsCount();
  /**
   * <code>repeated int64 product_ids = 4;</code>
   * @param index The index of the element to return.
   * @return The productIds at the given index.
   */
  long getProductIds(int index);

  /**
   * <code>float price = 5;</code>
   * @return The price.
   */
  float getPrice();
}
