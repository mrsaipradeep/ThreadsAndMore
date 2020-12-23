package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Forloop {

    public static void main(String[] args) {


        for (String a: getStrings()) {
            getStrings().remove(0);
        }


    }

    static List<String> ar = new ArrayList<>();

    private static List<String> getStrings() {
        if (ar.size() ==0) {
            ar.add("AAAAA");
            ar.add("BBBBB");
        }
        return ar;
    }


}
