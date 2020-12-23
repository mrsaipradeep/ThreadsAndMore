package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListTest {

    public static void main(String[] args) {
        //List<Integer> a = Arrays.asList(1, 2, 3, 4, 4, 6, 10, 12);
        //List<Integer> b = Arrays.asList(5, 5, 6, 7, 7, 9, 10, 11);

        List<Integer> a = Arrays.asList(1);
        List<Integer> b = Arrays.asList(5, 5, 6, 7, 7, 9, 10, 11);

        List<Integer> c = new ArrayList<>();
        int i = 0;
        int j = 0;
        while (!(c.contains(a.get(a.size() - 1)) && c.contains(b.get(b.size() - 1)))) {
           /* if(c.size() > 0){
                if(c.get(c.size() - 1).equals(a.get(i))){
                    a.remove(0);
                }
                if(c.get(c.size() - 1).equals(b.get(i))){
                    b.remove(0);
                }
            }*/
            if (a.get(i) < b.get(j) ) {
                if (!c.contains(a.get(i))) {
                    c.add(a.get(i));
                }
                i++;
                continue;
                // if(c.size() == 0){

                //}
            } else {
                if (!c.contains(b.get(j))) {
                    c.add(b.get(j));
                }
                j++;
                // if(c.size() == 0){

                // }
            }
            if(i == a.size() -1){
                c.add(a.get(i));
            }


        }
        System.out.println(c);


    }
}
