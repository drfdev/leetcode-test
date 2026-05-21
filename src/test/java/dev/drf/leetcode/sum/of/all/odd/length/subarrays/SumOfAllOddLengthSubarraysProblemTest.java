package dev.drf.leetcode.sum.of.all.odd.length.subarrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumOfAllOddLengthSubarraysProblemTest {
    private final SumOfAllOddLengthSubarraysProblem problem = new SumOfAllOddLengthSubarraysProblem();

    @Test
    void example1() {
        // Input: arr = [1,4,2,5,3]
        // Output: 58
        int[] arr = {1, 4, 2, 5, 3};

        int out = problem.sumOddLengthSubarrays(arr);

        assertEquals(58, out);
    }

    @Test
    void example2() {
        // Input: arr = [1,2]
        // Output: 3
        int[] arr = {1, 2};

        int out = problem.sumOddLengthSubarrays(arr);

        assertEquals(3, out);
    }
}
