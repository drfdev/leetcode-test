package dev.drf.leetcode.generate.parentheses;

import dev.drf.leetcode.Problem;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/generate-parentheses/
 * Used solution:
 * https://leetcode.com/problems/generate-parentheses/solutions/2542620/python-java-w-explanation-faster-than-96-w-proof-easy-to-understand/
 */
public class GenerateParenthesesProblem implements Problem {
    public List<String> generateParenthesis(int n) {
        List<String> parenthesis = new ArrayList<>();

        int left = 0;
        int right = 0;

        addBracket(parenthesis, left, right, n, "");

        return parenthesis;
    }

    private void addBracket(List<String> parenthesis, int left, int right, int max, String value) {
        int all = left + right;
        if (all == 2 * max) {
            parenthesis.add(value);
            return;
        }

        if (left < max) {
            addBracket(parenthesis, left + 1, right, max, value + "(");
        }

        if (left > right) {
            addBracket(parenthesis, left, right + 1, max, value + ")");
        }
    }
}
