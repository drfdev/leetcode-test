package dev.drf.leetcode.equal.row.and.column.pairs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EqualRowAndColumnPairsProblemTest {
    private final EqualRowAndColumnPairsProblem problem = new EqualRowAndColumnPairsProblem();

    @Test
    void example1() {
        /*
        Input: grid = [[3,2,1],[1,7,6],[2,7,7]]
        Output: 1
         */
        int[][] grid = new int[][]{
                {3, 2, 1},
                {1, 7, 6},
                {2, 7, 7}
        };

        var count = problem.equalPairs(grid);

        assertEquals(1, count);
    }

    @Test
    void example2() {
        /*
        Input: grid = [[3,1,2,2],[1,4,4,5],[2,4,2,2],[2,4,2,2]]
        Output: 3
         */
        int[][] grid = new int[][]{
                {3, 1, 2, 2},
                {1, 4, 4, 5},
                {2, 4, 2, 2},
                {2, 4, 2, 2}
        };

        var count = problem.equalPairs(grid);

        assertEquals(3, count);
    }

    @Test
    void failed1() {
        // grid = [[11,1],[1,11]]
        int[][] grid = new int[][]{
                {11, 1},
                {1, 11}
        };

        var count = problem.equalPairs(grid);

        assertEquals(2, count);
    }
}
