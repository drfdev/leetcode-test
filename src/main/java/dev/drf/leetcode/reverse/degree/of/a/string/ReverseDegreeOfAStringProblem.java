package dev.drf.leetcode.reverse.degree.of.a.string;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/reverse-degree-of-a-string/
 */
public class ReverseDegreeOfAStringProblem implements Problem {
    public int reverseDegree(String s) {
        if (s.isEmpty()) {
            return 0;
        }

        var chars = s.toCharArray();
        int sum = 0;
        int index = 1;

        for (char ch : chars) {
            int value = (26 - (ch - 'a')) * index;
            sum = sum + value;
            index++;
        }

        return sum;
    }
}
