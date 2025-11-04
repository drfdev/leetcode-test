package dev.drf.leetcode.difference.between.element.sum.and.digit.sum.of.an.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DifferenceBetweenElementSumAndDigitSumOfAnArrayProblemTest {
    private final DifferenceBetweenElementSumAndDigitSumOfAnArrayProblem problem = new DifferenceBetweenElementSumAndDigitSumOfAnArrayProblem();

    @Test
    void example1() {
        // Input: nums = [1,15,6,3]
        // Output: 9
        int[] nums = {1, 15, 6, 3};

        int sum = problem.differenceOfSum(nums);

        assertEquals(9, sum);
    }

    @Test
    void example2() {
        // Input: nums = [1,2,3,4]
        // Output: 0
        int[] nums = {1, 2, 3, 4};

        int sum = problem.differenceOfSum(nums);

        assertEquals(0, sum);
    }

    @Test
    void failed1() {
        // [2,7,8,10,8,10,1,10,5,9]
        // 27
        int[] nums = {2, 7, 8, 10, 8, 10, 1, 10, 5, 9};

        int sum = problem.differenceOfSum(nums);

        assertEquals(27, sum);
    }
}
