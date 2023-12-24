package dev.drf.leetcode.minimum.changes.to.make.alternating.binary.string;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/minimum-changes-to-make-alternating-binary-string/
 */
public class MinimumChangesToMakeAlternatingBinaryStringProblem implements Problem {
    public int minOperations(String s) {
        if (s == null) {
            return 0;
        }
        int swaps = 0;

        char[] chars = s.toCharArray();
        final int size = chars.length;
        for (int i = 0; i < size; i++) {
            char ch = chars[i];

            if (i % 2 == 0) {
                if (ch != '0') {
                    swaps++;
                }
            } else {
                if (ch != '1') {
                    swaps++;
                }
            }
        }

        return Math.min(swaps, size - swaps);
    }
}
