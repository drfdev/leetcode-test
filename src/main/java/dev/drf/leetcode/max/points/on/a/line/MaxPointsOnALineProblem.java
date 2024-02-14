package dev.drf.leetcode.max.points.on.a.line;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/max-points-on-a-line/
 * Used solution:
 * https://leetcode.com/problems/max-points-on-a-line/solutions/3017341/java-solution-with-explantation
 */
public class MaxPointsOnALineProblem implements Problem {
    public int maxPoints(int[][] points) {
        final int n = points.length;

        if (n <= 2) {
            return n;
        }

        int ans = 2;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = 2;
                for (int k = j + 1; k < n; k++) {
                    int x = (points[j][1] - points[i][1]) * (points[k][0] - points[i][0]);
                    int y = (points[k][1] - points[i][1]) * (points[j][0] - points[i][0]);
                    if (x == y) {
                        temp++;
                    }
                }
                if (temp > ans) {
                    ans = temp;
                }
            }
        }

        return ans;
    }
}
