package dev.drf.leetcode.queries.on.number.of.points.inside.a.circle;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/queries-on-number-of-points-inside-a-circle/
 */
public class QueriesOnNumberOfPointsInsideACircleProblem implements Problem {
    public int[] countPoints(int[][] points, int[][] queries) {
        int[] result = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            int[] query = queries[i];
            for (int[] point : points) {
                if (isPointInsideCircle(point, query)) {
                    result[i]++;
                }
            }
        }

        return result;
    }

    private boolean isPointInsideCircle(int[] point,
                                        int[] circle) {
        // point: [xi, yi]
        // circle: [xj, yj, rj]
        final double distance = Math.sqrt(
                Math.pow((point[0] - circle[0]), 2)
                        + Math.pow((point[1] - circle[1]), 2)
        );
        return distance <= circle[2];
    }
}
