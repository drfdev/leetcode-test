package dev.drf.leetcode.find.minimum.operations.to.make.all.elements.divisible.by.three;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/find-minimum-operations-to-make-all-elements-divisible-by-three
 */
public class FindMinimumOperationsToMakeAllElementsDivisibleByThreeProblem implements Problem {
    public int minimumOperations(int[] nums) {
        int operationCount = 0;

        for (int num : nums) {
            operationCount += num % 3 == 0 ? 0 : 1;
        }

        return operationCount;
    }
}
