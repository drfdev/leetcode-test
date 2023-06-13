package dev.drf.leetcode.find.the.duplicate.number;

import dev.drf.leetcode.Problem;

import java.util.HashSet;

/**
 * https://leetcode.com/problems/find-the-duplicate-number/
 */
public class FindTheDuplicateNumberProblem implements Problem {
    public int findDuplicate(int[] nums) {
        // You must solve the problem without modifying the array nums
        // and uses only constant extra space.
        if (nums == null) {
            return 0;
        }
        if (nums.length < 2) {
            return 0;
        }

        HashSet<Integer> values = new HashSet<>(nums.length);

        for (int num : nums) {
            boolean added = values.add(num);
            if (!added) {
                return num;
            }
        }

        return -1;
    }
}
