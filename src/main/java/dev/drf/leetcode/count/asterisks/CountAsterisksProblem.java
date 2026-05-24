package dev.drf.leetcode.count.asterisks;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/count-asterisks/
 */
public class CountAsterisksProblem implements Problem {
    public int countAsterisks(String s) {
        final char[] chars = s.toCharArray();

        boolean ignore = false;
        int count = 0;
        for (char ch : chars) {
            if (ch == '|') {
                ignore = !ignore;
            } else if (ch == '*') {
                if (!ignore) {
                    count++;
                }
            }
        }

        return count;
    }
}
