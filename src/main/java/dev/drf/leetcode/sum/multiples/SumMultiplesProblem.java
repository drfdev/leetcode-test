package dev.drf.leetcode.sum.multiples;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/sum-multiples/
 */
public class SumMultiplesProblem implements Problem {
    public int sumOfMultiples(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if ((i % 3 == 0)
                    || (i % 5 == 0)
                    || (i % 7 == 0)) {
                sum += i;
            }
        }
        return sum;
    }
}
