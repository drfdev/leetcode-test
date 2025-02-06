package dev.drf.leetcode.the.two.sneaky.numbers.of.digitville;

import dev.drf.leetcode.Problem;

import java.util.HashSet;

/**
 * https://leetcode.com/problems/the-two-sneaky-numbers-of-digitville/
 */
public class TheTwoSneakyNumbersOfDigitvilleProblem implements Problem {
    public int[] getSneakyNumbers(int[] nums) {
        final int[] result = new int[2];
        int resIndex = 0;

        var map = new HashSet<Integer>();
        for (int num : nums) {
            var added = map.add(num);
            if (!added) {
                result[resIndex] = num;
                resIndex++;
            }
        }

        return result;
    }
}
