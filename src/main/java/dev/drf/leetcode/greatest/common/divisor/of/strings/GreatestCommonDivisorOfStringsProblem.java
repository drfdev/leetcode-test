package dev.drf.leetcode.greatest.common.divisor.of.strings;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/greatest-common-divisor-of-strings/
 * Used solution:
 * https://leetcode.com/problems/greatest-common-divisor-of-strings/solutions/3124997/super-easy-solution-fully-explained-c-python3-java/
 */
public class GreatestCommonDivisorOfStringsProblem implements Problem {
    public String gcdOfStrings(String str1, String str2) {
        if (str1 == null || str2 == null) {
            return null;
        }

        String leftToRight = str1 + str2;
        String rightToLeft = str2 + str1;

        if (!leftToRight.equals(rightToLeft)) {
            return "";
        }

        int gcd = gcd(str1.length(), str2.length());
        return str1.substring(0, gcd);
    }

    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
