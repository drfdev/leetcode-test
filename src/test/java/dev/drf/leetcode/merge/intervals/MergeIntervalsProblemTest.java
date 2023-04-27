package dev.drf.leetcode.merge.intervals;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.equalTo;

public class MergeIntervalsProblemTest {
    private final MergeIntervalsProblem problem = new MergeIntervalsProblem();

    @Test
    void example1() {
        /*
        Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
        Output: [[1,6],[8,10],[15,18]]
        Explanation: Since intervals [1,3] and [2,6] overlap, merge them into [1,6].
         */
        int[][] intervals = new int[][]{
                {1, 3}, {2, 6}, {8, 10}, {15, 18}
        };

        var result = problem.merge(intervals);

        List<int[]> vals = Arrays.asList(result);
        assertThat(vals, containsInAnyOrder(
                equalTo(new int[]{1, 6}),
                equalTo(new int[]{8, 10}),
                equalTo(new int[]{15, 18})
        ));
    }

    @Test
    void example2() {
        /*
        Input: intervals = [[1,4],[4,5]]
        Output: [[1,5]]
        Explanation: Intervals [1,4] and [4,5] are considered overlapping.
         */
        int[][] intervals = new int[][]{
                {1, 4}, {4, 5}
        };

        var result = problem.merge(intervals);

        List<int[]> vals = Arrays.asList(result);
        assertThat(vals, containsInAnyOrder(
                equalTo(new int[]{1, 5})
        ));
    }

    @Test
    void myTest1() {
        int[][] intervals = new int[][]{
                {1, 5}, {2, 3}, {4, 7}
        };

        var result = problem.merge(intervals);

        List<int[]> vals = Arrays.asList(result);
        assertThat(vals, containsInAnyOrder(
                equalTo(new int[]{1, 7})
        ));
    }

    @Test
    void myTest2() {
        int[][] intervals = new int[][]{
                {1, 5}, {2, 3}, {6, 7}
        };

        var result = problem.merge(intervals);

        List<int[]> vals = Arrays.asList(result);
        assertThat(vals, containsInAnyOrder(
                equalTo(new int[]{1, 5}),
                equalTo(new int[]{6, 7})
        ));
    }

    @Test
    void failed1() {
        int[][] intervals = new int[][]{
                {1, 4}, {0, 2}, {3, 5}
        };

        var result = problem.merge(intervals);
        List<int[]> vals = Arrays.asList(result);
        assertThat(vals, containsInAnyOrder(
                equalTo(new int[]{0, 5})
        ));
    }

    @Test
    void failed2() {
        int[][] intervals = new int[][]{
                {2, 3}, {2, 2}, {3, 3}, {1, 3}, {5, 7}, {2, 2}, {4, 6}
        };

        var result = problem.merge(intervals);

        List<int[]> vals = Arrays.asList(result);
        assertThat(vals, containsInAnyOrder(
                // [[1,3],[4,7]]
                equalTo(new int[]{1, 3}),
                equalTo(new int[]{4, 7})
        ));
    }
}
