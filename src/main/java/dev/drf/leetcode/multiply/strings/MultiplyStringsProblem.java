package dev.drf.leetcode.multiply.strings;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/multiply-strings/
 */
public class MultiplyStringsProblem implements Problem {
    public String multiply(String num1, String num2) {
        if ("0".equals(num1) || "0".equals(num2)) {
            return "0";
        }

        char[] arr1 = num1.toCharArray();
        char[] arr2 = num2.toCharArray();

        int[] result = new int[arr1.length + arr2.length];
        int len = 1;
        for (int j = arr2.length - 1; j >= 0; j--) {
            int first = arr2.length - j - 1;
            for (int i = arr1.length - 1; i >= 0; i--) {
                int val1 = arr1[i] - '0';
                int val2 = arr2[j] - '0';

                int res = val1 * val2;
                int index = arr1.length - i - 1;
                result[first + index] = result[first + index] + res;
                len = Math.max(len, first + index + 1);
            }
        }

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < len; i++) {
            int val = result[i];
            if (val > 9) {
                int mod = val / 10;
                val = val % 10;
                result[i + 1] += mod;
                len = Math.max(len, i + 2);
            }
            builder.append(val);
        }
        return builder.reverse().toString();
    }
}
