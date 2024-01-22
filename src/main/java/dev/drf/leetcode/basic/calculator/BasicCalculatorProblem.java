package dev.drf.leetcode.basic.calculator;

import dev.drf.leetcode.Problem;

import java.util.LinkedList;

/**
 * https://leetcode.com/problems/basic-calculator/
 */
public class BasicCalculatorProblem implements Problem {

    public int calculate(String s) {
        // s consists of digits, '+', '-', '(', ')', and ' '.
        if (s == null || s.isEmpty()) {
            return 0;
        }

        LinkedList<Integer> stack = new LinkedList<>();

        int value = 0;
        int sign = 1;

        int result = 0;

        char[] chars = s.toCharArray();

        for (char ch : chars) {
            if (isDigit(ch)) {
                int val = (ch - '0');
                value = value * 10 + val;
            }
            if (ch == ' ') {
                // skip
                continue;
            }
            if (ch == '+') {
                result = result + (sign * value);
                value = 0;
                sign = 1;
            }
            if (ch == '-') {
                result = result + (sign * value);
                value = 0;
                sign = -1;
            }
            if (ch == '(') {
                stack.push(result);
                stack.push(sign);

                result = 0;
                sign = 1;
            }
            if (ch == ')') {
                result = result + (sign * value);
                value = 0;

                int prSign = stack.pop();
                int prResult = stack.pop();

                result = prResult + (prSign * result);
            }
        }

        if (value != 0) {
            result = result + sign * value;
        }

        return result;
    }

    private boolean isDigit(char ch) {
        return ch == '1'
                || ch == '2'
                || ch == '3'
                || ch == '4'
                || ch == '5'
                || ch == '6'
                || ch == '7'
                || ch == '8'
                || ch == '9'
                || ch == '0';
    }
}
