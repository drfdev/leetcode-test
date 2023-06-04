package dev.drf.leetcode.house.robber;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/house-robber/
 */
public class HouseRobberProblem implements Problem {
    public int rob(int[] nums) {
        if (nums == null) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }

        int sum = 0;
        int previous = 0;

        for (int num : nums) {
            int temp = sum;
            sum = Math.max(previous + num, sum);
            previous = temp;
        }

        return sum;
    }
}
