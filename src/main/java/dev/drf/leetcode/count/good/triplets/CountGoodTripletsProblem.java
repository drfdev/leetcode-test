package dev.drf.leetcode.count.good.triplets;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/count-good-triplets/
 */
public class CountGoodTripletsProblem implements Problem {
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        /*
        0 <= i < j < k < arr.length
        |arr[i] - arr[j]| <= a
        |arr[j] - arr[k]| <= b
        |arr[i] - arr[k]| <= c
         */
        final int len = arr.length;
        int count = 0;
        for (int i = 0; i < len; i++) {
            for (int j = (i + 1); j < len; j++) {
                boolean condition1 = Math.abs(arr[i] - arr[j]) <= a;
                if (condition1) {
                    for (int k = (j + 1); k < len; k++) {
                        boolean condition2 = Math.abs(arr[j] - arr[k]) <= b;
                        boolean condition3 = Math.abs(arr[i] - arr[k]) <= c;

                        if (condition2 && condition3) {
                            count++;
                        }
                    }
                }
            }
        }
        return count;
    }
}
