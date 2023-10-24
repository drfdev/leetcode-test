package dev.drf.leetcode.unique.paths.ii;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/unique-paths-ii/
 */
public class UniquePathsIIProblem implements Problem {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        final int rows = obstacleGrid.length;
        final int columns = obstacleGrid[0].length;

        if (obstacleGrid[0][0] == 1) {
            return 0;
        }

        int[][] paths = new int[rows][columns];
        paths[0][0] = 1;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (obstacleGrid[i][j] == 1) {
                    paths[i][j] = -1;
                } else {
                    int left = i == 0 ? -1 : paths[i - 1][j];
                    int top = j == 0 ? -1 : paths[i][j - 1];
                    if (left < 0) {
                        left = 0;
                    }
                    if (top < 0) {
                        top = 0;
                    }
                    paths[i][j] += left + top;
                }
            }
        }
        int result = paths[rows - 1][columns - 1];

        if (result < 0) {
            return 0;
        }

        return result;
    }
}
