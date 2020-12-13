package com.ss.day4.producerconsumer;

import java.util.ArrayList;

/**
 * @author Arun Mavumkal
 */
class Buffer {
    private static volatile Buffer bufferRef;
    private final int MAX_CAPACITY = 30;
    private ArrayList<Integer> bufferList = new ArrayList<>(MAX_CAPACITY);

    private Buffer() {}

    public static Buffer getInstance() {
        if(bufferRef == null) {
            synchronized (Buffer .class) {
                if(bufferRef == null) bufferRef = new Buffer();
            }
        }
        return bufferRef;
    }

    /**
     * @param value - integer value to add to buffer
     * @return returns true if value was added. returns false if buffer is full.
     */
    public synchronized boolean addItem(int value) {
            if(bufferList.size() < MAX_CAPACITY) {
                bufferList.add(value);
                return true;
            } else return false;
    }

    /**
     * @return removes and returns last element in buffer array if buffer is not empty.
     * @throws Exception thrown if buffer is empty
     */
    public synchronized int getItem() throws Exception {
            if(!bufferList.isEmpty())
                return bufferList.remove(bufferList.size() - 1);
            else
                throw new Exception("Consuming empty buffer");
    }

    /**
     * @return returns true if buffer is not empty.
     */
    public synchronized boolean hasItems() {
        return !bufferList.isEmpty();
    }
}