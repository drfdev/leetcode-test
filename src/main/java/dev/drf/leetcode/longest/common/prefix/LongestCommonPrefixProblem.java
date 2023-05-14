package dev.drf.leetcode.longest.common.prefix;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/longest-common-prefix/
 */
public class LongestCommonPrefixProblem implements Problem {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        if (strs.length == 1) {
            return strs[0];
        }

        int index = 0;
        int len = strs.length;

        stop: while (true) {
            if (strs[0].length() <= index) {
                break;
            }

            char chi = strs[0].charAt(index);
            for (int i = 1; i < len; i++) {
                if (strs[i].length() <= index) {
                    break stop;
                }
                var strChar = strs[i].charAt(index);
                if (strChar != chi) {
                    break stop;
                }
            }

            index++;
        }

        if (index == 0) {
            return "";
        }

        return strs[0].substring(0, index);
    }
}
