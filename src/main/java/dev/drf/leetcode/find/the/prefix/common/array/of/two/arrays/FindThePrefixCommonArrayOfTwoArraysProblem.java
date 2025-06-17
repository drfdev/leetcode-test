package dev.drf.leetcode.find.the.prefix.common.array.of.two.arrays;

import dev.drf.leetcode.Problem;

import java.util.HashMap;

/**
 * https://leetcode.com/problems/find-the-prefix-common-array-of-two-arrays/
 */
public class FindThePrefixCommonArrayOfTwoArraysProblem implements Problem {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        final int n = A.length;
        final var amap = new HashMap<Integer, Integer>(n);
        for (int i = 0; i < n; i++) {
            amap.put(A[i], i);
        }

        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            int value = B[i];
            int aIndex = amap.get(value);
            if (aIndex <= i) {
                result[i]++;
            } else {
                result[aIndex]++;
            }

            if (i > 0) {
                result[i] += result[i - 1];
            }
        }

        return result;
    }
}
