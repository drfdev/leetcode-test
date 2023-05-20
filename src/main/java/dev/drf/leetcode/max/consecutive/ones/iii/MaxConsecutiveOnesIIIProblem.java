package dev.drf.leetcode.max.consecutive.ones.iii;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/max-consecutive-ones-iii/
 * Used solution:
 * https://leetcode.com/problems/max-consecutive-ones-iii/solutions/247564/java-c-python-sliding-window/
 */
public class MaxConsecutiveOnesIIIProblem implements Problem {
    public int longestOnes(int[] nums, int k) {
        if (nums == null) {
            return 0;
        }

        int leftIndex = 0;
        int rightIndex = 0;

        int max = 0;
        int zeroCount = 0;

        for (rightIndex = 0; rightIndex < nums.length; rightIndex++) {
            if (nums[rightIndex] == 0) {
                zeroCount++;
            }

            if (zeroCount > k) {
                if (nums[leftIndex] == 0) {
                    zeroCount--;
                }
                leftIndex++;
            }
            if (zeroCount <= k) {
                max = Math.max(max, rightIndex - leftIndex + 1);
            }
        }

        return max;
    }
}
