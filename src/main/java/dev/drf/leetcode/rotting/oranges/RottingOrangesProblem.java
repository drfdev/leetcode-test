package dev.drf.leetcode.rotting.oranges;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/rotting-oranges/
 */
public class RottingOrangesProblem implements Problem {
    public int orangesRotting(int[][] grid) {
        final int row = grid.length;
        final int col = grid[0].length;

        int steps = 0;
        int rotten = 2;
        int[][] directions = new int[][] {
                {-1, 0}, {0, -1}, {1, 0}, {0, 1}
        };

        while (hasOranges(grid, row, col)) {
            boolean hasChanges = false;

            for (int r = 0; r < row; r++) {
                for (int l = 0; l < col; l++) {
                    if (grid[r][l] == rotten) {
                        for (int[] direction : directions) {
                            int rd = r + direction[0];
                            int ld = l + direction[1];

                            if (rd >= 0 && ld >= 0 && rd < row && ld < col) {
                                if (grid[rd][ld] == 1) {
                                    grid[rd][ld] = rotten + 1;
                                    hasChanges = true;
                                }
                            }
                        }
                    }
                }
            }

            rotten++;

            if (!hasChanges) {
                if (hasOranges(grid, row, col)) {
                    return -1;
                }
            }

            steps++;
        }

        return steps;
    }

    private boolean hasOranges(int[][] grid, int row, int col) {
        for (int r = 0; r < row; r++) {
            for (int l = 0; l < grid[r].length; l++) {
                if (grid[r][l] == 1) {
                    return true;
                }
            }
        }
        return false;
    }
}
