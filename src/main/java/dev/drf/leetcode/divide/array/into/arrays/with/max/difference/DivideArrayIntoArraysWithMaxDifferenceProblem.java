package dev.drf.leetcode.divide.array.into.arrays.with.max.difference;

import dev.drf.leetcode.Problem;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/divide-array-into-arrays-with-max-difference/
 */
public class DivideArrayIntoArraysWithMaxDifferenceProblem implements Problem {
    public int[][] divideArray(int[] nums, int k) {
        final int size = nums.length;

        if (size % 3 != 0) {
            return new int[0][0];
        }

        Arrays.sort(nums);

        final int blockCount = size / 3;
        int[][] result = new int[blockCount][3];

        for (int i = 0; i < blockCount; i++) {
            int leftIndex = i * 3;
            int middleIndex = i * 3 + 1;
            int rightIndex = i * 3 + 2;

            int left = nums[leftIndex];
            int middle = nums[middleIndex];
            int right = nums[rightIndex];

            int lmDiff = Math.abs(left - middle);
            int lrDiff = Math.abs(left - right);
            int rmDiff = Math.abs(right - middle);

            if (lmDiff <= k && lrDiff <= k && rmDiff <= k) {
                result[i] = new int[] {
                        left, middle, right
                };
            } else {
                return new int[0][0];
            }
        }

        return result;
    }
}
