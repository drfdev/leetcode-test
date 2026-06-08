package dev.drf.leetcode.minimum.cost.to.reach.every.position;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/minimum-cost-to-reach-every-position/
 */
public class MinimumCostToReachEveryPositionProblem implements Problem {
    public int[] minCosts(int[] cost) {
        final int n = cost.length;
        final int[] res = new int[n];

        int min = cost[0];
        for (int i = 0; i < res.length; i++) {
            min = Math.min(min, cost[i]);
            res[i] = min;
        }

        return res;
    }
}
