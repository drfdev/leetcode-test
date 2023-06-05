package dev.drf.leetcode.total.cost.to.hire.k.workers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TotalCostToHireKWorkersProblemTest {
    private final TotalCostToHireKWorkersProblem problem = new TotalCostToHireKWorkersProblem();

    @Test
    void example1() {
        /*
        Input: costs = [17,12,10,2,7,2,11,20,8], k = 3, candidates = 4
        Output: 11
         */

        int[] costs = new int[]{
                17, 12, 10, 2, 7, 2, 11, 20, 8
        };
        int k = 3;
        int candidates = 4;

        var result = problem.totalCost(costs, k, candidates);

        assertEquals(11, result);
    }

    @Test
    void example2() {
        /*
        Input: costs = [1,2,4,1], k = 3, candidates = 3
        Output: 4
         */
        int[] costs = new int[]{
                1,2,4,1
        };
        int k = 3;
        int candidates = 3;

        var result = problem.totalCost(costs, k, candidates);

        assertEquals(4, result);
    }
}
