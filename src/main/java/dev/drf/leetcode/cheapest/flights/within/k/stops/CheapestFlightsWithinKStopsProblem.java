package dev.drf.leetcode.cheapest.flights.within.k.stops;

import dev.drf.leetcode.Problem;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/cheapest-flights-within-k-stops/
 * Used solution:
 * https://www.youtube.com/watch?v=5eIK3zUdYmE
 */
public class CheapestFlightsWithinKStopsProblem implements Problem {
    public int findCheapestPrice(int n,
                                 int[][] flights,
                                 int src,
                                 int dst,
                                 int k) {
        int[] prices = new int[n];
        Arrays.fill(prices, Integer.MAX_VALUE);
        prices[src] = 0;

        for (int i = 0; i <= k; i++) {
            int[] temp = Arrays.copyOf(prices, prices.length);

            for (int j = 0; j < flights.length; j++) {
                int source = flights[j][0];
                int destination = flights[j][1];
                int price = flights[j][2];

                int sourcePrice = prices[source];
                if (sourcePrice == Integer.MAX_VALUE) {
                    continue;
                }

                if (sourcePrice + price < temp[destination]) {
                    temp[destination] = sourcePrice + price;
                }
            }

            prices = temp;
        }

        if (prices[dst] != Integer.MAX_VALUE) {
            return prices[dst];
        }

        return -1;
    }
}
