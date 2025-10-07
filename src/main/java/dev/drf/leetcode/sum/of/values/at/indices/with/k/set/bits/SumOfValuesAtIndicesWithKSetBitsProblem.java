package dev.drf.leetcode.sum.of.values.at.indices.with.k.set.bits;

import dev.drf.leetcode.Problem;

import java.util.List;

/**
 * https://leetcode.com/problems/sum-of-values-at-indices-with-k-set-bits/
 */
public class SumOfValuesAtIndicesWithKSetBitsProblem implements Problem {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int sum = 0;
        for (int i = 0; i < nums.size(); i++) {
            var value = nums.get(i);
            if (isCorrectIndex(i, k)) {
                sum += value;
            }
        }
        return sum;
    }

    private boolean isCorrectIndex(int index, int k) {
        int cnt = 0;
        while (index > 0) {
            if (index % 2 == 1) {
                cnt++;
            }
            index = index >> 1;
        }
        return cnt == k;
    }
}
