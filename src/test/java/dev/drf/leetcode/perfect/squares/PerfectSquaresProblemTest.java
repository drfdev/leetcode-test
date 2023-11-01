package dev.drf.leetcode.perfect.squares;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PerfectSquaresProblemTest {
    private final PerfectSquaresProblem problem = new PerfectSquaresProblem();

    @Test
    void example1() {
        /*
        Input: n = 12
        Output: 3
         */
        int n = 12;

        var cnt = problem.numSquares(n);

        assertEquals(3, cnt);
    }

    @Test
    void example2() {
        /*
        Input: n = 13
        Output: 2
         */
        int n = 13;

        var cnt = problem.numSquares(n);

        assertEquals(2, cnt);
    }
}
