package dev.drf.leetcode.minimum.time.visiting.all.points;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinimumTimeVisitingAllPointsProblemTest {
    private final MinimumTimeVisitingAllPointsProblem problem = new MinimumTimeVisitingAllPointsProblem();

    @Test
    void example1() {
        // Input: points = [[1,1],[3,4],[-1,0]]
        // Output: 7
        int[][] points = {
                {1, 1}, {3, 4}, {-1, 0}
        };

        int out = problem.minTimeToVisitAllPoints(points);

        assertEquals(7, out);
    }

    @Test
    void example2() {
        // Input: points = [[3,2],[-2,2]]
        // Output: 5
        int[][] points = {
                {3, 2}, {-2, 2}
        };

        int out = problem.minTimeToVisitAllPoints(points);

        assertEquals(5, out);
    }
}
