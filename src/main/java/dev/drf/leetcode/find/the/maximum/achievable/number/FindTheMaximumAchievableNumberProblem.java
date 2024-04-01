package dev.drf.leetcode.find.the.maximum.achievable.number;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/find-the-maximum-achievable-number/
 */
public class FindTheMaximumAchievableNumberProblem implements Problem {
    public int theMaximumAchievableX(int num, int t) {
        return num + ( t * 2 );
    }
}
