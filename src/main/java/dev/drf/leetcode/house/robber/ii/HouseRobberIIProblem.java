package dev.drf.leetcode.house.robber.ii;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/house-robber-ii/
 */
    public class HouseRobberIIProblem implements Problem {
    public int rob(int[] nums) {
        if (nums == null) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }

        final int size = nums.length;

        int attempt1 = houseRobber1(nums, 0, size - 1);
        int attempt2 = houseRobber1(nums, 1, size);

        return Math.max(attempt1, attempt2);
    }

    private int houseRobber1(int[] nums, int start, int len) {
        int sum = 0;
        int previous = 0;

        for (int i = start; i < len; i++) {
            int num = nums[i];

            int temp = sum;
            sum = Math.max(previous + num, sum);
            previous = temp;
        }

        return sum;
    }
}
