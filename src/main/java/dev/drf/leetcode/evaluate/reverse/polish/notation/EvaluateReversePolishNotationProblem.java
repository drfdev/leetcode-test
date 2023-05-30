package dev.drf.leetcode.evaluate.reverse.polish.notation;

import dev.drf.leetcode.Problem;

import java.util.LinkedList;

/**
 * https://leetcode.com/problems/evaluate-reverse-polish-notation/
 */
public class EvaluateReversePolishNotationProblem implements Problem {
    private static final String ADD_OPERATION = "+";
    private static final String MINUS_OPERATION = "-";
    private static final String MULTIPLY_OPERATION = "*";
    private static final String DIVISION_OPERATION = "/";

    public int evalRPN(String[] tokens) {
        LinkedList<Integer> stack = new LinkedList<>();

        for (String token : tokens) {
            if (isOperation(token)) {
                int right = stack.removeLast();
                int left = stack.removeLast();

                int calculated = calculate(left, right, token);
                stack.add(calculated);
            } else {
                stack.add(Integer.valueOf(token));
            }
        }

        return stack.removeLast();
    }

    private boolean isOperation(String token) {
        return ADD_OPERATION.equals(token)
                || MINUS_OPERATION.equals(token)
                || MULTIPLY_OPERATION.equals(token)
                || DIVISION_OPERATION.equals(token);
    }

    private int calculate(int left, int right, String token) {
        if (ADD_OPERATION.equals(token)) {
            return left + right;
        }
        if (MINUS_OPERATION.equals(token)) {
            return left - right;
        }
        if (MULTIPLY_OPERATION.equals(token)) {
            return left * right;
        }
        if (DIVISION_OPERATION.equals(token)) {
            return left / right;
        }
        throw new IllegalArgumentException(token);
    }
}
