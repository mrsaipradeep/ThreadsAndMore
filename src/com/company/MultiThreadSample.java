package com.company;

public class MultiThreadSample {

    private String s;

    public MultiThreadSample(String s) {
        this.s = s;
    }

    public MultiThreadSample() {
        this.s = s;
    }

    void print(){
        System.out.println(s.toUpperCase());
    }
}
