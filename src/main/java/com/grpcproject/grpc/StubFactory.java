package com.grpcproject.grpc;

import com.grpcproject.EchoGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class StubFactory {

    private static ManagedChannel managedChannel =   ManagedChannelBuilder
            .forAddress("localhost", 50051)
            .usePlaintext()
            .build();
    private static EchoGrpc.EchoBlockingStub blockingStub = EchoGrpc.newBlockingStub(managedChannel);
    private static EchoGrpc.EchoFutureStub futureStub = EchoGrpc.newFutureStub(managedChannel);
    private static EchoGrpc.EchoStub stub = EchoGrpc.newStub(managedChannel);

    public static ManagedChannel getManagedChannel() {
        return managedChannel;
    }

    public static EchoGrpc.EchoBlockingStub getBlockingStub() {
        return blockingStub;
    }

    public static EchoGrpc.EchoFutureStub getFutureStub() {
        return futureStub;
    }

    public static EchoGrpc.EchoStub getStub() {
        return stub;
    }
}
