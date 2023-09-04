package dev.drf.leetcode.redundant.connection;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RedundantConnectionProblemTest {
    private final RedundantConnectionProblem problem = new RedundantConnectionProblem();

    @Test
    void example1() {
        /*
        Input: edges = [[1,2],[1,3],[2,3]]
        Output: [2,3]
         */
        int[][] edges = new int[][]{
                {1, 2}, {1, 3}, {2, 3}
        };

        var res = problem.findRedundantConnection(edges);

        assertEquals(2, res[0]);
        assertEquals(3, res[1]);
    }

    @Test
    void example2() {
        /*
        Input: edges = [[1,2],[2,3],[3,4],[1,4],[1,5]]
        Output: [1,4]
         */
        int[][] edges = new int[][]{
                {1, 2}, {2, 3}, {3, 4}, {1, 4}, {1, 5}
        };

        var res = problem.findRedundantConnection(edges);

        assertEquals(1, res[0]);
        assertEquals(4, res[1]);
    }
}
