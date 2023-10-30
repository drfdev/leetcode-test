package dev.drf.leetcode.subarray.sum.equals.k;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/subarray-sum-equals-k/
 * Used solution:
 * https://leetcode.com/problems/subarray-sum-equals-k/solutions/803317/java-solution-with-detailed-explanation/
 */
public class SubarraySumEqualsKProblem implements Problem {
    public int subarraySum(int[] nums, int k) {
        if (nums == null) {
            return 0;
        }

        final int size = nums.length;
        final int sumSize = size + 1;
        int[] sum = new int[sumSize];
        sum[0] = 0;
        for (int i = 1; i <= size; i++) {
            sum[i] = sum[i - 1] + nums[i - 1];
        }

        int count = 0;
        for (int start = 0; start < sumSize; start++) {
            for (int end = start + 1; end < sumSize; end++) {
                if (sum[end] - sum[start] == k) {
                    count++;
                }
            }
        }

        return count;
    }
}
