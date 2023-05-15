package dev.drf.leetcode.sqrtx;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/sqrtx/
 */
public class SqrtXProblem implements Problem {
    public int mySqrt(int x) {
        if (x == 1 || x == 0) {
            return x;
        }

        final double epsilon = 0.000001;

        double left = 0;
        double right = x;
        long x_value = x;

        while ((right - left) > epsilon) {
            double middle = (right + left) / 2;

            long pow = (long) (middle * middle);

            if (x_value == pow) {
                return (int) middle;
            } else if (x_value < pow) {
                right = middle;
            } else {
                left = middle;
            }
        }

        return (int) left;
    }
}
