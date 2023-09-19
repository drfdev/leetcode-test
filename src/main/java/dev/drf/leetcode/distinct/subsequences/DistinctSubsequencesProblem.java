package dev.drf.leetcode.distinct.subsequences;

import dev.drf.leetcode.Problem;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/distinct-subsequences/
 * Used solution:
 * https://www.youtube.com/watch?v=-RDzMJ33nx8
 */
public class DistinctSubsequencesProblem implements Problem {
    public int numDistinct(String s, String t) {
        final int n = s.length() + 1;
        final int m = t.length() + 1;
        int[][] memo = new int[n][m];

        for (int[] row : memo) {
            Arrays.fill(row, -1);
        }

        return searchSubs(s, t, 0, 0, memo);
    }

    private int searchSubs(String s, String t, int sIdx, int tIdx, int[][] memo) {
        if (memo[sIdx][tIdx] != -1) {
            return memo[sIdx][tIdx];
        }

        if (tIdx >= t.length()) {
            return 1;
        }

        if (sIdx >= s.length()) {
            return 0;
        }

        char tChar = t.charAt(tIdx);
        char sChar = s.charAt(sIdx);
        if (tChar == sChar) {
            int stNextVal = searchSubs(s, t, sIdx + 1, tIdx + 1, memo);
            int sNextVal = searchSubs(s, t, sIdx + 1, tIdx, memo);
            memo[sIdx][tIdx] = stNextVal + sNextVal;
            return memo[sIdx][tIdx];
        }

        memo[sIdx][tIdx] = searchSubs(s, t, sIdx + 1, tIdx, memo);
        return memo[sIdx][tIdx];
    }
}
