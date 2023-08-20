package dev.drf.leetcode.max.area.of.island;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaxAreaOfIslandProblemTest {
    private final MaxAreaOfIslandProblem problem = new MaxAreaOfIslandProblem();

    @Test
    void example1() {
        /*
        Input: grid = [ [0,0,1,0,0,0,0,1,0,0,0,0,0],
                        [0,0,0,0,0,0,0,1,1,1,0,0,0],
                        [0,1,1,0,1,0,0,0,0,0,0,0,0],
                        [0,1,0,0,1,1,0,0,1,0,1,0,0],
                        [0,1,0,0,1,1,0,0,1,1,1,0,0],
                        [0,0,0,0,0,0,0,0,0,0,1,0,0],
                        [0,0,0,0,0,0,0,1,1,1,0,0,0],
                        [0,0,0,0,0,0,0,1,1,0,0,0,0]]
        Output: 6
         */
        int[][] grid = new int[][]{
                {0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
                {0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0},
                {0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0}
        };

        var max = problem.maxAreaOfIsland(grid);

        assertEquals(6, max);
    }

    @Test
    void example2() {
        /*
        Input: grid = [[0,0,0,0,0,0,0,0]]
        Output: 0
         */
        int[][] grid = new int[][]{
                {0, 0, 0, 0, 0, 0, 0, 0}
        };

        var max = problem.maxAreaOfIsland(grid);

        assertEquals(0, max);
    }
}
