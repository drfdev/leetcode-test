package dev.drf.leetcode.bitwise.and.of.numbers.range;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/bitwise-and-of-numbers-range/
 * Used solution:
 * https://leetcode.com/problems/bitwise-and-of-numbers-range/solutions/56729/bit-operation-solution-java/
 */
public class BitwiseAndOfNumbersRangeProblem implements Problem {
    public int rangeBitwiseAnd(int left, int right) {
        if (left == 0) {
            return 0;
        }

        int i = 0; // i means we have how many bits are 0 on the right
        while (left != right) {
            left >>= 1;
            right >>= 1;
            i++;
        }
        return left << i;
    }
}
