package dev.drf.leetcode.decode.xored.array;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/decode-xored-array/
 */
public class DecodeXoredArrayProblem implements Problem {
    public int[] decode(int[] encoded, int first) {
        final int n = encoded.length;
        int[] result = new int[n + 1];
        result[0] = first;

        for (int i = 0; i < n; i++) {
            int prev = result[i];
            int xored = encoded[i];

            result[i + 1] = (prev ^ xored);
        }

        return result;
    }
}
