package dev.drf.leetcode.nearest.exit.from.entrance.in.maze;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NearestExitFromEntranceInMazeProblemTest {
//    private final NearestExitFromEntranceInMazeProblem problem = new NearestExitFromEntranceInMazeProblem();
    private final NearestExitFromEntranceInMazeProblem2 problem = new NearestExitFromEntranceInMazeProblem2();

    @Test
    void example1() {
        /*
        Input: maze = [["+","+",".","+"],[".",".",".","+"],["+","+","+","."]], entrance = [1,2]
        Output: 1
         */
        char[][] maze = new char[][]{
                {'+', '+', '.', '+'},
                {'.', '.', '.', '+'},
                {'+', '+', '+', '.'}
        };
        int[] entrance = new int[]{
                1, 2
        };

        int steps = problem.nearestExit(maze, entrance);

        assertEquals(1, steps);
    }

    @Test
    void example2() {
        /*
        Input: maze = [["+","+","+"],[".",".","."],["+","+","+"]], entrance = [1,0]
        Output: 2
         */
        char[][] maze = new char[][]{
                {'+', '+', '+'},
                {'.', '.', '.'},
                {'+', '+', '+'}
        };
        int[] entrance = new int[]{
                1, 0
        };

        int steps = problem.nearestExit(maze, entrance);

        assertEquals(2, steps);
    }

    @Test
    void example3() {
        /*
        Input: maze = [[".","+"]], entrance = [0,0]
        Output: -1
         */
        char[][] maze = new char[][]{
                {'.', '+'}
        };
        int[] entrance = new int[]{
                0, 0
        };

        int steps = problem.nearestExit(maze, entrance);

        assertEquals(-1, steps);
    }

    @Test
    void failed1() {
        /*
        [
        [".","+","+","+",".",".",".","+","+"],
        [".",".","+",".","+",".","+","+","."],
        [".",".","+",".",".",".",".",".","."],
        [".","+",".",".","+","+",".","+","."],
        [".",".",".",".",".",".",".","+","."],
        [".",".",".",".",".",".",".",".","."],
        [".",".",".","+",".",".",".",".","."],
        [".",".",".",".",".",".",".",".","+"],
        ["+",".",".",".","+",".",".",".","."]
        ]

        entrance = [5,6]
        2
         */
        char[][] maze = new char[][]{
                {'.', '+', '+', '+', '.', '.', '.', '+', '+'},
                {'.', '.', '+', '.', '+', '.', '+', '+', '.'},
                {'.', '.', '+', '.', '.', '.', '.', '.', '.'},
                {'.', '+', '.', '.', '+', '+', '.', '+', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '+', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.', '.'},
                {'.', '.', '.', '+', '.', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.', '+'},
                {'+', '.', '.', '.', '+', '.', '.', '.', '.'}
        };
        int[] entrance = new int[]{
                5, 6
        };

        int steps = problem.nearestExit(maze, entrance);

        assertEquals(2, steps);
    }
}
