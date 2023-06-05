package dev.drf.leetcode.check.if_it.is.a.straight.line;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/check-if-it-is-a-straight-line/
 */
public class CheckIfItIsAStraightLineProblem implements Problem {
    public boolean checkStraightLine(int[][] coordinates) {
        final int size = coordinates.length;
        if (size < 3) {
            return true;
        }

        // y = m(x + x0)
        // m = y / (x + x0)
        // m = (y2 - y1) / (x2 - x1)

        int[] point0 = coordinates[0];
        int[] point1 = coordinates[1];

        if (point1[0] - point0[0] == 0) {
            for (int i = 2; i < coordinates.length; i++) {
                int[] ipoint = coordinates[i];
                int xi = ipoint[0];

                if (xi != point1[0]) {
                    return false;
                }
            }
            return true;
        }
        if (point1[1] - point0[1] == 0) {
            for (int i = 2; i < coordinates.length; i++) {
                int[] ipoint = coordinates[i];
                int yi = ipoint[1];

                if (yi != point0[1]) {
                    return false;
                }
            }
            return true;
        }

        final double m = (double) (point1[1] - point0[1]) / (double) (point1[0] - point0[0]);

        // y - y0 = m(x - x0)
        // y = mx - m*x0 + y0 ==> b = y0 - m * x0

//        final double b = point0[1] - m * point0[0];

        for (int i = 2; i < coordinates.length; i++) {
            int[] ipoint = coordinates[i];

            double calc = (double) (ipoint[1] - point0[1]) / (double) (ipoint[0] - point0[0]);

            if (Double.compare(calc, m) != 0) {
                return false;
            }
        }

        return true;
    }
}
