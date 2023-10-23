package dev.drf.leetcode.game.of.life;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class GameOfLifeProblemTest {
    private final GameOfLifeProblem problem = new GameOfLifeProblem();

    @Test
    void example1() {
        /*
        Input: board = [[0,1,0],[0,0,1],[1,1,1],[0,0,0]]
        Output: [[0,0,0],[1,0,1],[0,1,1],[0,1,0]]
         */
        int[][] board = new int[][]{
                {0, 1, 0},
                {0, 0, 1},
                {1, 1, 1},
                {0, 0, 0}
        };

        problem.gameOfLife(board);

        int[][] expected = new int[][]{
                {0, 0, 0},
                {1, 0, 1},
                {0, 1, 1},
                {0, 1, 0}
        };
        assertArrayEquals(expected, board);
    }

    @Test
    void example2() {
        /*
        Input: board = [[1,1],[1,0]]
        Output: [[1,1],[1,1]]
         */
        int[][] board = new int[][]{
                {1, 1},
                {1, 0}
        };

        problem.gameOfLife(board);

        int[][] expected = new int[][]{
                {1, 1},
                {1, 1}
        };
    }
}
