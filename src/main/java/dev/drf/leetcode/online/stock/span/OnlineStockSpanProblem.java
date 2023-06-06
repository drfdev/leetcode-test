package dev.drf.leetcode.online.stock.span;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/online-stock-span/
 */
public class OnlineStockSpanProblem implements Problem {
    public static class StockSpanner {
        private PriceDay day;

        public StockSpanner() {
            this.day = null;
        }

        public int next(int price) {
            PriceDay today = new PriceDay(price);
            today.next = day;
            this.day = today;

            PriceDay cursor = today.next;
            int count = 1;
            while (cursor != null) {
                if (cursor.price > price) {
                    break;
                }
                count++;
                cursor = cursor.next;
            }

            return count;
        }
    }

    private static class PriceDay {
        private final int price;
        private PriceDay next = null;

        public PriceDay(int price) {
            this.price = price;
        }
    }
}
