package dev.drf.leetcode.factorial.trailing.zeroes;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/factorial-trailing-zeroes/
 * Used solution:
 * https://www.purplemath.com/modules/factzero.htm
 */
public class FactorialTrailingZeroesProblem implements Problem {
    public int trailingZeroes(int n) {
        int count = 0;

        while (n > 0) {
            n = n / 5;
            count = count + n;
        }

        return count;
    }
}
