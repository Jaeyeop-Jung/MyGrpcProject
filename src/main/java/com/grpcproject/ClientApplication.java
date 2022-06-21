package com.grpcproject;

import com.google.common.util.concurrent.ListenableFuture;
import com.grpcproject.grpc.StubFactory;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

import java.util.Iterator;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;

public class ClientApplication {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        String subject = new Scanner(System.in).nextLine();
        EchoRequest echo = StubFactory.getBlockingStub().echo(
                EchoRequest.newBuilder()
                        .setSubject(subject)
                        .build()
        );
        System.out.println("echo = " + echo);
        System.out.println("------------------------ step1 끝 ------------------------");

        StubFactory.getStub().echo(echo, new StreamObserver<EchoRequest>() {
            @Override
            public void onNext(EchoRequest value) {
                System.out.println("value = " + value);
            }

            @Override
            public void onError(Throwable t) {

            }

            @Override
            public void onCompleted() {
                System.out.println("------------------------ step2 통신 끝 ------------------------");
            }
        });
//        Thread.sleep(50000);
        System.out.println("------------------------ step2 끝 ------------------------");

        Iterator<EchoRequest> echoRequestIterator = StubFactory.getBlockingStub().echoServerStream(echo);
        while(echoRequestIterator.hasNext()){
            System.out.println("echoRequestIterator.next() = " + echoRequestIterator.next());
        }

        System.out.println("------------------------ step3 끝 ------------------------");

        StubFactory.getStub().echoServerStream(echo, new StreamObserver<EchoRequest>() {
            @Override
            public void onNext(EchoRequest value) {
                System.out.println("value = " + value);
            }

            @Override
            public void onError(Throwable t) {

            }

            @Override
            public void onCompleted() {
                System.out.println("------------------------ step4 통신 끝 ------------------------");
            }
        });

        System.out.println("------------------------ step4 끝 ------------------------");

        StreamObserver<EchoRequest> responseStreamObserver = new StreamObserver<>() {

            @Override
            public void onNext(EchoRequest value) {
                System.out.println("value = " + value.getSubject());
            }

            @Override
            public void onError(Throwable t) {

            }

            @Override
            public void onCompleted() {

            }
        };

    }

}
