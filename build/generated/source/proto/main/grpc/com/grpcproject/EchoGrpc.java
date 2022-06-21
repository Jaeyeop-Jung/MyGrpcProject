package com.grpcproject;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.46.0)",
    comments = "Source: request.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class EchoGrpc {

  private EchoGrpc() {}

  public static final String SERVICE_NAME = "Echo";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.grpcproject.EchoRequest,
      com.grpcproject.EchoRequest> getEchoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Echo",
      requestType = com.grpcproject.EchoRequest.class,
      responseType = com.grpcproject.EchoRequest.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.grpcproject.EchoRequest,
      com.grpcproject.EchoRequest> getEchoMethod() {
    io.grpc.MethodDescriptor<com.grpcproject.EchoRequest, com.grpcproject.EchoRequest> getEchoMethod;
    if ((getEchoMethod = EchoGrpc.getEchoMethod) == null) {
      synchronized (EchoGrpc.class) {
        if ((getEchoMethod = EchoGrpc.getEchoMethod) == null) {
          EchoGrpc.getEchoMethod = getEchoMethod =
              io.grpc.MethodDescriptor.<com.grpcproject.EchoRequest, com.grpcproject.EchoRequest>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Echo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpcproject.EchoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpcproject.EchoRequest.getDefaultInstance()))
              .setSchemaDescriptor(new EchoMethodDescriptorSupplier("Echo"))
              .build();
        }
      }
    }
    return getEchoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.grpcproject.EchoRequest,
      com.grpcproject.EchoRequest> getEchoClientStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EchoClientStream",
      requestType = com.grpcproject.EchoRequest.class,
      responseType = com.grpcproject.EchoRequest.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<com.grpcproject.EchoRequest,
      com.grpcproject.EchoRequest> getEchoClientStreamMethod() {
    io.grpc.MethodDescriptor<com.grpcproject.EchoRequest, com.grpcproject.EchoRequest> getEchoClientStreamMethod;
    if ((getEchoClientStreamMethod = EchoGrpc.getEchoClientStreamMethod) == null) {
      synchronized (EchoGrpc.class) {
        if ((getEchoClientStreamMethod = EchoGrpc.getEchoClientStreamMethod) == null) {
          EchoGrpc.getEchoClientStreamMethod = getEchoClientStreamMethod =
              io.grpc.MethodDescriptor.<com.grpcproject.EchoRequest, com.grpcproject.EchoRequest>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EchoClientStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpcproject.EchoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpcproject.EchoRequest.getDefaultInstance()))
              .setSchemaDescriptor(new EchoMethodDescriptorSupplier("EchoClientStream"))
              .build();
        }
      }
    }
    return getEchoClientStreamMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.grpcproject.EchoRequest,
      com.grpcproject.EchoRequest> getEchoServerStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EchoServerStream",
      requestType = com.grpcproject.EchoRequest.class,
      responseType = com.grpcproject.EchoRequest.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.grpcproject.EchoRequest,
      com.grpcproject.EchoRequest> getEchoServerStreamMethod() {
    io.grpc.MethodDescriptor<com.grpcproject.EchoRequest, com.grpcproject.EchoRequest> getEchoServerStreamMethod;
    if ((getEchoServerStreamMethod = EchoGrpc.getEchoServerStreamMethod) == null) {
      synchronized (EchoGrpc.class) {
        if ((getEchoServerStreamMethod = EchoGrpc.getEchoServerStreamMethod) == null) {
          EchoGrpc.getEchoServerStreamMethod = getEchoServerStreamMethod =
              io.grpc.MethodDescriptor.<com.grpcproject.EchoRequest, com.grpcproject.EchoRequest>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EchoServerStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpcproject.EchoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpcproject.EchoRequest.getDefaultInstance()))
              .setSchemaDescriptor(new EchoMethodDescriptorSupplier("EchoServerStream"))
              .build();
        }
      }
    }
    return getEchoServerStreamMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.grpcproject.EchoRequest,
      com.grpcproject.EchoRequest> getEchoBothStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EchoBothStream",
      requestType = com.grpcproject.EchoRequest.class,
      responseType = com.grpcproject.EchoRequest.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<com.grpcproject.EchoRequest,
      com.grpcproject.EchoRequest> getEchoBothStreamMethod() {
    io.grpc.MethodDescriptor<com.grpcproject.EchoRequest, com.grpcproject.EchoRequest> getEchoBothStreamMethod;
    if ((getEchoBothStreamMethod = EchoGrpc.getEchoBothStreamMethod) == null) {
      synchronized (EchoGrpc.class) {
        if ((getEchoBothStreamMethod = EchoGrpc.getEchoBothStreamMethod) == null) {
          EchoGrpc.getEchoBothStreamMethod = getEchoBothStreamMethod =
              io.grpc.MethodDescriptor.<com.grpcproject.EchoRequest, com.grpcproject.EchoRequest>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EchoBothStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpcproject.EchoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpcproject.EchoRequest.getDefaultInstance()))
              .setSchemaDescriptor(new EchoMethodDescriptorSupplier("EchoBothStream"))
              .build();
        }
      }
    }
    return getEchoBothStreamMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static EchoStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EchoStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EchoStub>() {
        @java.lang.Override
        public EchoStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EchoStub(channel, callOptions);
        }
      };
    return EchoStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static EchoBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EchoBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EchoBlockingStub>() {
        @java.lang.Override
        public EchoBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EchoBlockingStub(channel, callOptions);
        }
      };
    return EchoBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static EchoFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EchoFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EchoFutureStub>() {
        @java.lang.Override
        public EchoFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EchoFutureStub(channel, callOptions);
        }
      };
    return EchoFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class EchoImplBase implements io.grpc.BindableService {

    /**
     */
    public void echo(com.grpcproject.EchoRequest request,
        io.grpc.stub.StreamObserver<com.grpcproject.EchoRequest> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEchoMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.grpcproject.EchoRequest> echoClientStream(
        io.grpc.stub.StreamObserver<com.grpcproject.EchoRequest> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getEchoClientStreamMethod(), responseObserver);
    }

    /**
     */
    public void echoServerStream(com.grpcproject.EchoRequest request,
        io.grpc.stub.StreamObserver<com.grpcproject.EchoRequest> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEchoServerStreamMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.grpcproject.EchoRequest> echoBothStream(
        io.grpc.stub.StreamObserver<com.grpcproject.EchoRequest> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getEchoBothStreamMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getEchoMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.grpcproject.EchoRequest,
                com.grpcproject.EchoRequest>(
                  this, METHODID_ECHO)))
          .addMethod(
            getEchoClientStreamMethod(),
            io.grpc.stub.ServerCalls.asyncClientStreamingCall(
              new MethodHandlers<
                com.grpcproject.EchoRequest,
                com.grpcproject.EchoRequest>(
                  this, METHODID_ECHO_CLIENT_STREAM)))
          .addMethod(
            getEchoServerStreamMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                com.grpcproject.EchoRequest,
                com.grpcproject.EchoRequest>(
                  this, METHODID_ECHO_SERVER_STREAM)))
          .addMethod(
            getEchoBothStreamMethod(),
            io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
              new MethodHandlers<
                com.grpcproject.EchoRequest,
                com.grpcproject.EchoRequest>(
                  this, METHODID_ECHO_BOTH_STREAM)))
          .build();
    }
  }

  /**
   */
  public static final class EchoStub extends io.grpc.stub.AbstractAsyncStub<EchoStub> {
    private EchoStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EchoStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EchoStub(channel, callOptions);
    }

    /**
     */
    public void echo(com.grpcproject.EchoRequest request,
        io.grpc.stub.StreamObserver<com.grpcproject.EchoRequest> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEchoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.grpcproject.EchoRequest> echoClientStream(
        io.grpc.stub.StreamObserver<com.grpcproject.EchoRequest> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getEchoClientStreamMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public void echoServerStream(com.grpcproject.EchoRequest request,
        io.grpc.stub.StreamObserver<com.grpcproject.EchoRequest> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getEchoServerStreamMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.grpcproject.EchoRequest> echoBothStream(
        io.grpc.stub.StreamObserver<com.grpcproject.EchoRequest> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getEchoBothStreamMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class EchoBlockingStub extends io.grpc.stub.AbstractBlockingStub<EchoBlockingStub> {
    private EchoBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EchoBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EchoBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.grpcproject.EchoRequest echo(com.grpcproject.EchoRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEchoMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.grpcproject.EchoRequest> echoServerStream(
        com.grpcproject.EchoRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getEchoServerStreamMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class EchoFutureStub extends io.grpc.stub.AbstractFutureStub<EchoFutureStub> {
    private EchoFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EchoFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EchoFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpcproject.EchoRequest> echo(
        com.grpcproject.EchoRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEchoMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ECHO = 0;
  private static final int METHODID_ECHO_SERVER_STREAM = 1;
  private static final int METHODID_ECHO_CLIENT_STREAM = 2;
  private static final int METHODID_ECHO_BOTH_STREAM = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final EchoImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(EchoImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ECHO:
          serviceImpl.echo((com.grpcproject.EchoRequest) request,
              (io.grpc.stub.StreamObserver<com.grpcproject.EchoRequest>) responseObserver);
          break;
        case METHODID_ECHO_SERVER_STREAM:
          serviceImpl.echoServerStream((com.grpcproject.EchoRequest) request,
              (io.grpc.stub.StreamObserver<com.grpcproject.EchoRequest>) responseObserver);
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
        case METHODID_ECHO_CLIENT_STREAM:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.echoClientStream(
              (io.grpc.stub.StreamObserver<com.grpcproject.EchoRequest>) responseObserver);
        case METHODID_ECHO_BOTH_STREAM:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.echoBothStream(
              (io.grpc.stub.StreamObserver<com.grpcproject.EchoRequest>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class EchoBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    EchoBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.grpcproject.Request.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Echo");
    }
  }

  private static final class EchoFileDescriptorSupplier
      extends EchoBaseDescriptorSupplier {
    EchoFileDescriptorSupplier() {}
  }

  private static final class EchoMethodDescriptorSupplier
      extends EchoBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    EchoMethodDescriptorSupplier(String methodName) {
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
      synchronized (EchoGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new EchoFileDescriptorSupplier())
              .addMethod(getEchoMethod())
              .addMethod(getEchoClientStreamMethod())
              .addMethod(getEchoServerStreamMethod())
              .addMethod(getEchoBothStreamMethod())
              .build();
        }
      }
    }
    return result;
  }
}
