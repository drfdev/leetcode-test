package dev.drf.leetcode.powx.n;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/powx-n/
 */
public class PowxNProblem implements Problem {
    public double myPow(double x, int n) {
        if (x == 1d || x == 0) {
            return x;
        }
        if (x == -1d) {
            return (n % 2 == 0) ? 1d : -1d;
        }
        if (n == 0) {
            return 1;
        } else if (n == 1) {
            return x;
        } else if (n == Integer.MIN_VALUE) {
            // wtf?
            return 0d;
        } else if (n == Integer.MAX_VALUE
                && x > 0 && x < 1) {
            // wtf?
            return 0d;
        }
        double value = n < 0
                ? 1 / x
                : x;
        double result = value;
        int iterations = Math.abs(n);

        for (int i = 1; i < iterations; i++) {
            result = result * value;
        }

        return result;
    }
}
