package dev.drf.leetcode.longest.valid.parentheses;

import dev.drf.leetcode.Problem;

import java.util.Deque;
import java.util.LinkedList;

/**
 * https://leetcode.com/problems/longest-valid-parentheses/
 * Used solution:
 * https://leetcode.com/problems/longest-valid-parentheses/solutions/14167/simple-java-solution-o-n-time-one-stack/
 */
public class LongestValidParenthesesProblem implements Problem {
    public int longestValidParentheses(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }

        Deque<Integer> stack = new LinkedList<>();
        int max = 0;
        int left = -1;

        for (int j = 0; j < s.length(); j++) {
            char ch = s.charAt(j);
            if (ch == '(') {
                stack.push(j);
            } else {
                if (stack.isEmpty()) {
                    left = j;
                } else {
                    stack.pop();
                    if (stack.isEmpty()) {
                        max = Math.max(max, j - left);
                    } else {
                        int index = stack.peek();
                        max = Math.max(max, j - index);
                    }
                }
            }
        }

        return max;
    }
}
