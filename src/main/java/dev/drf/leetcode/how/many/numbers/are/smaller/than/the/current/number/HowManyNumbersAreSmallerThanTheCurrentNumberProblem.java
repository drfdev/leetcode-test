package dev.drf.leetcode.how.many.numbers.are.smaller.than.the.current.number;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/
 * used solution:
 * https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/solutions/524996/java-beats-100-o-n/
 */
public class HowManyNumbersAreSmallerThanTheCurrentNumberProblem implements Problem {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        final int size = nums.length;
        int[] result = new int[size];

        int[] counts = new int[101];

        for (int i = 0; i < nums.length; i++) {
            counts[nums[i]]++;
        }

        for (int i = 1; i <= 100; i++) {
            counts[i] += counts[i - 1];
        }

        for (int i = 0; i < size; i++) {
            if (nums[i] == 0) {
                result[i] = 0;
            } else {
                result[i] = counts[nums[i] - 1];
            }
        }

        return result;
    }
}
