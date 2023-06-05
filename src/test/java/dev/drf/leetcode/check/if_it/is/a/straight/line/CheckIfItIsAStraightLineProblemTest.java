package dev.drf.leetcode.check.if_it.is.a.straight.line;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CheckIfItIsAStraightLineProblemTest {
    private final CheckIfItIsAStraightLineProblem problem = new CheckIfItIsAStraightLineProblem();

    @Test
    void example1() {
        /*
        Input: coordinates = [[1,2],[2,3],[3,4],[4,5],[5,6],[6,7]]
        Output: true
         */
        int[][] coordinates = new int[][]{
                {1, 2}, {2, 3}, {3, 4}, {4, 5}, {5, 6}, {6, 7}
        };

        var isLine = problem.checkStraightLine(coordinates);

        assertTrue(isLine);
    }

    @Test
    void example2() {
        /*
        Input: coordinates = [[1,1],[2,2],[3,4],[4,5],[5,6],[7,7]]
        Output: false
         */
        int[][] coordinates = new int[][]{
                {1, 1}, {2, 2}, {3, 4}, {4, 5}, {5, 6}, {7, 7}
        };

        var isLine = problem.checkStraightLine(coordinates);

        assertFalse(isLine);
    }

    @Test
    void failed1() {
        /*
        [[0,0],[0,1],[0,-1]]
         */
        int[][] coordinates = new int[][]{
                {0, 0}, {0, 1}, {0, -1}
        };

        var isLine = problem.checkStraightLine(coordinates);

        assertTrue(isLine);
    }

    @Test
    void failed2() {
        /*
        [[0,1],[1,3],[-4,-7],[5,11]]
         */
        int[][] coordinates = new int[][]{
                {0, 1}, {1, 3}, {-4, -7}, {5, 11}
        };

        var isLine = problem.checkStraightLine(coordinates);

        assertTrue(isLine);
    }
}
