package com.company;

public class FirstNegativeSubArray {

    private static void printFirstNegativeSubArray(int[] arr, int k) {
        int firstNegativeNumber = 0;
        int j = 0;
        while (k <= arr.length) {
            for (int q = j; q < k; q++) {
                if (arr[q] < 0) {
                    firstNegativeNumber = arr[q];
                    break;
                }
            }
            System.out.println(firstNegativeNumber);
            firstNegativeNumber = 0;
            k++;
            j++;
        }
    }

    public static void main(String[] args) {
        // -1,2,3,7,-4,3,-8,0,1

        printFirstNegativeSubArray(new int[]{-1, 2, 3, 7, -4, 3, -8, 0, 1}, 3);
    }
}
