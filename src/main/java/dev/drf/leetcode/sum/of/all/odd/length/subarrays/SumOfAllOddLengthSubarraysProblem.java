package dev.drf.leetcode.sum.of.all.odd.length.subarrays;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/sum-of-all-odd-length-subarrays/
 * Used solution:
 * https://leetcode.com/problems/sum-of-all-odd-length-subarrays/solutions/2341230/easy-c-on-soln-faang-interview-optimized-ho4d/
 */
public class SumOfAllOddLengthSubarraysProblem implements Problem {
    public int sumOddLengthSubarrays(int[] arr) {
        final int size = arr.length;
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            /*
            Subarrays to the left = i+1
            Subarrays to the right = n-i
            We then add 1 i.e (i+1 * n-i )+1 to include the entire array as the subarray.
             */
            sum += (((size - i) * (i + 1) + 1) / 2) * arr[i];
        }

        return sum;
    }
}
