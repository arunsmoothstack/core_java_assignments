package com.ss.day4.singleton;

public class Singleton {
    private static volatile Singleton singletonRef; //garantees threads reference same object in memory and that it's not moved to cpu cache when another thread is referencing it.

    private String randomText;
    private Singleton(String randomText) {
        this.randomText = randomText;
    }

    public static Singleton getInstance() {
        if (singletonRef == null) {
            synchronized (Singleton .class) {
                if(singletonRef == null) // needs to be checked just in case another thread is inside the outer if block before singleton variable is initialized.
                    singletonRef = new Singleton("This is a singleton");
            }
        }
        return singletonRef;
    }

    @Override
    public String toString() {
        return randomText;
    }
}
