package dev.drf.leetcode.how.many.numbers.are.smaller.than.the.current.number;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class HowManyNumbersAreSmallerThanTheCurrentNumberProblemTest {
    private final HowManyNumbersAreSmallerThanTheCurrentNumberProblem problem = new HowManyNumbersAreSmallerThanTheCurrentNumberProblem();

    @Test
    void example1() {
        /*
        Input: nums = [8,1,2,2,3]
        Output: [4,0,1,1,3]
         */
        int[] nums = {8, 1, 2, 2, 3};

        var out = problem.smallerNumbersThanCurrent(nums);

        var expected = new int[]{4, 0, 1, 1, 3};
        assertArrayEquals(expected, out);
    }

    @Test
    void example2() {
        /*
        Input: nums = [6,5,4,8]
        Output: [2,1,0,3]
         */
        int[] nums = {6, 5, 4, 8};

        var out = problem.smallerNumbersThanCurrent(nums);

        var expected = new int[]{2, 1, 0, 3};
        assertArrayEquals(expected, out);
    }

    @Test
    void example3() {
        /*
        Input: nums = [7,7,7,7]
        Output: [0,0,0,0]
         */
        int[] nums = {7, 7, 7, 7};

        var out = problem.smallerNumbersThanCurrent(nums);

        var expected = new int[]{0, 0, 0, 0};
        assertArrayEquals(expected, out);
    }
}
