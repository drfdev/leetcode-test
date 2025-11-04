package dev.drf.leetcode.difference.between.element.sum.and.digit.sum.of.an.array;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/difference-between-element-sum-and-digit-sum-of-an-array/
 */
public class DifferenceBetweenElementSumAndDigitSumOfAnArrayProblem implements Problem {
    public int differenceOfSum(int[] nums) {
        int sum = 0;

        for (final int num : nums) {
            if (num >= 10) {
                int digitSum = 0;
                int dig = num;
                while (dig > 0) {
                    digitSum += (dig % 10);
                    dig = dig / 10;
                }

                sum += Math.abs(num - digitSum);
            }
        }

        return sum;
    }
}
