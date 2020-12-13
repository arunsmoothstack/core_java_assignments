package com.ss.day4.producerconsumer;

import java.util.Random;

/**
 * @author Arun Mavumkal
 */
class Producer implements Runnable {
    private Buffer buffer = Buffer.getInstance();
    private Random random = new Random();

    @Override
    public void run() {
        int nextItem;
        try {
            while (true) {
                nextItem = random.nextInt(100);
                System.out.println("Attempting to add " + nextItem + " int to buffer");
                if(buffer.addItem(nextItem))
                    continue;
                System.out.println("Buffer full. Producer sleeping for 1 second");
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Producer thread interrupted");
        }
    }
}