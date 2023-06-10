package dev.drf.leetcode.unique.paths;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UniquePathsProblemTest {
    private final UniquePathsProblem problem = new UniquePathsProblem();

    @Test
    void example1() {
        /*
        Input: m = 3, n = 7
        Output: 28
         */
        int m = 3, n = 7;

        var res = problem.uniquePaths(m, n);

        assertEquals(28, res);
    }

    @Test
    void example2() {
        /*
        Input: m = 3, n = 2
        Output: 3
         */
        int m = 3, n = 2;

        var res = problem.uniquePaths(m, n);

        assertEquals(3, res);
    }
}
