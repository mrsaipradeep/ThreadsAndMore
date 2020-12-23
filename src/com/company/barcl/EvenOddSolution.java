package com.company.barcl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

public class EvenOddSolution {
    static  Map<String, Integer> map = new HashMap<>();
    static Consumer<String> print = s -> System.out.println(s + map.get(s));
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
        BufferedReader in = new BufferedReader(reader);
        String line;

        while ((line = in.readLine()) != null) {
            Thread t1 = new Thread(new Thread1());
            Thread t2 = new Thread(new Thread2());
            int num;
            try{
                num = Integer.parseInt(line);
            }catch (NumberFormatException e){
                break;
            }

            boolean isOdd;
            if(num % 2 == 0){
                map.put("even:", num);
                isOdd = false;
            } else {
                map.put("odd:", num);
                isOdd = true;
            }

            if(isOdd){
                t1.start();
               // print.accept("odd:");
            } else  {
                t2.start();
                //print.accept("even:");
            }

        }
    }

    static class Thread1 implements Runnable {

        @Override
        public void run() {
            print.accept("odd:");
        }
    }

    static class Thread2 implements Runnable {

        @Override
        public void run() {
            print.accept("even:");
        }
    }
}
