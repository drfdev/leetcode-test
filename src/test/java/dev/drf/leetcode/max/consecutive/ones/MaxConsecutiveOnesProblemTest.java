package dev.drf.leetcode.max.consecutive.ones;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaxConsecutiveOnesProblemTest {
    private final MaxConsecutiveOnesProblem problem = new MaxConsecutiveOnesProblem();

    @Test
    void example1() {
        /*
        Input: nums = [1,1,0,1,1,1]
        Output: 3
         */
        int[] nums = new int[]{1, 1, 0, 1, 1, 1};

        var value = problem.findMaxConsecutiveOnes(nums);

        assertEquals(3, value);
    }

    @Test
    void example2() {
        /*
        Input: nums = [1,0,1,1,0,1]
        Output: 2
         */
        int[] nums = new int[]{1, 0, 1, 1, 0, 1};

        var value = problem.findMaxConsecutiveOnes(nums);

        assertEquals(2, value);
    }
}
