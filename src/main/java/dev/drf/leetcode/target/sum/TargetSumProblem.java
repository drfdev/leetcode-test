package dev.drf.leetcode.target.sum;

import dev.drf.leetcode.Problem;

import java.util.HashMap;

/**
 * https://leetcode.com/problems/target-sum/
 * Used solution:
 * https://www.youtube.com/watch?v=g0npyaQtAQM
 */
public class TargetSumProblem implements Problem {
    public int findTargetSumWays(int[] nums, int target) {
        HashMap<String, Integer> dp = new HashMap<>();
        return calculate(dp, nums, 0, 0, target);
    }

    private int calculate(HashMap<String, Integer> dp, int[] nums,
                          int i, int sum, int target) {
        String key = i + "," + sum;

        if (i == nums.length) {
            return (sum == target) ? 1 : 0;
        }
        if (dp.containsKey(key)) {
            return dp.get(key);
        }

        int res = calculate(dp, nums, i + 1, sum + nums[i], target)
                + calculate(dp, nums, i + 1, sum - nums[i], target);
        dp.put(key, res);
        return res;
    }
}
