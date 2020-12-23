package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class NetworkProblem {

    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
        BufferedReader in = new BufferedReader(reader);
        String line;
        Set<String> visited = new HashSet<>();
        TreeMap<String,List<Integer>> networkMap = new TreeMap<>();
        int count = 0;
        while ((line = in.readLine()) != null) {
            //System.out.println(line);
            if(line.equals("")){
                break;
            }
            String[] split = line.split(" ");
            if(count == 0){
                visited.add(split[0]);
                networkMap.put(split[0], new ArrayList<>());
            } else{
                String root = "";
                for (int i = 0; i < split.length; i++) {
                    if(i == 0 && !visited.contains(split[i])){
                        networkMap.put(split[i], new ArrayList<>());
                        root = split[i];
                        visited.add(split[i]);
                    } else {
                        if(!visited.contains(split[i])){
                            visited.add(split[i]);
                            networkMap.get(root).add(Integer.parseInt(split[i]));
                        }

                    }

                }
            }
            count++;

        }
        //networkMap.forEach((key, value) -> System.out.println(key + " " + value.stream().sorted(Comparator.reverseOrder()).collect(Collectors.joining(" "))));
    }

}
