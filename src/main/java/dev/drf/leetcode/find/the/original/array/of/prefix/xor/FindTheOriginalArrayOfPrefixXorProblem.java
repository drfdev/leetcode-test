package dev.drf.leetcode.find.the.original.array.of.prefix.xor;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/find-the-original-array-of-prefix-xor/
 */
public class FindTheOriginalArrayOfPrefixXorProblem implements Problem {
    public int[] findArray(int[] pref) {
        if (pref.length == 1) {
            return pref;
        }

        final int[] arr = new int[pref.length];
        arr[0] = pref[0];
        int pr = pref[0];

        for (int i = 1; i < pref.length; i++) {
            arr[i] = pref[i] ^ pr;
            pr = pr ^ arr[i];
        }

        return arr;
    }
}
