package com.ss.day4.producerconsumer;

public class ProducerBufferMain {
    public static void main(String[] args) {
        Thread producerThread = new Thread(new Producer());
        Thread consumer1Thread = new Thread(new Consumer());
        //Thread consumer2Thread = new Thread(new Consumer());
        System.out.println("Starting Producer");
        producerThread.start();
        System.out.println("Starting Consumers");
        consumer1Thread.start();
        //consumer2Thread.start();
        try {
            Thread.sleep(10000); // program runs for 10 seconds then exits;
            System.out.println("Stopping Producer");
            producerThread.interrupt();
            Thread.sleep(1000);
            System.out.println("Stopping Consumers");
            consumer1Thread.interrupt();
            //consumer2Thread.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
