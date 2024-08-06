package dev.drf.leetcode.number.of.arithmetic.triplets;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/number-of-arithmetic-triplets/
 */
public class NumberOfArithmeticTripletsProblem implements Problem {
    public int arithmeticTriplets(int[] nums, int diff) {
        final int len = nums.length;

        int count = 0;

        int index = 0;
        int next = 1;

        for (; index < len; index++) {
            int value = nums[index];

            next = index + 1;
            boolean correct = false;

            final int secondValue = value + diff;
            while (next < len) {
                value = nums[next];
                if (value > secondValue) {
                    break;
                }
                if (value == secondValue) {
                    correct = true;
                    break;
                }

                next++;
            }

            if (!correct) {
                continue;
            }

            next++;
            final int thirdValue = secondValue + diff;
            while (next < len) {
                value = nums[next];
                if (value > thirdValue) {
                    break;
                }
                if (value == thirdValue) {
                    count++;
                    break;
                }

                next++;
            }
        }

        return count;
    }
}
