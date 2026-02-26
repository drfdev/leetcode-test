package dev.drf.leetcode.final_prices.with.a.special.discount.in.a.shop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class FinalPricesWithASpecialDiscountInAShopProblemTest {
    private final FinalPricesWithASpecialDiscountInAShopProblem problem = new FinalPricesWithASpecialDiscountInAShopProblem();

    @Test
    void example1() {
        // Input: prices = [8,4,6,2,3]
        // Output: [4,2,4,2,3]
        int[] prices = {8, 4, 6, 2, 3};

        var out = problem.finalPrices(prices);

        int[] expected = {4, 2, 4, 2, 3};
        assertArrayEquals(expected, out);
    }

    @Test
    void example2() {
        // Input: prices = [1,2,3,4,5]
        // Output: [1,2,3,4,5]
        int[] prices = {1, 2, 3, 4, 5};

        var out = problem.finalPrices(prices);

        int[] expected = {1, 2, 3, 4, 5};
        assertArrayEquals(expected, out);
    }

    @Test
    void example3() {
        // Input: prices = [10,1,1,6]
        // Output: [9,0,1,6]
        int[] prices = {10, 1, 1, 6};

        var out = problem.finalPrices(prices);

        int[] expected = {9, 0, 1, 6};
        assertArrayEquals(expected, out);
    }
}
