package dev.drf.leetcode.power.of.three;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/power-of-three/
 */
public class PowerOfThreeProblem implements Problem {
    public boolean isPowerOfThree(int n) {
        if (n < 0 || n == 0) {
            return false;
        }
        if (n == 1) {
            return true;
        }

        int t = 1;
        while (n > t && t > 0) {
            t = t * 3;
        }

        return t > 0 && n == t;
    }
}
