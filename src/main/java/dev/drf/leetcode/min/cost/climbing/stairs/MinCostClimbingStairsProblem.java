package dev.drf.leetcode.min.cost.climbing.stairs;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/min-cost-climbing-stairs/
 * Used solution:
 * https://leetcode.com/problems/min-cost-climbing-stairs/solutions/144682/3-lines-java-solution-o-1-space/?envType=study-plan-v2&envId=leetcode-75
 */
public class MinCostClimbingStairsProblem implements Problem {
    public int minCostClimbingStairs(int[] cost) {
        for (int i = 2; i < cost.length; i++) {
            cost[i] += Math.min(cost[i - 1], cost[i - 2]);
        }
        return Math.min(cost[cost.length - 1], cost[cost.length - 2]);
    }
}
