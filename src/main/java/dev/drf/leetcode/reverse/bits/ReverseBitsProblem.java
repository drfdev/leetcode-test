package dev.drf.leetcode.reverse.bits;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/reverse-bits/
 */
public class ReverseBitsProblem implements Problem {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int pos = Integer.SIZE;
        int result = 0;
        int val = n;

        do {
            result <<= 1;
            result |= (val & 1);
            val >>>= 1;
            pos--;
        } while (pos > 0);

        return result;
    }
}
