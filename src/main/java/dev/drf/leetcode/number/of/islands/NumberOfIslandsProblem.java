package dev.drf.leetcode.number.of.islands;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/number-of-islands/
 * Used solution:
 * https://leetcode.com/problems/number-of-islands/solutions/56359/very-concise-java-ac-solution/
 */
public class NumberOfIslandsProblem implements Problem {
    public int numIslands(char[][] grid) {
        final int rows = grid.length;
        if (rows == 0) {
            return 0;
        }
        final int cols = grid[0].length;

        int count = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == '1') {
                    DFSMarking(grid, i, j, rows, cols);
                    count++;
                }
            }
        }

        return count;
    }

    private void DFSMarking(char[][] grid, int i, int j, final int rows, final int cols) {
        if (i < 0 || j < 0 || i >= rows || j >= cols || grid[i][j] != '1') {
            return;
        }
        grid[i][j] = '0';
        DFSMarking(grid, i + 1, j, rows, cols);
        DFSMarking(grid, i - 1, j, rows, cols);
        DFSMarking(grid, i, j + 1, rows, cols);
        DFSMarking(grid, i, j - 1, rows, cols);
    }
}
