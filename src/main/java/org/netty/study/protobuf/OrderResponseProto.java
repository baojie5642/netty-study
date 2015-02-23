// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: netty/OrderResponseProto.proto

package org.netty.study.protobuf;

public final class OrderResponseProto {
  private OrderResponseProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface OrderResponseOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // required int32 orderId = 1;
    /**
     * <code>required int32 orderId = 1;</code>
     */
    boolean hasOrderId();
    /**
     * <code>required int32 orderId = 1;</code>
     */
    int getOrderId();

    // required int32 statusCode = 2;
    /**
     * <code>required int32 statusCode = 2;</code>
     */
    boolean hasStatusCode();
    /**
     * <code>required int32 statusCode = 2;</code>
     */
    int getStatusCode();

    // required string desc = 3;
    /**
     * <code>required string desc = 3;</code>
     */
    boolean hasDesc();
    /**
     * <code>required string desc = 3;</code>
     */
    java.lang.String getDesc();
    /**
     * <code>required string desc = 3;</code>
     */
    com.google.protobuf.ByteString
        getDescBytes();
  }
  /**
   * Protobuf type {@code netty.OrderResponse}
   */
  public static final class OrderResponse extends
      com.google.protobuf.GeneratedMessage
      implements OrderResponseOrBuilder {
    // Use OrderResponse.newBuilder() to construct.
    private OrderResponse(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private OrderResponse(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final OrderResponse defaultInstance;
    public static OrderResponse getDefaultInstance() {
      return defaultInstance;
    }

    public OrderResponse getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private OrderResponse(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
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
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 8: {
              bitField0_ |= 0x00000001;
              orderId_ = input.readInt32();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              statusCode_ = input.readInt32();
              break;
            }
            case 26: {
              bitField0_ |= 0x00000004;
              desc_ = input.readBytes();
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.netty.study.protobuf.OrderResponseProto.internal_static_netty_OrderResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.netty.study.protobuf.OrderResponseProto.internal_static_netty_OrderResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.netty.study.protobuf.OrderResponseProto.OrderResponse.class, org.netty.study.protobuf.OrderResponseProto.OrderResponse.Builder.class);
    }

    public static com.google.protobuf.Parser<OrderResponse> PARSER =
        new com.google.protobuf.AbstractParser<OrderResponse>() {
      public OrderResponse parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new OrderResponse(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<OrderResponse> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // required int32 orderId = 1;
    public static final int ORDERID_FIELD_NUMBER = 1;
    private int orderId_;
    /**
     * <code>required int32 orderId = 1;</code>
     */
    public boolean hasOrderId() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required int32 orderId = 1;</code>
     */
    public int getOrderId() {
      return orderId_;
    }

    // required int32 statusCode = 2;
    public static final int STATUSCODE_FIELD_NUMBER = 2;
    private int statusCode_;
    /**
     * <code>required int32 statusCode = 2;</code>
     */
    public boolean hasStatusCode() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required int32 statusCode = 2;</code>
     */
    public int getStatusCode() {
      return statusCode_;
    }

    // required string desc = 3;
    public static final int DESC_FIELD_NUMBER = 3;
    private java.lang.Object desc_;
    /**
     * <code>required string desc = 3;</code>
     */
    public boolean hasDesc() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>required string desc = 3;</code>
     */
    public java.lang.String getDesc() {
      java.lang.Object ref = desc_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          desc_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string desc = 3;</code>
     */
    public com.google.protobuf.ByteString
        getDescBytes() {
      java.lang.Object ref = desc_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        desc_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private void initFields() {
      orderId_ = 0;
      statusCode_ = 0;
      desc_ = "";
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      if (!hasOrderId()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasStatusCode()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasDesc()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeInt32(1, orderId_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt32(2, statusCode_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeBytes(3, getDescBytes());
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, orderId_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, statusCode_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(3, getDescBytes());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static org.netty.study.protobuf.OrderResponseProto.OrderResponse parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.netty.study.protobuf.OrderResponseProto.OrderResponse parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.netty.study.protobuf.OrderResponseProto.OrderResponse parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.netty.study.protobuf.OrderResponseProto.OrderResponse parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.netty.study.protobuf.OrderResponseProto.OrderResponse parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.netty.study.protobuf.OrderResponseProto.OrderResponse parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static org.netty.study.protobuf.OrderResponseProto.OrderResponse parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static org.netty.study.protobuf.OrderResponseProto.OrderResponse parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static org.netty.study.protobuf.OrderResponseProto.OrderResponse parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.netty.study.protobuf.OrderResponseProto.OrderResponse parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(org.netty.study.protobuf.OrderResponseProto.OrderResponse prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code netty.OrderResponse}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements org.netty.study.protobuf.OrderResponseProto.OrderResponseOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.netty.study.protobuf.OrderResponseProto.internal_static_netty_OrderResponse_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.netty.study.protobuf.OrderResponseProto.internal_static_netty_OrderResponse_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.netty.study.protobuf.OrderResponseProto.OrderResponse.class, org.netty.study.protobuf.OrderResponseProto.OrderResponse.Builder.class);
      }

      // Construct using org.netty.study.protobuf.OrderResponseProto.OrderResponse.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        orderId_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        statusCode_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        desc_ = "";
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.netty.study.protobuf.OrderResponseProto.internal_static_netty_OrderResponse_descriptor;
      }

      public org.netty.study.protobuf.OrderResponseProto.OrderResponse getDefaultInstanceForType() {
        return org.netty.study.protobuf.OrderResponseProto.OrderResponse.getDefaultInstance();
      }

      public org.netty.study.protobuf.OrderResponseProto.OrderResponse build() {
        org.netty.study.protobuf.OrderResponseProto.OrderResponse result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public org.netty.study.protobuf.OrderResponseProto.OrderResponse buildPartial() {
        org.netty.study.protobuf.OrderResponseProto.OrderResponse result = new org.netty.study.protobuf.OrderResponseProto.OrderResponse(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.orderId_ = orderId_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.statusCode_ = statusCode_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.desc_ = desc_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof org.netty.study.protobuf.OrderResponseProto.OrderResponse) {
          return mergeFrom((org.netty.study.protobuf.OrderResponseProto.OrderResponse)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.netty.study.protobuf.OrderResponseProto.OrderResponse other) {
        if (other == org.netty.study.protobuf.OrderResponseProto.OrderResponse.getDefaultInstance()) return this;
        if (other.hasOrderId()) {
          setOrderId(other.getOrderId());
        }
        if (other.hasStatusCode()) {
          setStatusCode(other.getStatusCode());
        }
        if (other.hasDesc()) {
          bitField0_ |= 0x00000004;
          desc_ = other.desc_;
          onChanged();
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasOrderId()) {
          
          return false;
        }
        if (!hasStatusCode()) {
          
          return false;
        }
        if (!hasDesc()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        org.netty.study.protobuf.OrderResponseProto.OrderResponse parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.netty.study.protobuf.OrderResponseProto.OrderResponse) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // required int32 orderId = 1;
      private int orderId_ ;
      /**
       * <code>required int32 orderId = 1;</code>
       */
      public boolean hasOrderId() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required int32 orderId = 1;</code>
       */
      public int getOrderId() {
        return orderId_;
      }
      /**
       * <code>required int32 orderId = 1;</code>
       */
      public Builder setOrderId(int value) {
        bitField0_ |= 0x00000001;
        orderId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int32 orderId = 1;</code>
       */
      public Builder clearOrderId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        orderId_ = 0;
        onChanged();
        return this;
      }

      // required int32 statusCode = 2;
      private int statusCode_ ;
      /**
       * <code>required int32 statusCode = 2;</code>
       */
      public boolean hasStatusCode() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required int32 statusCode = 2;</code>
       */
      public int getStatusCode() {
        return statusCode_;
      }
      /**
       * <code>required int32 statusCode = 2;</code>
       */
      public Builder setStatusCode(int value) {
        bitField0_ |= 0x00000002;
        statusCode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int32 statusCode = 2;</code>
       */
      public Builder clearStatusCode() {
        bitField0_ = (bitField0_ & ~0x00000002);
        statusCode_ = 0;
        onChanged();
        return this;
      }

      // required string desc = 3;
      private java.lang.Object desc_ = "";
      /**
       * <code>required string desc = 3;</code>
       */
      public boolean hasDesc() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>required string desc = 3;</code>
       */
      public java.lang.String getDesc() {
        java.lang.Object ref = desc_;
        if (!(ref instanceof java.lang.String)) {
          java.lang.String s = ((com.google.protobuf.ByteString) ref)
              .toStringUtf8();
          desc_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string desc = 3;</code>
       */
      public com.google.protobuf.ByteString
          getDescBytes() {
        java.lang.Object ref = desc_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          desc_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string desc = 3;</code>
       */
      public Builder setDesc(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        desc_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string desc = 3;</code>
       */
      public Builder clearDesc() {
        bitField0_ = (bitField0_ & ~0x00000004);
        desc_ = getDefaultInstance().getDesc();
        onChanged();
        return this;
      }
      /**
       * <code>required string desc = 3;</code>
       */
      public Builder setDescBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        desc_ = value;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:netty.OrderResponse)
    }

    static {
      defaultInstance = new OrderResponse(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:netty.OrderResponse)
  }

  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_netty_OrderResponse_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_netty_OrderResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\036netty/OrderResponseProto.proto\022\005netty\"" +
      "B\n\rOrderResponse\022\017\n\007orderId\030\001 \002(\005\022\022\n\nsta" +
      "tusCode\030\002 \002(\005\022\014\n\004desc\030\003 \002(\tB.\n\030org.netty" +
      ".study.protobufB\022OrderResponseProto"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_netty_OrderResponse_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_netty_OrderResponse_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_netty_OrderResponse_descriptor,
              new java.lang.String[] { "OrderId", "StatusCode", "Desc", });
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }

  // @@protoc_insertion_point(outer_class_scope)
}