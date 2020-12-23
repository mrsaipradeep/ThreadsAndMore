package com.company;

public class StringSplit {
    public static void main(String[] args) {
        String s = "/";
        String s1 = "/1235465";
        String s2 = "1235465/";
        System.out.println(s.split("/"));
        System.out.println(s1.split("/")[0]);
        System.out.println(s2.split("/")[0]);
    }
}
