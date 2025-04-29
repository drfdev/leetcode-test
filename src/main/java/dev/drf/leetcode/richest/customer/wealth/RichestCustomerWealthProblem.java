package dev.drf.leetcode.richest.customer.wealth;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/richest-customer-wealth/
 */
public class RichestCustomerWealthProblem implements Problem {
    public int maximumWealth(int[][] accounts) {
        int maxWealth = 0;

        for (int[] banks : accounts) {
            int wealth = 0;
            for (int bank : banks) {
                wealth += bank;
            }
            maxWealth = Math.max(maxWealth, wealth);
        }

        return maxWealth;
    }
}
