package dev.drf.leetcode.number.of.steps.to.reduce.a.number.in.binary.representation.to.one;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/number-of-steps-to-reduce-a-number-in-binary-representation-to-one/
 */
@Deprecated
public class NumberOfStepsToReduceANumberInBinaryRepresentationToOneProblem implements Problem {
    public int numSteps(String s) {
        if (s.length() == 1) {
            return 0;
        }

        long value = toInt(s);
        int steps = 0;
        while (value > 1L) {
            if (value % 2 == 0) {
                // even
                value = value >> 1;
            } else {
                // odd
                value++;
            }
            steps++;
        }
        return steps;
    }

    private long toInt(String s) {
        long result = 0;
        var chars = s.toCharArray();
        for (char ch : chars) {
            int next = ch == '1' ? 1 : 0;
            result = (result << 1) + next;
        }

        return result;
    }


}
