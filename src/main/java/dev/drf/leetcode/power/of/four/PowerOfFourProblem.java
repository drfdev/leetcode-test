package dev.drf.leetcode.power.of.four;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/power-of-four/
 */
public class PowerOfFourProblem implements Problem {
    public boolean isPowerOfFour(int n) {
        if (n < 0 || n == 0) {
            return false;
        }
        if (n == 1) {
            return true;
        }

        int t = 1;
        while (n > t && t > 0) {
            t = t << 2;
        }

        return t > 0 && n == t;
    }
}
