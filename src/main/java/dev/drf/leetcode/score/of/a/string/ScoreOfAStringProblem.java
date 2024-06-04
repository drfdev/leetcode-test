package dev.drf.leetcode.score.of.a.string;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/score-of-a-string/
 */
public class ScoreOfAStringProblem implements Problem {
    public int scoreOfString(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }

        var size = s.length();
        var count = size - 1;
        var chars = s.toCharArray();
        var result = 0;

        for (int i = 0; i < count; i++) {
            var index1 = i;
            var index2 = i + 1;

            var ch1 = chars[index1];
            var ch2 = chars[index2];

            int value = Math.abs(ch1 - ch2);
            result += value;
        }

        return result;
    }
}
