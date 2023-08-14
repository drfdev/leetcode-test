package dev.drf.leetcode.single.number.ii;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SingleNumberIIProblemTest {
    private final SingleNumberIIProblem problem = new SingleNumberIIProblem();

    @Test
    void example1() {
        /*
        Input: nums = [2,2,3,2]
        Output: 3
         */
        int[] nums = new int[]{
                2, 2, 3, 2
        };

        var value = problem.singleNumber(nums);

        assertEquals(3, value);
    }

    @Test
    void example2() {
        /*
        Input: nums = [0,1,0,1,0,1,99]
        Output: 99
         */
        int[] nums = new int[]{
                0, 1, 0, 1, 0, 1, 99
        };

        var value = problem.singleNumber(nums);

        assertEquals(99, value);
    }
}
