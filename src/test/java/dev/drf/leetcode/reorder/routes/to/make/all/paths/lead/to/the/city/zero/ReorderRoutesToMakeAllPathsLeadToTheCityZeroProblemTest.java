package dev.drf.leetcode.reorder.routes.to.make.all.paths.lead.to.the.city.zero;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReorderRoutesToMakeAllPathsLeadToTheCityZeroProblemTest {
//    private final ReorderRoutesToMakeAllPathsLeadToTheCityZeroProblem problem = new ReorderRoutesToMakeAllPathsLeadToTheCityZeroProblem();
    private final ReorderRoutesToMakeAllPathsLeadToTheCityZeroProblem2 problem = new ReorderRoutesToMakeAllPathsLeadToTheCityZeroProblem2();

    @Test
    void example1() {
        /*
        Input: n = 6, connections = [[0,1],[1,3],[2,3],[4,0],[4,5]]
        Output: 3
         */
        int n = 6;
        int[][] connections = new int[][]{
                {0, 1},
                {1, 3},
                {2, 3},
                {4, 0},
                {4, 5}
        };

        var value = problem.minReorder(n, connections);

        assertEquals(3, value);
    }

    @Test
    void example2() {
        /*
        Input: n = 5, connections = [[1,0],[1,2],[3,2],[3,4]]
        Output: 2
         */
        int n = 5;
        int[][] connections = new int[][]{
                {1, 0},
                {1, 2},
                {3, 2},
                {3, 4}
        };

        var value = problem.minReorder(n, connections);

        assertEquals(2, value);
    }

    @Test
    void example3() {
        /*
        Input: n = 3, connections = [[1,0],[2,0]]
        Output: 0
         */
        int n = 3;
        int[][] connections = new int[][]{
                {1, 0},
                {2, 0}
        };

        var value = problem.minReorder(n, connections);

        assertEquals(0, value);
    }
}
