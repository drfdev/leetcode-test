package dev.drf.leetcode.regular.expression.matching;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/regular-expression-matching/
 * Used solution:
 * https://www.youtube.com/watch?v=HAA8mgxlov8
 */
public class RegularExpressionMatchingProblem implements Problem {
    public boolean isMatch(String s, String p) {
        final int slen = s.length();
        final int plen = p.length();

        boolean[][] cache = new boolean[slen + 1][plen + 1];
        return dfs(cache, s, p, 0, 0);
    }

    private boolean dfs(boolean[][] cache,
                        String s,
                        String p,
                        int i,
                        int j) {
        if (cache[i][j]) {
            return cache[i][j];
        }

        if (i >= s.length()
                && j >= p.length()) {
            return true;
        }

        if (j >= p.length()) {
            return false;
        }

        boolean match = i < s.length()
                && (s.charAt(i) == p.charAt(j) || p.charAt(j) == '.');

        if (j + 1 < p.length()
                && p.charAt(j + 1) == '*') {
            cache[i][j] = dfs(cache, s, p, i, j + 2)
                    || (match && dfs(cache, s, p, i + 1, j));
        } else {
            cache[i][j] = match
                    && dfs(cache, s, p, i + 1, j + 1);
        }

        return cache[i][j];
    }
}
