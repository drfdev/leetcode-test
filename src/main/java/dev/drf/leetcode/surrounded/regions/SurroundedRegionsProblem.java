package dev.drf.leetcode.surrounded.regions;

import dev.drf.leetcode.Problem;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * https://leetcode.com/problems/surrounded-regions/
 */
public class SurroundedRegionsProblem implements Problem {
    private static final char CHUNK_X = 'X';
    private static final char CHUNK_O = 'O';

    public void solve(char[][] board) {
        if (board == null) {
            return;
        }

        final int rows = board.length;
        if (rows == 0) {
            return;
        }
        final int cols = board[0].length;

        Set<Point> skip = new HashSet<>();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                Point p = new Point(i, j);
                if (board[i][j] == CHUNK_O) {
                    if (skip.contains(p)) {
                        continue;
                    }
                    Set<Point> points = new HashSet<>();
                    boolean surround = dfsSurround(board, i, j, rows, cols, points);
                    if (surround) {
                        for (Point point : points) {
                            board[point.i][point.j] = CHUNK_X;
                        }
                    } else {
                        skip.addAll(points);
                    }
                }
            }
        }
    }

    private boolean dfsSurround(char[][] board,
                                int i, int j,
                                int rows, int cols,
                                Set<Point> points) {
        if (i < 0 || j < 0
                || i >= rows || j >= cols) {
            return false;
        }
        if (board[i][j] == CHUNK_X) {
            return true;
        }
        Point p =new Point(i, j);
        if (points.contains(p)) {
            return true;
        }
        boolean surround;
        points.add(p);

        surround = dfsSurround(board, i + 1, j, rows, cols, points);
        if (!surround) {
            return false;
        }
        surround = dfsSurround(board, i - 1, j, rows, cols, points);
        if (!surround) {
            return false;
        }
        surround = dfsSurround(board, i, j + 1, rows, cols, points);
        if (!surround) {
            return false;
        }
        surround = dfsSurround(board, i, j - 1, rows, cols, points);
        if (!surround) {
            return false;
        }

        return true;
    }

    private static class Point {
        private final int i;
        private final int j;

        public Point(int i, int j) {
            this.i = i;
            this.j = j;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            Point point = (Point) o;
            return i == point.i
                    && j == point.j;
        }

        @Override
        public int hashCode() {
            return Objects.hash(i, j);
        }
    }
}
