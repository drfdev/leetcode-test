package dev.drf.leetcode.count.equal.and.divisible.pairs.in.an.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountEqualAndDivisiblePairsInAnArrayProblemTest {
    private final CountEqualAndDivisiblePairsInAnArrayProblem problem = new CountEqualAndDivisiblePairsInAnArrayProblem();

    @Test
    void example1() {
        // Input: nums = [3,1,2,2,2,1,3], k = 2
        // Output: 4
        int[] nums = {3, 1, 2, 2, 2, 1, 3};
        int k = 2;

        var out = problem.countPairs(nums, k);

        assertEquals(4, out);
    }

    @Test
    void example2() {
        // Input: nums = [1,2,3,4], k = 1
        // Output: 0
        int[] nums = {1, 2, 3, 4};
        int k = 1;

        var out = problem.countPairs(nums, k);

        assertEquals(0, out);
    }
}
