package dev.drf.leetcode.find.the.difference;

import dev.drf.leetcode.Problem;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/find-the-difference/
 */
public class FindTheDifferenceProblem implements Problem {
    public char findTheDifference(String s, String t) {
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();

        Arrays.sort(sChars);
        Arrays.sort(tChars);

        for (int i = 0; i < sChars.length; i++) {
            char sCh = sChars[i];
            char tCh = tChars[i];

            if (sCh != tCh) {
                return tCh;
            }
        }

        return tChars[sChars.length];
    }
}
