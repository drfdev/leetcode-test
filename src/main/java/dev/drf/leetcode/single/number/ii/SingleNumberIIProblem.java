package dev.drf.leetcode.single.number.ii;

import dev.drf.leetcode.Problem;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/single-number-ii/
 */
public class SingleNumberIIProblem implements Problem {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);

        int val = nums[0];
        int count = 1;

        for (int i = 1; i < nums.length; i++) {
            int cur = nums[i];
            if (cur == val) {
                count++;
            } else {
                if (count == 1) {
                    return val;
                }
                val = cur;
                count = 1;
            }
        }

        return val;
    }
}
