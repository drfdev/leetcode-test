package dev.drf.leetcode.insert.interval;

import dev.drf.leetcode.Problem;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/insert-interval/
 */
public class InsertIntervalProblem implements Problem {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> result = new ArrayList<>();
        int[] tempInterval = new int[2];
        tempInterval[0] = newInterval[0];
        tempInterval[1] = newInterval[1];

        for (int[] interval : intervals) {
            if (tempInterval == null || interval[1] < tempInterval[0]) {
                // lower
                result.add(interval);
            } else if (interval[0] > tempInterval[1]) {
                // bigger
                result.add(tempInterval);
                result.add(interval);
                tempInterval = null;
            } else {
                // overlap
                tempInterval[0] = Math.min(interval[0], tempInterval[0]);
                tempInterval[1] = Math.max(interval[1], tempInterval[1]);
            }
        }

        if (tempInterval != null) {
            result.add(tempInterval);
        }

        return result.toArray(new int[0][]);
    }
}
