package dev.drf.leetcode.compute.alternating.sum;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/compute-alternating-sum/
 */
public class ComputeAlternatingSumProblem implements Problem {
    public int alternatingSum(int[] nums) {
        boolean even = true;
        int sum = 0;
        for (int num : nums) {
            if (even) {
                sum += num;
            } else {
                sum -= num;
            }
            even = !even;
        }
        return sum;
    }
}
