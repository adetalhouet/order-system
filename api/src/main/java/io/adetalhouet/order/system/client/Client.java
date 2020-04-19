// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: client.proto

package io.adetalhouet.order.system.client;

/**
 * Protobuf type {@code io.adetalhouet.order.system.client.Client}
 */
public  final class Client extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:io.adetalhouet.order.system.client.Client)
    ClientOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Client.newBuilder() to construct.
  private Client(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Client() {
    username_ = "";
    firstname_ = "";
    lastname_ = "";
    email_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Client();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Client(
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
          case 8: {

            id_ = input.readInt64();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            username_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            firstname_ = s;
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            lastname_ = s;
            break;
          }
          case 42: {
            java.lang.String s = input.readStringRequireUtf8();

            email_ = s;
            break;
          }
          case 50: {
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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.adetalhouet.order.system.client.ClientOuterClass.internal_static_io_adetalhouet_order_system_client_Client_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.adetalhouet.order.system.client.ClientOuterClass.internal_static_io_adetalhouet_order_system_client_Client_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.adetalhouet.order.system.client.Client.class, io.adetalhouet.order.system.client.Client.Builder.class);
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

  public static final int USERNAME_FIELD_NUMBER = 2;
  private volatile java.lang.Object username_;
  /**
   * <code>string username = 2;</code>
   * @return The username.
   */
  public java.lang.String getUsername() {
    java.lang.Object ref = username_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      username_ = s;
      return s;
    }
  }
  /**
   * <code>string username = 2;</code>
   * @return The bytes for username.
   */
  public com.google.protobuf.ByteString
      getUsernameBytes() {
    java.lang.Object ref = username_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      username_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int FIRSTNAME_FIELD_NUMBER = 3;
  private volatile java.lang.Object firstname_;
  /**
   * <code>string firstname = 3;</code>
   * @return The firstname.
   */
  public java.lang.String getFirstname() {
    java.lang.Object ref = firstname_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      firstname_ = s;
      return s;
    }
  }
  /**
   * <code>string firstname = 3;</code>
   * @return The bytes for firstname.
   */
  public com.google.protobuf.ByteString
      getFirstnameBytes() {
    java.lang.Object ref = firstname_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      firstname_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int LASTNAME_FIELD_NUMBER = 4;
  private volatile java.lang.Object lastname_;
  /**
   * <code>string lastname = 4;</code>
   * @return The lastname.
   */
  public java.lang.String getLastname() {
    java.lang.Object ref = lastname_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      lastname_ = s;
      return s;
    }
  }
  /**
   * <code>string lastname = 4;</code>
   * @return The bytes for lastname.
   */
  public com.google.protobuf.ByteString
      getLastnameBytes() {
    java.lang.Object ref = lastname_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      lastname_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int EMAIL_FIELD_NUMBER = 5;
  private volatile java.lang.Object email_;
  /**
   * <code>string email = 5;</code>
   * @return The email.
   */
  public java.lang.String getEmail() {
    java.lang.Object ref = email_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      email_ = s;
      return s;
    }
  }
  /**
   * <code>string email = 5;</code>
   * @return The bytes for email.
   */
  public com.google.protobuf.ByteString
      getEmailBytes() {
    java.lang.Object ref = email_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      email_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DATE_CREATED_FIELD_NUMBER = 6;
  private com.google.protobuf.Timestamp dateCreated_;
  /**
   * <code>.google.protobuf.Timestamp date_created = 6;</code>
   * @return Whether the dateCreated field is set.
   */
  public boolean hasDateCreated() {
    return dateCreated_ != null;
  }
  /**
   * <code>.google.protobuf.Timestamp date_created = 6;</code>
   * @return The dateCreated.
   */
  public com.google.protobuf.Timestamp getDateCreated() {
    return dateCreated_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : dateCreated_;
  }
  /**
   * <code>.google.protobuf.Timestamp date_created = 6;</code>
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
    if (!getUsernameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, username_);
    }
    if (!getFirstnameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, firstname_);
    }
    if (!getLastnameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, lastname_);
    }
    if (!getEmailBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, email_);
    }
    if (dateCreated_ != null) {
      output.writeMessage(6, getDateCreated());
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
    if (!getUsernameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, username_);
    }
    if (!getFirstnameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, firstname_);
    }
    if (!getLastnameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, lastname_);
    }
    if (!getEmailBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, email_);
    }
    if (dateCreated_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(6, getDateCreated());
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
    if (!(obj instanceof io.adetalhouet.order.system.client.Client)) {
      return super.equals(obj);
    }
    io.adetalhouet.order.system.client.Client other = (io.adetalhouet.order.system.client.Client) obj;

    if (getId()
        != other.getId()) return false;
    if (!getUsername()
        .equals(other.getUsername())) return false;
    if (!getFirstname()
        .equals(other.getFirstname())) return false;
    if (!getLastname()
        .equals(other.getLastname())) return false;
    if (!getEmail()
        .equals(other.getEmail())) return false;
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
    hash = (37 * hash) + USERNAME_FIELD_NUMBER;
    hash = (53 * hash) + getUsername().hashCode();
    hash = (37 * hash) + FIRSTNAME_FIELD_NUMBER;
    hash = (53 * hash) + getFirstname().hashCode();
    hash = (37 * hash) + LASTNAME_FIELD_NUMBER;
    hash = (53 * hash) + getLastname().hashCode();
    hash = (37 * hash) + EMAIL_FIELD_NUMBER;
    hash = (53 * hash) + getEmail().hashCode();
    if (hasDateCreated()) {
      hash = (37 * hash) + DATE_CREATED_FIELD_NUMBER;
      hash = (53 * hash) + getDateCreated().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.adetalhouet.order.system.client.Client parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.adetalhouet.order.system.client.Client parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.adetalhouet.order.system.client.Client parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.adetalhouet.order.system.client.Client parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.adetalhouet.order.system.client.Client parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.adetalhouet.order.system.client.Client parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.adetalhouet.order.system.client.Client parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.adetalhouet.order.system.client.Client parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.adetalhouet.order.system.client.Client parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.adetalhouet.order.system.client.Client parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.adetalhouet.order.system.client.Client parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.adetalhouet.order.system.client.Client parseFrom(
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
  public static Builder newBuilder(io.adetalhouet.order.system.client.Client prototype) {
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
   * Protobuf type {@code io.adetalhouet.order.system.client.Client}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:io.adetalhouet.order.system.client.Client)
      io.adetalhouet.order.system.client.ClientOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.adetalhouet.order.system.client.ClientOuterClass.internal_static_io_adetalhouet_order_system_client_Client_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.adetalhouet.order.system.client.ClientOuterClass.internal_static_io_adetalhouet_order_system_client_Client_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.adetalhouet.order.system.client.Client.class, io.adetalhouet.order.system.client.Client.Builder.class);
    }

    // Construct using io.adetalhouet.order.system.client.Client.newBuilder()
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
      id_ = 0L;

      username_ = "";

      firstname_ = "";

      lastname_ = "";

      email_ = "";

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
      return io.adetalhouet.order.system.client.ClientOuterClass.internal_static_io_adetalhouet_order_system_client_Client_descriptor;
    }

    @java.lang.Override
    public io.adetalhouet.order.system.client.Client getDefaultInstanceForType() {
      return io.adetalhouet.order.system.client.Client.getDefaultInstance();
    }

    @java.lang.Override
    public io.adetalhouet.order.system.client.Client build() {
      io.adetalhouet.order.system.client.Client result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.adetalhouet.order.system.client.Client buildPartial() {
      io.adetalhouet.order.system.client.Client result = new io.adetalhouet.order.system.client.Client(this);
      result.id_ = id_;
      result.username_ = username_;
      result.firstname_ = firstname_;
      result.lastname_ = lastname_;
      result.email_ = email_;
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
      if (other instanceof io.adetalhouet.order.system.client.Client) {
        return mergeFrom((io.adetalhouet.order.system.client.Client)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.adetalhouet.order.system.client.Client other) {
      if (other == io.adetalhouet.order.system.client.Client.getDefaultInstance()) return this;
      if (other.getId() != 0L) {
        setId(other.getId());
      }
      if (!other.getUsername().isEmpty()) {
        username_ = other.username_;
        onChanged();
      }
      if (!other.getFirstname().isEmpty()) {
        firstname_ = other.firstname_;
        onChanged();
      }
      if (!other.getLastname().isEmpty()) {
        lastname_ = other.lastname_;
        onChanged();
      }
      if (!other.getEmail().isEmpty()) {
        email_ = other.email_;
        onChanged();
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
      io.adetalhouet.order.system.client.Client parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.adetalhouet.order.system.client.Client) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

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

    private java.lang.Object username_ = "";
    /**
     * <code>string username = 2;</code>
     * @return The username.
     */
    public java.lang.String getUsername() {
      java.lang.Object ref = username_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        username_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string username = 2;</code>
     * @return The bytes for username.
     */
    public com.google.protobuf.ByteString
        getUsernameBytes() {
      java.lang.Object ref = username_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        username_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string username = 2;</code>
     * @param value The username to set.
     * @return This builder for chaining.
     */
    public Builder setUsername(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      username_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string username = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearUsername() {
      
      username_ = getDefaultInstance().getUsername();
      onChanged();
      return this;
    }
    /**
     * <code>string username = 2;</code>
     * @param value The bytes for username to set.
     * @return This builder for chaining.
     */
    public Builder setUsernameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      username_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object firstname_ = "";
    /**
     * <code>string firstname = 3;</code>
     * @return The firstname.
     */
    public java.lang.String getFirstname() {
      java.lang.Object ref = firstname_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        firstname_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string firstname = 3;</code>
     * @return The bytes for firstname.
     */
    public com.google.protobuf.ByteString
        getFirstnameBytes() {
      java.lang.Object ref = firstname_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        firstname_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string firstname = 3;</code>
     * @param value The firstname to set.
     * @return This builder for chaining.
     */
    public Builder setFirstname(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      firstname_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string firstname = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearFirstname() {
      
      firstname_ = getDefaultInstance().getFirstname();
      onChanged();
      return this;
    }
    /**
     * <code>string firstname = 3;</code>
     * @param value The bytes for firstname to set.
     * @return This builder for chaining.
     */
    public Builder setFirstnameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      firstname_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object lastname_ = "";
    /**
     * <code>string lastname = 4;</code>
     * @return The lastname.
     */
    public java.lang.String getLastname() {
      java.lang.Object ref = lastname_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        lastname_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string lastname = 4;</code>
     * @return The bytes for lastname.
     */
    public com.google.protobuf.ByteString
        getLastnameBytes() {
      java.lang.Object ref = lastname_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        lastname_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string lastname = 4;</code>
     * @param value The lastname to set.
     * @return This builder for chaining.
     */
    public Builder setLastname(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      lastname_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string lastname = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearLastname() {
      
      lastname_ = getDefaultInstance().getLastname();
      onChanged();
      return this;
    }
    /**
     * <code>string lastname = 4;</code>
     * @param value The bytes for lastname to set.
     * @return This builder for chaining.
     */
    public Builder setLastnameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      lastname_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object email_ = "";
    /**
     * <code>string email = 5;</code>
     * @return The email.
     */
    public java.lang.String getEmail() {
      java.lang.Object ref = email_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        email_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string email = 5;</code>
     * @return The bytes for email.
     */
    public com.google.protobuf.ByteString
        getEmailBytes() {
      java.lang.Object ref = email_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        email_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string email = 5;</code>
     * @param value The email to set.
     * @return This builder for chaining.
     */
    public Builder setEmail(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      email_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string email = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearEmail() {
      
      email_ = getDefaultInstance().getEmail();
      onChanged();
      return this;
    }
    /**
     * <code>string email = 5;</code>
     * @param value The bytes for email to set.
     * @return This builder for chaining.
     */
    public Builder setEmailBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      email_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.Timestamp dateCreated_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> dateCreatedBuilder_;
    /**
     * <code>.google.protobuf.Timestamp date_created = 6;</code>
     * @return Whether the dateCreated field is set.
     */
    public boolean hasDateCreated() {
      return dateCreatedBuilder_ != null || dateCreated_ != null;
    }
    /**
     * <code>.google.protobuf.Timestamp date_created = 6;</code>
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
     * <code>.google.protobuf.Timestamp date_created = 6;</code>
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
     * <code>.google.protobuf.Timestamp date_created = 6;</code>
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
     * <code>.google.protobuf.Timestamp date_created = 6;</code>
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
     * <code>.google.protobuf.Timestamp date_created = 6;</code>
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
     * <code>.google.protobuf.Timestamp date_created = 6;</code>
     */
    public com.google.protobuf.Timestamp.Builder getDateCreatedBuilder() {
      
      onChanged();
      return getDateCreatedFieldBuilder().getBuilder();
    }
    /**
     * <code>.google.protobuf.Timestamp date_created = 6;</code>
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
     * <code>.google.protobuf.Timestamp date_created = 6;</code>
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


    // @@protoc_insertion_point(builder_scope:io.adetalhouet.order.system.client.Client)
  }

  // @@protoc_insertion_point(class_scope:io.adetalhouet.order.system.client.Client)
  private static final io.adetalhouet.order.system.client.Client DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.adetalhouet.order.system.client.Client();
  }

  public static io.adetalhouet.order.system.client.Client getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Client>
      PARSER = new com.google.protobuf.AbstractParser<Client>() {
    @java.lang.Override
    public Client parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Client(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Client> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Client> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.adetalhouet.order.system.client.Client getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

