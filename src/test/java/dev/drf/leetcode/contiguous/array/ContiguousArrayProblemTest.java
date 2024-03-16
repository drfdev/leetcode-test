package dev.drf.leetcode.contiguous.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ContiguousArrayProblemTest {
    private final ContiguousArrayProblem problem = new ContiguousArrayProblem();

    @Test
    void example1() {
        /*
        Input: nums = [0,1]
        Output: 2
         */
        int[] nums = {0, 1};

        var out = problem.findMaxLength(nums);

        assertEquals(2, out);
    }

    @Test
    void example2() {
        /*
        Input: nums = [0,1,0]
        Output: 2
         */
        int[] nums = {0, 1, 0};

        var out = problem.findMaxLength(nums);

        assertEquals(2, out);
    }

    @Test
    void my1() {
        // 1, 0, 0, 1, 0, 1, 1
        int[] nums = {1, 0, 0, 1, 0, 1, 1};

        var out = problem.findMaxLength(nums);

        assertEquals(6, out);
    }


    @Test
    void my2() {
        // 1, 0, 0, 1, 0, 1, 1
        int[] nums = {1, 1, 1, 1, 1, 0, 0, 1, 0, 1};

        var out = problem.findMaxLength(nums);

        assertEquals(6, out);
    }
}
