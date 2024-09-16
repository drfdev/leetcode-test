package dev.drf.leetcode.minimum.time.difference;

import dev.drf.leetcode.Problem;

import java.util.Arrays;
import java.util.List;

/**
 * https://leetcode.com/problems/minimum-time-difference/
 */
public class MinimumTimeDifferenceProblem implements Problem {
    public int findMinDifference(List<String> timePoints) {
        var times = buildTimes(timePoints);

        Arrays.sort(times);

        int minutes = Integer.MAX_VALUE;

        for (int i = 1; i < times.length; i++) {
            var left = times[i - 1];
            var right = times[i];

            int diff = right - left;
            minutes = Math.min(minutes, diff);
        }

        minutes = Math.min(minutes, 1440 - (times[times.length - 1] - times[0]));

        return minutes;
    }

    private int[] buildTimes(List<String> timePoints) {
        final int size = timePoints.size();
        int[] times = new int[size];
        for (int i = 0; i < timePoints.size(); i++) {
            // "23:59"
            var point = timePoints.get(i);

            int hours = chatToInt(point.charAt(0)) * 10 + chatToInt(point.charAt(1));
            int minutes = chatToInt(point.charAt(3)) * 10 + chatToInt(point.charAt(4));

            times[i] = hours * 60 + minutes;
            if (times[i] == 0) {
                times[i] = 1440;
            }

        }
        return times;
    }

    private int chatToInt(char ch) {
        return ch - '0';
    }
}
