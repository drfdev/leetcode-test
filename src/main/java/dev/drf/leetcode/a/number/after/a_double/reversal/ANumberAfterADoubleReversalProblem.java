package dev.drf.leetcode.a.number.after.a_double.reversal;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/a-number-after-a-double-reversal/
 */
public class ANumberAfterADoubleReversalProblem implements Problem {
    public boolean isSameAfterReversals(int num) {
        if (num == 0) {
            return true;
        }

        return num % 10 != 0;
    }
}
