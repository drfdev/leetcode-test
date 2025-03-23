package dev.drf.leetcode.convert.date.to.binary;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/convert-date-to-binary/
 */
public class ConvertDateToBinaryProblem implements Problem {
    public String convertDateToBinary(String date) {
        // yyyy-mm-dd
        int year = 0;
        int month = 0;
        int day = 0;

        var chars = date.toCharArray();
        year = (chars[0] - '0') * 1000
                + (chars[1] - '0') * 100
                + (chars[2] - '0') * 10
                + (chars[3] - '0');
        month = (chars[5] - '0') * 10
                + (chars[6] - '0');
        day = (chars[8] - '0') * 10
                + (chars[9] - '0');

        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toBinaryString(year));
        sb.append("-");
        sb.append(Integer.toBinaryString(month));
        sb.append("-");
        sb.append(Integer.toBinaryString(day));

        return sb.toString();
    }
}
