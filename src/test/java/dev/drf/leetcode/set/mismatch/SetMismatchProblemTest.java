package dev.drf.leetcode.set.mismatch;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SetMismatchProblemTest {
    private final SetMismatchProblem problem = new SetMismatchProblem();

    @Test
    void example1() {
        /*
        Input: nums = [1,2,2,4]
        Output: [2,3]
         */
        int[] nums = new int[]{
                1, 2, 2, 4
        };

        var out = problem.findErrorNums(nums);

        assertEquals(2, out[0]);
        assertEquals(3, out[1]);
    }

    @Test
    void example2() {
        /*
        Input: nums = [1,1]
        Output: [1,2]
         */
        int[] nums = new int[]{
                1, 1
        };

        var out = problem.findErrorNums(nums);

        assertEquals(1, out[0]);
        assertEquals(2, out[1]);
    }
}
