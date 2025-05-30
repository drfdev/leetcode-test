package dev.drf.leetcode.minimum.bit.flips.to.convert.number;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/minimum-bit-flips-to-convert-number/
 */
public class MinimumBitFlipsToConvertNumberProblem implements Problem {
    public int minBitFlips(int start, int goal) {
        int flips = 0;

        while (start > 0 || goal > 0) {
            int startVal = start % 2;
            int goalVal = goal % 2;

            if (startVal != goalVal) {
                flips++;
            }
            start = start / 2;
            goal = goal / 2;
        }

        return flips;
    }
}
