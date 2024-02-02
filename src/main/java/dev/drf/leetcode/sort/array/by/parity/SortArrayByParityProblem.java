package dev.drf.leetcode.sort.array.by.parity;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/sort-array-by-parity/
 */
public class SortArrayByParityProblem implements Problem {
    public int[] sortArrayByParity(int[] nums) {
        final int size = nums.length;

        int leftIndex = 0;
        int rightIndex = size - 1;

        while (leftIndex < rightIndex) {
            int left = nums[leftIndex];
            int right = nums[rightIndex];

            boolean leftEven = isEven(left);
            boolean rightOdd = !isEven(right);

            if (leftEven && rightOdd) {
                leftIndex++;
                rightIndex--;
            } else if (!leftEven && !rightOdd) {
                swap(nums, leftIndex, rightIndex);
                leftIndex++;
                rightIndex--;
            } else {
                if (!leftEven) {
                    rightIndex--;
                } else if (!rightOdd) {
                    leftIndex++;
                }
            }
        }

        return nums;
    }

    private boolean isEven(int value) {
        return value % 2 == 0;
    }

    private void swap(int[] values, int i, int j) {
        int temp = values[i];
        values[i] = values[j];
        values[j] = temp;
    }
}
