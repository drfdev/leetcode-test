package dev.drf.leetcode.extra.characters.in.a.string;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/extra-characters-in-a-string/
 * Used solution:
 * https://leetcode.com/problems/extra-characters-in-a-string/solutions/3990686/step-by-step-beginner-friendly-full-explanation-dp-efficient-easy-to-understand/
 */
public class ExtraCharactersInAStringProblem implements Problem {
    public int minExtraChar(String s,
                            String[] dictionary) {
        final int[] dp = new int[51];
        final int n = s.length();

        for (int i = n - 1; i >= 0; --i) {
            dp[i] = 1 + dp[i + 1];

            for (String w : dictionary) {
                final int wlen = w.length();
                if (i + wlen <= n && s.startsWith(w, i)) {
                    dp[i] = Math.min(dp[i], dp[i + wlen]);
                }
            }
        }

        return dp[0];
    }
}
