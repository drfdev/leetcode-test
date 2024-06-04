package dev.drf.leetcode.permutation.difference.between.two.strings;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/permutation-difference-between-two-strings/
 */
public class PermutationDifferenceBetweenTwoStringsProblem implements Problem {
    public int findPermutationDifference(String s, String t) {
        if (s == null || s.isEmpty()) {
            return 0;
        }

        int[][] lettres = new int[26][2];
        var size = s.length();

        for (int i = 0; i < size; i++) {
            var sChar = s.charAt(i);
            var tChar = t.charAt(i);

            int sIndex = sChar - 'a';
            var sValues = lettres[sIndex];
            sValues[0] += i;

            int tIndex = tChar - 'a';
            var tValues = lettres[tIndex];
            tValues[1] += i;
        }

        int result = 0;
        for (int[] values : lettres) {
            var sSum = values[0];
            var tSum = values[1];

            if (sSum > 0 || tSum > 0) {
                result += Math.abs(sSum - tSum);
            }
        }
        return result;
    }
}
