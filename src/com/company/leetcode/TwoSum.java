package com.company.leetcode;

import java.util.Arrays;

public class TwoSum {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{2, 7, 11, 15}, 9)));
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        int count = -1;
        while (nums.length > count){
            int a = nums[++count];
            int b = nums[++count];
            if(a + b == target){
                result[0] = a;
                result[1] = b;
                break;
            }

        }
        return result;
    }
}
