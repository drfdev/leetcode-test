package dev.drf.leetcode.roman.to.integer;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/roman-to-integer/
 */
public class RomanToIntegerProblem implements Problem {
    public int romanToInt(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        char[] chars = s.toCharArray();
        int sum = 0;
        int lastVal = -1;

        for (int i = chars.length - 1; i >= 0; i--) {
            char lastChar = chars[i];
            int value = charToInt(lastChar);
            /*
            I can be placed before V (5) and X (10) to make 4 and 9.
            X can be placed before L (50) and C (100) to make 40 and 90.
            C can be placed before D (500) and M (1000) to make 400 and 900.
             */
            if (((lastVal == 5 || lastVal == 10)
                    && value == 1)
                    || ((lastVal == 50 || lastVal == 100)
                    && value == 10)
                    || ((lastVal == 500 || lastVal == 1000)
                    && value == 100)) {
                sum -= value;
            } else {
                sum += value;
            }

            lastVal = value;
        }

        return sum;
    }

    private int charToInt(char ch) {
        switch (ch) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
        }

        return 0;
    }
}
