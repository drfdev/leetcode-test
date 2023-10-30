package dev.drf.leetcode.power.of.two;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/power-of-two/
 */
public class PowerOfTwoProblem implements Problem {
    public boolean isPowerOfTwo(int n) {
        if (n < 0 || n == 0) {
            return false;
        }
        if (n == 1) {
            return true;
        }

        int t = 1;
        while (n > t && t > 0) {
            t = t << 1;
        }

        return t > 0 && n == t;
    }
}
