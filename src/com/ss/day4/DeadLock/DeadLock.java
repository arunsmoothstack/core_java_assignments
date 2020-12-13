package com.ss.day4.DeadLock;

public class DeadLock implements Runnable{
    //static objects so all threads reference the same objects for monitoring
    public static final Object OBJECT_1 = new Object();
    public static final Object OBJECT_2 = new Object();

    private String threadName;
    public DeadLock(String threadName) {
        this.threadName = threadName;
    }
    @Override
    public void run() {
        try {
            synchronized (OBJECT_1) {
                Thread.sleep(1000);
                synchronized (OBJECT_2) {
                    System.out.println("Thread " + threadName + " is running");
                }
            }
            synchronized (OBJECT_2) {
                Thread.sleep(1000);
                synchronized (OBJECT_1) {
                    System.out.println("Thread " + threadName + " is running");
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Thread(new DeadLock("Thread 1")).start();
        new Thread(new DeadLock("Thread 2")).start();
    }
}
