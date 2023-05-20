package dev.drf.leetcode.find.pivot.index;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/find-pivot-index/
 * Same problem:
 * https://leetcode.com/problems/find-the-middle-index-in-array/
 * Used solution:
 * https://leetcode.com/problems/find-pivot-index/solutions/2470014/very-easy-100-fully-explained-java-c-python-js-python3/
 */
public class FindPivotIndexProblem implements Problem {
    public int pivotIndex(int[] nums) {
        if (nums == null) {
            return -1;
        }

        if (nums.length == 1) {
            return 0;
        }

        int totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }

        int leftSum = 0;
        for (int i = 0; i < nums.length; i++) {
            int value = nums[i];

            if (leftSum * 2 == totalSum - value) {
                return i;
            }

            leftSum += value;
        }


        return -1;
    }
}
