package com.ss.day4.producerconsumer;

import junit.framework.TestFailure;
import org.junit.Test;

import static org.junit.Assert.*;

public class BufferTest {
    @Test
    public void getInstance() {
        final Buffer[] buffer = new Buffer[2];
        Runnable t1 = () -> buffer[0] = Buffer.getInstance();
        Runnable t2 = () -> buffer[1] = Buffer.getInstance();
        Thread thread1 = new Thread(t1);
        Thread thread2 = new Thread(t2);
        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        assertSame(buffer[0], buffer[1]);
    }

    @Test()
    public void hasItems() {
        Buffer buffer = Buffer.getInstance();
        assertFalse(buffer.hasItems());
        buffer.addItem(3);
        assertTrue(buffer.hasItems());
        try {
            buffer.getItem();
        } catch (Exception e) {
            e.printStackTrace();
            fail("buffer empty when it shouldn't be");
        }
    }

    @Test
    public void addItem() {
        Buffer buffer = Buffer.getInstance();
        buffer.addItem(3);
        try {
            assertEquals(3, buffer.getItem());
        } catch (Exception e) {
            e.printStackTrace();
            fail("buffer empty when it shouldn't be");
        }
    }
}
