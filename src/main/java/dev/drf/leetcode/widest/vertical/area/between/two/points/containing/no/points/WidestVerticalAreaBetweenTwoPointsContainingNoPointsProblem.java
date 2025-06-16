package dev.drf.leetcode.widest.vertical.area.between.two.points.containing.no.points;

import java.util.Arrays;
import java.util.Comparator;

/**
 * https://leetcode.com/problems/widest-vertical-area-between-two-points-containing-no-points/
 */
public class WidestVerticalAreaBetweenTwoPointsContainingNoPointsProblem {
    private static final Comparator<int[]> COMPARATOR = Comparator.comparingInt(value -> value[0]);

    public int maxWidthOfVerticalArea(int[][] points) {
        if (points.length < 2) {
            return 0;
        }

        // points[i] = [xi, yi]
        Arrays.sort(points, COMPARATOR);

        int maxWidth = 0;
        for (int i = 1; i < points.length; i++) {
            int first = points[i - 1][0];
            int second = points[i][0];

            maxWidth = Math.max(maxWidth, (second - first));
        }

        return maxWidth;
    }
}
