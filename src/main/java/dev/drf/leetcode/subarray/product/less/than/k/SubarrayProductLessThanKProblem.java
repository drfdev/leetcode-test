package dev.drf.leetcode.subarray.product.less.than.k;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/subarray-product-less-than-k/
 * Used solution:
 * https://leetcode.com/problems/subarray-product-less-than-k/solutions/108861/java-c-clean-code-with-explanation/
 */
public class SubarrayProductLessThanKProblem implements Problem {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k == 0) {
            return 0;
        }
        int count = 0;
        int product = 1;
        for (int i = 0, j = 0; j < nums.length; j++) {
            product *= nums[j];
            while (i <= j && product >= k) {
                product /= nums[i++];
            }
            count += j - i + 1;
        }
        return count;
    }
}
