package dev.drf.leetcode.word.break_1;

import dev.drf.leetcode.Problem;

import java.util.List;

/**
 * https://leetcode.com/problems/word-break/
 * Used solution:
 * https://www.youtube.com/watch?v=Sx9NNgInc3A
 */
public class WordBreakProblem implements Problem {
    public boolean wordBreak(String s,
                             List<String> wordDict) {
        final int len = s.length();
        boolean[] dp = new boolean[len + 1];
        dp[len] = true;

        for (int i = len - 1; i >= 0; i--) {
            for (String w : wordDict) {
                int wlen = w.length();
                if ((i + wlen) <= len
                        && s.startsWith(w, i)) {
                    dp[i] = dp[i + wlen];
                }
                if (dp[i]) {
                    break;
                }
            }
        }
        return dp[0];
    }
}
