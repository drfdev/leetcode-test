package dev.drf.leetcode.third.maximum.number;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ThirdMaximumNumberProblemTest {
    private final ThirdMaximumNumberProblem problem = new ThirdMaximumNumberProblem();

    @Test
    void example1() {
        /*
        Input: nums = [3,2,1]
        Output: 1
         */
        int[] nums = {3, 2, 1};

        var out = problem.thirdMax(nums);

        assertEquals(1, out);
    }

    @Test
    void example2() {
        /*
        Input: nums = [1,2]
        Output: 2
         */
        int[] nums = {1, 2};

        var out = problem.thirdMax(nums);

        assertEquals(2, out);
    }

    @Test
    void example3() {
        /*
        Input: nums = [2,2,3,1]
        Output: 1
         */
        int[] nums = {2, 2, 3, 1};

        var out = problem.thirdMax(nums);

        assertEquals(1, out);
    }

    @Test
    void failed1() {
        // nums = [1,1,2]
        int[] nums = {1, 1, 2};

        var out = problem.thirdMax(nums);

        assertEquals(2, out);
    }

    @Test
    void failed2() {
        // nums = [5,2,2]
        int[] nums = {5, 2, 2};

        var out = problem.thirdMax(nums);

        assertEquals(5, out);
    }

    @Test
    void failed3() {
        // nums = [1,2,2,5,3,5]
        int[] nums = {1, 2, 2, 5, 3, 5};

        var out = problem.thirdMax(nums);

        assertEquals(2, out);
    }

    @Test
    void failed4() {
        // nums = [1,2,-2147483648]
        int[] nums = {1, 2, -2147483648};

        var out = problem.thirdMax(nums);

        assertEquals(-2147483648, out);
    }
}
