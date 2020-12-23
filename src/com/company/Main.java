package com.company;

public class Main {

    public static void main(String[] args) throws InterruptedException {
	    Thread hi = new Hi();
        Thread hello = new Hello();

        hi.start();
        Thread.sleep(10);
        hello.start();

        System.out.println("Thread is alive before join : " + hi.isAlive());
        hi.join();

        System.out.println("Bye");

    }
}
