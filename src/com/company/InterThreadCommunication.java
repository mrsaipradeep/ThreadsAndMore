package com.company;

class Q {

    private int num;
    private boolean valueSet = false;

    public synchronized void setNum(int num) {
        while(valueSet){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("set num : " + num);
        this.num = num;
        this.valueSet = true;
        notify();
    }

    public synchronized void getNum() {
        while(!valueSet){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Get num : " + num);
        this.valueSet = false;
        notify();
    }


}

class Producer implements Runnable {

    Q q;

    public Producer(Q q) {
        this.q = q;
        Thread producerThread = new Thread(this, "producer");
        producerThread.start();
    }

    @Override
    public void run() {
        int i=0;
        while (true){
            q.setNum(i++);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Consumer implements Runnable {

    Q q;

    public Consumer(Q q) {
        this.q = q;
        Thread consumerThread = new Thread(this,"consumer");
        consumerThread.start();
    }

    @Override
    public void run() {
        while (true){
            q.getNum();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class InterThreadCommunication {
    public static void main(String[] args) {
        Q q = new Q();
        new Producer(q);
        new Consumer(q);
    }
}
