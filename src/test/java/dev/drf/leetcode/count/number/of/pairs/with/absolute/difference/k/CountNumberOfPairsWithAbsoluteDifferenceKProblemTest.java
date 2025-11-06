package dev.drf.leetcode.count.number.of.pairs.with.absolute.difference.k;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountNumberOfPairsWithAbsoluteDifferenceKProblemTest {
    private final CountNumberOfPairsWithAbsoluteDifferenceKProblem problem = new CountNumberOfPairsWithAbsoluteDifferenceKProblem();

    @Test
    void example1() {
        // Input: nums = [1,2,2,1], k = 1
        // Output: 4
        int[] nums = {1, 2, 2, 1};
        int k = 1;

        int out = problem.countKDifference(nums, k);

        assertEquals(4, out);
    }

    @Test
    void example2() {
        // Input: nums = [1,3], k = 3
        // Output: 0
        int[] nums = {1, 3};
        int k = 3;

        int out = problem.countKDifference(nums, k);

        assertEquals(0, out);
    }

    @Test
    void example3() {
        // Input: nums = [3,2,1,5,4], k = 2
        // Output: 3
        int[] nums = {3, 2, 1, 5, 4};
        int k = 2;

        int out = problem.countKDifference(nums, k);

        assertEquals(3, out);
    }
}
