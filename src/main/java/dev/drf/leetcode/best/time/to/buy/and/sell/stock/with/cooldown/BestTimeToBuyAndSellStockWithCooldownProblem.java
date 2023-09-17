package dev.drf.leetcode.best.time.to.buy.and.sell.stock.with.cooldown;

import dev.drf.leetcode.Problem;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock-with-cooldown/
 * Used solution:
 * https://www.youtube.com/watch?v=I7j0F7AHpb8
 */
public class BestTimeToBuyAndSellStockWithCooldownProblem implements Problem {
    public int maxProfit(int[] prices) {
        Map<String, Integer> cache = new HashMap<>();
        return dfs(prices, cache, 0, true);
    }

    private int dfs(int[] prices,
                    Map<String, Integer> cache,
                    int index,
                    boolean buying) {
        if (index >= prices.length) {
            return 0;
        }
        String key = index + "-" + buying;

        if (cache.containsKey(key)) {
            return cache.get(key);
        }

        int cooldown = dfs(prices, cache, index + 1, buying);
        int buyOsell;

        if (buying) {
            buyOsell = dfs(prices, cache, index + 1, !buying) - prices[index];
        } else {
            buyOsell = dfs(prices, cache, index + 2, !buying) + prices[index];
        }

        cache.put(key, Math.max(buyOsell, cooldown));
        return cache.get(key);
    }
}
