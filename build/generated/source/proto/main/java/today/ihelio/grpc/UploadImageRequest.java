// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: book_service.proto

package today.ihelio.grpc;

/**
 * Protobuf type {@code book.UploadImageRequest}
 */
public final class UploadImageRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:book.UploadImageRequest)
    UploadImageRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UploadImageRequest.newBuilder() to construct.
  private UploadImageRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UploadImageRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UploadImageRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private UploadImageRequest(
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
            today.ihelio.grpc.ImageInfo.Builder subBuilder = null;
            if (dataCase_ == 1) {
              subBuilder = ((today.ihelio.grpc.ImageInfo) data_).toBuilder();
            }
            data_ =
                input.readMessage(today.ihelio.grpc.ImageInfo.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom((today.ihelio.grpc.ImageInfo) data_);
              data_ = subBuilder.buildPartial();
            }
            dataCase_ = 1;
            break;
          }
          case 18: {
            data_ = input.readBytes();
            dataCase_ = 2;
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
    return today.ihelio.grpc.BookServiceOuterClass.internal_static_book_UploadImageRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return today.ihelio.grpc.BookServiceOuterClass.internal_static_book_UploadImageRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            today.ihelio.grpc.UploadImageRequest.class, today.ihelio.grpc.UploadImageRequest.Builder.class);
  }

  private int dataCase_ = 0;
  private java.lang.Object data_;
  public enum DataCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    INFO(1),
    CHUNK_DATA(2),
    DATA_NOT_SET(0);
    private final int value;
    private DataCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static DataCase valueOf(int value) {
      return forNumber(value);
    }

    public static DataCase forNumber(int value) {
      switch (value) {
        case 1: return INFO;
        case 2: return CHUNK_DATA;
        case 0: return DATA_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public DataCase
  getDataCase() {
    return DataCase.forNumber(
        dataCase_);
  }

  public static final int INFO_FIELD_NUMBER = 1;
  /**
   * <code>.book.ImageInfo info = 1;</code>
   * @return Whether the info field is set.
   */
  @java.lang.Override
  public boolean hasInfo() {
    return dataCase_ == 1;
  }
  /**
   * <code>.book.ImageInfo info = 1;</code>
   * @return The info.
   */
  @java.lang.Override
  public today.ihelio.grpc.ImageInfo getInfo() {
    if (dataCase_ == 1) {
       return (today.ihelio.grpc.ImageInfo) data_;
    }
    return today.ihelio.grpc.ImageInfo.getDefaultInstance();
  }
  /**
   * <code>.book.ImageInfo info = 1;</code>
   */
  @java.lang.Override
  public today.ihelio.grpc.ImageInfoOrBuilder getInfoOrBuilder() {
    if (dataCase_ == 1) {
       return (today.ihelio.grpc.ImageInfo) data_;
    }
    return today.ihelio.grpc.ImageInfo.getDefaultInstance();
  }

  public static final int CHUNK_DATA_FIELD_NUMBER = 2;
  /**
   * <code>bytes chunk_data = 2;</code>
   * @return Whether the chunkData field is set.
   */
  @java.lang.Override
  public boolean hasChunkData() {
    return dataCase_ == 2;
  }
  /**
   * <code>bytes chunk_data = 2;</code>
   * @return The chunkData.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getChunkData() {
    if (dataCase_ == 2) {
      return (com.google.protobuf.ByteString) data_;
    }
    return com.google.protobuf.ByteString.EMPTY;
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
    if (dataCase_ == 1) {
      output.writeMessage(1, (today.ihelio.grpc.ImageInfo) data_);
    }
    if (dataCase_ == 2) {
      output.writeBytes(
          2, (com.google.protobuf.ByteString) data_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (dataCase_ == 1) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, (today.ihelio.grpc.ImageInfo) data_);
    }
    if (dataCase_ == 2) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(
            2, (com.google.protobuf.ByteString) data_);
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
    if (!(obj instanceof today.ihelio.grpc.UploadImageRequest)) {
      return super.equals(obj);
    }
    today.ihelio.grpc.UploadImageRequest other = (today.ihelio.grpc.UploadImageRequest) obj;

    if (!getDataCase().equals(other.getDataCase())) return false;
    switch (dataCase_) {
      case 1:
        if (!getInfo()
            .equals(other.getInfo())) return false;
        break;
      case 2:
        if (!getChunkData()
            .equals(other.getChunkData())) return false;
        break;
      case 0:
      default:
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
    switch (dataCase_) {
      case 1:
        hash = (37 * hash) + INFO_FIELD_NUMBER;
        hash = (53 * hash) + getInfo().hashCode();
        break;
      case 2:
        hash = (37 * hash) + CHUNK_DATA_FIELD_NUMBER;
        hash = (53 * hash) + getChunkData().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static today.ihelio.grpc.UploadImageRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static today.ihelio.grpc.UploadImageRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static today.ihelio.grpc.UploadImageRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static today.ihelio.grpc.UploadImageRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static today.ihelio.grpc.UploadImageRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static today.ihelio.grpc.UploadImageRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static today.ihelio.grpc.UploadImageRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static today.ihelio.grpc.UploadImageRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static today.ihelio.grpc.UploadImageRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static today.ihelio.grpc.UploadImageRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static today.ihelio.grpc.UploadImageRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static today.ihelio.grpc.UploadImageRequest parseFrom(
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
  public static Builder newBuilder(today.ihelio.grpc.UploadImageRequest prototype) {
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
   * Protobuf type {@code book.UploadImageRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:book.UploadImageRequest)
      today.ihelio.grpc.UploadImageRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return today.ihelio.grpc.BookServiceOuterClass.internal_static_book_UploadImageRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return today.ihelio.grpc.BookServiceOuterClass.internal_static_book_UploadImageRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              today.ihelio.grpc.UploadImageRequest.class, today.ihelio.grpc.UploadImageRequest.Builder.class);
    }

    // Construct using today.ihelio.grpc.UploadImageRequest.newBuilder()
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
      dataCase_ = 0;
      data_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return today.ihelio.grpc.BookServiceOuterClass.internal_static_book_UploadImageRequest_descriptor;
    }

    @java.lang.Override
    public today.ihelio.grpc.UploadImageRequest getDefaultInstanceForType() {
      return today.ihelio.grpc.UploadImageRequest.getDefaultInstance();
    }

    @java.lang.Override
    public today.ihelio.grpc.UploadImageRequest build() {
      today.ihelio.grpc.UploadImageRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public today.ihelio.grpc.UploadImageRequest buildPartial() {
      today.ihelio.grpc.UploadImageRequest result = new today.ihelio.grpc.UploadImageRequest(this);
      if (dataCase_ == 1) {
        if (infoBuilder_ == null) {
          result.data_ = data_;
        } else {
          result.data_ = infoBuilder_.build();
        }
      }
      if (dataCase_ == 2) {
        result.data_ = data_;
      }
      result.dataCase_ = dataCase_;
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
      if (other instanceof today.ihelio.grpc.UploadImageRequest) {
        return mergeFrom((today.ihelio.grpc.UploadImageRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(today.ihelio.grpc.UploadImageRequest other) {
      if (other == today.ihelio.grpc.UploadImageRequest.getDefaultInstance()) return this;
      switch (other.getDataCase()) {
        case INFO: {
          mergeInfo(other.getInfo());
          break;
        }
        case CHUNK_DATA: {
          setChunkData(other.getChunkData());
          break;
        }
        case DATA_NOT_SET: {
          break;
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
      today.ihelio.grpc.UploadImageRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (today.ihelio.grpc.UploadImageRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int dataCase_ = 0;
    private java.lang.Object data_;
    public DataCase
        getDataCase() {
      return DataCase.forNumber(
          dataCase_);
    }

    public Builder clearData() {
      dataCase_ = 0;
      data_ = null;
      onChanged();
      return this;
    }


    private com.google.protobuf.SingleFieldBuilderV3<
        today.ihelio.grpc.ImageInfo, today.ihelio.grpc.ImageInfo.Builder, today.ihelio.grpc.ImageInfoOrBuilder> infoBuilder_;
    /**
     * <code>.book.ImageInfo info = 1;</code>
     * @return Whether the info field is set.
     */
    @java.lang.Override
    public boolean hasInfo() {
      return dataCase_ == 1;
    }
    /**
     * <code>.book.ImageInfo info = 1;</code>
     * @return The info.
     */
    @java.lang.Override
    public today.ihelio.grpc.ImageInfo getInfo() {
      if (infoBuilder_ == null) {
        if (dataCase_ == 1) {
          return (today.ihelio.grpc.ImageInfo) data_;
        }
        return today.ihelio.grpc.ImageInfo.getDefaultInstance();
      } else {
        if (dataCase_ == 1) {
          return infoBuilder_.getMessage();
        }
        return today.ihelio.grpc.ImageInfo.getDefaultInstance();
      }
    }
    /**
     * <code>.book.ImageInfo info = 1;</code>
     */
    public Builder setInfo(today.ihelio.grpc.ImageInfo value) {
      if (infoBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        data_ = value;
        onChanged();
      } else {
        infoBuilder_.setMessage(value);
      }
      dataCase_ = 1;
      return this;
    }
    /**
     * <code>.book.ImageInfo info = 1;</code>
     */
    public Builder setInfo(
        today.ihelio.grpc.ImageInfo.Builder builderForValue) {
      if (infoBuilder_ == null) {
        data_ = builderForValue.build();
        onChanged();
      } else {
        infoBuilder_.setMessage(builderForValue.build());
      }
      dataCase_ = 1;
      return this;
    }
    /**
     * <code>.book.ImageInfo info = 1;</code>
     */
    public Builder mergeInfo(today.ihelio.grpc.ImageInfo value) {
      if (infoBuilder_ == null) {
        if (dataCase_ == 1 &&
            data_ != today.ihelio.grpc.ImageInfo.getDefaultInstance()) {
          data_ = today.ihelio.grpc.ImageInfo.newBuilder((today.ihelio.grpc.ImageInfo) data_)
              .mergeFrom(value).buildPartial();
        } else {
          data_ = value;
        }
        onChanged();
      } else {
        if (dataCase_ == 1) {
          infoBuilder_.mergeFrom(value);
        } else {
          infoBuilder_.setMessage(value);
        }
      }
      dataCase_ = 1;
      return this;
    }
    /**
     * <code>.book.ImageInfo info = 1;</code>
     */
    public Builder clearInfo() {
      if (infoBuilder_ == null) {
        if (dataCase_ == 1) {
          dataCase_ = 0;
          data_ = null;
          onChanged();
        }
      } else {
        if (dataCase_ == 1) {
          dataCase_ = 0;
          data_ = null;
        }
        infoBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>.book.ImageInfo info = 1;</code>
     */
    public today.ihelio.grpc.ImageInfo.Builder getInfoBuilder() {
      return getInfoFieldBuilder().getBuilder();
    }
    /**
     * <code>.book.ImageInfo info = 1;</code>
     */
    @java.lang.Override
    public today.ihelio.grpc.ImageInfoOrBuilder getInfoOrBuilder() {
      if ((dataCase_ == 1) && (infoBuilder_ != null)) {
        return infoBuilder_.getMessageOrBuilder();
      } else {
        if (dataCase_ == 1) {
          return (today.ihelio.grpc.ImageInfo) data_;
        }
        return today.ihelio.grpc.ImageInfo.getDefaultInstance();
      }
    }
    /**
     * <code>.book.ImageInfo info = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        today.ihelio.grpc.ImageInfo, today.ihelio.grpc.ImageInfo.Builder, today.ihelio.grpc.ImageInfoOrBuilder> 
        getInfoFieldBuilder() {
      if (infoBuilder_ == null) {
        if (!(dataCase_ == 1)) {
          data_ = today.ihelio.grpc.ImageInfo.getDefaultInstance();
        }
        infoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            today.ihelio.grpc.ImageInfo, today.ihelio.grpc.ImageInfo.Builder, today.ihelio.grpc.ImageInfoOrBuilder>(
                (today.ihelio.grpc.ImageInfo) data_,
                getParentForChildren(),
                isClean());
        data_ = null;
      }
      dataCase_ = 1;
      onChanged();;
      return infoBuilder_;
    }

    /**
     * <code>bytes chunk_data = 2;</code>
     * @return Whether the chunkData field is set.
     */
    public boolean hasChunkData() {
      return dataCase_ == 2;
    }
    /**
     * <code>bytes chunk_data = 2;</code>
     * @return The chunkData.
     */
    public com.google.protobuf.ByteString getChunkData() {
      if (dataCase_ == 2) {
        return (com.google.protobuf.ByteString) data_;
      }
      return com.google.protobuf.ByteString.EMPTY;
    }
    /**
     * <code>bytes chunk_data = 2;</code>
     * @param value The chunkData to set.
     * @return This builder for chaining.
     */
    public Builder setChunkData(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  dataCase_ = 2;
      data_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bytes chunk_data = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearChunkData() {
      if (dataCase_ == 2) {
        dataCase_ = 0;
        data_ = null;
        onChanged();
      }
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


    // @@protoc_insertion_point(builder_scope:book.UploadImageRequest)
  }

  // @@protoc_insertion_point(class_scope:book.UploadImageRequest)
  private static final today.ihelio.grpc.UploadImageRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new today.ihelio.grpc.UploadImageRequest();
  }

  public static today.ihelio.grpc.UploadImageRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UploadImageRequest>
      PARSER = new com.google.protobuf.AbstractParser<UploadImageRequest>() {
    @java.lang.Override
    public UploadImageRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new UploadImageRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<UploadImageRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UploadImageRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public today.ihelio.grpc.UploadImageRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

