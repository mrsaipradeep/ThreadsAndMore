package com.company;

import java.util.stream.IntStream;

public class MaxArrayVal {

    private static int max;

    public static void main(String[] args) {
        int[] a = {0,0,0,0,0};
        int k = 100;
        /*add(b, 500, 5000, k);
        add(b, 3000, 7000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 2000, k);
        add(b, 1000, 5000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);
        add(b, 1000, 7000, k);*/
        add(a, 1, 2, k);
        add(a, 2, 3, k);
        add(a, 2, 4, k);
        add(a, 3, 4, k);
        add(a, 2, 3, k);
        //System.out.println(Arrays.toString(b));
        System.out.println(max);
    }

    private static void add(int[] a, int i, int j, int k) {


        for (int v = i; v <= j; v++) {
            a[v] += k;
        }

        a[i] += k;
        a[j] += k;
        if(max < a[i]){
            max = a[i];
        }
        if(max < a[j]){
            max = a[j];
        }
    }


}

// System.out.println(max + "++" + i +"++" + j);
//if(i < max && j >= max){

//   System.out.println("in if" + max);
//}


//if(max > j){
//  max += k;
//}

        /*a[i] += k;
        a[j] += k;
       // for (int v = i; v <= j; v++) {
           // a[v] += k;
            if (max < a[i]) {
                max = a[i];
            }
        if (max < a[j]) {
            max = a[j];
        }*/
// }
