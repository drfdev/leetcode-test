package dev.drf.leetcode.construct.the.minimum.bitwise.array.i;

import dev.drf.leetcode.Problem;

import java.util.List;

/**
 * https://leetcode.com/problems/construct-the-minimum-bitwise-array-i/
 * Used solution:
 * https://leetcode.com/problems/construct-the-minimum-bitwise-array-i/solutions/7508394/minimum-bitwise-array-bitwise-tricks-by-icpzb/
 */
public class ConstructTheMinimumBitwiseArrayIProblem implements Problem {
    public int[] minBitwiseArray(List<Integer> nums) {
        int[] res = new int[nums.size()];
        for (int i = 0; i < nums.size(); i++) {
            int n = nums.get(i);
            if ((n & 1) == 1) {
                res[i] = n & ~(((n + 1) & ~n) >> 1);
            } else {
                res[i] = -1;
            }
        }
        return res;
    }
}
