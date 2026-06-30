package dev.drf.leetcode.harshad.number;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/harshad-number/
 */
public class HarshadNumberProblem implements Problem {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        if (x < 10) {
            return x;
        }
        final int harshad = calculateSum(x);
        final int divisor = x / harshad;
        final int origin = divisor * harshad;

        if (x == origin) {
            return harshad;
        }

        return -1;
    }

    private int calculateSum(int x) {
        if (x == 100) {
            return 1;
        }
        // 1 <= x <= 100
        return (x % 10) + (x / 10);
    }
}
