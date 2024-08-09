package dev.drf.leetcode.smallest.even.multiple;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/smallest-even-multiple/
 */
public class SmallestEvenMultipleProblem implements Problem {
    public int smallestEvenMultiple(int n) {
        return n % 2 == 0
                ? n : (2 * n);
    }
}
