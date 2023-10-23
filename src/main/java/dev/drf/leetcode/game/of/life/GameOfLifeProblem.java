package dev.drf.leetcode.game.of.life;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/game-of-life/
 */
public class GameOfLifeProblem implements Problem {
    public void gameOfLife(int[][] board) {
        if (board == null) {
            return;
        }
        int rows = board.length;
        int columns = board[0].length;

        int[][] nextState = new int[rows][columns];

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < columns; c++) {
                int top = (r > 0)
                        ? board[r - 1][c]
                        : 0;
                int bottom = (r < rows - 1)
                        ? board[r + 1][c]
                        : 0;
                int left = (c > 0)
                        ? board[r][c - 1]
                        : 0;
                int right = (c < columns - 1)
                        ? board[r][c + 1]
                        : 0;
                int topLeft = (r > 0) && (c > 0)
                        ? board[r - 1][c - 1]
                        : 0;
                int topRight = (r > 0) && (c < columns - 1)
                        ? board[r - 1][c + 1]
                        : 0;
                int bottomLeft = (r < rows - 1) && (c > 0)
                        ? board[r + 1][c - 1]
                        : 0;
                int bottomRight = (r < rows - 1) && (c < columns - 1)
                        ? board[r + 1][c + 1]
                        : 0;

                int sum = top + bottom + left + right
                        + topLeft + topRight + bottomLeft + bottomRight;
                int cell = board[r][c];
                /*
    Any live cell with fewer than two live neighbors dies as if caused by under-population.
    Any live cell with two or three live neighbors lives on to the next generation.
    Any live cell with more than three live neighbors dies, as if by over-population.
    Any dead cell with exactly three live neighbors becomes a live cell, as if by reproduction.
                 */
                if (cell == 1) {
                    // alive
                    if (sum < 2) {
                        nextState[r][c] = 0;
                    } else if (sum > 3) {
                        nextState[r][c] = 0;
                    } else {
                        nextState[r][c] = 1;
                    }
                } else {
                    // dead
                    if (sum == 3) {
                        nextState[r][c] = 1;
                    } else {
                        nextState[r][c] = 0;
                    }
                }
            }
        }

        System.arraycopy(nextState, 0, board, 0, rows);
    }
}
