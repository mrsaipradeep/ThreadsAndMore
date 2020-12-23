package com.company;

import java.util.stream.IntStream;

class Counter {
    int count;

    public synchronized void increment() {
        count++;
    }
}

public class SynchronizedSample {

    public static void main(String[] args) throws InterruptedException {
        System.gc();
        Runtime.getRuntime().gc();
        Counter counter = new Counter();
        Thread t1 = new Thread(() -> IntStream.range(0, 1000).forEach(i -> counter.increment()));
        t1.start();
        Thread t2 = new Thread(() -> IntStream.range(0, 1000).forEach(i -> counter.increment()));
        t2.start();
        t1.join();
        System.out.println(counter.count);
    }
}
