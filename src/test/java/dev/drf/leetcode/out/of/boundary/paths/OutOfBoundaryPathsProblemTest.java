package dev.drf.leetcode.out.of.boundary.paths;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OutOfBoundaryPathsProblemTest {
    private final OutOfBoundaryPathsProblem problem = new OutOfBoundaryPathsProblem();

    @Test
    void example1() {
        /*
        Input: m = 2, n = 2, maxMove = 2, startRow = 0, startColumn = 0
        Output: 6
         */
        int m = 2, n = 2, maxMove = 2, startRow = 0, startColumn = 0;

        var out = problem.findPaths(m, n, maxMove, startRow, startColumn);

        assertEquals(6, out);
    }

    @Test
    void example2() {
        /*
        Input: m = 1, n = 3, maxMove = 3, startRow = 0, startColumn = 1
        Output: 12
         */
        int m = 1, n = 3, maxMove = 3, startRow = 0, startColumn = 1;

        var out = problem.findPaths(m, n, maxMove, startRow, startColumn);

        assertEquals(12, out);
    }
}
