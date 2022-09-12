// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: image_message.proto

package today.ihelio.grpc;

/**
 * Protobuf type {@code book.Image}
 */
public final class Image extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:book.Image)
    ImageOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Image.newBuilder() to construct.
  private Image(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Image() {
    id_ = "";
    filePath_ = "";
    size_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Image();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Image(
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
            java.lang.String s = input.readStringRequireUtf8();

            id_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            filePath_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            size_ = s;
            break;
          }
          case 34: {
            com.google.protobuf.Timestamp.Builder subBuilder = null;
            if (uploadedAt_ != null) {
              subBuilder = uploadedAt_.toBuilder();
            }
            uploadedAt_ = input.readMessage(com.google.protobuf.Timestamp.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(uploadedAt_);
              uploadedAt_ = subBuilder.buildPartial();
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
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
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
    return today.ihelio.grpc.ImageMessage.internal_static_book_Image_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return today.ihelio.grpc.ImageMessage.internal_static_book_Image_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            today.ihelio.grpc.Image.class, today.ihelio.grpc.Image.Builder.class);
  }

  public static final int ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object id_;
  /**
   * <code>string id = 1;</code>
   * @return The id.
   */
  @java.lang.Override
  public java.lang.String getId() {
    java.lang.Object ref = id_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      id_ = s;
      return s;
    }
  }
  /**
   * <code>string id = 1;</code>
   * @return The bytes for id.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getIdBytes() {
    java.lang.Object ref = id_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      id_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int FILE_PATH_FIELD_NUMBER = 2;
  private volatile java.lang.Object filePath_;
  /**
   * <code>string file_path = 2;</code>
   * @return The filePath.
   */
  @java.lang.Override
  public java.lang.String getFilePath() {
    java.lang.Object ref = filePath_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      filePath_ = s;
      return s;
    }
  }
  /**
   * <code>string file_path = 2;</code>
   * @return The bytes for filePath.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getFilePathBytes() {
    java.lang.Object ref = filePath_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      filePath_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SIZE_FIELD_NUMBER = 3;
  private volatile java.lang.Object size_;
  /**
   * <code>string size = 3;</code>
   * @return The size.
   */
  @java.lang.Override
  public java.lang.String getSize() {
    java.lang.Object ref = size_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      size_ = s;
      return s;
    }
  }
  /**
   * <code>string size = 3;</code>
   * @return The bytes for size.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSizeBytes() {
    java.lang.Object ref = size_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      size_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int UPLOADED_AT_FIELD_NUMBER = 4;
  private com.google.protobuf.Timestamp uploadedAt_;
  /**
   * <code>.google.protobuf.Timestamp uploaded_at = 4;</code>
   * @return Whether the uploadedAt field is set.
   */
  @java.lang.Override
  public boolean hasUploadedAt() {
    return uploadedAt_ != null;
  }
  /**
   * <code>.google.protobuf.Timestamp uploaded_at = 4;</code>
   * @return The uploadedAt.
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getUploadedAt() {
    return uploadedAt_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : uploadedAt_;
  }
  /**
   * <code>.google.protobuf.Timestamp uploaded_at = 4;</code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getUploadedAtOrBuilder() {
    return getUploadedAt();
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(id_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, id_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(filePath_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, filePath_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(size_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, size_);
    }
    if (uploadedAt_ != null) {
      output.writeMessage(4, getUploadedAt());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(id_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, id_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(filePath_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, filePath_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(size_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, size_);
    }
    if (uploadedAt_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, getUploadedAt());
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
    if (!(obj instanceof today.ihelio.grpc.Image)) {
      return super.equals(obj);
    }
    today.ihelio.grpc.Image other = (today.ihelio.grpc.Image) obj;

    if (!getId()
        .equals(other.getId())) return false;
    if (!getFilePath()
        .equals(other.getFilePath())) return false;
    if (!getSize()
        .equals(other.getSize())) return false;
    if (hasUploadedAt() != other.hasUploadedAt()) return false;
    if (hasUploadedAt()) {
      if (!getUploadedAt()
          .equals(other.getUploadedAt())) return false;
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
    hash = (53 * hash) + getId().hashCode();
    hash = (37 * hash) + FILE_PATH_FIELD_NUMBER;
    hash = (53 * hash) + getFilePath().hashCode();
    hash = (37 * hash) + SIZE_FIELD_NUMBER;
    hash = (53 * hash) + getSize().hashCode();
    if (hasUploadedAt()) {
      hash = (37 * hash) + UPLOADED_AT_FIELD_NUMBER;
      hash = (53 * hash) + getUploadedAt().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static today.ihelio.grpc.Image parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static today.ihelio.grpc.Image parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static today.ihelio.grpc.Image parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static today.ihelio.grpc.Image parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static today.ihelio.grpc.Image parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static today.ihelio.grpc.Image parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static today.ihelio.grpc.Image parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static today.ihelio.grpc.Image parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static today.ihelio.grpc.Image parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static today.ihelio.grpc.Image parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static today.ihelio.grpc.Image parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static today.ihelio.grpc.Image parseFrom(
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
  public static Builder newBuilder(today.ihelio.grpc.Image prototype) {
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
   * Protobuf type {@code book.Image}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:book.Image)
      today.ihelio.grpc.ImageOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return today.ihelio.grpc.ImageMessage.internal_static_book_Image_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return today.ihelio.grpc.ImageMessage.internal_static_book_Image_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              today.ihelio.grpc.Image.class, today.ihelio.grpc.Image.Builder.class);
    }

    // Construct using today.ihelio.grpc.Image.newBuilder()
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
      id_ = "";

      filePath_ = "";

      size_ = "";

      if (uploadedAtBuilder_ == null) {
        uploadedAt_ = null;
      } else {
        uploadedAt_ = null;
        uploadedAtBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return today.ihelio.grpc.ImageMessage.internal_static_book_Image_descriptor;
    }

    @java.lang.Override
    public today.ihelio.grpc.Image getDefaultInstanceForType() {
      return today.ihelio.grpc.Image.getDefaultInstance();
    }

    @java.lang.Override
    public today.ihelio.grpc.Image build() {
      today.ihelio.grpc.Image result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public today.ihelio.grpc.Image buildPartial() {
      today.ihelio.grpc.Image result = new today.ihelio.grpc.Image(this);
      result.id_ = id_;
      result.filePath_ = filePath_;
      result.size_ = size_;
      if (uploadedAtBuilder_ == null) {
        result.uploadedAt_ = uploadedAt_;
      } else {
        result.uploadedAt_ = uploadedAtBuilder_.build();
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
      if (other instanceof today.ihelio.grpc.Image) {
        return mergeFrom((today.ihelio.grpc.Image)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(today.ihelio.grpc.Image other) {
      if (other == today.ihelio.grpc.Image.getDefaultInstance()) return this;
      if (!other.getId().isEmpty()) {
        id_ = other.id_;
        onChanged();
      }
      if (!other.getFilePath().isEmpty()) {
        filePath_ = other.filePath_;
        onChanged();
      }
      if (!other.getSize().isEmpty()) {
        size_ = other.size_;
        onChanged();
      }
      if (other.hasUploadedAt()) {
        mergeUploadedAt(other.getUploadedAt());
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
      today.ihelio.grpc.Image parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (today.ihelio.grpc.Image) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object id_ = "";
    /**
     * <code>string id = 1;</code>
     * @return The id.
     */
    public java.lang.String getId() {
      java.lang.Object ref = id_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        id_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string id = 1;</code>
     * @return The bytes for id.
     */
    public com.google.protobuf.ByteString
        getIdBytes() {
      java.lang.Object ref = id_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        id_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string id = 1;</code>
     * @param value The id to set.
     * @return This builder for chaining.
     */
    public Builder setId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      id_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearId() {
      
      id_ = getDefaultInstance().getId();
      onChanged();
      return this;
    }
    /**
     * <code>string id = 1;</code>
     * @param value The bytes for id to set.
     * @return This builder for chaining.
     */
    public Builder setIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      id_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object filePath_ = "";
    /**
     * <code>string file_path = 2;</code>
     * @return The filePath.
     */
    public java.lang.String getFilePath() {
      java.lang.Object ref = filePath_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        filePath_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string file_path = 2;</code>
     * @return The bytes for filePath.
     */
    public com.google.protobuf.ByteString
        getFilePathBytes() {
      java.lang.Object ref = filePath_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        filePath_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string file_path = 2;</code>
     * @param value The filePath to set.
     * @return This builder for chaining.
     */
    public Builder setFilePath(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      filePath_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string file_path = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearFilePath() {
      
      filePath_ = getDefaultInstance().getFilePath();
      onChanged();
      return this;
    }
    /**
     * <code>string file_path = 2;</code>
     * @param value The bytes for filePath to set.
     * @return This builder for chaining.
     */
    public Builder setFilePathBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      filePath_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object size_ = "";
    /**
     * <code>string size = 3;</code>
     * @return The size.
     */
    public java.lang.String getSize() {
      java.lang.Object ref = size_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        size_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string size = 3;</code>
     * @return The bytes for size.
     */
    public com.google.protobuf.ByteString
        getSizeBytes() {
      java.lang.Object ref = size_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        size_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string size = 3;</code>
     * @param value The size to set.
     * @return This builder for chaining.
     */
    public Builder setSize(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      size_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string size = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearSize() {
      
      size_ = getDefaultInstance().getSize();
      onChanged();
      return this;
    }
    /**
     * <code>string size = 3;</code>
     * @param value The bytes for size to set.
     * @return This builder for chaining.
     */
    public Builder setSizeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      size_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.Timestamp uploadedAt_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> uploadedAtBuilder_;
    /**
     * <code>.google.protobuf.Timestamp uploaded_at = 4;</code>
     * @return Whether the uploadedAt field is set.
     */
    public boolean hasUploadedAt() {
      return uploadedAtBuilder_ != null || uploadedAt_ != null;
    }
    /**
     * <code>.google.protobuf.Timestamp uploaded_at = 4;</code>
     * @return The uploadedAt.
     */
    public com.google.protobuf.Timestamp getUploadedAt() {
      if (uploadedAtBuilder_ == null) {
        return uploadedAt_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : uploadedAt_;
      } else {
        return uploadedAtBuilder_.getMessage();
      }
    }
    /**
     * <code>.google.protobuf.Timestamp uploaded_at = 4;</code>
     */
    public Builder setUploadedAt(com.google.protobuf.Timestamp value) {
      if (uploadedAtBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        uploadedAt_ = value;
        onChanged();
      } else {
        uploadedAtBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp uploaded_at = 4;</code>
     */
    public Builder setUploadedAt(
        com.google.protobuf.Timestamp.Builder builderForValue) {
      if (uploadedAtBuilder_ == null) {
        uploadedAt_ = builderForValue.build();
        onChanged();
      } else {
        uploadedAtBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp uploaded_at = 4;</code>
     */
    public Builder mergeUploadedAt(com.google.protobuf.Timestamp value) {
      if (uploadedAtBuilder_ == null) {
        if (uploadedAt_ != null) {
          uploadedAt_ =
            com.google.protobuf.Timestamp.newBuilder(uploadedAt_).mergeFrom(value).buildPartial();
        } else {
          uploadedAt_ = value;
        }
        onChanged();
      } else {
        uploadedAtBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp uploaded_at = 4;</code>
     */
    public Builder clearUploadedAt() {
      if (uploadedAtBuilder_ == null) {
        uploadedAt_ = null;
        onChanged();
      } else {
        uploadedAt_ = null;
        uploadedAtBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp uploaded_at = 4;</code>
     */
    public com.google.protobuf.Timestamp.Builder getUploadedAtBuilder() {
      
      onChanged();
      return getUploadedAtFieldBuilder().getBuilder();
    }
    /**
     * <code>.google.protobuf.Timestamp uploaded_at = 4;</code>
     */
    public com.google.protobuf.TimestampOrBuilder getUploadedAtOrBuilder() {
      if (uploadedAtBuilder_ != null) {
        return uploadedAtBuilder_.getMessageOrBuilder();
      } else {
        return uploadedAt_ == null ?
            com.google.protobuf.Timestamp.getDefaultInstance() : uploadedAt_;
      }
    }
    /**
     * <code>.google.protobuf.Timestamp uploaded_at = 4;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> 
        getUploadedAtFieldBuilder() {
      if (uploadedAtBuilder_ == null) {
        uploadedAtBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>(
                getUploadedAt(),
                getParentForChildren(),
                isClean());
        uploadedAt_ = null;
      }
      return uploadedAtBuilder_;
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


    // @@protoc_insertion_point(builder_scope:book.Image)
  }

  // @@protoc_insertion_point(class_scope:book.Image)
  private static final today.ihelio.grpc.Image DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new today.ihelio.grpc.Image();
  }

  public static today.ihelio.grpc.Image getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Image>
      PARSER = new com.google.protobuf.AbstractParser<Image>() {
    @java.lang.Override
    public Image parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Image(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Image> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Image> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public today.ihelio.grpc.Image getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

