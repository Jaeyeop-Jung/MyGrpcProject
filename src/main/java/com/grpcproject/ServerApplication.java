package com.grpcproject;

import com.grpcproject.grpc.EchoImpl;
import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class ServerApplication {

    private static Server server;

    public static void main(String[] args) throws IOException, InterruptedException {
        server = ServerBuilder.forPort(50051)
                .addService(new EchoImpl())
                .build()
                .start();

        server.awaitTermination();
    }

}
