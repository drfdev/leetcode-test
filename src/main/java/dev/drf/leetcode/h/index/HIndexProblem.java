package dev.drf.leetcode.h.index;

import dev.drf.leetcode.Problem;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/h-index/
 */
public class HIndexProblem implements Problem {
    public int hIndex(int[] citations) {
        if (citations == null) {
            return 0;
        }
        if (citations.length == 1) {
            return Math.min(1, citations[0]);
        }

        Arrays.sort(citations);
        final int size = citations.length;

        int hIndex = 0;
        int count = 0;
        for (int i = size - 1; i >= 0; i--) {
            count++;
            int val = citations[i];
            int currentHIndex = Math.min(count, val);

            if (hIndex <= currentHIndex) {
                hIndex = currentHIndex;
            } else {
                break;
            }
        }

        return hIndex;
    }
}
