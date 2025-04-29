package dev.drf.leetcode.richest.customer.wealth;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RichestCustomerWealthProblemTest {
    private final RichestCustomerWealthProblem problem = new RichestCustomerWealthProblem();

    @Test
    void example1() {
        // Input: accounts = [[1,2,3],[3,2,1]]
        // Output: 6
        int[][] accounts = {
                {1, 2, 3},
                {3, 2, 1}
        };

        var wealth = problem.maximumWealth(accounts);

        assertEquals(6, wealth);
    }

    @Test
    void example2() {
        // Input: accounts = [[1,5],[7,3],[3,5]]
        // Output: 10
        int[][] accounts = {
                {1, 5},
                {7, 3},
                {3, 5}
        };

        var wealth = problem.maximumWealth(accounts);

        assertEquals(10, wealth);
    }

    @Test
    void example3() {
        // Input: accounts = [[2,8,7],[7,1,3],[1,9,5]]
        // Output: 17
        int[][] accounts = {
                {2, 8, 7},
                {7, 1, 3},
                {1, 9, 5}
        };

        var wealth = problem.maximumWealth(accounts);

        assertEquals(17, wealth);
    }
}
