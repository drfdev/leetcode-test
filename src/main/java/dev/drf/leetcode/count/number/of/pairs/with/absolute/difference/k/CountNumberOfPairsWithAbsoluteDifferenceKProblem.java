package dev.drf.leetcode.count.number.of.pairs.with.absolute.difference.k;

import dev.drf.leetcode.Problem;

import java.util.HashMap;

/**
 * https://leetcode.com/problems/count-number-of-pairs-with-absolute-difference-k/
 */
public class CountNumberOfPairsWithAbsoluteDifferenceKProblem implements Problem {
    public int countKDifference(int[] nums, int k) {
        int sum = 0;

        HashMap<Integer, Integer> map = new HashMap<>(nums.length);
        for (int num : nums) {
            int left = num - k;
            int right = num + k;
            sum += map.getOrDefault(left, 0);
            sum += map.getOrDefault(right, 0);

            map.compute(num, (key, val) -> val == null ? 1 : val + 1);
        }

        return sum;
    }
}
