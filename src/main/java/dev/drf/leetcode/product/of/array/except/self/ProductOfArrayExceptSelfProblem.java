package dev.drf.leetcode.product.of.array.except.self;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/product-of-array-except-self/
 */
public class ProductOfArrayExceptSelfProblem implements Problem {
    public int[] productExceptSelf(int[] nums) {
        if (nums == null) {
            return null;
        }

        int[] result = new int[nums.length];
        int multiply = 1;
        int zeroCount = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zeroCount++;
            } else {
                multiply = multiply * nums[i];
            }
        }

        for (int i = 0; i < result.length; i++) {
            if (nums[i] == 0) {
                result[i] = zeroCount == 1 ? multiply : 0;
            } else {
                result[i] = zeroCount > 0 ? 0 : multiply / nums[i];
            }
        }

        return result;
    }
}
