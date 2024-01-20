package dev.drf.leetcode.sum.of.subarray.minimums;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/sum-of-subarray-minimums/
 */
@Deprecated
public class SumOfSubarrayMinimumsProblem implements Problem {
    public int sumSubarrayMins(int[] arr) {
        if (arr == null) {
            return 0;
        }

        if (arr.length == 1) {
            return arr[0];
        }

        final int mod = 1000000007;
        final int len = arr.length;
        int sum = 0;

        for (int sub = 0; sub < len; sub++) {
            int min = Integer.MAX_VALUE;
            for (int i = sub; i < len; i++) {
                min = Math.min(min, arr[i]);
                sum += (min % mod);
                sum %= mod;
            }
        }

        return sum;
    }
}
