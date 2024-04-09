package dev.drf.leetcode.time.needed.to.buy.tickets;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/time-needed-to-buy-tickets/
 * Used solution:
 * https://leetcode.com/problems/time-needed-to-buy-tickets/solutions/4995356/97-44-easy-solution-with-explanation
 */
public class TimeNeededToBuyTicketsProblem implements Problem {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int total = 0;

        for (int i = 0; i < tickets.length; i++) {
            if (i <= k) {
                total += Math.min(tickets[i], tickets[k]);
            } else {
                total += Math.min(tickets[i], tickets[k] - 1);
            }
        }

        return total;
    }
}
