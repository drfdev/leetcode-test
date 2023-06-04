package dev.drf.leetcode.domino.and.tromino.tiling;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/domino-and-tromino-tiling/
 * Used solutions:
 * https://leetcode.com/problems/domino-and-tromino-tiling/solutions/116581/detail-and-explanation-of-o-n-solution-why-dp-n-2-d-n-1-dp-n-3/
 * https://leetcode.com/problems/domino-and-tromino-tiling/solutions/1620809/python-java-c-c-dp-image-visualized-explanation-100-faster-o-n/
 */
public class DominoAndTrominoTilingProblem implements Problem {
    public int numTilings(int n) {
        // I couldn't understand it
        long[] dp = new long[n + 3];
        dp[0] = 1;
        dp[1] = 2;
        dp[2] = 5;
        for (int i = 3; i < n; i++) {
            dp[i] = (dp[i - 1] * 2 + dp[i - 3]) % 1000000007;
        }
        return (int) dp[n - 1];
    }
}
