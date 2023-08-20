package dev.drf.leetcode.n.queens.ii;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NQueensIIProblemTest {
    private final NQueensIIProblem problem = new NQueensIIProblem();

    @Test
    void example1() {
        /*
        Input: n = 4
        Output: 2
         */
        int n = 4;

        var count = problem.totalNQueens(n);

        assertEquals(2, count);
    }

    @Test
    void example2() {
        /*
        Input: n = 1
        Output: 1
         */
        int n = 1;

        var count = problem.totalNQueens(n);

        assertEquals(1, count);
    }
}
