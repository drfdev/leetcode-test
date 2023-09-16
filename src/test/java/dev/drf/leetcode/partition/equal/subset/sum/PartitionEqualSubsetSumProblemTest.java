package dev.drf.leetcode.partition.equal.subset.sum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PartitionEqualSubsetSumProblemTest {
    private final PartitionEqualSubsetSumProblem problem = new PartitionEqualSubsetSumProblem();

    @Test
    void example1() {
        /*
        Input: nums = [1,5,11,5]
        Output: true
         */
        int[] nums = new int[]{
                1, 5, 11, 5
        };

        var valid = problem.canPartition(nums);

        assertTrue(valid);
    }

    @Test
    void example2() {
        /*
        Input: nums = [1,2,3,5]
        Output: false
         */
        int[] nums = new int[]{
                1, 2, 3, 5
        };

        var valid = problem.canPartition(nums);

        assertFalse(valid);
    }
}
