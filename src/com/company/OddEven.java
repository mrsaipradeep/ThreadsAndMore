package com.company;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class OddEven {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        Map<String, List<Integer>> map = new HashMap<>();
        map.put("Odd", new ArrayList<>());
        map.put("Even", new ArrayList<>());
        while (scanner.hasNext()) {
            String s = scanner.next();
            if(s.equals("exit")){
                break;
            }
            int i = Integer.parseInt(s);
            if(i % 2 == 0){
                map.get("Even").add(i);
            } else {
                map.get("Odd").add(i);
            }
        }
        map.entrySet().stream().filter(stringListEntry -> stringListEntry.getKey().equals("Odd")).map(Map.Entry::getValue).forEach(System.out::println);
        map.entrySet().stream().filter(stringListEntry -> stringListEntry.getKey().equals("Even")).map(Map.Entry::getValue).forEach(System.out::println);
    }
}
