// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: book_message.proto

package today.ihelio.grpc;

public interface BookOrBuilder extends
    // @@protoc_insertion_point(interface_extends:book.Book)
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
   * <code>string name = 2;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>string name = 2;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>string author = 3;</code>
   * @return The author.
   */
  java.lang.String getAuthor();
  /**
   * <code>string author = 3;</code>
   * @return The bytes for author.
   */
  com.google.protobuf.ByteString
      getAuthorBytes();

  /**
   * <code>uint32 publish_year = 4;</code>
   * @return The publishYear.
   */
  int getPublishYear();

  /**
   * <code>double price = 5;</code>
   * @return The price.
   */
  double getPrice();

  /**
   * <code>string publication = 6;</code>
   * @return The publication.
   */
  java.lang.String getPublication();
  /**
   * <code>string publication = 6;</code>
   * @return The bytes for publication.
   */
  com.google.protobuf.ByteString
      getPublicationBytes();

  /**
   * <code>uint32 rating = 7;</code>
   * @return The rating.
   */
  int getRating();

  /**
   * <code>uint32 rating_count = 8;</code>
   * @return The ratingCount.
   */
  int getRatingCount();

  /**
   * <code>double avg_rating = 9;</code>
   * @return The avgRating.
   */
  double getAvgRating();

  /**
   * <code>repeated .book.Sample sample = 10;</code>
   */
  java.util.List<today.ihelio.grpc.Sample> 
      getSampleList();
  /**
   * <code>repeated .book.Sample sample = 10;</code>
   */
  today.ihelio.grpc.Sample getSample(int index);
  /**
   * <code>repeated .book.Sample sample = 10;</code>
   */
  int getSampleCount();
  /**
   * <code>repeated .book.Sample sample = 10;</code>
   */
  java.util.List<? extends today.ihelio.grpc.SampleOrBuilder> 
      getSampleOrBuilderList();
  /**
   * <code>repeated .book.Sample sample = 10;</code>
   */
  today.ihelio.grpc.SampleOrBuilder getSampleOrBuilder(
      int index);

  /**
   * <code>repeated .book.Image image = 11;</code>
   */
  java.util.List<today.ihelio.grpc.Image> 
      getImageList();
  /**
   * <code>repeated .book.Image image = 11;</code>
   */
  today.ihelio.grpc.Image getImage(int index);
  /**
   * <code>repeated .book.Image image = 11;</code>
   */
  int getImageCount();
  /**
   * <code>repeated .book.Image image = 11;</code>
   */
  java.util.List<? extends today.ihelio.grpc.ImageOrBuilder> 
      getImageOrBuilderList();
  /**
   * <code>repeated .book.Image image = 11;</code>
   */
  today.ihelio.grpc.ImageOrBuilder getImageOrBuilder(
      int index);

  /**
   * <code>repeated .book.Book.Genre genre = 12;</code>
   * @return A list containing the genre.
   */
  java.util.List<today.ihelio.grpc.Book.Genre> getGenreList();
  /**
   * <code>repeated .book.Book.Genre genre = 12;</code>
   * @return The count of genre.
   */
  int getGenreCount();
  /**
   * <code>repeated .book.Book.Genre genre = 12;</code>
   * @param index The index of the element to return.
   * @return The genre at the given index.
   */
  today.ihelio.grpc.Book.Genre getGenre(int index);
  /**
   * <code>repeated .book.Book.Genre genre = 12;</code>
   * @return A list containing the enum numeric values on the wire for genre.
   */
  java.util.List<java.lang.Integer>
  getGenreValueList();
  /**
   * <code>repeated .book.Book.Genre genre = 12;</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of genre at the given index.
   */
  int getGenreValue(int index);

  /**
   * <code>optional uint32 popularity = 13;</code>
   * @return Whether the popularity field is set.
   */
  boolean hasPopularity();
  /**
   * <code>optional uint32 popularity = 13;</code>
   * @return The popularity.
   */
  int getPopularity();
}