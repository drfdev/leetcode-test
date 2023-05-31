package dev.drf.leetcode.n.th.tribonacci.number;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/n-th-tribonacci-number/
 */
public class NthTribonacciNumberProblem implements Problem {
    public int tribonacci(int n) {
        final int t0 = 0;
        final int t1 = 1;
        final int t2 = 1;

        if (n == 0) {
            return t0;
        } else if (n == 1) {
            return t1;
        } else if (n == 2) {
            return t2;
        }

        int prN3 = t0;
        int prN2 = t1;
        int prN1 = t2;

        int result = 0;
        for (int i = 3; i <= n; i++) {
            result = prN3 + prN2 + prN1;

            prN3 = prN2;
            prN2 = prN1;
            prN1 = result;
        }

        return result;
    }
}
