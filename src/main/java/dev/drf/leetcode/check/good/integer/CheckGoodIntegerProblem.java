package dev.drf.leetcode.check.good.integer;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/check-good-integer/
 */
public class CheckGoodIntegerProblem implements Problem {
    public boolean checkGoodInteger(int n) {
        long digitSum = 0L;
        long squareSum = 0L;

        while (n > 0) {
            int val = n % 10;
            digitSum += val;
            squareSum += (val * val);
            n = n / 10;
        }

        return (squareSum - digitSum) >= 50;
    }
}
