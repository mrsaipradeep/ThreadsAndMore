package com.company;

import java.util.stream.IntStream;

public class MainWithRunnable {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(()-> print("Hi"));
        Thread t2 = new Thread(()-> print("Hello"));

        t1.start();
        Thread.sleep(10);
        t2.start();
    }

    private static void print(String val){
        IntStream.range(0,5).forEach(integer -> {
            System.out.println(val);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

    }
}
