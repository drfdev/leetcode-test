package dev.drf.leetcode.contains.duplicate;

import dev.drf.leetcode.Problem;

import java.util.HashSet;
import java.util.Set;

/**
 * https://leetcode.com/problems/contains-duplicate/
 */
public class ContainsDuplicateProblem implements Problem {
    public boolean containsDuplicate(int[] nums) {
        if (nums == null) {
            return false;
        }

        Set<Integer> duplicateChecker = new HashSet<>(nums.length);

        for (int num : nums) {
            if (!duplicateChecker.add(num)) {
                return true;
            }
        }

        return false;
    }
}
