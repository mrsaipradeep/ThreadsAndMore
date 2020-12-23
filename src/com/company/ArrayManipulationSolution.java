package com.company;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayManipulationSolution {
    // Complete the arrayManipulation function below.
    private static long arrayManipulation(int n, int[][] queries) {

        long[] arr = new long[n+1];
        for (int[] query : queries) {
            int j = 0;
            int a = query[j];
            int b = query[j + 1];
            int k = query[j + 2];
            System.out.println(a + "--" + b + "--" + k);
            add(arr, a, b, k);
        }
        long max = arr[0];
        long x = arr[0];
        System.out.println(Arrays.toString(arr));
        for (long anArr : arr) {
            x += anArr;
            if (max < x)
                max = x;
        }

        return max;
    }

    private static void add(long[] arr, int a, int b, int k) {
        arr[a] = arr[a] + k;
        if (b + 1 < arr.length)
            arr[b + 1] = arr[b + 1] - k;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nm = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nm[0]);

        int m = Integer.parseInt(nm[1]);

        int[][] queries = new int[m][3];

        for (int i = 0; i < m; i++) {
            String[] queriesRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 3; j++) {
                int queriesItem = Integer.parseInt(queriesRowItems[j]);
                queries[i][j] = queriesItem;
            }
        }

        long result = arrayManipulation(n, queries);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();


        bufferedWriter.close();

        scanner.close();
    }
}
