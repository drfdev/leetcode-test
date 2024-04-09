package dev.drf.leetcode.time.needed.to.buy.tickets;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TimeNeededToBuyTicketsProblemTest {
    private final TimeNeededToBuyTicketsProblem problem = new TimeNeededToBuyTicketsProblem();

    @Test
    void example1() {
        /*
        Input: tickets = [2,3,2], k = 2
        Output: 6
         */
        int[] tickets = {2, 3, 2};
        int k = 2;

        var out = problem.timeRequiredToBuy(tickets, k);

        assertEquals(6, out);
    }

    @Test
    void example2() {
        /*
        Input: tickets = [5,1,1,1], k = 0
        Output: 8
         */
        int[] tickets = {5, 1, 1, 1};
        int k = 0;

        var out = problem.timeRequiredToBuy(tickets, k);

        assertEquals(8, out);
    }
}
