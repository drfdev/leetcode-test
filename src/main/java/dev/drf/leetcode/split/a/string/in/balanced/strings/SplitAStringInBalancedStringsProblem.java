package dev.drf.leetcode.split.a.string.in.balanced.strings;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/split-a-string-in-balanced-strings/
 */
public class SplitAStringInBalancedStringsProblem implements Problem {
    public int balancedStringSplit(String s) {
        int balance = 0;
        int count = 0;

        var chars = s.toCharArray();
        for (char ch : chars) {
            balance += ch == 'R' ? 1 : -1;
            if (balance == 0) {
                count++;
            }
        }

        return count;
    }
}
