package dev.drf.leetcode.bitwise.or.of.even.numbers.in.an.array;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/bitwise-or-of-even-numbers-in-an-array/
 */
public class BitwiseOrOfEvenNumbersInAnArrayProblem implements Problem {
    public int evenNumberBitwiseORs(int[] nums) {
        int result = 0;

        for (int num : nums) {
            if (num % 2 == 0) {
                result = result | num;
            }
        }

        return result;
    }
}
