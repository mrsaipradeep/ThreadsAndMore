package com.company.barcl;

import java.util.ArrayList;
import java.util.List;

public class Bag1<T extends Denomination> {

    private List<T> list = new ArrayList<>();

    void add(T t){
        this.list.add(t);
    }

    void display(){
        list.stream().map(Denomination::getValue).forEach(System.out::println);
    }
}
