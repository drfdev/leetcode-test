package dev.drf.leetcode.non.overlapping.intervals;

import dev.drf.leetcode.Problem;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/non-overlapping-intervals/
 */
public class NonOverlappingIntervalsProblem implements Problem {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (left, right) -> {
            int left0 = left[0];
            int right0 = right[0];

            if (left0 == right0) {
                return Integer.compare(left[1], right[1]);
            }

            return Integer.compare(left0, right0);
        });

        int removedCount = 0;

        int endValue = intervals[0][1];

        for (int i = 1; i < intervals.length; i++) {
            int[] interval = intervals[i];

            if (isOverlap(endValue, interval)) {
                removedCount++;
                // move bigger interval:
                endValue = Math.min(endValue, interval[1]);
            } else {
                endValue = interval[1];
            }
        }

        return removedCount;
    }

    private boolean isOverlap(int endValue, int[] interval) {
        int left = interval[0];
        return left < endValue;
    }

}
