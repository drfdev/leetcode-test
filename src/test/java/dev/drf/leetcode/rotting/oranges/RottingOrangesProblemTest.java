package dev.drf.leetcode.rotting.oranges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RottingOrangesProblemTest {
    private final RottingOrangesProblem problem = new RottingOrangesProblem();

    @Test
    void example1() {
        /*
        Input: grid = [[2,1,1],[1,1,0],[0,1,1]]
        Output: 4
         */
        int[][] grid = new int[][]{
                {2, 1, 1},
                {1, 1, 0},
                {0, 1, 1}
        };

        var res = problem.orangesRotting(grid);

        assertEquals(4, res);
    }

    @Test
    void example2() {
        /*
        Input: grid = [[2,1,1],[0,1,1],[1,0,1]]
        Output: -1
         */
        int[][] grid = new int[][]{
                {2, 1, 1},
                {0, 1, 1},
                {1, 0, 1}
        };

        var res = problem.orangesRotting(grid);

        assertEquals(-1, res);
    }

    @Test
    void example3() {
        /*
        Input: grid = [[0,2]]
        Output: 0
         */
        int[][] grid = new int[][]{
                {0, 2}
        };

        var res = problem.orangesRotting(grid);

        assertEquals(0, res);
    }
}
