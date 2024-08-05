package dev.drf.leetcode.maximum.nesting.depth.of.the.parentheses;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/maximum-nesting-depth-of-the-parentheses/
 */
public class MaximumNestingDepthOfTheParenthesesProblem implements Problem {
    private static final char OPEN_PARENTHESES = '(';
    private static final char CLOSE_PARENTHESES = ')';

    public int maxDepth(String s) {
        var chars = s.toCharArray();

        int counter = 0;
        int max = 0;
        for (char ch : chars) {
            if (ch == OPEN_PARENTHESES) {
                counter++;
                max = Math.max(max, counter);
            } else if (ch == CLOSE_PARENTHESES) {
                counter--;
            }
        }

        return max;
    }
}
