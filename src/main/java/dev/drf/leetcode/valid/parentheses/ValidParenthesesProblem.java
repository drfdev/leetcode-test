package dev.drf.leetcode.valid.parentheses;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/valid-parentheses/
 */
public class ValidParenthesesProblem implements Problem {
    private static final char ROUND_BRACKETS_OP = '(';
    private static final char ROUND_BRACKETS_CL = ')';

    private static final char SQUARE_BRACKETS_OP = '[';
    private static final char SQUARE_BRACKETS_CL = ']';

    private static final char CURLY_BRACKETS_OP = '{';
    private static final char CURLY_BRACKETS_CL = '}';

    public boolean isValid(String s) {
        if (s == null) {
            return false;
        }

        int roundBrackets = 0;
        int squareBrackets = 0;
        int curlyBrackets = 0;

        char[] chars = s.toCharArray();
        MyStack stack = new MyStack(chars.length);

        for (char val : chars) {
            if (val == ROUND_BRACKETS_OP) {
                roundBrackets++;
                stack.push(ROUND_BRACKETS_OP);
            } else if (val == ROUND_BRACKETS_CL) {
                if (roundBrackets == 0) {
                    return false;
                }
                char value = stack.pop();
                if (value != ROUND_BRACKETS_OP) {
                    return false;
                }
                roundBrackets--;
            } else if (val == SQUARE_BRACKETS_OP) {
                squareBrackets++;
                stack.push(SQUARE_BRACKETS_OP);
            } else if (val == SQUARE_BRACKETS_CL) {
                if (squareBrackets == 0) {
                    return false;
                }
                char value = stack.pop();
                if (value != SQUARE_BRACKETS_OP) {
                    return false;
                }
                squareBrackets--;
            } else if (val == CURLY_BRACKETS_OP) {
                curlyBrackets++;
                stack.push(CURLY_BRACKETS_OP);
            } else if (val == CURLY_BRACKETS_CL) {
                if (curlyBrackets == 0) {
                    return false;
                }
                char value = stack.pop();
                if (value != CURLY_BRACKETS_OP) {
                    return false;
                }
                curlyBrackets--;
            }
        }

        return roundBrackets == 0
                && squareBrackets == 0
                && curlyBrackets == 0;
    }

    private static class MyStack {
        private final char[] stack;
        private int cursor = 0;

        public MyStack(int len) {
            this.stack = new char[len];
        }

        public void push(char value) {
            this.stack[cursor] = value;
            cursor ++;
        }

        public char pop() {
            cursor --;
            return this.stack[cursor];
        }
    }
}
