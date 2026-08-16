package dev.drf.leetcode.count.symmetric.integers;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/count-symmetric-integers/
 */
public class CountSymmetricIntegersProblem implements Problem {
    public int countSymmetricIntegers(int low, int high) {
        // 1 <= low <= high <= 10^4 (10_000)
        int result = 0;

        for (int i = low; i <= high; i++) {
            if (i >= 10 && i < 1_00) {
                if (i % 11 == 0) {
                    result++;
                }
            } else if (i >= 1_000 && i < 10_000) {
                // ####
                int left = (i / 1_000) + ((i % 1_000) / 100);
                int right = ((i % 100) / 10) + (i % 10);
                if (left == right) {
                    result++;
                }
            }
        }

        return result;
    }
}
