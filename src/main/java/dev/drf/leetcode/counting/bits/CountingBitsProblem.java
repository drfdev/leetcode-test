package dev.drf.leetcode.counting.bits;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/counting-bits/
 * Used solution:
 * https://leetcode.com/problems/counting-bits/solutions/79539/three-line-java-solution/
 */
public class CountingBitsProblem implements Problem {
    public int[] countBits(int n) {
        if (n < 0) {
            return null;
        }
        int[] result = new int[n + 1];

        for (int i = 0; i <= n; i++) {
            result[i] = result[i / 2] + i % 2;
        }

        return result;
    }
}
