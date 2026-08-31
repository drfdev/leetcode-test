package dev.drf.leetcode.count.substrings.that.differ.by.one.character;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/count-substrings-that-differ-by-one-character/
 * Used solution:
 * https://leetcode.com/problems/count-substrings-that-differ-by-one-character/solutions/1182847/java-clean-omn-time-o1-space-dynamic-pro-o1ub/?envType=problem-list-v2&envId=dynamic-programming
 */
public class CountSubstringsThatDifferByOneCharacterProblem implements Problem {
    public int countSubstrings(String s, String t) {
        int m = s.length(), n = t.length(), res = 0;
        int[][][] dp = new int[m+1][n+1][2];

        // dp[i][j] : count for s[0:i) & t[0:j)
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                dp[i+1][j+1][0] = (s.charAt(i) == t.charAt(j)) ? dp[i][j][0] + 1 : 0;
                dp[i+1][j+1][1] = (s.charAt(i) == t.charAt(j)) ? dp[i][j][1] : dp[i][j][0] + 1;
                res += dp[i+1][j+1][1];
            }
        }

        return res;
    }
}
