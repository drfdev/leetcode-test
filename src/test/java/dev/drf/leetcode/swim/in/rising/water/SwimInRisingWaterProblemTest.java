package dev.drf.leetcode.swim.in.rising.water;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SwimInRisingWaterProblemTest {
    private final SwimInRisingWaterProblem problem = new SwimInRisingWaterProblem();

    @Test
    void example1() {
        /*
        Input: grid = [[0,2],[1,3]]
        Output: 3
         */
        int[][] grid = new int[][]{
                {0, 2},
                {1, 3}
        };

        var result = problem.swimInWater(grid);

        assertEquals(3, result);
    }

    @Test
    void example2() {
        /*
        Input: grid = [[0,1,2,3,4],[24,23,22,21,5],[12,13,14,15,16],[11,17,18,19,20],[10,9,8,7,6]]
        Output: 16
         */
        int[][] grid = new int[][]{
                {0, 1, 2, 3, 4},
                {24, 23, 22, 21, 5},
                {12, 13, 14, 15, 16},
                {11, 17, 18, 19, 20},
                {10, 9, 8, 7, 6}
        };

        var result = problem.swimInWater(grid);

        assertEquals(16, result);
    }
}
