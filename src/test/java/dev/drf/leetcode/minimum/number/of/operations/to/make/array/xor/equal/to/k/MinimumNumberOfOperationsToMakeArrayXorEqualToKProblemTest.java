package dev.drf.leetcode.minimum.number.of.operations.to.make.array.xor.equal.to.k;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinimumNumberOfOperationsToMakeArrayXorEqualToKProblemTest {
    private final MinimumNumberOfOperationsToMakeArrayXorEqualToKProblem problem = new MinimumNumberOfOperationsToMakeArrayXorEqualToKProblem();

    @Test
    void example1() {
        // Input: nums = [2,1,3,4], k = 1
        // Output: 2
        int[] nums = {2, 1, 3, 4};
        int k = 1;

        int num = problem.minOperations(nums, k);

        assertEquals(2, num);
    }

    @Test
    void example2() {
        // Input: nums = [2,0,2,0], k = 0
        // Output: 0
        int[] nums = {2, 0, 2, 0};
        int k = 0;

        int num = problem.minOperations(nums, k);

        assertEquals(0, num);
    }
}
