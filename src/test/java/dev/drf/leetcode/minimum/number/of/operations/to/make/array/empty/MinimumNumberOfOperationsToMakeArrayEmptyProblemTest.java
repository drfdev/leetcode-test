package dev.drf.leetcode.minimum.number.of.operations.to.make.array.empty;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinimumNumberOfOperationsToMakeArrayEmptyProblemTest {
    private final MinimumNumberOfOperationsToMakeArrayEmptyProblem problem = new MinimumNumberOfOperationsToMakeArrayEmptyProblem();

    @Test
    void example1() {
        /*
        Input: nums = [2,3,3,2,2,4,2,3,4]
        Output: 4
         */
        int[] nums = new int[]{
                2, 3, 3, 2, 2, 4, 2, 3, 4
        };

        var out = problem.minOperations(nums);

        assertEquals(4, out);
    }

    @Test
    void example2() {
        /*
        Input: nums = [2,1,2,2,3,3]
        Output: -1
         */
        int[] nums = new int[]{
                2, 1, 2, 2, 3, 3
        };

        var out = problem.minOperations(nums);

        assertEquals(-1, out);
    }
}
