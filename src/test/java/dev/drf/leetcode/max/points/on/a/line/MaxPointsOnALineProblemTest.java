package dev.drf.leetcode.max.points.on.a.line;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaxPointsOnALineProblemTest {
    private final MaxPointsOnALineProblem problem = new MaxPointsOnALineProblem();

    @Test
    void example1() {
        /*
        Input: points = [[1,1],[2,2],[3,3]]
        Output: 3
         */
        int[][] points = {
                {1, 1},
                {2, 2},
                {3, 3}
        };

        var out = problem.maxPoints(points);

        assertEquals(3, out);
    }

    @Test
    void example2() {
        /*
        Input: points = [[1,1],[3,2],[5,3],[4,1],[2,3],[1,4]]
        Output: 4
         */
        int[][] points = {
                {1, 1},
                {3, 2},
                {5, 3},
                {4, 1},
                {2, 3},
                {1, 4}
        };

        var out = problem.maxPoints(points);

        assertEquals(4, out);
    }
}
