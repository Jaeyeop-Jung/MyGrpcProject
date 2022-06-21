package com.grpcproject.grpc;

import com.grpcproject.EchoGrpc;
import com.grpcproject.EchoRequest;
import io.grpc.stub.StreamObserver;

import java.util.ArrayList;
import java.util.List;

public class EchoImpl extends EchoGrpc.EchoImplBase {

    @Override
    public void echo(EchoRequest request, StreamObserver<EchoRequest> responseObserver) {
        EchoRequest response = EchoRequest.newBuilder()
                .setSubject(request.getSubject())
                .build();
        responseObserver.onNext(response);

//        System.out.println("sleep 3초");
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e){
//            e.printStackTrace();
//        }
        responseObserver.onCompleted();
    }

    @Override
    public StreamObserver<EchoRequest> echoClientStream(StreamObserver<EchoRequest> responseObserver) {
        return new StreamObserver<EchoRequest>() {
            @Override
            public void onNext(EchoRequest value) {
                System.out.println("echoClientstream value = " + value);
            }

            @Override
            public void onError(Throwable t) {

            }

            @Override
            public void onCompleted() {
                responseObserver.onNext(EchoRequest.newBuilder().setSubject("server-onCompledted").build());
                responseObserver.onCompleted();
            }
        };
    }

    @Override
    public void echoServerStream(EchoRequest request, StreamObserver<EchoRequest> responseObserver) {
        for(int i=0; i<3; i++) {
            EchoRequest build = EchoRequest.newBuilder()
                    .setSubject(String.valueOf(i))
                    .build();
            responseObserver.onNext(build);
            if(i == 1){
                try {
                    System.out.println("sleep 3초");
                    Thread.sleep(5000);
                } catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        }

        System.out.println("server-onCompleted");
        responseObserver.onCompleted();
    }

    @Override
    public StreamObserver<EchoRequest> echoBothStream(StreamObserver<EchoRequest> responseObserver) {
        return new StreamObserver<EchoRequest>() {
            @Override
            public void onNext(EchoRequest value) {
                System.out.println("value = " + value);
            }

            @Override
            public void onError(Throwable t) {

            }

            @Override
            public void onCompleted() {
                responseObserver.onCompleted();
            }
        };
    }
}
