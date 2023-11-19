package dev.drf.leetcode.reduction.operations.to.make.the.array.elements.equal;

import dev.drf.leetcode.Problem;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/reduction-operations-to-make-the-array-elements-equal/
 * Used solution:
 * https://leetcode.com/problems/reduction-operations-to-make-the-array-elements-equal/solutions/1253877/sort-and-count/
 */
public class ReductionOperationsToMakeTheArrayElementsEqualProblem implements Problem {
    public int reductionOperations(int[] nums) {
        final int size = nums.length;

        Arrays.sort(nums);

        int opCount = 0;
        for (int i = size - 1; i > 0; i--) {
            int current = nums[i];
            int prev = nums[i - 1];
            if (current != prev) {
                opCount += size - i;
            }
        }

        return opCount;
    }
}
