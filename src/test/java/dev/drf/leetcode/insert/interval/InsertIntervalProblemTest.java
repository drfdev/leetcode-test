package dev.drf.leetcode.insert.interval;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;

public class InsertIntervalProblemTest {
    private final InsertIntervalProblem problem = new InsertIntervalProblem();

    @Test
    void example1() {
        /*
        Input: intervals = [[1,3],[6,9]], newInterval = [2,5]
        Output: [[1,5],[6,9]]
         */
        int[][] intervals = new int[][]{
                {1, 3}, {6, 9}
        };
        int[] newInterval = new int[]{
                2, 5
        };

        var result = problem.insert(intervals, newInterval);

        assertThat(Arrays.asList(result), containsInAnyOrder(
                new int[]{1, 5},
                new int[]{6, 9}
        ));
    }

    @Test
    void example2() {
        /*
        Input: intervals = [[1,2],[3,5],[6,7],[8,10],[12,16]], newInterval = [4,8]
        Output: [[1,2],[3,10],[12,16]]
         */
        int[][] intervals = new int[][]{
                {1, 2}, {3, 5}, {6, 7}, {8, 10}, {12, 16}
        };
        int[] newInterval = new int[]{
                4, 8
        };

        var result = problem.insert(intervals, newInterval);

        assertThat(Arrays.asList(result), containsInAnyOrder(
                new int[]{1, 2},
                new int[]{3, 10},
                new int[]{12, 16}
        ));
    }
}
