package dev.drf.leetcode.divisible.and.non.divisible.sums.difference;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/divisible-and-non-divisible-sums-difference/
 */
public class DivisibleAndNonDivisibleSumsDifferenceProblem implements Problem {
    public int differenceOfSums(int n, int m) {
        int result = 0;

        for (int i = 0; i <= n; i++) {
            if (i % m == 0) {
                result -= i;
            } else {
                result += i;
            }
        }

        return result;
    }
}
