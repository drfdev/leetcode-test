package dev.drf.leetcode.transform.array.by.parity;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/transform-array-by-parity/
 */
public class TransformArrayByParityProblem implements Problem {
    public int[] transformArray(int[] nums) {
        int[] res = new int[nums.length];

        int evenIndex = 0;
        int oddIndex = nums.length - 1;

        for (int num : nums) {
            if (num % 2 == 0) {
                // even
                res[evenIndex] = 0;
                evenIndex++;
            } else {
                // odd
                res[oddIndex] = 1;
                oddIndex--;
            }
        }

        return res;
    }
}
