package dev.drf.leetcode.find.the.pivot.integer;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/find-the-pivot-integer/
 * Used solution:
 * https://leetcode.com/problems/find-the-pivot-integer/solutions/2851954/simple-maths-proof-with-picture/
 */
public class FindThePivotIntegerProblem implements Problem {
    public int pivotInteger(int n) {
        int ans = (n * n + n) / 2;
        int sq = (int) Math.sqrt(ans);
        if (sq * sq == ans) {
            return sq;
        } else {
            return -1;
        }
    }
}
