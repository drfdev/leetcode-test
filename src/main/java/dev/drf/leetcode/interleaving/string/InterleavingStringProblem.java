package dev.drf.leetcode.interleaving.string;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/interleaving-string/
 * Used solution:
 * https://www.youtube.com/watch?v=3Rw3p9LrgvE
 */
public class InterleavingStringProblem implements Problem {
    public boolean isInterleave(String s1, String s2, String s3) {
        if (s1 == null || s2 == null || s3 == null) {
            return false;
        }

        final int len1 = s1.length();
        final int len2 = s2.length();
        final int len3 = s3.length();

        if (len1 + len2 != len3) {
            return false;
        }

        boolean[][] dp = new boolean[len1 + 1][len2 + 1];
        dp[len1][len2] = true;

        for (int i = len1; i >= 0; i--) {
            for (int j = len2; j >= 0; j--) {
                if (i < len1
                        && s1.charAt(i) == s3.charAt(i + j)
                        && dp[i + 1][j]) {
                    dp[i][j] = true;
                }
                if (j < len2
                        && s2.charAt(j) == s3.charAt(i + j)
                        && dp[i][j + 1]) {
                    dp[i][j] = true;
                }
            }
        }

        return dp[0][0];
    }
}
