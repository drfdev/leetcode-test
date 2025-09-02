package dev.drf.leetcode.decompress.run.length.encoded.list;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/decompress-run-length-encoded-list/
 */
public class DecompressRunLengthEncodedListProblem implements Problem {
    public int[] decompressRLElist(int[] nums) {
        final int n = nums.length / 2;
        int expectedLen = 0;

        for (int i = 0; i < n; i++) {
            expectedLen += nums[2 * i];
        }

        int[] result = new int[expectedLen];

        int index = 0;
        for (int i = 0; i < n; i++) {
            int freq = nums[2 * i];
            int value = nums[2 * i + 1];

            while (freq > 0) {
                result[index++] = value;
                freq--;
            }
        }

        return result;
    }
}
