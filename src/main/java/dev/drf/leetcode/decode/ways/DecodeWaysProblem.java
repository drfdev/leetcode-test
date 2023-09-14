package dev.drf.leetcode.decode.ways;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/decode-ways/
 */
public class DecodeWaysProblem implements Problem {
    public int numDecodings(String s) {
        if (s == null) {
            return 0;
        }

        char[] chars = s.toCharArray();
        int[] dp = new int[chars.length + 1];

        dp[0] = 1;
        dp[1] = chars[0] == '0' ? 0 : 1;
        for (int i = 2; i < chars.length + 1; i++) {
            if (chars[i - 1] != '0') {
                dp[i] += dp[i - 1];
            }
            if (chars[i - 2] == '1'
                    || (chars[i - 2] == '2' && chars[i - 1] < '7')) {
                dp[i] += dp[i - 2];
            }
        }

        return dp[s.length()];
    }
}
