package dev.drf.leetcode.maximum._69.number;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/maximum-69-number/
 */
public class Maximum69NumberProblem implements Problem {
    public int maximum69Number (int num) {
        int current = num;
        int multiplier = 1;
        int add = 0;

        while (current > 0) {
            int value = current % 10;
            if (value == 6) {
                add = 3 * multiplier;
            }
            current = current / 10;
            multiplier = multiplier * 10;
        }

        return (num + add);
    }
}
