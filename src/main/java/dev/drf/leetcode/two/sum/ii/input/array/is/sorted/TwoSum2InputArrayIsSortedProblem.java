package dev.drf.leetcode.two.sum.ii.input.array.is.sorted;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
 */
public class TwoSum2InputArrayIsSortedProblem implements Problem {
    public int[] twoSum(int[] numbers, int target) {

        int leftIndex = 0;
        int rightIndex = numbers.length - 1;

        while (leftIndex < rightIndex) {
            int left = numbers[leftIndex];
            int right = numbers[rightIndex];

            int value = left + right;

            if (value == target) {
                break;
            }
            if (value < target) {
                leftIndex++;
            } else {
                rightIndex--;
            }
        }

        return new int[]{
                leftIndex + 1, rightIndex + 1
        };
    }
}
