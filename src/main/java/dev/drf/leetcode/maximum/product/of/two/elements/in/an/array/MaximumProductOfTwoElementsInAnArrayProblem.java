package dev.drf.leetcode.maximum.product.of.two.elements.in.an.array;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/maximum-product-of-two-elements-in-an-array/
 */
public class MaximumProductOfTwoElementsInAnArrayProblem implements Problem {
    public int maxProduct(int[] nums) {
        int max1 = Math.max(nums[0], nums[1]);
        int max2 = Math.min(nums[0], nums[1]);

        for (int i = 2; i < nums.length; i++) {
            int val = nums[i];
            if (val > max1) {
                max2 = max1;
                max1 = val;
            } else if (val > max2) {
                max2 = val;
            }
        }

        return (max1 - 1) * (max2 - 1);
    }
}
