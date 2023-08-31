package dev.drf.leetcode.valid.parenthesis.string;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/valid-parenthesis-string/
 */
public class ValidParenthesisStringProblem implements Problem {
    public boolean checkValidString(String s) {
        if (s == null) {
            return false;
        }
        if (s.isEmpty()) {
            return true;
        }

        int parenthesisLow = 0;
        int parenthesisHigh = 0;

        char[] arr = s.toCharArray();
        for (char c : arr) {
            if (c == '*') {
                if (parenthesisLow > 0) {
                    parenthesisLow--;
                }
                parenthesisHigh++;
            } else if (c == '(') {
                parenthesisLow++;
                parenthesisHigh++;
            } else if (c == ')') {
                if (parenthesisLow > 0) {
                    parenthesisLow--;
                }
                parenthesisHigh--;
            }

            if (parenthesisHigh < 0) {
                return false;
            }
        }

        return parenthesisLow == 0;
    }
}
