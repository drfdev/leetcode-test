package dev.drf.leetcode.queries.on.number.of.points.inside.a.circle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class QueriesOnNumberOfPointsInsideACircleProblemTest {
    private final QueriesOnNumberOfPointsInsideACircleProblem problem = new QueriesOnNumberOfPointsInsideACircleProblem();

    @Test
    void example1() {
        // Input: points = [[1,3],[3,3],[5,3],[2,2]], queries = [[2,3,1],[4,3,1],[1,1,2]]
        // Output: [3,2,2]
        int[][] points = {
                {1, 3}, {3, 3}, {5, 3}, {2, 2}
        };
        int[][] queries = {
                {2, 3, 1}, {4, 3, 1}, {1, 1, 2}
        };

        var output = problem.countPoints(points, queries);

        int[] expected = {3, 2, 2};
        assertArrayEquals(expected, output);
    }

    @Test
    void example2() {
        // Input: points = [[1,1],[2,2],[3,3],[4,4],[5,5]], queries = [[1,2,2],[2,2,2],[4,3,2],[4,3,3]]
        // Output: [2,3,2,4]
        int[][] points = {
                {1, 1}, {2, 2}, {3, 3}, {4, 4}, {5, 5}
        };
        int[][] queries = {
                {1, 2, 2}, {2, 2, 2}, {4, 3, 2}, {4, 3, 3}
        };

        var output = problem.countPoints(points, queries);

        int[] expected = {2, 3, 2, 4};
        assertArrayEquals(expected, output);
    }
}
