package com.company;

import java.util.ArrayList;
import java.util.List;

public class TestMain {

    public static void main(String[] args) {
        List a = new ArrayList<String>();
        a.add("lkdlkasd");
        a.add("skakjdad");
        a.add(1);

        for (int i = 0; i <a.size(); i++) {
            System.out.println(a.get(i));
        }
    }
}
