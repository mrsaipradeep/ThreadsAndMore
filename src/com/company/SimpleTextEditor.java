package com.company;

import java.util.Scanner;
import java.util.Stack;

public class SimpleTextEditor {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Stack<String> simpleEditorStack = new Stack<>();
        int noOfOperations = Integer.valueOf(scanner.nextLine());
        String str = "";
        for (int i = 0; i < noOfOperations; i++) {
            String[] input = scanner.nextLine().split(" ");
            String operation = input[0];
            String content = input.length > 1 ? input[1] : "";
            switch (operation) {
                case "1":
                    str += (content);
                    simpleEditorStack.push(str.toLowerCase());
                    break;
                case "2":
                    simpleEditorStack.push(str.toLowerCase());
                    str = str.substring(0 , simpleEditorStack.lastElement().length() - Integer.valueOf(content));
                    break;
                case "3":
                    System.out.println(simpleEditorStack.lastElement().charAt(Integer.valueOf(content)-1));
                    //System.out.println(str.charAt(Integer.valueOf(content)-1));
                    break;
                default:
                    if(!simpleEditorStack.isEmpty()){
                        str = simpleEditorStack.lastElement();
                        simpleEditorStack.pop();
                    }
                    break;
            }

        }
    }

}
