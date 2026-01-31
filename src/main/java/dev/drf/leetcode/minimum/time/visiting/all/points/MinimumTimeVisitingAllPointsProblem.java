package dev.drf.leetcode.minimum.time.visiting.all.points;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/minimum-time-visiting-all-points/
 */
public class MinimumTimeVisitingAllPointsProblem implements Problem {
    public int minTimeToVisitAllPoints(int[][] points) {
        final int size = points.length;
        int times = 0;

        for (int i = 1; i < size; i++) {
            int[] point1 = points[i - 1];
            int[] point2 = points[i];

            int xDistant = Math.abs(point1[0] - point2[0]);
            int yDistant = Math.abs(point1[1] - point2[1]);

            times += Math.max(xDistant, yDistant);
        }

        return times;
    }
}
