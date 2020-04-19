// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cart.proto

package io.adetalhouet.order.system.cart;

/**
 * Protobuf type {@code io.adetalhouet.order.system.cart.CartItem}
 */
public  final class CartItem extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:io.adetalhouet.order.system.cart.CartItem)
    CartItemOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CartItem.newBuilder() to construct.
  private CartItem(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CartItem() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CartItem();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CartItem(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
            io.adetalhouet.order.system.product.Product.Builder subBuilder = null;
            if (product_ != null) {
              subBuilder = product_.toBuilder();
            }
            product_ = input.readMessage(io.adetalhouet.order.system.product.Product.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(product_);
              product_ = subBuilder.buildPartial();
            }

            break;
          }
          case 16: {

            quantity_ = input.readInt32();
            break;
          }
          case 29: {

            totalPrice_ = input.readFloat();
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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.adetalhouet.order.system.cart.CartOuterClass.internal_static_io_adetalhouet_order_system_cart_CartItem_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.adetalhouet.order.system.cart.CartOuterClass.internal_static_io_adetalhouet_order_system_cart_CartItem_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.adetalhouet.order.system.cart.CartItem.class, io.adetalhouet.order.system.cart.CartItem.Builder.class);
  }

  public static final int PRODUCT_FIELD_NUMBER = 1;
  private io.adetalhouet.order.system.product.Product product_;
  /**
   * <code>.io.adetalhouet.order.system.product.Product product = 1;</code>
   * @return Whether the product field is set.
   */
  public boolean hasProduct() {
    return product_ != null;
  }
  /**
   * <code>.io.adetalhouet.order.system.product.Product product = 1;</code>
   * @return The product.
   */
  public io.adetalhouet.order.system.product.Product getProduct() {
    return product_ == null ? io.adetalhouet.order.system.product.Product.getDefaultInstance() : product_;
  }
  /**
   * <code>.io.adetalhouet.order.system.product.Product product = 1;</code>
   */
  public io.adetalhouet.order.system.product.ProductOrBuilder getProductOrBuilder() {
    return getProduct();
  }

  public static final int QUANTITY_FIELD_NUMBER = 2;
  private int quantity_;
  /**
   * <code>int32 quantity = 2;</code>
   * @return The quantity.
   */
  public int getQuantity() {
    return quantity_;
  }

  public static final int TOTAL_PRICE_FIELD_NUMBER = 3;
  private float totalPrice_;
  /**
   * <code>float total_price = 3;</code>
   * @return The totalPrice.
   */
  public float getTotalPrice() {
    return totalPrice_;
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
    if (product_ != null) {
      output.writeMessage(1, getProduct());
    }
    if (quantity_ != 0) {
      output.writeInt32(2, quantity_);
    }
    if (totalPrice_ != 0F) {
      output.writeFloat(3, totalPrice_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (product_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getProduct());
    }
    if (quantity_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, quantity_);
    }
    if (totalPrice_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(3, totalPrice_);
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
    if (!(obj instanceof io.adetalhouet.order.system.cart.CartItem)) {
      return super.equals(obj);
    }
    io.adetalhouet.order.system.cart.CartItem other = (io.adetalhouet.order.system.cart.CartItem) obj;

    if (hasProduct() != other.hasProduct()) return false;
    if (hasProduct()) {
      if (!getProduct()
          .equals(other.getProduct())) return false;
    }
    if (getQuantity()
        != other.getQuantity()) return false;
    if (java.lang.Float.floatToIntBits(getTotalPrice())
        != java.lang.Float.floatToIntBits(
            other.getTotalPrice())) return false;
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
    if (hasProduct()) {
      hash = (37 * hash) + PRODUCT_FIELD_NUMBER;
      hash = (53 * hash) + getProduct().hashCode();
    }
    hash = (37 * hash) + QUANTITY_FIELD_NUMBER;
    hash = (53 * hash) + getQuantity();
    hash = (37 * hash) + TOTAL_PRICE_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getTotalPrice());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.adetalhouet.order.system.cart.CartItem parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.adetalhouet.order.system.cart.CartItem parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.adetalhouet.order.system.cart.CartItem parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.adetalhouet.order.system.cart.CartItem parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.adetalhouet.order.system.cart.CartItem parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.adetalhouet.order.system.cart.CartItem parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.adetalhouet.order.system.cart.CartItem parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.adetalhouet.order.system.cart.CartItem parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.adetalhouet.order.system.cart.CartItem parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.adetalhouet.order.system.cart.CartItem parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.adetalhouet.order.system.cart.CartItem parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.adetalhouet.order.system.cart.CartItem parseFrom(
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
  public static Builder newBuilder(io.adetalhouet.order.system.cart.CartItem prototype) {
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
   * Protobuf type {@code io.adetalhouet.order.system.cart.CartItem}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:io.adetalhouet.order.system.cart.CartItem)
      io.adetalhouet.order.system.cart.CartItemOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.adetalhouet.order.system.cart.CartOuterClass.internal_static_io_adetalhouet_order_system_cart_CartItem_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.adetalhouet.order.system.cart.CartOuterClass.internal_static_io_adetalhouet_order_system_cart_CartItem_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.adetalhouet.order.system.cart.CartItem.class, io.adetalhouet.order.system.cart.CartItem.Builder.class);
    }

    // Construct using io.adetalhouet.order.system.cart.CartItem.newBuilder()
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
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (productBuilder_ == null) {
        product_ = null;
      } else {
        product_ = null;
        productBuilder_ = null;
      }
      quantity_ = 0;

      totalPrice_ = 0F;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.adetalhouet.order.system.cart.CartOuterClass.internal_static_io_adetalhouet_order_system_cart_CartItem_descriptor;
    }

    @java.lang.Override
    public io.adetalhouet.order.system.cart.CartItem getDefaultInstanceForType() {
      return io.adetalhouet.order.system.cart.CartItem.getDefaultInstance();
    }

    @java.lang.Override
    public io.adetalhouet.order.system.cart.CartItem build() {
      io.adetalhouet.order.system.cart.CartItem result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.adetalhouet.order.system.cart.CartItem buildPartial() {
      io.adetalhouet.order.system.cart.CartItem result = new io.adetalhouet.order.system.cart.CartItem(this);
      if (productBuilder_ == null) {
        result.product_ = product_;
      } else {
        result.product_ = productBuilder_.build();
      }
      result.quantity_ = quantity_;
      result.totalPrice_ = totalPrice_;
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
      if (other instanceof io.adetalhouet.order.system.cart.CartItem) {
        return mergeFrom((io.adetalhouet.order.system.cart.CartItem)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.adetalhouet.order.system.cart.CartItem other) {
      if (other == io.adetalhouet.order.system.cart.CartItem.getDefaultInstance()) return this;
      if (other.hasProduct()) {
        mergeProduct(other.getProduct());
      }
      if (other.getQuantity() != 0) {
        setQuantity(other.getQuantity());
      }
      if (other.getTotalPrice() != 0F) {
        setTotalPrice(other.getTotalPrice());
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
      io.adetalhouet.order.system.cart.CartItem parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.adetalhouet.order.system.cart.CartItem) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private io.adetalhouet.order.system.product.Product product_;
    private com.google.protobuf.SingleFieldBuilderV3<
        io.adetalhouet.order.system.product.Product, io.adetalhouet.order.system.product.Product.Builder, io.adetalhouet.order.system.product.ProductOrBuilder> productBuilder_;
    /**
     * <code>.io.adetalhouet.order.system.product.Product product = 1;</code>
     * @return Whether the product field is set.
     */
    public boolean hasProduct() {
      return productBuilder_ != null || product_ != null;
    }
    /**
     * <code>.io.adetalhouet.order.system.product.Product product = 1;</code>
     * @return The product.
     */
    public io.adetalhouet.order.system.product.Product getProduct() {
      if (productBuilder_ == null) {
        return product_ == null ? io.adetalhouet.order.system.product.Product.getDefaultInstance() : product_;
      } else {
        return productBuilder_.getMessage();
      }
    }
    /**
     * <code>.io.adetalhouet.order.system.product.Product product = 1;</code>
     */
    public Builder setProduct(io.adetalhouet.order.system.product.Product value) {
      if (productBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        product_ = value;
        onChanged();
      } else {
        productBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.io.adetalhouet.order.system.product.Product product = 1;</code>
     */
    public Builder setProduct(
        io.adetalhouet.order.system.product.Product.Builder builderForValue) {
      if (productBuilder_ == null) {
        product_ = builderForValue.build();
        onChanged();
      } else {
        productBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.io.adetalhouet.order.system.product.Product product = 1;</code>
     */
    public Builder mergeProduct(io.adetalhouet.order.system.product.Product value) {
      if (productBuilder_ == null) {
        if (product_ != null) {
          product_ =
            io.adetalhouet.order.system.product.Product.newBuilder(product_).mergeFrom(value).buildPartial();
        } else {
          product_ = value;
        }
        onChanged();
      } else {
        productBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.io.adetalhouet.order.system.product.Product product = 1;</code>
     */
    public Builder clearProduct() {
      if (productBuilder_ == null) {
        product_ = null;
        onChanged();
      } else {
        product_ = null;
        productBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.io.adetalhouet.order.system.product.Product product = 1;</code>
     */
    public io.adetalhouet.order.system.product.Product.Builder getProductBuilder() {
      
      onChanged();
      return getProductFieldBuilder().getBuilder();
    }
    /**
     * <code>.io.adetalhouet.order.system.product.Product product = 1;</code>
     */
    public io.adetalhouet.order.system.product.ProductOrBuilder getProductOrBuilder() {
      if (productBuilder_ != null) {
        return productBuilder_.getMessageOrBuilder();
      } else {
        return product_ == null ?
            io.adetalhouet.order.system.product.Product.getDefaultInstance() : product_;
      }
    }
    /**
     * <code>.io.adetalhouet.order.system.product.Product product = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.adetalhouet.order.system.product.Product, io.adetalhouet.order.system.product.Product.Builder, io.adetalhouet.order.system.product.ProductOrBuilder> 
        getProductFieldBuilder() {
      if (productBuilder_ == null) {
        productBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.adetalhouet.order.system.product.Product, io.adetalhouet.order.system.product.Product.Builder, io.adetalhouet.order.system.product.ProductOrBuilder>(
                getProduct(),
                getParentForChildren(),
                isClean());
        product_ = null;
      }
      return productBuilder_;
    }

    private int quantity_ ;
    /**
     * <code>int32 quantity = 2;</code>
     * @return The quantity.
     */
    public int getQuantity() {
      return quantity_;
    }
    /**
     * <code>int32 quantity = 2;</code>
     * @param value The quantity to set.
     * @return This builder for chaining.
     */
    public Builder setQuantity(int value) {
      
      quantity_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 quantity = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearQuantity() {
      
      quantity_ = 0;
      onChanged();
      return this;
    }

    private float totalPrice_ ;
    /**
     * <code>float total_price = 3;</code>
     * @return The totalPrice.
     */
    public float getTotalPrice() {
      return totalPrice_;
    }
    /**
     * <code>float total_price = 3;</code>
     * @param value The totalPrice to set.
     * @return This builder for chaining.
     */
    public Builder setTotalPrice(float value) {
      
      totalPrice_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float total_price = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearTotalPrice() {
      
      totalPrice_ = 0F;
      onChanged();
      return this;
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


    // @@protoc_insertion_point(builder_scope:io.adetalhouet.order.system.cart.CartItem)
  }

  // @@protoc_insertion_point(class_scope:io.adetalhouet.order.system.cart.CartItem)
  private static final io.adetalhouet.order.system.cart.CartItem DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.adetalhouet.order.system.cart.CartItem();
  }

  public static io.adetalhouet.order.system.cart.CartItem getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CartItem>
      PARSER = new com.google.protobuf.AbstractParser<CartItem>() {
    @java.lang.Override
    public CartItem parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CartItem(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CartItem> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CartItem> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.adetalhouet.order.system.cart.CartItem getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
