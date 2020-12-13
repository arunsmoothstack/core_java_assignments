package com.ss.day4.producerconsumer;

/**
 * @author Arun Mavumkal
 */
class Consumer implements Runnable {
    private Buffer buffer = Buffer.getInstance();

    @Override
    public void run() {
        try {
            while (true) {
                if (buffer.hasItems()) {
                    try {
                        System.out.println("Consumed Item: " + buffer.getItem());
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                } else {
                    System.out.println("Buffer empty unable to retrieve item");
                }
                Thread.sleep(100);
            }
        } catch (Exception e) {
            System.out.println("Consumer Thread Interrupted");
        }
    }
}
