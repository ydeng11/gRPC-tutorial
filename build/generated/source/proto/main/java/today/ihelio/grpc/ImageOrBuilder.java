// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: image_message.proto

package today.ihelio.grpc;

public interface ImageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:book.Image)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string id = 1;</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <code>string id = 1;</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <code>string file_path = 2;</code>
   * @return The filePath.
   */
  java.lang.String getFilePath();
  /**
   * <code>string file_path = 2;</code>
   * @return The bytes for filePath.
   */
  com.google.protobuf.ByteString
      getFilePathBytes();

  /**
   * <code>string size = 3;</code>
   * @return The size.
   */
  java.lang.String getSize();
  /**
   * <code>string size = 3;</code>
   * @return The bytes for size.
   */
  com.google.protobuf.ByteString
      getSizeBytes();

  /**
   * <code>.google.protobuf.Timestamp uploaded_at = 4;</code>
   * @return Whether the uploadedAt field is set.
   */
  boolean hasUploadedAt();
  /**
   * <code>.google.protobuf.Timestamp uploaded_at = 4;</code>
   * @return The uploadedAt.
   */
  com.google.protobuf.Timestamp getUploadedAt();
  /**
   * <code>.google.protobuf.Timestamp uploaded_at = 4;</code>
   */
  com.google.protobuf.TimestampOrBuilder getUploadedAtOrBuilder();
}
