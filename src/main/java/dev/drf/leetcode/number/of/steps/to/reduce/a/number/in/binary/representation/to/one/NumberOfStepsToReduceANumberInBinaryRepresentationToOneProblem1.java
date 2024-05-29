package dev.drf.leetcode.number.of.steps.to.reduce.a.number.in.binary.representation.to.one;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/number-of-steps-to-reduce-a-number-in-binary-representation-to-one/
 * Used solution:
 * https://leetcode.com/problems/number-of-steps-to-reduce-a-number-in-binary-representation-to-one/solutions/5223471/highly-detailed-step-by-step-explanation-with-diagram/
 */
public class NumberOfStepsToReduceANumberInBinaryRepresentationToOneProblem1 implements Problem {
    public int numSteps(String s) {
        var chars = s.toCharArray();
        var steps = 0;
        var carry = 0;

        for (int i = chars.length - 1; i > 0; i--) {
            var ch = chars[i];
            int value = ch == '1' ? 1 : 0;
            int calcValue = value + carry;

            if (calcValue == 0) {
                // even
                carry = 0;
                steps++;
            } else if (calcValue == 2) {
                // even
                carry = 1;
                steps++;
            } else {
                // odd
                carry = 1;
                steps += 2;
            }
        }

        if (carry == 1) {
            steps++;
        }

        return steps;
    }
}
