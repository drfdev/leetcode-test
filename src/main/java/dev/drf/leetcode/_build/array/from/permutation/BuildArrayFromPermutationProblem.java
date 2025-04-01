package dev.drf.leetcode._build.array.from.permutation;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/build-array-from-permutation
 */
public class BuildArrayFromPermutationProblem implements Problem {
    public int[] buildArray(int[] nums) {
        int[] res = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            res[i] = nums[nums[i]];
        }

        return res;
    }
}
