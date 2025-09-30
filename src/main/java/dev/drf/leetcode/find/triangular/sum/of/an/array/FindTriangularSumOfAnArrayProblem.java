package dev.drf.leetcode.find.triangular.sum.of.an.array;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/find-triangular-sum-of-an-array/
 */
public class FindTriangularSumOfAnArrayProblem implements Problem {
    public int triangularSum(int[] nums) {
        final int len = nums.length;

        for (int i = 0; i < len; i++) {
            for (int k = 0; k < (len - i - 1); k++) {
                nums[k] = (nums[k] + nums[k + 1]) % 10;
            }
        }

        return nums[0];
    }
}
