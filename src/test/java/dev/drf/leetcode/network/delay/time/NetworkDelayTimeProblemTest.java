package dev.drf.leetcode.network.delay.time;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NetworkDelayTimeProblemTest {
    private final NetworkDelayTimeProblem problem = new NetworkDelayTimeProblem();

    @Test
    void example1() {
        /*
        Input: times = [[2,1,1],[2,3,1],[3,4,1]], n = 4, k = 2
        Output: 2
         */
        int[][] times = new int[][]{
                {2, 1, 1},
                {2, 3, 1},
                {3, 4, 1}
        };
        int n = 4, k = 2;

        var cost = problem.networkDelayTime(times, n, k);

        assertEquals(2, cost);
    }

    @Test
    void example2() {
        /*
        Input: times = [[1,2,1]], n = 2, k = 1
        Output: 1
         */
        int[][] times = new int[][]{
                {1, 2, 1}
        };
        int n = 2, k = 1;

        var cost = problem.networkDelayTime(times, n, k);

        assertEquals(1, cost);
    }

    @Test
    void example3() {
        /*
        Input: times = [[1,2,1]], n = 2, k = 2
        Output: -1
         */
        int[][] times = new int[][]{
                {1, 2, 1}
        };
        int n = 2, k = 2;

        var cost = problem.networkDelayTime(times, n, k);

        assertEquals(-1, cost);
    }
}
