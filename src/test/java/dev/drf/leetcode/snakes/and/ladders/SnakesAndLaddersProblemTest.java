package dev.drf.leetcode.snakes.and.ladders;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SnakesAndLaddersProblemTest {
    private final SnakesAndLaddersProblem problem = new SnakesAndLaddersProblem();

    @Test
    void example1() {
        /*
        Input: board = [[-1,-1,-1,-1,-1,-1],[-1,-1,-1,-1,-1,-1],[-1,-1,-1,-1,-1,-1],[-1,35,-1,-1,13,-1],[-1,-1,-1,-1,-1,-1],[-1,15,-1,-1,-1,-1]]
        Output: 4
         */
        int[][] board = new int[][]{
                {-1, -1, -1, -1, -1, -1},
                {-1, -1, -1, -1, -1, -1},
                {-1, -1, -1, -1, -1, -1},
                {-1, 35, -1, -1, 13, -1},
                {-1, -1, -1, -1, -1, -1},
                {-1, 15, -1, -1, -1, -1}
        };

        var out = problem.snakesAndLadders(board);

        assertEquals(4, out);
    }

    @Test
    void example2() {
        /*
        Input: board = [[-1,-1],[-1,3]]
        Output: 1
         */
        int[][] board = new int[][]{
                {-1, -1},
                {-1, 3}
        };

        var out = problem.snakesAndLadders(board);

        assertEquals(1, out);
    }
}
