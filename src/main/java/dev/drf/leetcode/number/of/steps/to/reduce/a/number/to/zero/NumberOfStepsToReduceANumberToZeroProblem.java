package dev.drf.leetcode.number.of.steps.to.reduce.a.number.to.zero;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/
 */
public class NumberOfStepsToReduceANumberToZeroProblem implements Problem {
    public int numberOfSteps(int num) {
        int steps = 0;

        while (num > 0) {
            final boolean even = num % 2 == 0;

            if (even) {
                num = num / 2;
            } else {
                num = num - 1;
            }
            steps++;
        }

        return steps;
    }
}
