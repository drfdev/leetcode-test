package dev.drf.leetcode.squares.of.a.sorted.array;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/squares-of-a-sorted-array/
 */
public class SquaresOfASortedArrayProblem implements Problem {
    public int[] sortedSquares(int[] nums) {
        final int size = nums.length;
        int[] result = new int[size];

        int leftIndex = -1;
        int rightIndex = -1;

        int minIndex = 0;
        int prev = Math.abs(nums[0]);

        for (int i = 1; i < size; i++) {
            int current = Math.abs(nums[i]);
            if (current <= prev) {
                minIndex = i;
                prev = current;
            } else {
                break;
            }
        }

        result[0] = prev * prev;

        leftIndex = minIndex - 1;
        rightIndex = minIndex + 1;

        for (int i = 1; i < size; ) {
            int leftValue = Integer.MIN_VALUE;
            int rightValue = Integer.MIN_VALUE;

            if (leftIndex >= 0) {
                leftValue = Math.abs(nums[leftIndex]);
            }
            if (rightIndex < size) {
                rightValue = Math.abs(nums[rightIndex]);
            }

            if (leftValue != Integer.MIN_VALUE && rightValue != Integer.MIN_VALUE) {
                if (leftValue < rightValue) {
                    result[i++] = leftValue * leftValue;
                    leftIndex--;
                } else {
                    result[i++] = rightValue * rightValue;
                    rightIndex++;
                }
            } else if (leftValue != Integer.MIN_VALUE) {
                result[i++] = leftValue * leftValue;
                leftIndex--;
            } else if (rightValue != Integer.MIN_VALUE) {
                result[i++] = rightValue * rightValue;
                rightIndex++;
            }
        }

        return result;
    }
}
