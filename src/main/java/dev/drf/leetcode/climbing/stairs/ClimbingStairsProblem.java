package dev.drf.leetcode.climbing.stairs;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/climbing-stairs/
 * Used solution:
 * https://www.youtube.com/watch?v=Y0lT9Fck7qI
 */
public class ClimbingStairsProblem implements Problem {
    public int climbStairs(int n) {
        int one = 1;
        int two = 1;
        int temp;

        for (int i = 0; i < n - 1; i++) {
            temp = one + two;
            two = one;
            one = temp;
        }

        return one;
    }
}
