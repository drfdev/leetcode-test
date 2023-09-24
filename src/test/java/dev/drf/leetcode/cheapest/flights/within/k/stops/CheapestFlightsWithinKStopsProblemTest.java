package dev.drf.leetcode.cheapest.flights.within.k.stops;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CheapestFlightsWithinKStopsProblemTest {
    private final CheapestFlightsWithinKStopsProblem problem = new CheapestFlightsWithinKStopsProblem();

    @Test
    void example1() {
        /*
        Input: n = 4, flights = [[0,1,100],[1,2,100],[2,0,100],[1,3,600],[2,3,200]], src = 0, dst = 3, k = 1
        Output: 700
         */
        int n = 4;
        int[][] flights = new int[][]{
                {0, 1, 100},
                {1, 2, 100},
                {2, 0, 100},
                {1, 3, 600},
                {2, 3, 200}
        };
        int src = 0;
        int dst = 3;
        int k = 1;

        var cost = problem.findCheapestPrice(n, flights, src, dst, k);

        assertEquals(700, cost);
    }

    @Test
    void example2() {
        /*
        Input: n = 3, flights = [[0,1,100],[1,2,100],[0,2,500]], src = 0, dst = 2, k = 1
        Output: 200
         */
        int n = 3;
        int[][] flights = new int[][]{
                {0, 1, 100},
                {1, 2, 100},
                {0, 2, 500}
        };
        int src = 0;
        int dst = 2;
        int k = 1;

        var cost = problem.findCheapestPrice(n, flights, src, dst, k);

        assertEquals(200, cost);
    }

    @Test
    void example3() {
        /*
        Input: n = 3, flights = [[0,1,100],[1,2,100],[0,2,500]], src = 0, dst = 2, k = 0
        Output: 500
         */
        int n = 3;
        int[][] flights = new int[][]{
                {0, 1, 100},
                {1, 2, 100},
                {0, 2, 500}
        };
        int src = 0;
        int dst = 2;
        int k = 0;

        var cost = problem.findCheapestPrice(n, flights, src, dst, k);

        assertEquals(500, cost);
    }
}
