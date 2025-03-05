package dev.drf.leetcode.count.total.number.of.colored.cells;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/count-total-number-of-colored-cells/
 */
public class CountTotalNumberOfColoredCellsProblem implements Problem {
    public long coloredCells(int n) {
        if (n == 1) {
            return 1L;
        }

/*
1
5       = 1 + 4     = 1 + 4                             = 1 + 1*4
13      = 5 + 8     = 1 + 4 + 2*4                       = 1 + 3*4
25      = 13 + 12   = 1 + 4 + 2*4 + 3*4                 = 1 + 6*4
41      = 25 + 16   = 1 + 4 + 2*4 + 3*4 + 4*4           = 1 + 10*4
61      = 41 + 20   = 1 + 4 + 2*4 + 3*4 + 4*4 + 5*4     = 1 + 15*4
*/
        return 1L + triNumSeq(n - 1) * 4L;
    }

    private long triNumSeq(long n) {
        // triangular number sequence
        return n * (n + 1) / 2;
    }
}
