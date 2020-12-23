package com.company.optum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Class1 {

    public static void main(String[] args) {
        System.out.println("test");
        List<List<Integer>> markings = new ArrayList<>();
        markings.add(Arrays.asList(11,20));
        markings.add(Arrays.asList(11,17));
        markings.add(Arrays.asList(12,16));
        System.out.println(chooseFlask(Arrays.asList(10,15), 3 , markings));
//        markings.add(Arrays.asList(3,5,7));
//        markings.add(Arrays.asList(6,8,9));
//        markings.add(Arrays.asList(3,5,6));
//        System.out.println(chooseFlask(Arrays.asList(4,6,6,7), 3 , markings));
//        markings.add(Arrays.asList(5,7,10));
//        markings.add(Arrays.asList(1,4));
//        System.out.println(chooseFlask(Arrays.asList(4,6), 2 , markings));

    }

    private static int chooseFlask(List<Integer> requirements, int flaskTypes, List<List<Integer>> markings) {
        // Write your code here
        //requirements = requirements.parallelStream().sorted().collect(Collectors.toList());
        Map<Integer, List<Integer>> markingsMap = new HashMap<>();
//        for (int i=0; i<markings.size(); i++) {
//            markings.set(i, markings.get(i).parallelStream().sorted().collect(Collectors.toList()));
//        }
        int maxCapacity = requirements.stream().mapToInt(v-> v).max().orElse(0);
        for (int i=0; i <markings.size(); i++) {
            int inMaxCap = markings.get(i).stream().mapToInt(v-> v).max().orElse(0);
            if(inMaxCap >= maxCapacity){
                markingsMap.put(i, markings.get(i));
            }
        }

        if(markingsMap.size() == 0){
            return -1;
        }
        int index = 0;
        int minimalLoss = Integer.MAX_VALUE;
        for(int i=0; i < markingsMap.entrySet().size(); i++){
            List<Integer> v = markingsMap.get(i);
            int loss = 0;
            for(int req: requirements){
                for(int marking: v){
                    if(req <= marking ){
                        loss += marking - req;
                        break;
                    }
                }
            }
            if(loss < minimalLoss){
                minimalLoss = loss;
                index = i;
            }
        }
        return index;
    }

    private static int choose(List<Integer> requirements, int flaskTypes, List<List<Integer>> markings){
        requirements = requirements.parallelStream().sorted().collect(Collectors.toList());
        int minVal = requirements.get(0);
        int maxVal = requirements.get(requirements.size() - 1);
        for (int i=0; i<markings.size(); i++) {
            markings.set(i, markings.get(i).parallelStream().sorted().collect(Collectors.toList()));
        }
        int index = -1;
        int minimalLoss = Integer.MAX_VALUE;
        int count = 0;
        for (Integer requirement : requirements) {
            for (List<Integer> marking : markings) {
                int maxValMark = marking.get(0);
                int minValMark = marking.get(requirements.size() - 1);
                if(minVal<minValMark || maxVal>maxValMark) {
                    break;
                }
                int loss = 0;
                for (Integer mark : marking) {
                    loss += requirement - mark;
                }
                count++;
                if(loss < minimalLoss){
                    minimalLoss = loss;
                    index = count;
                }

            }
        }
        return index;
    }
}
