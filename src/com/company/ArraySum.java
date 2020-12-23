package com.company;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ArraySum {

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        int sum = 8;
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if(!set.contains(arr[i])){
                set.add((sum - arr[i]));
                set.add(arr[i]);
                System.out.println((sum - arr[i]) +" - " +  arr[i]);
            }else {
                break;
            }


        }
    }
}
