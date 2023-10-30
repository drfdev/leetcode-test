package dev.drf.leetcode.add.digits;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/add-digits/
 */
public class AddDigitsProblem implements Problem {
    public int addDigits(int num) {
        if (num < 10) {
            return num;
        }
        int res = 0;
        int value = num;
        while (value > 9) {
            res = 0;
            while (value > 9) {
                res += value % 10;
                value = value / 10;
            }
            res += value;
            value = res;
        }

        return res;
    }
}
