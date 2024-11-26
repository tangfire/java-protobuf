// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: Role.proto
// Protobuf Java Version: 4.27.2

package com.fire.protobuf.proto;

public final class RoleProto {
  private RoleProto() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 27,
      /* patch= */ 2,
      /* suffix= */ "",
      RoleProto.class.getName());
  }
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface RoleOrBuilder extends
      // @@protoc_insertion_point(interface_extends:com.fire.protobuf.proto.Role)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * 角色代码
     * </pre>
     *
     * <code>string code = 1;</code>
     * @return The code.
     */
    java.lang.String getCode();
    /**
     * <pre>
     * 角色代码
     * </pre>
     *
     * <code>string code = 1;</code>
     * @return The bytes for code.
     */
    com.google.protobuf.ByteString
        getCodeBytes();

    /**
     * <pre>
     * 角色名称
     * </pre>
     *
     * <code>string name = 2;</code>
     * @return The name.
     */
    java.lang.String getName();
    /**
     * <pre>
     * 角色名称
     * </pre>
     *
     * <code>string name = 2;</code>
     * @return The bytes for name.
     */
    com.google.protobuf.ByteString
        getNameBytes();
  }
  /**
   * <pre>
   * 角色对象定义
   * </pre>
   *
   * Protobuf type {@code com.fire.protobuf.proto.Role}
   */
  public static final class Role extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:com.fire.protobuf.proto.Role)
      RoleOrBuilder {
  private static final long serialVersionUID = 0L;
    static {
      com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
        com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
        /* major= */ 4,
        /* minor= */ 27,
        /* patch= */ 2,
        /* suffix= */ "",
        Role.class.getName());
    }
    // Use Role.newBuilder() to construct.
    private Role(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
    }
    private Role() {
      code_ = "";
      name_ = "";
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.fire.protobuf.proto.RoleProto.internal_static_com_fire_protobuf_proto_Role_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.fire.protobuf.proto.RoleProto.internal_static_com_fire_protobuf_proto_Role_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.fire.protobuf.proto.RoleProto.Role.class, com.fire.protobuf.proto.RoleProto.Role.Builder.class);
    }

    public static final int CODE_FIELD_NUMBER = 1;
    @SuppressWarnings("serial")
    private volatile java.lang.Object code_ = "";
    /**
     * <pre>
     * 角色代码
     * </pre>
     *
     * <code>string code = 1;</code>
     * @return The code.
     */
    @java.lang.Override
    public java.lang.String getCode() {
      java.lang.Object ref = code_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        code_ = s;
        return s;
      }
    }
    /**
     * <pre>
     * 角色代码
     * </pre>
     *
     * <code>string code = 1;</code>
     * @return The bytes for code.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getCodeBytes() {
      java.lang.Object ref = code_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        code_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int NAME_FIELD_NUMBER = 2;
    @SuppressWarnings("serial")
    private volatile java.lang.Object name_ = "";
    /**
     * <pre>
     * 角色名称
     * </pre>
     *
     * <code>string name = 2;</code>
     * @return The name.
     */
    @java.lang.Override
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      }
    }
    /**
     * <pre>
     * 角色名称
     * </pre>
     *
     * <code>string name = 2;</code>
     * @return The bytes for name.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
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
      if (!com.google.protobuf.GeneratedMessage.isStringEmpty(code_)) {
        com.google.protobuf.GeneratedMessage.writeString(output, 1, code_);
      }
      if (!com.google.protobuf.GeneratedMessage.isStringEmpty(name_)) {
        com.google.protobuf.GeneratedMessage.writeString(output, 2, name_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!com.google.protobuf.GeneratedMessage.isStringEmpty(code_)) {
        size += com.google.protobuf.GeneratedMessage.computeStringSize(1, code_);
      }
      if (!com.google.protobuf.GeneratedMessage.isStringEmpty(name_)) {
        size += com.google.protobuf.GeneratedMessage.computeStringSize(2, name_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof com.fire.protobuf.proto.RoleProto.Role)) {
        return super.equals(obj);
      }
      com.fire.protobuf.proto.RoleProto.Role other = (com.fire.protobuf.proto.RoleProto.Role) obj;

      if (!getCode()
          .equals(other.getCode())) return false;
      if (!getName()
          .equals(other.getName())) return false;
      if (!getUnknownFields().equals(other.getUnknownFields())) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + CODE_FIELD_NUMBER;
      hash = (53 * hash) + getCode().hashCode();
      hash = (37 * hash) + NAME_FIELD_NUMBER;
      hash = (53 * hash) + getName().hashCode();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.fire.protobuf.proto.RoleProto.Role parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.fire.protobuf.proto.RoleProto.Role parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.fire.protobuf.proto.RoleProto.Role parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.fire.protobuf.proto.RoleProto.Role parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.fire.protobuf.proto.RoleProto.Role parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.fire.protobuf.proto.RoleProto.Role parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.fire.protobuf.proto.RoleProto.Role parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input);
    }
    public static com.fire.protobuf.proto.RoleProto.Role parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static com.fire.protobuf.proto.RoleProto.Role parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static com.fire.protobuf.proto.RoleProto.Role parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.fire.protobuf.proto.RoleProto.Role parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input);
    }
    public static com.fire.protobuf.proto.RoleProto.Role parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(com.fire.protobuf.proto.RoleProto.Role prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     * 角色对象定义
     * </pre>
     *
     * Protobuf type {@code com.fire.protobuf.proto.Role}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:com.fire.protobuf.proto.Role)
        com.fire.protobuf.proto.RoleProto.RoleOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.fire.protobuf.proto.RoleProto.internal_static_com_fire_protobuf_proto_Role_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.fire.protobuf.proto.RoleProto.internal_static_com_fire_protobuf_proto_Role_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.fire.protobuf.proto.RoleProto.Role.class, com.fire.protobuf.proto.RoleProto.Role.Builder.class);
      }

      // Construct using com.fire.protobuf.proto.RoleProto.Role.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        bitField0_ = 0;
        code_ = "";
        name_ = "";
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.fire.protobuf.proto.RoleProto.internal_static_com_fire_protobuf_proto_Role_descriptor;
      }

      @java.lang.Override
      public com.fire.protobuf.proto.RoleProto.Role getDefaultInstanceForType() {
        return com.fire.protobuf.proto.RoleProto.Role.getDefaultInstance();
      }

      @java.lang.Override
      public com.fire.protobuf.proto.RoleProto.Role build() {
        com.fire.protobuf.proto.RoleProto.Role result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.fire.protobuf.proto.RoleProto.Role buildPartial() {
        com.fire.protobuf.proto.RoleProto.Role result = new com.fire.protobuf.proto.RoleProto.Role(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(com.fire.protobuf.proto.RoleProto.Role result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.code_ = code_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.name_ = name_;
        }
      }

      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.fire.protobuf.proto.RoleProto.Role) {
          return mergeFrom((com.fire.protobuf.proto.RoleProto.Role)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.fire.protobuf.proto.RoleProto.Role other) {
        if (other == com.fire.protobuf.proto.RoleProto.Role.getDefaultInstance()) return this;
        if (!other.getCode().isEmpty()) {
          code_ = other.code_;
          bitField0_ |= 0x00000001;
          onChanged();
        }
        if (!other.getName().isEmpty()) {
          name_ = other.name_;
          bitField0_ |= 0x00000002;
          onChanged();
        }
        this.mergeUnknownFields(other.getUnknownFields());
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
        if (extensionRegistry == null) {
          throw new java.lang.NullPointerException();
        }
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              case 10: {
                code_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
              case 18: {
                name_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
              default: {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
            } // switch (tag)
          } // while (!done)
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.unwrapIOException();
        } finally {
          onChanged();
        } // finally
        return this;
      }
      private int bitField0_;

      private java.lang.Object code_ = "";
      /**
       * <pre>
       * 角色代码
       * </pre>
       *
       * <code>string code = 1;</code>
       * @return The code.
       */
      public java.lang.String getCode() {
        java.lang.Object ref = code_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          code_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       * 角色代码
       * </pre>
       *
       * <code>string code = 1;</code>
       * @return The bytes for code.
       */
      public com.google.protobuf.ByteString
          getCodeBytes() {
        java.lang.Object ref = code_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          code_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       * 角色代码
       * </pre>
       *
       * <code>string code = 1;</code>
       * @param value The code to set.
       * @return This builder for chaining.
       */
      public Builder setCode(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        code_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * 角色代码
       * </pre>
       *
       * <code>string code = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearCode() {
        code_ = getDefaultInstance().getCode();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }
      /**
       * <pre>
       * 角色代码
       * </pre>
       *
       * <code>string code = 1;</code>
       * @param value The bytes for code to set.
       * @return This builder for chaining.
       */
      public Builder setCodeBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        code_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }

      private java.lang.Object name_ = "";
      /**
       * <pre>
       * 角色名称
       * </pre>
       *
       * <code>string name = 2;</code>
       * @return The name.
       */
      public java.lang.String getName() {
        java.lang.Object ref = name_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          name_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       * 角色名称
       * </pre>
       *
       * <code>string name = 2;</code>
       * @return The bytes for name.
       */
      public com.google.protobuf.ByteString
          getNameBytes() {
        java.lang.Object ref = name_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          name_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       * 角色名称
       * </pre>
       *
       * <code>string name = 2;</code>
       * @param value The name to set.
       * @return This builder for chaining.
       */
      public Builder setName(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        name_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * 角色名称
       * </pre>
       *
       * <code>string name = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearName() {
        name_ = getDefaultInstance().getName();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
        return this;
      }
      /**
       * <pre>
       * 角色名称
       * </pre>
       *
       * <code>string name = 2;</code>
       * @param value The bytes for name to set.
       * @return This builder for chaining.
       */
      public Builder setNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        name_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:com.fire.protobuf.proto.Role)
    }

    // @@protoc_insertion_point(class_scope:com.fire.protobuf.proto.Role)
    private static final com.fire.protobuf.proto.RoleProto.Role DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.fire.protobuf.proto.RoleProto.Role();
    }

    public static com.fire.protobuf.proto.RoleProto.Role getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Role>
        PARSER = new com.google.protobuf.AbstractParser<Role>() {
      @java.lang.Override
      public Role parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        Builder builder = newBuilder();
        try {
          builder.mergeFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.setUnfinishedMessage(builder.buildPartial());
        } catch (com.google.protobuf.UninitializedMessageException e) {
          throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
        } catch (java.io.IOException e) {
          throw new com.google.protobuf.InvalidProtocolBufferException(e)
              .setUnfinishedMessage(builder.buildPartial());
        }
        return builder.buildPartial();
      }
    };

    public static com.google.protobuf.Parser<Role> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Role> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.fire.protobuf.proto.RoleProto.Role getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_fire_protobuf_proto_Role_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_fire_protobuf_proto_Role_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\nRole.proto\022\027com.fire.protobuf.proto\"\"\n" +
      "\004Role\022\014\n\004code\030\001 \001(\t\022\014\n\004name\030\002 \001(\tB$\n\027com" +
      ".fire.protobuf.protoB\tRoleProtob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_com_fire_protobuf_proto_Role_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_fire_protobuf_proto_Role_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_com_fire_protobuf_proto_Role_descriptor,
        new java.lang.String[] { "Code", "Name", });
    descriptor.resolveAllFeaturesImmutable();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
