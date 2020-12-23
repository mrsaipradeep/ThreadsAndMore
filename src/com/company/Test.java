package com.company;

import java.text.NumberFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;
import java.util.Stack;
import java.util.regex.Pattern;

public class Test {

    /*public static void main(String[] args) {
//        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//        System.out.println(integers.subList(-5,10));
        Calendar instance = Calendar.getInstance();
        instance.set(Calendar.DATE, 3);
        instance.set(Calendar.MONTH, 3);
        instance.set(Calendar.YEAR, 2019);

        System.out.println(instance.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.getDefault()));

        NumberFormat usCurrencyInstance = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat chCurrencyInstance = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat frCurrencyInstance = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        NumberFormat inCurrencyInstance = NumberFormat.getCurrencyInstance(new Locale("en","IN"));
        System.out.println(usCurrencyInstance.format(12345));
        System.out.println(chCurrencyInstance.format(12345));
        System.out.println(frCurrencyInstance.format(12345));
        System.out.println(inCurrencyInstance.format(12345));


        String a = "java";
        String b = "java";
        if(a.compareTo(b) <= 0){
            System.out.println("No");
        }else {
            System.out.println("Yes");
        }
        System.out.println(capitalize(a) + " " + capitalize(b));

        System.out.println(a.length() + b.length());


        String s = "HelloWorld";
        int start = 3;
        int end = 7;

        if((start >= 1 && start <= 100) &&  (end >= 1 && end <= 100) && Pattern.matches("^[a-zA-z]*",s)){
            System.out.println(s.substring(start,end));
        }


    }*/

    public static void main(String[] args) {
        Stack<String> s = new Stack<>();
        s.push("1");
        s.push("2");
        s.push("3");
        s.push("4");
        System.out.println(s.firstElement());
        System.out.println(s.lastElement());
    }

    private static String capitalize(String str) {
        if(str.length() > 1){
            return str.substring(0,1).toUpperCase() + str.substring(1).toLowerCase();
        }else{
            return str;
        }
    }
}
