package dev.drf.leetcode.number.of1bits;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/number-of-1-bits/
 */
public class NumberOf1BitsProblem implements Problem {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int sum = 0;
        int shift = 1;
        int length = Integer.SIZE - Integer.numberOfLeadingZeros(n);

        int radix = 1 << shift;
        int mask = radix - 1;

        int pos = length;
        int val = n;
        do {
            sum += val & mask;
            pos--;
            val >>>= shift;
        } while (pos > 0);

        return sum;
    }
}
