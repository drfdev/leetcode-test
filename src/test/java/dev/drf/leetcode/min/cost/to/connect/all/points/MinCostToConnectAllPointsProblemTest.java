package dev.drf.leetcode.min.cost.to.connect.all.points;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinCostToConnectAllPointsProblemTest {
    private final MinCostToConnectAllPointsProblem problem = new MinCostToConnectAllPointsProblem();

    @Test
    void example1() {
        /*
        Input: points = [[0,0],[2,2],[3,10],[5,2],[7,0]]
        Output: 20
         */
        int[][] points = new int[][]{
                {0, 0},
                {2, 2},
                {3, 10},
                {5, 2},
                {7, 0}
        };

        var cost = problem.minCostConnectPoints(points);

        assertEquals(20, cost);
    }

    @Test
    void example2() {
        /*
        Input: points = [[3,12],[-2,5],[-4,1]]
        Output: 18
         */
        int[][] points = new int[][]{
                {3, 12},
                {-2, 5},
                {-4, 1}
        };

        var cost = problem.minCostConnectPoints(points);

        assertEquals(18, cost);
    }
}
