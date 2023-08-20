package dev.drf.leetcode.missing.number;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MissingNumberProblemTest {
    private final MissingNumberProblem problem = new MissingNumberProblem();

    @Test
    void example1() {
        /*
        Input: nums = [3,0,1]
        Output: 2
         */
        int[] nums = new int[]{
                3, 0, 1
        };

        var number = problem.missingNumber(nums);

        assertEquals(2, number);
    }

    @Test
    void example2() {
        /*
        Input: nums = [0,1]
        Output: 2
         */
        int[] nums = new int[]{
                0, 1
        };

        var number = problem.missingNumber(nums);

        assertEquals(2, number);
    }

    @Test
    void example3() {
        /*
        Input: nums = [9,6,4,2,3,5,7,0,1]
        Output: 8
         */
        int[] nums = new int[]{
                9, 6, 4, 2, 3, 5, 7, 0, 1
        };

        var number = problem.missingNumber(nums);

        assertEquals(8, number);
    }
}
