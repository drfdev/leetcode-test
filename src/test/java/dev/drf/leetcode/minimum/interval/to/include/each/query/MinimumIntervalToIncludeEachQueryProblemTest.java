package dev.drf.leetcode.minimum.interval.to.include.each.query;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class MinimumIntervalToIncludeEachQueryProblemTest {
    private final MinimumIntervalToIncludeEachQueryProblem problem = new MinimumIntervalToIncludeEachQueryProblem();

    @Test
    void example1() {
        /*
        Input: intervals = [[1,4],[2,4],[3,6],[4,4]], queries = [2,3,4,5]
        Output: [3,3,1,4]
         */
        int[][] intervals = new int[][]{
                {1, 4}, {2, 4}, {3, 6}, {4, 4}
        };
        int[] queries = new int[]{
                2, 3, 4, 5
        };

        var result = problem.minInterval(intervals, queries);

        assertNotNull(result);
        assertEquals(4, result.length);

        assertEquals(3, result[0]);
        assertEquals(3, result[1]);
        assertEquals(1, result[2]);
        assertEquals(4, result[3]);
    }

    @Test
    void example2() {
        /*
        Input: intervals = [[2,3],[2,5],[1,8],[20,25]], queries = [2,19,5,22]
        Output: [2,-1,4,6]
         */
        int[][] intervals = new int[][]{
                {2, 3}, {2, 5}, {1, 8}, {20, 25}
        };
        int[] queries = new int[]{
                2, 19, 5, 22
        };

        var result = problem.minInterval(intervals, queries);

        assertNotNull(result);
        assertEquals(4, result.length);

        assertEquals(2, result[0]);
        assertEquals(-1, result[1]);
        assertEquals(4, result[2]);
        assertEquals(6, result[3]);
    }
}
