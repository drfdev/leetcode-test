package dev.drf.leetcode.minimum.element.after.replacement.with.digit.sum;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/minimum-element-after-replacement-with-digit-sum/
 */
public class MinimumElementAfterReplacementWithDigitSumProblem implements Problem {
    public int minElement(int[] nums) {
        int min = Integer.MAX_VALUE;

        for (int num : nums) {
            int sum = sumOfDigits(num);
            if (min > sum) {
                min = sum;
                if (min == 1) {
                    return 1;
                }
            }
        }

        return min;
    }

    private int sumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num = num / 10;
        }
        return sum;
    }
}
