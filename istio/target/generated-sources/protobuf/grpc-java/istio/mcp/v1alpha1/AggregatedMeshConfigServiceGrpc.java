package istio.mcp.v1alpha1;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 * The aggregated mesh configuration services allow a single
 * management server, via a single gRPC stream, to deliver all API
 * updates.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.26.0)",
    comments = "Source: mcp/v1alpha1/mcp.proto")
public final class AggregatedMeshConfigServiceGrpc {

  private AggregatedMeshConfigServiceGrpc() {}

  public static final String SERVICE_NAME = "istio.mcp.v1alpha1.AggregatedMeshConfigService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<istio.mcp.v1alpha1.Mcp.MeshConfigRequest,
      istio.mcp.v1alpha1.Mcp.MeshConfigResponse> getStreamAggregatedResourcesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StreamAggregatedResources",
      requestType = istio.mcp.v1alpha1.Mcp.MeshConfigRequest.class,
      responseType = istio.mcp.v1alpha1.Mcp.MeshConfigResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<istio.mcp.v1alpha1.Mcp.MeshConfigRequest,
      istio.mcp.v1alpha1.Mcp.MeshConfigResponse> getStreamAggregatedResourcesMethod() {
    io.grpc.MethodDescriptor<istio.mcp.v1alpha1.Mcp.MeshConfigRequest, istio.mcp.v1alpha1.Mcp.MeshConfigResponse> getStreamAggregatedResourcesMethod;
    if ((getStreamAggregatedResourcesMethod = AggregatedMeshConfigServiceGrpc.getStreamAggregatedResourcesMethod) == null) {
      synchronized (AggregatedMeshConfigServiceGrpc.class) {
        if ((getStreamAggregatedResourcesMethod = AggregatedMeshConfigServiceGrpc.getStreamAggregatedResourcesMethod) == null) {
          AggregatedMeshConfigServiceGrpc.getStreamAggregatedResourcesMethod = getStreamAggregatedResourcesMethod =
              io.grpc.MethodDescriptor.<istio.mcp.v1alpha1.Mcp.MeshConfigRequest, istio.mcp.v1alpha1.Mcp.MeshConfigResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StreamAggregatedResources"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  istio.mcp.v1alpha1.Mcp.MeshConfigRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  istio.mcp.v1alpha1.Mcp.MeshConfigResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AggregatedMeshConfigServiceMethodDescriptorSupplier("StreamAggregatedResources"))
              .build();
        }
      }
    }
    return getStreamAggregatedResourcesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<istio.mcp.v1alpha1.Mcp.IncrementalMeshConfigRequest,
      istio.mcp.v1alpha1.Mcp.IncrementalMeshConfigResponse> getIncrementalAggregatedResourcesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "IncrementalAggregatedResources",
      requestType = istio.mcp.v1alpha1.Mcp.IncrementalMeshConfigRequest.class,
      responseType = istio.mcp.v1alpha1.Mcp.IncrementalMeshConfigResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<istio.mcp.v1alpha1.Mcp.IncrementalMeshConfigRequest,
      istio.mcp.v1alpha1.Mcp.IncrementalMeshConfigResponse> getIncrementalAggregatedResourcesMethod() {
    io.grpc.MethodDescriptor<istio.mcp.v1alpha1.Mcp.IncrementalMeshConfigRequest, istio.mcp.v1alpha1.Mcp.IncrementalMeshConfigResponse> getIncrementalAggregatedResourcesMethod;
    if ((getIncrementalAggregatedResourcesMethod = AggregatedMeshConfigServiceGrpc.getIncrementalAggregatedResourcesMethod) == null) {
      synchronized (AggregatedMeshConfigServiceGrpc.class) {
        if ((getIncrementalAggregatedResourcesMethod = AggregatedMeshConfigServiceGrpc.getIncrementalAggregatedResourcesMethod) == null) {
          AggregatedMeshConfigServiceGrpc.getIncrementalAggregatedResourcesMethod = getIncrementalAggregatedResourcesMethod =
              io.grpc.MethodDescriptor.<istio.mcp.v1alpha1.Mcp.IncrementalMeshConfigRequest, istio.mcp.v1alpha1.Mcp.IncrementalMeshConfigResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "IncrementalAggregatedResources"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  istio.mcp.v1alpha1.Mcp.IncrementalMeshConfigRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  istio.mcp.v1alpha1.Mcp.IncrementalMeshConfigResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AggregatedMeshConfigServiceMethodDescriptorSupplier("IncrementalAggregatedResources"))
              .build();
        }
      }
    }
    return getIncrementalAggregatedResourcesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AggregatedMeshConfigServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AggregatedMeshConfigServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AggregatedMeshConfigServiceStub>() {
        @java.lang.Override
        public AggregatedMeshConfigServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AggregatedMeshConfigServiceStub(channel, callOptions);
        }
      };
    return AggregatedMeshConfigServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AggregatedMeshConfigServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AggregatedMeshConfigServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AggregatedMeshConfigServiceBlockingStub>() {
        @java.lang.Override
        public AggregatedMeshConfigServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AggregatedMeshConfigServiceBlockingStub(channel, callOptions);
        }
      };
    return AggregatedMeshConfigServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AggregatedMeshConfigServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AggregatedMeshConfigServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AggregatedMeshConfigServiceFutureStub>() {
        @java.lang.Override
        public AggregatedMeshConfigServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AggregatedMeshConfigServiceFutureStub(channel, callOptions);
        }
      };
    return AggregatedMeshConfigServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * The aggregated mesh configuration services allow a single
   * management server, via a single gRPC stream, to deliver all API
   * updates.
   * </pre>
   */
  public static abstract class AggregatedMeshConfigServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * StreamAggregatedResources provides the ability to carefully
     * sequence updates across multiple resource types. A single stream
     * is used with multiple independent MeshConfigRequest /
     * MeshConfigResponses sequences multiplexed via the type URL.
     * </pre>
     */
    public io.grpc.stub.StreamObserver<istio.mcp.v1alpha1.Mcp.MeshConfigRequest> streamAggregatedResources(
        io.grpc.stub.StreamObserver<istio.mcp.v1alpha1.Mcp.MeshConfigResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getStreamAggregatedResourcesMethod(), responseObserver);
    }

    /**
     * <pre>
     * IncrementalAggregatedResources provides the ability to incrementally
     * update the resources on the client. This supports the goal of
     * scalability of MCP resources.
     * </pre>
     */
    public io.grpc.stub.StreamObserver<istio.mcp.v1alpha1.Mcp.IncrementalMeshConfigRequest> incrementalAggregatedResources(
        io.grpc.stub.StreamObserver<istio.mcp.v1alpha1.Mcp.IncrementalMeshConfigResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getIncrementalAggregatedResourcesMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getStreamAggregatedResourcesMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                istio.mcp.v1alpha1.Mcp.MeshConfigRequest,
                istio.mcp.v1alpha1.Mcp.MeshConfigResponse>(
                  this, METHODID_STREAM_AGGREGATED_RESOURCES)))
          .addMethod(
            getIncrementalAggregatedResourcesMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                istio.mcp.v1alpha1.Mcp.IncrementalMeshConfigRequest,
                istio.mcp.v1alpha1.Mcp.IncrementalMeshConfigResponse>(
                  this, METHODID_INCREMENTAL_AGGREGATED_RESOURCES)))
          .build();
    }
  }

  /**
   * <pre>
   * The aggregated mesh configuration services allow a single
   * management server, via a single gRPC stream, to deliver all API
   * updates.
   * </pre>
   */
  public static final class AggregatedMeshConfigServiceStub extends io.grpc.stub.AbstractAsyncStub<AggregatedMeshConfigServiceStub> {
    private AggregatedMeshConfigServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AggregatedMeshConfigServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AggregatedMeshConfigServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * StreamAggregatedResources provides the ability to carefully
     * sequence updates across multiple resource types. A single stream
     * is used with multiple independent MeshConfigRequest /
     * MeshConfigResponses sequences multiplexed via the type URL.
     * </pre>
     */
    public io.grpc.stub.StreamObserver<istio.mcp.v1alpha1.Mcp.MeshConfigRequest> streamAggregatedResources(
        io.grpc.stub.StreamObserver<istio.mcp.v1alpha1.Mcp.MeshConfigResponse> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getStreamAggregatedResourcesMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     * IncrementalAggregatedResources provides the ability to incrementally
     * update the resources on the client. This supports the goal of
     * scalability of MCP resources.
     * </pre>
     */
    public io.grpc.stub.StreamObserver<istio.mcp.v1alpha1.Mcp.IncrementalMeshConfigRequest> incrementalAggregatedResources(
        io.grpc.stub.StreamObserver<istio.mcp.v1alpha1.Mcp.IncrementalMeshConfigResponse> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getIncrementalAggregatedResourcesMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * <pre>
   * The aggregated mesh configuration services allow a single
   * management server, via a single gRPC stream, to deliver all API
   * updates.
   * </pre>
   */
  public static final class AggregatedMeshConfigServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<AggregatedMeshConfigServiceBlockingStub> {
    private AggregatedMeshConfigServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AggregatedMeshConfigServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AggregatedMeshConfigServiceBlockingStub(channel, callOptions);
    }
  }

  /**
   * <pre>
   * The aggregated mesh configuration services allow a single
   * management server, via a single gRPC stream, to deliver all API
   * updates.
   * </pre>
   */
  public static final class AggregatedMeshConfigServiceFutureStub extends io.grpc.stub.AbstractFutureStub<AggregatedMeshConfigServiceFutureStub> {
    private AggregatedMeshConfigServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AggregatedMeshConfigServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AggregatedMeshConfigServiceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_STREAM_AGGREGATED_RESOURCES = 0;
  private static final int METHODID_INCREMENTAL_AGGREGATED_RESOURCES = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AggregatedMeshConfigServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AggregatedMeshConfigServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_STREAM_AGGREGATED_RESOURCES:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.streamAggregatedResources(
              (io.grpc.stub.StreamObserver<istio.mcp.v1alpha1.Mcp.MeshConfigResponse>) responseObserver);
        case METHODID_INCREMENTAL_AGGREGATED_RESOURCES:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.incrementalAggregatedResources(
              (io.grpc.stub.StreamObserver<istio.mcp.v1alpha1.Mcp.IncrementalMeshConfigResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class AggregatedMeshConfigServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AggregatedMeshConfigServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return istio.mcp.v1alpha1.Mcp.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AggregatedMeshConfigService");
    }
  }

  private static final class AggregatedMeshConfigServiceFileDescriptorSupplier
      extends AggregatedMeshConfigServiceBaseDescriptorSupplier {
    AggregatedMeshConfigServiceFileDescriptorSupplier() {}
  }

  private static final class AggregatedMeshConfigServiceMethodDescriptorSupplier
      extends AggregatedMeshConfigServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AggregatedMeshConfigServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (AggregatedMeshConfigServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AggregatedMeshConfigServiceFileDescriptorSupplier())
              .addMethod(getStreamAggregatedResourcesMethod())
              .addMethod(getIncrementalAggregatedResourcesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
