package today.ihelio.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.49.0)",
    comments = "Source: book_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class BookServiceGrpc {

  private BookServiceGrpc() {}

  public static final String SERVICE_NAME = "book.BookService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<today.ihelio.grpc.CreateBookRequest,
      today.ihelio.grpc.CreateBookResponse> getCreateBookMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateBook",
      requestType = today.ihelio.grpc.CreateBookRequest.class,
      responseType = today.ihelio.grpc.CreateBookResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<today.ihelio.grpc.CreateBookRequest,
      today.ihelio.grpc.CreateBookResponse> getCreateBookMethod() {
    io.grpc.MethodDescriptor<today.ihelio.grpc.CreateBookRequest, today.ihelio.grpc.CreateBookResponse> getCreateBookMethod;
    if ((getCreateBookMethod = BookServiceGrpc.getCreateBookMethod) == null) {
      synchronized (BookServiceGrpc.class) {
        if ((getCreateBookMethod = BookServiceGrpc.getCreateBookMethod) == null) {
          BookServiceGrpc.getCreateBookMethod = getCreateBookMethod =
              io.grpc.MethodDescriptor.<today.ihelio.grpc.CreateBookRequest, today.ihelio.grpc.CreateBookResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateBook"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  today.ihelio.grpc.CreateBookRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  today.ihelio.grpc.CreateBookResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BookServiceMethodDescriptorSupplier("CreateBook"))
              .build();
        }
      }
    }
    return getCreateBookMethod;
  }

  private static volatile io.grpc.MethodDescriptor<today.ihelio.grpc.UploadImageRequest,
      today.ihelio.grpc.UploadImageResponse> getUploadImageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UploadImage",
      requestType = today.ihelio.grpc.UploadImageRequest.class,
      responseType = today.ihelio.grpc.UploadImageResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<today.ihelio.grpc.UploadImageRequest,
      today.ihelio.grpc.UploadImageResponse> getUploadImageMethod() {
    io.grpc.MethodDescriptor<today.ihelio.grpc.UploadImageRequest, today.ihelio.grpc.UploadImageResponse> getUploadImageMethod;
    if ((getUploadImageMethod = BookServiceGrpc.getUploadImageMethod) == null) {
      synchronized (BookServiceGrpc.class) {
        if ((getUploadImageMethod = BookServiceGrpc.getUploadImageMethod) == null) {
          BookServiceGrpc.getUploadImageMethod = getUploadImageMethod =
              io.grpc.MethodDescriptor.<today.ihelio.grpc.UploadImageRequest, today.ihelio.grpc.UploadImageResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UploadImage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  today.ihelio.grpc.UploadImageRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  today.ihelio.grpc.UploadImageResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BookServiceMethodDescriptorSupplier("UploadImage"))
              .build();
        }
      }
    }
    return getUploadImageMethod;
  }

  private static volatile io.grpc.MethodDescriptor<today.ihelio.grpc.RecommendBookRequest,
      today.ihelio.grpc.RecommendBookResponse> getRecommendBookMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RecommendBook",
      requestType = today.ihelio.grpc.RecommendBookRequest.class,
      responseType = today.ihelio.grpc.RecommendBookResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<today.ihelio.grpc.RecommendBookRequest,
      today.ihelio.grpc.RecommendBookResponse> getRecommendBookMethod() {
    io.grpc.MethodDescriptor<today.ihelio.grpc.RecommendBookRequest, today.ihelio.grpc.RecommendBookResponse> getRecommendBookMethod;
    if ((getRecommendBookMethod = BookServiceGrpc.getRecommendBookMethod) == null) {
      synchronized (BookServiceGrpc.class) {
        if ((getRecommendBookMethod = BookServiceGrpc.getRecommendBookMethod) == null) {
          BookServiceGrpc.getRecommendBookMethod = getRecommendBookMethod =
              io.grpc.MethodDescriptor.<today.ihelio.grpc.RecommendBookRequest, today.ihelio.grpc.RecommendBookResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RecommendBook"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  today.ihelio.grpc.RecommendBookRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  today.ihelio.grpc.RecommendBookResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BookServiceMethodDescriptorSupplier("RecommendBook"))
              .build();
        }
      }
    }
    return getRecommendBookMethod;
  }

  private static volatile io.grpc.MethodDescriptor<today.ihelio.grpc.RateBookRequest,
      today.ihelio.grpc.RateBookResponse> getRateBookMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RateBook",
      requestType = today.ihelio.grpc.RateBookRequest.class,
      responseType = today.ihelio.grpc.RateBookResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<today.ihelio.grpc.RateBookRequest,
      today.ihelio.grpc.RateBookResponse> getRateBookMethod() {
    io.grpc.MethodDescriptor<today.ihelio.grpc.RateBookRequest, today.ihelio.grpc.RateBookResponse> getRateBookMethod;
    if ((getRateBookMethod = BookServiceGrpc.getRateBookMethod) == null) {
      synchronized (BookServiceGrpc.class) {
        if ((getRateBookMethod = BookServiceGrpc.getRateBookMethod) == null) {
          BookServiceGrpc.getRateBookMethod = getRateBookMethod =
              io.grpc.MethodDescriptor.<today.ihelio.grpc.RateBookRequest, today.ihelio.grpc.RateBookResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RateBook"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  today.ihelio.grpc.RateBookRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  today.ihelio.grpc.RateBookResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BookServiceMethodDescriptorSupplier("RateBook"))
              .build();
        }
      }
    }
    return getRateBookMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static BookServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BookServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BookServiceStub>() {
        @java.lang.Override
        public BookServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BookServiceStub(channel, callOptions);
        }
      };
    return BookServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static BookServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BookServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BookServiceBlockingStub>() {
        @java.lang.Override
        public BookServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BookServiceBlockingStub(channel, callOptions);
        }
      };
    return BookServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static BookServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BookServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BookServiceFutureStub>() {
        @java.lang.Override
        public BookServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BookServiceFutureStub(channel, callOptions);
        }
      };
    return BookServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class BookServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void createBook(today.ihelio.grpc.CreateBookRequest request,
        io.grpc.stub.StreamObserver<today.ihelio.grpc.CreateBookResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateBookMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<today.ihelio.grpc.UploadImageRequest> uploadImage(
        io.grpc.stub.StreamObserver<today.ihelio.grpc.UploadImageResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getUploadImageMethod(), responseObserver);
    }

    /**
     */
    public void recommendBook(today.ihelio.grpc.RecommendBookRequest request,
        io.grpc.stub.StreamObserver<today.ihelio.grpc.RecommendBookResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRecommendBookMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<today.ihelio.grpc.RateBookRequest> rateBook(
        io.grpc.stub.StreamObserver<today.ihelio.grpc.RateBookResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getRateBookMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateBookMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                today.ihelio.grpc.CreateBookRequest,
                today.ihelio.grpc.CreateBookResponse>(
                  this, METHODID_CREATE_BOOK)))
          .addMethod(
            getUploadImageMethod(),
            io.grpc.stub.ServerCalls.asyncClientStreamingCall(
              new MethodHandlers<
                today.ihelio.grpc.UploadImageRequest,
                today.ihelio.grpc.UploadImageResponse>(
                  this, METHODID_UPLOAD_IMAGE)))
          .addMethod(
            getRecommendBookMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                today.ihelio.grpc.RecommendBookRequest,
                today.ihelio.grpc.RecommendBookResponse>(
                  this, METHODID_RECOMMEND_BOOK)))
          .addMethod(
            getRateBookMethod(),
            io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
              new MethodHandlers<
                today.ihelio.grpc.RateBookRequest,
                today.ihelio.grpc.RateBookResponse>(
                  this, METHODID_RATE_BOOK)))
          .build();
    }
  }

  /**
   */
  public static final class BookServiceStub extends io.grpc.stub.AbstractAsyncStub<BookServiceStub> {
    private BookServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BookServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BookServiceStub(channel, callOptions);
    }

    /**
     */
    public void createBook(today.ihelio.grpc.CreateBookRequest request,
        io.grpc.stub.StreamObserver<today.ihelio.grpc.CreateBookResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateBookMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<today.ihelio.grpc.UploadImageRequest> uploadImage(
        io.grpc.stub.StreamObserver<today.ihelio.grpc.UploadImageResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getUploadImageMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public void recommendBook(today.ihelio.grpc.RecommendBookRequest request,
        io.grpc.stub.StreamObserver<today.ihelio.grpc.RecommendBookResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getRecommendBookMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<today.ihelio.grpc.RateBookRequest> rateBook(
        io.grpc.stub.StreamObserver<today.ihelio.grpc.RateBookResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getRateBookMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class BookServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<BookServiceBlockingStub> {
    private BookServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BookServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BookServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public today.ihelio.grpc.CreateBookResponse createBook(today.ihelio.grpc.CreateBookRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateBookMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<today.ihelio.grpc.RecommendBookResponse> recommendBook(
        today.ihelio.grpc.RecommendBookRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getRecommendBookMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class BookServiceFutureStub extends io.grpc.stub.AbstractFutureStub<BookServiceFutureStub> {
    private BookServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BookServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BookServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<today.ihelio.grpc.CreateBookResponse> createBook(
        today.ihelio.grpc.CreateBookRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateBookMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_BOOK = 0;
  private static final int METHODID_RECOMMEND_BOOK = 1;
  private static final int METHODID_UPLOAD_IMAGE = 2;
  private static final int METHODID_RATE_BOOK = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final BookServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(BookServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_BOOK:
          serviceImpl.createBook((today.ihelio.grpc.CreateBookRequest) request,
              (io.grpc.stub.StreamObserver<today.ihelio.grpc.CreateBookResponse>) responseObserver);
          break;
        case METHODID_RECOMMEND_BOOK:
          serviceImpl.recommendBook((today.ihelio.grpc.RecommendBookRequest) request,
              (io.grpc.stub.StreamObserver<today.ihelio.grpc.RecommendBookResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_UPLOAD_IMAGE:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.uploadImage(
              (io.grpc.stub.StreamObserver<today.ihelio.grpc.UploadImageResponse>) responseObserver);
        case METHODID_RATE_BOOK:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.rateBook(
              (io.grpc.stub.StreamObserver<today.ihelio.grpc.RateBookResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class BookServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    BookServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return today.ihelio.grpc.BookServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("BookService");
    }
  }

  private static final class BookServiceFileDescriptorSupplier
      extends BookServiceBaseDescriptorSupplier {
    BookServiceFileDescriptorSupplier() {}
  }

  private static final class BookServiceMethodDescriptorSupplier
      extends BookServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    BookServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (BookServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new BookServiceFileDescriptorSupplier())
              .addMethod(getCreateBookMethod())
              .addMethod(getUploadImageMethod())
              .addMethod(getRecommendBookMethod())
              .addMethod(getRateBookMethod())
              .build();
        }
      }
    }
    return result;
  }
}
