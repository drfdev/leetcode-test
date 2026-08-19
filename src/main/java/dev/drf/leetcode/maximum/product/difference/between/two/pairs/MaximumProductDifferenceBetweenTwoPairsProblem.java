package dev.drf.leetcode.maximum.product.difference.between.two.pairs;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/maximum-product-difference-between-two-pairs/
 */
public class MaximumProductDifferenceBetweenTwoPairsProblem implements Problem {
    public int maxProductDifference(int[] nums) {
        long min = Integer.MAX_VALUE;
        long min2 = Integer.MAX_VALUE;

        long max = -1;
        long max2 = -1;

        for (int num : nums) {
            if (num > max) {
                max2 = max;
                max = num;
            } else if (num > max2) {
                max2 = num;
            }

            if (num < min) {
                min2 = min;
                min = num;
            } else if (num < min2) {
                min2 = num;
            }
        }

        return (int) ((max * max2) - (min * min2));
    }

}
