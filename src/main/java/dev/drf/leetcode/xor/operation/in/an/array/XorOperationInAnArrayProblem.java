package dev.drf.leetcode.xor.operation.in.an.array;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/xor-operation-in-an-array/
 */
public class XorOperationInAnArrayProblem implements Problem {
    public int xorOperation(int n, int start) {
        // nums[i] = start + 2 * i
        int result = start;
        for (int i = 1; i < n; i++) {
            result = result ^ (start + 2 * i);
        }
        return result;
    }
}
