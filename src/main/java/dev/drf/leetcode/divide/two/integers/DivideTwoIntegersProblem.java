package dev.drf.leetcode.divide.two.integers;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/divide-two-integers/
 */
public class DivideTwoIntegersProblem implements Problem {
    public int divide(int dividend, int divisor) {
        if (dividend == 0) {
            return 0;
        }
        if (divisor == 1) {
            return dividend;
        }
        if (divisor == -1) {
            if (dividend == -2147483648) {
                return 2147483647;
            }
            return -dividend;
        }
        if (divisor == 2) {
            return dividend >> 1;
        }
        if (divisor == -2) {
            return -dividend >> 1;
        }

        long dividendAbs = Math.abs((long) dividend);
        long divisorAbs = Math.abs((long) divisor);

        if (dividendAbs < divisorAbs) {
            return 0;
        }

        boolean aboveDividendZero = dividend > 0;
        boolean aboveDivisorZero = divisor > 0;
        boolean negative = aboveDividendZero ^ aboveDivisorZero;

        int result = 0;

        while (!(dividendAbs < divisorAbs)) {
            dividendAbs = dividendAbs - divisorAbs;
            result++;
        }

        return negative ? -result : result;
    }
}
