package dev.drf.leetcode.final_value.of.variable.after.performing.operations;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/final-value-of-variable-after-performing-operations/
 */
public class FinalValueOfVariableAfterPerformingOperationsProblem implements Problem {
    public int finalValueAfterOperations(String[] operations) {
        final String increment1 = "++X";
        final String increment2 = "X++";

        final String decrement1 = "--X";
        final String decrement2 = "X--";

        int result = 0;
        for (String operation : operations) {
            if (operation.equals(increment1) || operation.equals(increment2)) {
                result++;
            }
            if (operation.equals(decrement1) || operation.equals(decrement2)) {
                result--;
            }
        }

        return result;
    }
}
