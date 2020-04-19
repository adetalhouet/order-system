// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cart.proto

package io.adetalhouet.order.system.cart;

/**
 * Protobuf type {@code io.adetalhouet.order.system.cart.Cart}
 */
public  final class Cart extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:io.adetalhouet.order.system.cart.Cart)
    CartOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Cart.newBuilder() to construct.
  private Cart(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Cart() {
    items_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Cart();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Cart(
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
          case 8: {

            id_ = input.readInt64();
            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              items_ = new java.util.ArrayList<io.adetalhouet.order.system.cart.CartItem>();
              mutable_bitField0_ |= 0x00000001;
            }
            items_.add(
                input.readMessage(io.adetalhouet.order.system.cart.CartItem.parser(), extensionRegistry));
            break;
          }
          case 26: {
            com.google.protobuf.Timestamp.Builder subBuilder = null;
            if (dateCreated_ != null) {
              subBuilder = dateCreated_.toBuilder();
            }
            dateCreated_ = input.readMessage(com.google.protobuf.Timestamp.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(dateCreated_);
              dateCreated_ = subBuilder.buildPartial();
            }

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
        items_ = java.util.Collections.unmodifiableList(items_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.adetalhouet.order.system.cart.CartOuterClass.internal_static_io_adetalhouet_order_system_cart_Cart_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.adetalhouet.order.system.cart.CartOuterClass.internal_static_io_adetalhouet_order_system_cart_Cart_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.adetalhouet.order.system.cart.Cart.class, io.adetalhouet.order.system.cart.Cart.Builder.class);
  }

  public static final int ID_FIELD_NUMBER = 1;
  private long id_;
  /**
   * <code>int64 id = 1;</code>
   * @return The id.
   */
  public long getId() {
    return id_;
  }

  public static final int ITEMS_FIELD_NUMBER = 2;
  private java.util.List<io.adetalhouet.order.system.cart.CartItem> items_;
  /**
   * <code>repeated .io.adetalhouet.order.system.cart.CartItem items = 2;</code>
   */
  public java.util.List<io.adetalhouet.order.system.cart.CartItem> getItemsList() {
    return items_;
  }
  /**
   * <code>repeated .io.adetalhouet.order.system.cart.CartItem items = 2;</code>
   */
  public java.util.List<? extends io.adetalhouet.order.system.cart.CartItemOrBuilder> 
      getItemsOrBuilderList() {
    return items_;
  }
  /**
   * <code>repeated .io.adetalhouet.order.system.cart.CartItem items = 2;</code>
   */
  public int getItemsCount() {
    return items_.size();
  }
  /**
   * <code>repeated .io.adetalhouet.order.system.cart.CartItem items = 2;</code>
   */
  public io.adetalhouet.order.system.cart.CartItem getItems(int index) {
    return items_.get(index);
  }
  /**
   * <code>repeated .io.adetalhouet.order.system.cart.CartItem items = 2;</code>
   */
  public io.adetalhouet.order.system.cart.CartItemOrBuilder getItemsOrBuilder(
      int index) {
    return items_.get(index);
  }

  public static final int DATE_CREATED_FIELD_NUMBER = 3;
  private com.google.protobuf.Timestamp dateCreated_;
  /**
   * <code>.google.protobuf.Timestamp date_created = 3;</code>
   * @return Whether the dateCreated field is set.
   */
  public boolean hasDateCreated() {
    return dateCreated_ != null;
  }
  /**
   * <code>.google.protobuf.Timestamp date_created = 3;</code>
   * @return The dateCreated.
   */
  public com.google.protobuf.Timestamp getDateCreated() {
    return dateCreated_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : dateCreated_;
  }
  /**
   * <code>.google.protobuf.Timestamp date_created = 3;</code>
   */
  public com.google.protobuf.TimestampOrBuilder getDateCreatedOrBuilder() {
    return getDateCreated();
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
    if (id_ != 0L) {
      output.writeInt64(1, id_);
    }
    for (int i = 0; i < items_.size(); i++) {
      output.writeMessage(2, items_.get(i));
    }
    if (dateCreated_ != null) {
      output.writeMessage(3, getDateCreated());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (id_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, id_);
    }
    for (int i = 0; i < items_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, items_.get(i));
    }
    if (dateCreated_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getDateCreated());
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
    if (!(obj instanceof io.adetalhouet.order.system.cart.Cart)) {
      return super.equals(obj);
    }
    io.adetalhouet.order.system.cart.Cart other = (io.adetalhouet.order.system.cart.Cart) obj;

    if (getId()
        != other.getId()) return false;
    if (!getItemsList()
        .equals(other.getItemsList())) return false;
    if (hasDateCreated() != other.hasDateCreated()) return false;
    if (hasDateCreated()) {
      if (!getDateCreated()
          .equals(other.getDateCreated())) return false;
    }
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
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getId());
    if (getItemsCount() > 0) {
      hash = (37 * hash) + ITEMS_FIELD_NUMBER;
      hash = (53 * hash) + getItemsList().hashCode();
    }
    if (hasDateCreated()) {
      hash = (37 * hash) + DATE_CREATED_FIELD_NUMBER;
      hash = (53 * hash) + getDateCreated().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.adetalhouet.order.system.cart.Cart parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.adetalhouet.order.system.cart.Cart parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.adetalhouet.order.system.cart.Cart parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.adetalhouet.order.system.cart.Cart parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.adetalhouet.order.system.cart.Cart parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.adetalhouet.order.system.cart.Cart parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.adetalhouet.order.system.cart.Cart parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.adetalhouet.order.system.cart.Cart parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.adetalhouet.order.system.cart.Cart parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.adetalhouet.order.system.cart.Cart parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.adetalhouet.order.system.cart.Cart parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.adetalhouet.order.system.cart.Cart parseFrom(
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
  public static Builder newBuilder(io.adetalhouet.order.system.cart.Cart prototype) {
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
   * Protobuf type {@code io.adetalhouet.order.system.cart.Cart}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:io.adetalhouet.order.system.cart.Cart)
      io.adetalhouet.order.system.cart.CartOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.adetalhouet.order.system.cart.CartOuterClass.internal_static_io_adetalhouet_order_system_cart_Cart_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.adetalhouet.order.system.cart.CartOuterClass.internal_static_io_adetalhouet_order_system_cart_Cart_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.adetalhouet.order.system.cart.Cart.class, io.adetalhouet.order.system.cart.Cart.Builder.class);
    }

    // Construct using io.adetalhouet.order.system.cart.Cart.newBuilder()
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
        getItemsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      id_ = 0L;

      if (itemsBuilder_ == null) {
        items_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        itemsBuilder_.clear();
      }
      if (dateCreatedBuilder_ == null) {
        dateCreated_ = null;
      } else {
        dateCreated_ = null;
        dateCreatedBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.adetalhouet.order.system.cart.CartOuterClass.internal_static_io_adetalhouet_order_system_cart_Cart_descriptor;
    }

    @java.lang.Override
    public io.adetalhouet.order.system.cart.Cart getDefaultInstanceForType() {
      return io.adetalhouet.order.system.cart.Cart.getDefaultInstance();
    }

    @java.lang.Override
    public io.adetalhouet.order.system.cart.Cart build() {
      io.adetalhouet.order.system.cart.Cart result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.adetalhouet.order.system.cart.Cart buildPartial() {
      io.adetalhouet.order.system.cart.Cart result = new io.adetalhouet.order.system.cart.Cart(this);
      int from_bitField0_ = bitField0_;
      result.id_ = id_;
      if (itemsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          items_ = java.util.Collections.unmodifiableList(items_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.items_ = items_;
      } else {
        result.items_ = itemsBuilder_.build();
      }
      if (dateCreatedBuilder_ == null) {
        result.dateCreated_ = dateCreated_;
      } else {
        result.dateCreated_ = dateCreatedBuilder_.build();
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
      if (other instanceof io.adetalhouet.order.system.cart.Cart) {
        return mergeFrom((io.adetalhouet.order.system.cart.Cart)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.adetalhouet.order.system.cart.Cart other) {
      if (other == io.adetalhouet.order.system.cart.Cart.getDefaultInstance()) return this;
      if (other.getId() != 0L) {
        setId(other.getId());
      }
      if (itemsBuilder_ == null) {
        if (!other.items_.isEmpty()) {
          if (items_.isEmpty()) {
            items_ = other.items_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureItemsIsMutable();
            items_.addAll(other.items_);
          }
          onChanged();
        }
      } else {
        if (!other.items_.isEmpty()) {
          if (itemsBuilder_.isEmpty()) {
            itemsBuilder_.dispose();
            itemsBuilder_ = null;
            items_ = other.items_;
            bitField0_ = (bitField0_ & ~0x00000001);
            itemsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getItemsFieldBuilder() : null;
          } else {
            itemsBuilder_.addAllMessages(other.items_);
          }
        }
      }
      if (other.hasDateCreated()) {
        mergeDateCreated(other.getDateCreated());
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
      io.adetalhouet.order.system.cart.Cart parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.adetalhouet.order.system.cart.Cart) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private long id_ ;
    /**
     * <code>int64 id = 1;</code>
     * @return The id.
     */
    public long getId() {
      return id_;
    }
    /**
     * <code>int64 id = 1;</code>
     * @param value The id to set.
     * @return This builder for chaining.
     */
    public Builder setId(long value) {
      
      id_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearId() {
      
      id_ = 0L;
      onChanged();
      return this;
    }

    private java.util.List<io.adetalhouet.order.system.cart.CartItem> items_ =
      java.util.Collections.emptyList();
    private void ensureItemsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        items_ = new java.util.ArrayList<io.adetalhouet.order.system.cart.CartItem>(items_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        io.adetalhouet.order.system.cart.CartItem, io.adetalhouet.order.system.cart.CartItem.Builder, io.adetalhouet.order.system.cart.CartItemOrBuilder> itemsBuilder_;

    /**
     * <code>repeated .io.adetalhouet.order.system.cart.CartItem items = 2;</code>
     */
    public java.util.List<io.adetalhouet.order.system.cart.CartItem> getItemsList() {
      if (itemsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(items_);
      } else {
        return itemsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .io.adetalhouet.order.system.cart.CartItem items = 2;</code>
     */
    public int getItemsCount() {
      if (itemsBuilder_ == null) {
        return items_.size();
      } else {
        return itemsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .io.adetalhouet.order.system.cart.CartItem items = 2;</code>
     */
    public io.adetalhouet.order.system.cart.CartItem getItems(int index) {
      if (itemsBuilder_ == null) {
        return items_.get(index);
      } else {
        return itemsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .io.adetalhouet.order.system.cart.CartItem items = 2;</code>
     */
    public Builder setItems(
        int index, io.adetalhouet.order.system.cart.CartItem value) {
      if (itemsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureItemsIsMutable();
        items_.set(index, value);
        onChanged();
      } else {
        itemsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .io.adetalhouet.order.system.cart.CartItem items = 2;</code>
     */
    public Builder setItems(
        int index, io.adetalhouet.order.system.cart.CartItem.Builder builderForValue) {
      if (itemsBuilder_ == null) {
        ensureItemsIsMutable();
        items_.set(index, builderForValue.build());
        onChanged();
      } else {
        itemsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .io.adetalhouet.order.system.cart.CartItem items = 2;</code>
     */
    public Builder addItems(io.adetalhouet.order.system.cart.CartItem value) {
      if (itemsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureItemsIsMutable();
        items_.add(value);
        onChanged();
      } else {
        itemsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .io.adetalhouet.order.system.cart.CartItem items = 2;</code>
     */
    public Builder addItems(
        int index, io.adetalhouet.order.system.cart.CartItem value) {
      if (itemsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureItemsIsMutable();
        items_.add(index, value);
        onChanged();
      } else {
        itemsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .io.adetalhouet.order.system.cart.CartItem items = 2;</code>
     */
    public Builder addItems(
        io.adetalhouet.order.system.cart.CartItem.Builder builderForValue) {
      if (itemsBuilder_ == null) {
        ensureItemsIsMutable();
        items_.add(builderForValue.build());
        onChanged();
      } else {
        itemsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .io.adetalhouet.order.system.cart.CartItem items = 2;</code>
     */
    public Builder addItems(
        int index, io.adetalhouet.order.system.cart.CartItem.Builder builderForValue) {
      if (itemsBuilder_ == null) {
        ensureItemsIsMutable();
        items_.add(index, builderForValue.build());
        onChanged();
      } else {
        itemsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .io.adetalhouet.order.system.cart.CartItem items = 2;</code>
     */
    public Builder addAllItems(
        java.lang.Iterable<? extends io.adetalhouet.order.system.cart.CartItem> values) {
      if (itemsBuilder_ == null) {
        ensureItemsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, items_);
        onChanged();
      } else {
        itemsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .io.adetalhouet.order.system.cart.CartItem items = 2;</code>
     */
    public Builder clearItems() {
      if (itemsBuilder_ == null) {
        items_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        itemsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .io.adetalhouet.order.system.cart.CartItem items = 2;</code>
     */
    public Builder removeItems(int index) {
      if (itemsBuilder_ == null) {
        ensureItemsIsMutable();
        items_.remove(index);
        onChanged();
      } else {
        itemsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .io.adetalhouet.order.system.cart.CartItem items = 2;</code>
     */
    public io.adetalhouet.order.system.cart.CartItem.Builder getItemsBuilder(
        int index) {
      return getItemsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .io.adetalhouet.order.system.cart.CartItem items = 2;</code>
     */
    public io.adetalhouet.order.system.cart.CartItemOrBuilder getItemsOrBuilder(
        int index) {
      if (itemsBuilder_ == null) {
        return items_.get(index);  } else {
        return itemsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .io.adetalhouet.order.system.cart.CartItem items = 2;</code>
     */
    public java.util.List<? extends io.adetalhouet.order.system.cart.CartItemOrBuilder> 
         getItemsOrBuilderList() {
      if (itemsBuilder_ != null) {
        return itemsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(items_);
      }
    }
    /**
     * <code>repeated .io.adetalhouet.order.system.cart.CartItem items = 2;</code>
     */
    public io.adetalhouet.order.system.cart.CartItem.Builder addItemsBuilder() {
      return getItemsFieldBuilder().addBuilder(
          io.adetalhouet.order.system.cart.CartItem.getDefaultInstance());
    }
    /**
     * <code>repeated .io.adetalhouet.order.system.cart.CartItem items = 2;</code>
     */
    public io.adetalhouet.order.system.cart.CartItem.Builder addItemsBuilder(
        int index) {
      return getItemsFieldBuilder().addBuilder(
          index, io.adetalhouet.order.system.cart.CartItem.getDefaultInstance());
    }
    /**
     * <code>repeated .io.adetalhouet.order.system.cart.CartItem items = 2;</code>
     */
    public java.util.List<io.adetalhouet.order.system.cart.CartItem.Builder> 
         getItemsBuilderList() {
      return getItemsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        io.adetalhouet.order.system.cart.CartItem, io.adetalhouet.order.system.cart.CartItem.Builder, io.adetalhouet.order.system.cart.CartItemOrBuilder> 
        getItemsFieldBuilder() {
      if (itemsBuilder_ == null) {
        itemsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            io.adetalhouet.order.system.cart.CartItem, io.adetalhouet.order.system.cart.CartItem.Builder, io.adetalhouet.order.system.cart.CartItemOrBuilder>(
                items_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        items_ = null;
      }
      return itemsBuilder_;
    }

    private com.google.protobuf.Timestamp dateCreated_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> dateCreatedBuilder_;
    /**
     * <code>.google.protobuf.Timestamp date_created = 3;</code>
     * @return Whether the dateCreated field is set.
     */
    public boolean hasDateCreated() {
      return dateCreatedBuilder_ != null || dateCreated_ != null;
    }
    /**
     * <code>.google.protobuf.Timestamp date_created = 3;</code>
     * @return The dateCreated.
     */
    public com.google.protobuf.Timestamp getDateCreated() {
      if (dateCreatedBuilder_ == null) {
        return dateCreated_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : dateCreated_;
      } else {
        return dateCreatedBuilder_.getMessage();
      }
    }
    /**
     * <code>.google.protobuf.Timestamp date_created = 3;</code>
     */
    public Builder setDateCreated(com.google.protobuf.Timestamp value) {
      if (dateCreatedBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        dateCreated_ = value;
        onChanged();
      } else {
        dateCreatedBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp date_created = 3;</code>
     */
    public Builder setDateCreated(
        com.google.protobuf.Timestamp.Builder builderForValue) {
      if (dateCreatedBuilder_ == null) {
        dateCreated_ = builderForValue.build();
        onChanged();
      } else {
        dateCreatedBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp date_created = 3;</code>
     */
    public Builder mergeDateCreated(com.google.protobuf.Timestamp value) {
      if (dateCreatedBuilder_ == null) {
        if (dateCreated_ != null) {
          dateCreated_ =
            com.google.protobuf.Timestamp.newBuilder(dateCreated_).mergeFrom(value).buildPartial();
        } else {
          dateCreated_ = value;
        }
        onChanged();
      } else {
        dateCreatedBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp date_created = 3;</code>
     */
    public Builder clearDateCreated() {
      if (dateCreatedBuilder_ == null) {
        dateCreated_ = null;
        onChanged();
      } else {
        dateCreated_ = null;
        dateCreatedBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp date_created = 3;</code>
     */
    public com.google.protobuf.Timestamp.Builder getDateCreatedBuilder() {
      
      onChanged();
      return getDateCreatedFieldBuilder().getBuilder();
    }
    /**
     * <code>.google.protobuf.Timestamp date_created = 3;</code>
     */
    public com.google.protobuf.TimestampOrBuilder getDateCreatedOrBuilder() {
      if (dateCreatedBuilder_ != null) {
        return dateCreatedBuilder_.getMessageOrBuilder();
      } else {
        return dateCreated_ == null ?
            com.google.protobuf.Timestamp.getDefaultInstance() : dateCreated_;
      }
    }
    /**
     * <code>.google.protobuf.Timestamp date_created = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> 
        getDateCreatedFieldBuilder() {
      if (dateCreatedBuilder_ == null) {
        dateCreatedBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>(
                getDateCreated(),
                getParentForChildren(),
                isClean());
        dateCreated_ = null;
      }
      return dateCreatedBuilder_;
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


    // @@protoc_insertion_point(builder_scope:io.adetalhouet.order.system.cart.Cart)
  }

  // @@protoc_insertion_point(class_scope:io.adetalhouet.order.system.cart.Cart)
  private static final io.adetalhouet.order.system.cart.Cart DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.adetalhouet.order.system.cart.Cart();
  }

  public static io.adetalhouet.order.system.cart.Cart getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Cart>
      PARSER = new com.google.protobuf.AbstractParser<Cart>() {
    @java.lang.Override
    public Cart parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Cart(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Cart> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Cart> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.adetalhouet.order.system.cart.Cart getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

