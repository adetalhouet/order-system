// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: billing.proto

package io.adetalhouet.order.system.billing;

/**
 * Protobuf type {@code io.adetalhouet.order.system.billing.Bills}
 */
public  final class Bills extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:io.adetalhouet.order.system.billing.Bills)
    BillsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Bills.newBuilder() to construct.
  private Bills(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Bills() {
    bills_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Bills();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Bills(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              bills_ = new java.util.ArrayList<io.adetalhouet.order.system.billing.Bill>();
              mutable_bitField0_ |= 0x00000001;
            }
            bills_.add(
                input.readMessage(io.adetalhouet.order.system.billing.Bill.parser(), extensionRegistry));
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        bills_ = java.util.Collections.unmodifiableList(bills_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.adetalhouet.order.system.billing.Billing.internal_static_io_adetalhouet_order_system_billing_Bills_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.adetalhouet.order.system.billing.Billing.internal_static_io_adetalhouet_order_system_billing_Bills_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.adetalhouet.order.system.billing.Bills.class, io.adetalhouet.order.system.billing.Bills.Builder.class);
  }

  public static final int BILLS_FIELD_NUMBER = 1;
  private java.util.List<io.adetalhouet.order.system.billing.Bill> bills_;
  /**
   * <code>repeated .io.adetalhouet.order.system.billing.Bill bills = 1;</code>
   */
  public java.util.List<io.adetalhouet.order.system.billing.Bill> getBillsList() {
    return bills_;
  }
  /**
   * <code>repeated .io.adetalhouet.order.system.billing.Bill bills = 1;</code>
   */
  public java.util.List<? extends io.adetalhouet.order.system.billing.BillOrBuilder> 
      getBillsOrBuilderList() {
    return bills_;
  }
  /**
   * <code>repeated .io.adetalhouet.order.system.billing.Bill bills = 1;</code>
   */
  public int getBillsCount() {
    return bills_.size();
  }
  /**
   * <code>repeated .io.adetalhouet.order.system.billing.Bill bills = 1;</code>
   */
  public io.adetalhouet.order.system.billing.Bill getBills(int index) {
    return bills_.get(index);
  }
  /**
   * <code>repeated .io.adetalhouet.order.system.billing.Bill bills = 1;</code>
   */
  public io.adetalhouet.order.system.billing.BillOrBuilder getBillsOrBuilder(
      int index) {
    return bills_.get(index);
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < bills_.size(); i++) {
      output.writeMessage(1, bills_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < bills_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, bills_.get(i));
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof io.adetalhouet.order.system.billing.Bills)) {
      return super.equals(obj);
    }
    io.adetalhouet.order.system.billing.Bills other = (io.adetalhouet.order.system.billing.Bills) obj;

    if (!getBillsList()
        .equals(other.getBillsList())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getBillsCount() > 0) {
      hash = (37 * hash) + BILLS_FIELD_NUMBER;
      hash = (53 * hash) + getBillsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.adetalhouet.order.system.billing.Bills parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.adetalhouet.order.system.billing.Bills parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.adetalhouet.order.system.billing.Bills parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.adetalhouet.order.system.billing.Bills parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.adetalhouet.order.system.billing.Bills parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.adetalhouet.order.system.billing.Bills parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.adetalhouet.order.system.billing.Bills parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.adetalhouet.order.system.billing.Bills parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.adetalhouet.order.system.billing.Bills parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.adetalhouet.order.system.billing.Bills parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.adetalhouet.order.system.billing.Bills parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.adetalhouet.order.system.billing.Bills parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(io.adetalhouet.order.system.billing.Bills prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code io.adetalhouet.order.system.billing.Bills}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:io.adetalhouet.order.system.billing.Bills)
      io.adetalhouet.order.system.billing.BillsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.adetalhouet.order.system.billing.Billing.internal_static_io_adetalhouet_order_system_billing_Bills_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.adetalhouet.order.system.billing.Billing.internal_static_io_adetalhouet_order_system_billing_Bills_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.adetalhouet.order.system.billing.Bills.class, io.adetalhouet.order.system.billing.Bills.Builder.class);
    }

    // Construct using io.adetalhouet.order.system.billing.Bills.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getBillsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (billsBuilder_ == null) {
        bills_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        billsBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.adetalhouet.order.system.billing.Billing.internal_static_io_adetalhouet_order_system_billing_Bills_descriptor;
    }

    @java.lang.Override
    public io.adetalhouet.order.system.billing.Bills getDefaultInstanceForType() {
      return io.adetalhouet.order.system.billing.Bills.getDefaultInstance();
    }

    @java.lang.Override
    public io.adetalhouet.order.system.billing.Bills build() {
      io.adetalhouet.order.system.billing.Bills result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.adetalhouet.order.system.billing.Bills buildPartial() {
      io.adetalhouet.order.system.billing.Bills result = new io.adetalhouet.order.system.billing.Bills(this);
      int from_bitField0_ = bitField0_;
      if (billsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          bills_ = java.util.Collections.unmodifiableList(bills_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.bills_ = bills_;
      } else {
        result.bills_ = billsBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof io.adetalhouet.order.system.billing.Bills) {
        return mergeFrom((io.adetalhouet.order.system.billing.Bills)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.adetalhouet.order.system.billing.Bills other) {
      if (other == io.adetalhouet.order.system.billing.Bills.getDefaultInstance()) return this;
      if (billsBuilder_ == null) {
        if (!other.bills_.isEmpty()) {
          if (bills_.isEmpty()) {
            bills_ = other.bills_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureBillsIsMutable();
            bills_.addAll(other.bills_);
          }
          onChanged();
        }
      } else {
        if (!other.bills_.isEmpty()) {
          if (billsBuilder_.isEmpty()) {
            billsBuilder_.dispose();
            billsBuilder_ = null;
            bills_ = other.bills_;
            bitField0_ = (bitField0_ & ~0x00000001);
            billsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getBillsFieldBuilder() : null;
          } else {
            billsBuilder_.addAllMessages(other.bills_);
          }
        }
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      io.adetalhouet.order.system.billing.Bills parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.adetalhouet.order.system.billing.Bills) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<io.adetalhouet.order.system.billing.Bill> bills_ =
      java.util.Collections.emptyList();
    private void ensureBillsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        bills_ = new java.util.ArrayList<io.adetalhouet.order.system.billing.Bill>(bills_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        io.adetalhouet.order.system.billing.Bill, io.adetalhouet.order.system.billing.Bill.Builder, io.adetalhouet.order.system.billing.BillOrBuilder> billsBuilder_;

    /**
     * <code>repeated .io.adetalhouet.order.system.billing.Bill bills = 1;</code>
     */
    public java.util.List<io.adetalhouet.order.system.billing.Bill> getBillsList() {
      if (billsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(bills_);
      } else {
        return billsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .io.adetalhouet.order.system.billing.Bill bills = 1;</code>
     */
    public int getBillsCount() {
      if (billsBuilder_ == null) {
        return bills_.size();
      } else {
        return billsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .io.adetalhouet.order.system.billing.Bill bills = 1;</code>
     */
    public io.adetalhouet.order.system.billing.Bill getBills(int index) {
      if (billsBuilder_ == null) {
        return bills_.get(index);
      } else {
        return billsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .io.adetalhouet.order.system.billing.Bill bills = 1;</code>
     */
    public Builder setBills(
        int index, io.adetalhouet.order.system.billing.Bill value) {
      if (billsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureBillsIsMutable();
        bills_.set(index, value);
        onChanged();
      } else {
        billsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .io.adetalhouet.order.system.billing.Bill bills = 1;</code>
     */
    public Builder setBills(
        int index, io.adetalhouet.order.system.billing.Bill.Builder builderForValue) {
      if (billsBuilder_ == null) {
        ensureBillsIsMutable();
        bills_.set(index, builderForValue.build());
        onChanged();
      } else {
        billsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .io.adetalhouet.order.system.billing.Bill bills = 1;</code>
     */
    public Builder addBills(io.adetalhouet.order.system.billing.Bill value) {
      if (billsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureBillsIsMutable();
        bills_.add(value);
        onChanged();
      } else {
        billsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .io.adetalhouet.order.system.billing.Bill bills = 1;</code>
     */
    public Builder addBills(
        int index, io.adetalhouet.order.system.billing.Bill value) {
      if (billsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureBillsIsMutable();
        bills_.add(index, value);
        onChanged();
      } else {
        billsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .io.adetalhouet.order.system.billing.Bill bills = 1;</code>
     */
    public Builder addBills(
        io.adetalhouet.order.system.billing.Bill.Builder builderForValue) {
      if (billsBuilder_ == null) {
        ensureBillsIsMutable();
        bills_.add(builderForValue.build());
        onChanged();
      } else {
        billsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .io.adetalhouet.order.system.billing.Bill bills = 1;</code>
     */
    public Builder addBills(
        int index, io.adetalhouet.order.system.billing.Bill.Builder builderForValue) {
      if (billsBuilder_ == null) {
        ensureBillsIsMutable();
        bills_.add(index, builderForValue.build());
        onChanged();
      } else {
        billsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .io.adetalhouet.order.system.billing.Bill bills = 1;</code>
     */
    public Builder addAllBills(
        java.lang.Iterable<? extends io.adetalhouet.order.system.billing.Bill> values) {
      if (billsBuilder_ == null) {
        ensureBillsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, bills_);
        onChanged();
      } else {
        billsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .io.adetalhouet.order.system.billing.Bill bills = 1;</code>
     */
    public Builder clearBills() {
      if (billsBuilder_ == null) {
        bills_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        billsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .io.adetalhouet.order.system.billing.Bill bills = 1;</code>
     */
    public Builder removeBills(int index) {
      if (billsBuilder_ == null) {
        ensureBillsIsMutable();
        bills_.remove(index);
        onChanged();
      } else {
        billsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .io.adetalhouet.order.system.billing.Bill bills = 1;</code>
     */
    public io.adetalhouet.order.system.billing.Bill.Builder getBillsBuilder(
        int index) {
      return getBillsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .io.adetalhouet.order.system.billing.Bill bills = 1;</code>
     */
    public io.adetalhouet.order.system.billing.BillOrBuilder getBillsOrBuilder(
        int index) {
      if (billsBuilder_ == null) {
        return bills_.get(index);  } else {
        return billsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .io.adetalhouet.order.system.billing.Bill bills = 1;</code>
     */
    public java.util.List<? extends io.adetalhouet.order.system.billing.BillOrBuilder> 
         getBillsOrBuilderList() {
      if (billsBuilder_ != null) {
        return billsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(bills_);
      }
    }
    /**
     * <code>repeated .io.adetalhouet.order.system.billing.Bill bills = 1;</code>
     */
    public io.adetalhouet.order.system.billing.Bill.Builder addBillsBuilder() {
      return getBillsFieldBuilder().addBuilder(
          io.adetalhouet.order.system.billing.Bill.getDefaultInstance());
    }
    /**
     * <code>repeated .io.adetalhouet.order.system.billing.Bill bills = 1;</code>
     */
    public io.adetalhouet.order.system.billing.Bill.Builder addBillsBuilder(
        int index) {
      return getBillsFieldBuilder().addBuilder(
          index, io.adetalhouet.order.system.billing.Bill.getDefaultInstance());
    }
    /**
     * <code>repeated .io.adetalhouet.order.system.billing.Bill bills = 1;</code>
     */
    public java.util.List<io.adetalhouet.order.system.billing.Bill.Builder> 
         getBillsBuilderList() {
      return getBillsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        io.adetalhouet.order.system.billing.Bill, io.adetalhouet.order.system.billing.Bill.Builder, io.adetalhouet.order.system.billing.BillOrBuilder> 
        getBillsFieldBuilder() {
      if (billsBuilder_ == null) {
        billsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            io.adetalhouet.order.system.billing.Bill, io.adetalhouet.order.system.billing.Bill.Builder, io.adetalhouet.order.system.billing.BillOrBuilder>(
                bills_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        bills_ = null;
      }
      return billsBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:io.adetalhouet.order.system.billing.Bills)
  }

  // @@protoc_insertion_point(class_scope:io.adetalhouet.order.system.billing.Bills)
  private static final io.adetalhouet.order.system.billing.Bills DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.adetalhouet.order.system.billing.Bills();
  }

  public static io.adetalhouet.order.system.billing.Bills getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Bills>
      PARSER = new com.google.protobuf.AbstractParser<Bills>() {
    @java.lang.Override
    public Bills parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Bills(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Bills> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Bills> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.adetalhouet.order.system.billing.Bills getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

