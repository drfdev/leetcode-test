package dev.drf.leetcode.score.after.flipping.matrix;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/score-after-flipping-matrix/
 * Used solution:
 * https://leetcode.com/problems/score-after-flipping-matrix/solutions/143722/c-java-python-easy-and-concise/
 */
public class ScoreAfterFlippingMatrixProblem implements Problem {
    public int matrixScore(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int res = (1 << (n - 1)) * m;
        for (int j = 1; j < n; j++) {
            int cur = 0;
            for (int i = 0; i < m; i++) {
                cur += grid[i][j] == grid[i][0] ? 1 : 0;
            }
            res += Math.max(cur, m - cur) * (1 << (n - j - 1));
        }
        return res;
    }
}
