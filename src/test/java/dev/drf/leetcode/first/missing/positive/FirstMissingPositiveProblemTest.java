package dev.drf.leetcode.first.missing.positive;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FirstMissingPositiveProblemTest {
    private final FirstMissingPositiveProblem problem = new FirstMissingPositiveProblem();

    @Test
    void example1() {
        /*
        Input: nums = [1,2,0]
        Output: 3
         */
        int[] nums = new int[]{
                1, 2, 0
        };

        var value = problem.firstMissingPositive(nums);

        assertEquals(3, value);
    }

    @Test
    void example2() {
        /*
        Input: nums = [3,4,-1,1]
        Output: 2
         */
        int[] nums = new int[]{
                3, 4, -1, 1
        };

        var value = problem.firstMissingPositive(nums);

        assertEquals(2, value);
    }

    @Test
    void example3() {
        /*
        Input: nums = [7,8,9,11,12]
        Output: 1
         */
        int[] nums = new int[]{
                7, 8, 9, 11, 12
        };

        var value = problem.firstMissingPositive(nums);

        assertEquals(1, value);
    }
}
