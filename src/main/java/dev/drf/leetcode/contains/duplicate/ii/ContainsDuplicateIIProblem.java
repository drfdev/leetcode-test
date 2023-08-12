package dev.drf.leetcode.contains.duplicate.ii;

import dev.drf.leetcode.Problem;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/contains-duplicate-ii/
 */
public class ContainsDuplicateIIProblem implements Problem {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if (nums == null) {
            return false;
        }

        Map<Integer, Integer> lastIndex = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int value = nums[i];
            Integer index = lastIndex.get(value);

            if (index != null) {
                int diff = Math.abs(i - index);
                if (diff <= k) {
                    return true;
                }
            }

            lastIndex.put(value, i);
        }

        return false;
    }
}
