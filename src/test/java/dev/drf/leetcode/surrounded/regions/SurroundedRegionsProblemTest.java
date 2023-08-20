package dev.drf.leetcode.surrounded.regions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SurroundedRegionsProblemTest {
    private final SurroundedRegionsProblem problem = new SurroundedRegionsProblem();

    @Test
    void example1() {
        /*
        Input: board = [["X","X","X","X"],
                        ["X","O","O","X"],
                        ["X","X","O","X"],
                        ["X","O","X","X"]]
        Output: [       ["X","X","X","X"],
                        ["X","X","X","X"],
                        ["X","X","X","X"],
                        ["X","O","X","X"]]
         */
        char[][] board = new char[][]{
                {'X', 'X', 'X', 'X'},
                {'X', 'O', 'O', 'X'},
                {'X', 'X', 'O', 'X'},
                {'X', 'O', 'X', 'X'}
        };

        problem.solve(board);

        char[][] expected = new char[][]{
                {'X', 'X', 'X', 'X'},
                {'X', 'X', 'X', 'X'},
                {'X', 'X', 'X', 'X'},
                {'X', 'O', 'X', 'X'}
        };
        assertArrayEquals(expected, board);
    }

    @Test
    void example2() {
        /*
        Input: board = [["X"]]
        Output: [["X"]]
         */
        char[][] board = new char[][]{
                {'X'}
        };

        problem.solve(board);

        char[][] expected = new char[][]{
                {'X'}
        };
        assertArrayEquals(expected, board);
    }
}
