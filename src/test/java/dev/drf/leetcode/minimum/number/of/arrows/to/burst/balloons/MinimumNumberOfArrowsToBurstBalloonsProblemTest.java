package dev.drf.leetcode.minimum.number.of.arrows.to.burst.balloons;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinimumNumberOfArrowsToBurstBalloonsProblemTest {
    private final MinimumNumberOfArrowsToBurstBalloonsProblem problem = new MinimumNumberOfArrowsToBurstBalloonsProblem();

    @Test
    void example1() {
        /*
        Input: points = [[10,16],[2,8],[1,6],[7,12]]
        Output: 2
         */
        int[][] points = new int[][]{
                {10, 16}, {2, 8}, {1, 6}, {7, 12}
        };

        var result = problem.findMinArrowShots(points);

        assertEquals(2, result);
    }

    @Test
    void example2() {
        /*
        Input: points = [[1,2],[3,4],[5,6],[7,8]]
        Output: 4
         */
        int[][] points = new int[][]{
                {1, 2}, {3, 4}, {5, 6}, {7, 8}
        };

        var result = problem.findMinArrowShots(points);

        assertEquals(4, result);
    }

    @Test
    void example3() {
        /*
        Input: points = [[1,2],[2,3],[3,4],[4,5]]
        Output: 2
         */
        int[][] points = new int[][]{
                {1, 2}, {2, 3}, {3, 4}, {4, 5}
        };

        var result = problem.findMinArrowShots(points);

        assertEquals(2, result);
    }
}
