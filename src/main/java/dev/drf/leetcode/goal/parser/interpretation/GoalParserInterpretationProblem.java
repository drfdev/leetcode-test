package dev.drf.leetcode.goal.parser.interpretation;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/goal-parser-interpretation
 */
public class GoalParserInterpretationProblem implements Problem {
    public String interpret(String command) {
        StringBuilder sb = new StringBuilder();

        var chars = command.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char ch = chars[i];
            if (ch == 'G') {
                sb.append('G');
            } else if (ch == '(') {
                i++;
                char next = chars[i];
                if (next == ')') {
                    sb.append('o');
                } else if (next == 'a') {
                    sb.append("al");
                    i = i + 2;
                }
            }
        }

        return sb.toString();
    }
}
