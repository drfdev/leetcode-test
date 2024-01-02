package dev.drf.leetcode.ugly.number;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/ugly-number/
 */
public class UglyNumberProblem implements Problem {
    public boolean isUgly(int n) {
        if (n == 0) {
            return false;
        }
        int[] deli = new int[]{
                2, 3, 5
        };

        for (int del : deli) {
            while (n % del == 0) {
                n = n / del;
            }
        }

        return n == 1;
    }
}
