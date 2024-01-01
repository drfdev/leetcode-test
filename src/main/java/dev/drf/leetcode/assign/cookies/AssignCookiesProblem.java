package dev.drf.leetcode.assign.cookies;

import dev.drf.leetcode.Problem;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/assign-cookies/
 */
public class AssignCookiesProblem implements Problem {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int child = 0;
        for (int i = 0; i < s.length; i++) {
            if (g[child] <= s[i]) {
                child++;
                if (child >= g.length) {
                    break;
                }
            }
        }

        return child;
    }
}
