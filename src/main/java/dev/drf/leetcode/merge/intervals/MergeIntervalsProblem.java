package dev.drf.leetcode.merge.intervals;

import dev.drf.leetcode.Problem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * https://leetcode.com/problems/merge-intervals/
 */
public class MergeIntervalsProblem implements Problem {
    public int[][] merge(int[][] intervals) {
        if (intervals == null) {
            return null;
        }
        if (intervals.length == 1) {
            return intervals;
        }

        List<int[]> result = new ArrayList<>();
        Arrays.sort(intervals, Comparator.comparingInt(it -> it[0]));

        int index = 1;
        int cursor = 0;

        int size = intervals.length;
        result.add(new int[]{
                intervals[0][0],
                intervals[0][1]
        });

        while (index < size) {
            int[] last = result.get(cursor);
            int[] next = intervals[index];

            if (isOverlap(last, next)) {
                last[1] = Math.max(last[1], next[1]);
            } else {
                result.add(new int[]{
                        intervals[index][0],
                        intervals[index][1]
                });
                cursor ++;
            }
            index++;
        }

        return result.toArray(int[][]::new);
    }

    private boolean isOverlap(int[] left, int[] right) {
        int leftMin = left[0];
        int leftMax = left[1];

        int rightMin = right[0];
        int rightMax = right[1];

        boolean notOverlap = (leftMin < rightMin && leftMax < rightMin)
                && (leftMin < rightMax && leftMax < rightMax);

        return !notOverlap;
    }
}
