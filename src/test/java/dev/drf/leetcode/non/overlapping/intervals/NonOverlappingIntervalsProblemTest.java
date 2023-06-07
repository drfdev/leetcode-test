package dev.drf.leetcode.non.overlapping.intervals;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NonOverlappingIntervalsProblemTest {
    private final NonOverlappingIntervalsProblem problem = new NonOverlappingIntervalsProblem();

    @Test
    void example1() {
        /*
        Input: intervals = [[1,2],[2,3],[3,4],[1,3]]
        Output: 1
         */
        int[][] intervals = new int[][]{
                {1, 2}, {2, 3}, {3, 4}, {1, 3}
        };

        var result = problem.eraseOverlapIntervals(intervals);

        assertEquals(1, result);
    }

    @Test
    void example2() {
        /*
        Input: intervals = [[1,2],[1,2],[1,2]]
        Output: 2
         */
        int[][] intervals = new int[][]{
                {1, 2}, {1, 2}, {1, 2}
        };

        var result = problem.eraseOverlapIntervals(intervals);

        assertEquals(2, result);
    }

    @Test
    void example3() {
        /*
        Input: intervals = [[1,2],[2,3]]
        Output: 0
         */
        int[][] intervals = new int[][]{
                {1, 2}, {2, 3}
        };

        var result = problem.eraseOverlapIntervals(intervals);

        assertEquals(0, result);
    }

    @Test
    void failed1() {
        /*
        [[-52,31],[-73,-26],[82,97],[-65,-11],[-62,-49],[95,99],[58,95],[-31,49],[66,98],[-63,2],[30,47],[-40,-26]]
        7
         */
        int[][] intervals = new int[][]{
                {-52, 31}, {-73, -26}, {82, 97},
                {-65, -11}, {-62, -49}, {95, 99},
                {58, 95}, {-31, 49}, {66, 98},
                {-63, 2}, {30, 47}, {-40, -26}
        };

        var result = problem.eraseOverlapIntervals(intervals);

        assertEquals(7, result);
    }
}
