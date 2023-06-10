package dev.drf.leetcode.minimum.number.of.arrows.to.burst.balloons;

import dev.drf.leetcode.Problem;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/minimum-number-of-arrows-to-burst-balloons/
 */
public class MinimumNumberOfArrowsToBurstBalloonsProblem implements Problem {
    public int findMinArrowShots(int[][] points) {
        if (points == null || points.length == 0) {
            return 0;
        }
        if (points.length == 1) {
            return 1;
        }

        Arrays.sort(points, (left, right) -> {
            int left0 = left[0];
            int right0 = right[0];

            if (left0 == right0) {
                int left1 = left[1];
                int right1 = right[1];

                return Integer.compare(left1, right1);
            }

            return Integer.compare(left0, right0);
        });

        int overlap = 0;

        int prStart = points[0][0];
        int prEnd = points[0][1];
        overlap++;

        for (int i = 1; i < points.length; i++) {
            int[] point = points[i];

            int start = point[0];
            int end = point[1];

            if (prEnd >= start || prEnd >= end) {
                prStart = Math.min(prStart, start);
                prEnd = Math.min(prEnd, end);
            } else {
                overlap++;
                prStart = start;
                prEnd = end;
            }
        }

        return overlap;
    }
}
