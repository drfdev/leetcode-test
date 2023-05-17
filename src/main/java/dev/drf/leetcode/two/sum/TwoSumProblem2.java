package dev.drf.leetcode.two.sum;

import dev.drf.leetcode.Problem;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/two-sum/
 */
public class TwoSumProblem2 implements Problem {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int value = nums[i];
            int expected = target - value;
            if (map.containsKey(expected)) {
                return new int[] {map.get(expected), i};
            }
            map.put(value, i);
        }

        return null;
    }
}
