package dev.drf.leetcode.final_prices.with.a.special.discount.in.a.shop;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/final-prices-with-a-special-discount-in-a-shop/
 */
public class FinalPricesWithASpecialDiscountInAShopProblem implements Problem {
    public int[] finalPrices(int[] prices) {
        final int[] answer = new int[prices.length];
        for (int i = 0; i < prices.length; i++) {
            answer[i] = prices[i];
            int discount = 0;
            for (int j = i + 1; j < prices.length; j++) {
                if (prices[j] <= prices[i]) {
                    discount = prices[j];
                    break;
                }
            }
            answer[i] = answer[i] - discount;
        }
        return answer;
    }
}
