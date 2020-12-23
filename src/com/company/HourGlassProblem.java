package com.company;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class HourGlassProblem {

    // Complete the hourglassSum function below.
    private static int hourglassSum(int[][] arr) {
        if (arr.length > 6 || arr[0].length > 6) {
            throw new RuntimeException("Wrong input");
        }
        int rows = arr.length - 2;
        int col = arr[0].length - 2;
        int maxSum = Integer.MIN_VALUE;
        int i = 0;
        for (int k = 0; k < rows; k++) {
            int j = 0;
            for (int q = 0; q < col; q++) {
                if (arr[i][j] >= -9 && arr[i][j] <= 9) {
                    int sum = findSum(arr, i, j, q + 1);
                    if (sum > maxSum) {
                        maxSum = sum;
                    }
                    j++;
                }
            }
            i++;
        }
        return maxSum;
    }

    private static int findSum(int[][] arr, int i, int j, int col) {
        return arr[i][j] + arr[i][j + 1] + arr[i][j + 2] + arr[i + 1][col] + arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2];
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int result = hourglassSum(arr);
        System.out.println(result);
        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
