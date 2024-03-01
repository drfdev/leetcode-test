package dev.drf.leetcode.minimum.sum.of.four.digit.number.after.splitting.digits;

import dev.drf.leetcode.Problem;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/minimum-sum-of-four-digit-number-after-splitting-digits/
 */
public class MinimumSumOfFourDigitNumberAfterSplittingDigitsProblem implements Problem {
    public int minimumSum(int num) {
        // 1000 <= num <= 9999
        int[] digits = new int[4];
        digits[0] = num % 10;
        num = num / 10;
        digits[1] = num % 10;
        num = num / 10;
        digits[2] = num % 10;
        num = num / 10;
        digits[3] = num % 10;

        Arrays.sort(digits);

        int val1 = digits[0] * 10 + digits[2];
        int val2 = digits[1] * 10 + digits[3];

        return val1 + val2;
    }
}
