package com.company.barcl;

public class Coin implements Denomination{

    private int val;

    public int getValue() {
        return val;
    }

    public void setValue(int val) {
        this.val = val;
    }
}
