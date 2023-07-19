package dev.drf.leetcode.majority.element;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/majority-element/
 */
public class MajorityElementProblem {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);

        int max = 1;
        int count = 1;
        int prev = nums[0];
        int maxPrev = prev;

        for (int i = 1; i < nums.length; i++) {
            int val = nums[i];
            if (val == prev) {
                count++;
            } else {
                if (count > max) {
                    max = count;
                    maxPrev = prev;
                }
                count = 1;
                prev = val;
            }
        }

        if (count > max) {
            maxPrev = prev;
        }

        return maxPrev;
    }
}
