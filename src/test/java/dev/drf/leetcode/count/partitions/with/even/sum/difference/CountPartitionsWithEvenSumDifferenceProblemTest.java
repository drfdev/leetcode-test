package dev.drf.leetcode.count.partitions.with.even.sum.difference;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountPartitionsWithEvenSumDifferenceProblemTest {
    private final CountPartitionsWithEvenSumDifferenceProblem problem = new CountPartitionsWithEvenSumDifferenceProblem();

    @Test
    void example1() {
        // Input: nums = [10,10,3,7,6]
        // Output: 4
        int[] nums = {10, 10, 3, 7, 6};

        var out = problem.countPartitions(nums);

        assertEquals(4, out);
    }

    @Test
    void example2() {
        // Input: nums = [1,2,2]
        // Output: 0
        int[] nums = {1, 2, 2};

        var out = problem.countPartitions(nums);

        assertEquals(0, out);
    }

    @Test
    void example3() {
        // Input: nums = [2,4,6,8]
        // Output: 3
        int[] nums = {2, 4, 6, 8};

        var out = problem.countPartitions(nums);

        assertEquals(3, out);
    }
}
