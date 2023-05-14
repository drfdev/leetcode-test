package dev.drf.leetcode.plus.one;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/plus-one/
 */
public class PlusOneProblem implements Problem {
    public int[] plusOne(int[] digits) {
        if (digits == null) {
            return null;
        }

        int[] result = new int[digits.length];
        int index = digits.length - 1;
        int aboveTen = 1;

        while (index >= 0) {
            int value = digits[index] + aboveTen;
            aboveTen = value / 10;
            result[index] = value % 10;

            index--;
        }

        if (aboveTen > 0) {
            int[] resultBigger = new int[result.length + 1];
            System.arraycopy(result, 0, resultBigger, 1, result.length);
            resultBigger[0] = aboveTen;
            result = resultBigger;
        }

        return result;
    }
}
