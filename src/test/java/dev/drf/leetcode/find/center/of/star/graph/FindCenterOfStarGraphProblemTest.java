package dev.drf.leetcode.find.center.of.star.graph;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindCenterOfStarGraphProblemTest {
    private final FindCenterOfStarGraphProblem problem = new FindCenterOfStarGraphProblem();

    @Test
    void example1() {
        /*
        Input: edges = [[1,2],[2,3],[4,2]]
        Output: 2
         */
        int[][] edges = {
                {1, 2},
                {2, 3},
                {4, 2}
        };

        var node = problem.findCenter(edges);

        assertEquals(2, node);
    }

    @Test
    void example2() {
        /*
        Input: edges = [[1,2],[5,1],[1,3],[1,4]]
        Output: 1
         */
        int[][] edges = {
                {1, 2},
                {5, 1},
                {1, 3},
                {1, 4}
        };

        var node = problem.findCenter(edges);

        assertEquals(1, node);
    }
}
