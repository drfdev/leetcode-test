package dev.drf.leetcode.partition.array_for.maximum.sum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PartitionArrayForMaximumSumProblemTest {
    private final PartitionArrayForMaximumSumProblem problem = new PartitionArrayForMaximumSumProblem();

    @Test
    void example1() {
        /*
        Input: arr = [1,15,7,9,2,5,10], k = 3
        Output: 84
         */
        int[] arr = {1, 15, 7, 9, 2, 5, 10};
        int k = 3;

        var out = problem.maxSumAfterPartitioning(arr, k);

        assertEquals(84, out);
    }

    @Test
    void example2() {
        /*
        Input: arr = [1,4,1,5,7,3,6,1,9,9,3], k = 4
        Output: 83
         */
        int[] arr = {1, 4, 1, 5, 7, 3, 6, 1, 9, 9, 3};
        int k = 4;

        var out = problem.maxSumAfterPartitioning(arr, k);

        assertEquals(83, out);
    }

    @Test
    void example3() {
        /*
        Input: arr = [1], k = 1
        Output: 1
         */
        int[] arr = {1};
        int k = 1;

        var out = problem.maxSumAfterPartitioning(arr, k);

        assertEquals(1, out);
    }
}
