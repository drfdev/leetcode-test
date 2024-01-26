package dev.drf.leetcode.out.of.boundary.paths;

/**
 * https://leetcode.com/problems/out-of-boundary-paths/
 * Used solution:
 * https://leetcode.com/problems/out-of-boundary-paths/solutions/4626756/beats-99-users-c-java-python-javascript-explained
 */
public class OutOfBoundaryPathsProblem {
    public int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {
        final int module = 1000000000 + 7;

        int[][] dp = new int[m][n];
        dp[startRow][startColumn] = 1;
        int count = 0;


        for (int moves = 1; moves <= maxMove; moves++) {
            int[][] temp = new int[m][n];

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {

                    if (i == m - 1) {
                        count = (count + dp[i][j]) % module;
                    }
                    if (j == n - 1) {
                        count = (count + dp[i][j]) % module;
                    }
                    if (i == 0) {
                        count = (count + dp[i][j]) % module;
                    }
                    if (j == 0) {
                        count = (count + dp[i][j]) % module;
                    }

                    temp[i][j] = (
                            ((i > 0 ? dp[i - 1][j] : 0) + (i < m - 1 ? dp[i + 1][j] : 0)) % module +
                                    ((j > 0 ? dp[i][j - 1] : 0) + (j < n - 1 ? dp[i][j + 1] : 0)) % module
                    ) % module;
                }
            }
            dp = temp;
        }

        return count;
    }
}
