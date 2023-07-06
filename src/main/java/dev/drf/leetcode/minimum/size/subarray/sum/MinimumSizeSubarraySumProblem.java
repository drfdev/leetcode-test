package dev.drf.leetcode.minimum.size.subarray.sum;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/minimum-size-subarray-sum/
 */
public class MinimumSizeSubarraySumProblem implements Problem {
    public int minSubArrayLen(int target, int[] nums) {
        final int size = nums.length;

        if (size == 1) {
            int val0 = nums[0];
            return val0 >= target ? val0 : 0;
        }

        int leftIndex = 0;
        int rightIndex = 0;
        int sum = nums[0];

        int min = Integer.MAX_VALUE;

        while (leftIndex < size && rightIndex < size) {
            if (sum >= target) {
                min = Math.min(min, rightIndex - leftIndex + 1);

                leftIndex++;
                if (leftIndex >= size) {
                    break;
                }
                sum = sum - nums[leftIndex - 1];
                if (leftIndex > rightIndex) {
                    rightIndex++;
                    sum = sum + nums[rightIndex];
                }
            } else {
                rightIndex++;
                if (rightIndex >= size) {
                    rightIndex = size - 1;
                    leftIndex++;
                    sum = sum - nums[leftIndex - 1];
                } else {
                    sum = sum + nums[rightIndex];
                }
            }
        }

        if (min == Integer.MAX_VALUE) {
            return 0;
        }

        return min;
    }
}
