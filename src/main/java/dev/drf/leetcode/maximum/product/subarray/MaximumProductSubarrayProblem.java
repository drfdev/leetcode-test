package dev.drf.leetcode.maximum.product.subarray;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/maximum-product-subarray/
 * Used solution:
 * https://www.youtube.com/watch?v=lXVy6YWFcRM
 */
public class MaximumProductSubarrayProblem implements Problem {
    public int maxProduct(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }

        int res = nums[0];
        int max = 1;
        int min = 1;

        for (int n : nums) {
            int tmp = max * n;
            max = Math.max(n, Math.max(tmp, min * n));
            min = Math.min(n, Math.min(tmp, min * n));
            res = Math.max(res, max);
        }
        return res;
    }
}
