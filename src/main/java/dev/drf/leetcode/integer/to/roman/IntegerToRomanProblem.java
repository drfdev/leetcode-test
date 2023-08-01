package dev.drf.leetcode.integer.to.roman;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/integer-to-roman/
 */
public class IntegerToRomanProblem implements Problem {
    public String intToRoman(int num) {
        /*
Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
         */
        int value = num;
        StringBuilder sb = new StringBuilder();

        int[] values = new int[]{
                1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1
        };
        String[] chars = new String[]{
                "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"
        };

        for (int n = 0; n < values.length; n++) {
            int nVal = values[n];
            String nRoman = chars[n];

            if (value >= nVal) {
                int count = value / nVal;
                value = value % nVal;
                for (int i = 0; i < count; i++) {
                    sb.append(nRoman);
                }
            }
        }

        return sb.toString();
    }
}
