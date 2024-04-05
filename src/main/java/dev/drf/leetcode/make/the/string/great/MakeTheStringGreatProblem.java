package dev.drf.leetcode.make.the.string.great;

import dev.drf.leetcode.Problem;

import java.util.Deque;
import java.util.LinkedList;

/**
 * https://leetcode.com/problems/make-the-string-great/
 */
public class MakeTheStringGreatProblem implements Problem {
    public String makeGood(String s) {
        Deque<Character> stack = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            if (!stack.isEmpty() && Math.abs(stack.peek() - s.charAt(i)) == 32) {
                stack.pop();
            } else {
                stack.push(s.charAt(i));
            }
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        return sb.reverse()
                .toString();
    }
}
