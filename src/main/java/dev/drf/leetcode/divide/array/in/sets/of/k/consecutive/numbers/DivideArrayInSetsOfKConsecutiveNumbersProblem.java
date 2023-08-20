package dev.drf.leetcode.divide.array.in.sets.of.k.consecutive.numbers;

import dev.drf.leetcode.Problem;

import java.util.Arrays;
import java.util.HashMap;

/**
 * https://leetcode.com/problems/divide-array-in-sets-of-k-consecutive-numbers/
 * same as:
 * https://leetcode.com/problems/hand-of-straights/
 */
public class DivideArrayInSetsOfKConsecutiveNumbersProblem implements Problem {
    public boolean isPossibleDivide(int[] nums, int k) {
        if (nums == null
                || nums.length % k != 0) {
            return false;
        }

        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int card : nums) {
            hm.put(card, hm.getOrDefault(card, 0) + 1);
        }

        Arrays.sort(nums);
        for (int card : nums) {
            if (hm.get(card) <= 0) {
                continue;
            }
            for (int i = 1; i < k; i++) {
                int count = hm.getOrDefault(card + i, 0);
                if (count > 0) {
                    hm.put(card + i, count - 1);
                } else {
                    return false;
                }
            }
            hm.put(card, hm.get(card) - 1);
        }

        return true;
    }
}
