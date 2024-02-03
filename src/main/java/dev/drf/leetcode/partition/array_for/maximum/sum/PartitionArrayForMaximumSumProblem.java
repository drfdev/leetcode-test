package dev.drf.leetcode.partition.array_for.maximum.sum;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/partition-array-for-maximum-sum/
 * Used solution:
 * https://leetcode.com/problems/partition-array-for-maximum-sum/solutions/4668560/beats-99-users-c-java-python-javascript-explained/
 */
public class PartitionArrayForMaximumSumProblem implements Problem {
    public int maxSumAfterPartitioning(int[] arr, int k) {
        final int size = arr.length;
        final int k1 = k + 1;

        int[] dp = new int[k1];

        for (int start = size - 1; start >= 0; start--) {
            int currMax = 0;
            int end = Math.min(size, start + k);

            for (int i = start; i < end; i++) {
                currMax = Math.max(currMax, arr[i]);
                dp[start % k1] = Math.max(
                        dp[start % k1],
                        dp[(i + 1) % k1] + currMax * (i - start + 1)
                );
            }
        }
        return dp[0];
    }
}
