package dev.drf.leetcode.remove.outermost.parentheses;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/remove-outermost-parentheses/
 * Used solution:
 * https://leetcode.com/problems/remove-outermost-parentheses/solutions/270022/java-c-python-count-opened-parenthesis/
 */
public class RemoveOutermostParenthesesProblem implements Problem {
    public String removeOuterParentheses(String s) {
        var sb = new StringBuilder();
        int opened = 0;
        var chars = s.toCharArray();

        for (char ch : chars) {
            if (ch == '(' && opened++ > 0) {
                sb.append(ch);
            }
            if (ch == ')' && opened-- > 1) {
                sb.append(ch);
            }
        }

        return sb.toString();
    }
}
