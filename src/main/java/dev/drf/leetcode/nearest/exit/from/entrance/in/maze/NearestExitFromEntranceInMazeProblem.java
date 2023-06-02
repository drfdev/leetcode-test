package dev.drf.leetcode.nearest.exit.from.entrance.in.maze;

import dev.drf.leetcode.Problem;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * https://leetcode.com/problems/nearest-exit-from-entrance-in-maze/
 */
@Deprecated
public class NearestExitFromEntranceInMazeProblem implements Problem {
    public int nearestExit(char[][] maze, int[] entrance) {
        Set<Index> indexes = new HashSet<>(maze.length * maze[0].length);

        int entranceRow = entrance[0];
        int entranceCol = entrance[1];

        indexes.add(new Index(entranceRow, entranceCol));

        return minStepToExit(maze, entranceRow, entranceCol, indexes, 0);
    }

    private int minStepToExit(char[][] maze, int currentRow, int currentCol, Set<Index> indexes, int steps) {
        Index currentIndex = new Index(currentRow, currentCol);
        if (!indexes.contains(currentIndex)
                && isExit(currentRow, currentCol, maze)) {
            return steps;
        }

        indexes.add(currentIndex);

        int leftStep = -1;
        if (canMove(maze, indexes, currentRow, currentCol - 1)) {
            // move to left
            leftStep = minStepToExit(maze, currentRow, currentCol - 1, indexes, steps + 1);
        }

        int rightStep = -1;
        if (canMove(maze, indexes, currentRow, currentCol + 1)) {
            // move to right
            rightStep = minStepToExit(maze, currentRow, currentCol + 1, indexes, steps + 1);
        }

        int topStep = -1;
        if (canMove(maze, indexes, currentRow - 1, currentCol)) {
            // move to top
            topStep = minStepToExit(maze, currentRow - 1, currentCol, indexes, steps + 1);
        }

        int bottomStep = -1;
        if (canMove(maze, indexes, currentRow + 1, currentCol)) {
            // move to bottom
            bottomStep = minStepToExit(maze, currentRow + 1, currentCol, indexes, steps + 1);
        }

        indexes.remove(currentIndex);

        return checkMinStep(leftStep, rightStep, topStep, bottomStep);
    }

    private int checkMinStep(int leftStep, int rightStep, int topStep, int bottomStep) {
        int res = -1;
        if (leftStep != -1) {
            res = leftStep;
        }
        if (rightStep != -1) {
            if (res == -1) {
                res = rightStep;
            } else {
                res = Math.min(res, rightStep);
            }
        }
        if (topStep != -1) {
            if (res == -1) {
                res = topStep;
            } else {
                res = Math.min(res, topStep);
            }
        }
        if (bottomStep != -1) {
            if (res == -1) {
                res = bottomStep;
            } else {
                res = Math.min(res, bottomStep);
            }
        }
        return res;
    }

    private boolean canMove(char[][] maze, Set<Index> indexes, int row, int col) {
        if (row < 0 || col < 0) {
            return false;
        }
        if (row >= maze.length) {
            return false;
        }
        if (col >= maze[row].length) {
            return false;
        }
        char ch = maze[row][col];
        boolean checkedAlready = indexes.contains(new Index(row, col));
        return ch != '+' && !checkedAlready;
    }

    private boolean isExit(int row, int col, char[][] maze) {
        return row == 0 || col == 0
                || row == maze.length - 1
                || col == maze[row].length - 1;
    }

    private static class Index {
        private final int row;
        private final int col;

        public Index(int row, int col) {
            this.row = row;
            this.col = col;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Index index = (Index) o;
            return row == index.row && col == index.col;
        }

        @Override
        public int hashCode() {
            return Objects.hash(row, col);
        }
    }
}
