package dev.drf.leetcode.mirror.distance.of.an.integer;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/mirror-distance-of-an-integer/
 */
public class MirrorDistanceOfAnIntegerProblem implements Problem {
    public int mirrorDistance(int n) {
        if (n < 10) {
            return 0;
        }

        int reversed = myReverse(n);
        return Math.abs(n - reversed);
    }

    private int myReverse(int n) {
        int result = 0;
        while (n > 0) {
            result = (result * 10) + (n % 10);
            n = n / 10;
        }
        return result;
    }
}
