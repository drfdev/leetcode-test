package dev.drf.leetcode.max.number.of.k.sum.pairs;

import dev.drf.leetcode.Problem;

import java.util.HashMap;

/**
 * https://leetcode.com/problems/max-number-of-k-sum-pairs/
 */
public class MaxNumberOfKSumPairsProblem implements Problem {
    public int maxOperations(int[] nums, int k) {
        if (nums == null || nums.length < 2) {
            return 0;
        }

        int result = 0;
        HashMap<Integer, Counter> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int value = nums[i];
            int target = k - value;

            if (map.containsKey(target)) {
                result++;

                Counter counter = map.get(target);
                counter.count--;

                if (counter.count == 0) {
                    map.remove(target);
                }
            } else {
                Counter counter = map.get(value);
                if (counter == null) {
                    counter = new Counter();
                    map.put(value, counter);
                }
                counter.count++;
            }
        }

        return result;
    }

    private static class Counter {
        private int count = 0;
    }
}
