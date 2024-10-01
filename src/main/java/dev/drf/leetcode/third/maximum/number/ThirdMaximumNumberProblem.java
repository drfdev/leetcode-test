package dev.drf.leetcode.third.maximum.number;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/third-maximum-number/
 */
public class ThirdMaximumNumberProblem implements Problem {
    public int thirdMax(int[] nums) {
        long max1 = Long.MIN_VALUE; // the biggest
        long max2 = Long.MIN_VALUE; // middle
        long max3 = Long.MIN_VALUE; // the lowest
        int depth = 0;

        for (int num : nums) {
            if (num == max1 || num == max2 || num == max3) {
                continue;
            }

            if (num > max1) {
                max3 = max2;
                max2 = max1;
                max1 = num;

                if (depth < 3) {
                    depth++;
                }
            } else if (num > max2) {
                max3 = max2;
                max2 = num;

                if (depth < 3) {
                    depth++;
                }
            } else if (num > max3) {
                max3 = num;

                if (depth < 3) {
                    depth++;
                }
            }
        }

        if (depth == 3) {
            return (int) max3;
        }

        return (int) Math.max(max1, max2);
    }
}
