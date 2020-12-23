package com.company;

public class DynamicSlidingWindowSample {

    //smallest subarray within given sum
    private static int smallestSubArray(int[] arr, int targetSum) {

        int windowStart = 0;
        int currentRunningSum = 0;
        int smallestSubArraySize = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            currentRunningSum += arr[i];
            System.out.println("in for " + i);
            while (currentRunningSum >= targetSum) {
                System.out.println("in while " +i +" currentRunningSum >> "+ currentRunningSum);
                smallestSubArraySize = Math.min(currentRunningSum, i - windowStart + 1);
                System.out.println(smallestSubArraySize);
                currentRunningSum -= arr[windowStart];
                windowStart++;
            }
        }

        return smallestSubArraySize;
    }


    public static void main(String[] args) {
        int[] ints = {4, 2, 1, 7, 8, 1, 2, 8, 1, 0};
        int targetSum = 5;
        System.out.println(smallestSubArray(ints, targetSum));
    }
}
