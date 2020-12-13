package com.ss.day4.singleton;

public class SingletonMain implements Runnable {
    private Singleton singleton = Singleton.getInstance();

    @Override
    public void run() {
        System.out.println(singleton);
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new SingletonMain());
        Thread t2 = new Thread(new SingletonMain());
        System.out.println("Starting Thread 1");
        t1.start();
        System.out.println("Starting Thread 2");
        t2.start();
        System.out.println("Main thread sleeping for 1 second");
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
