package dev.drf.leetcode.two.sum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TwoSumProblemTest {
    private final TwoSumProblem problem = new TwoSumProblem();

    @Test
    void example1() {
        /*
        Input: nums = [2,7,11,15], target = 9
        Output: [0,1]
        Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
         */
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;

        var result = problem.twoSum(nums, target);

        assertEquals(0, result[0]);
        assertEquals(1, result[1]);
    }

    @Test
    void example2() {
        /*
        Input: nums = [3,2,4], target = 6
        Output: [1,2]
         */
        int[] nums = new int[]{3, 2, 4};
        int target = 6;

        var result = problem.twoSum(nums, target);

        assertEquals(1, result[0]);
        assertEquals(2, result[1]);
    }

    @Test
    void example3() {
        /*
        Input: nums = [3,3], target = 6
        Output: [0,1]
         */
        int[] nums = new int[]{3, 3};
        int target = 6;

        var result = problem.twoSum(nums, target);

        assertEquals(0, result[0]);
        assertEquals(1, result[1]);
    }

    @Test
    void myTest1() {
        int[] nums = new int[]{-1, 3, 5};
        int target = 2;

        var result = problem.twoSum(nums, target);

        assertEquals(0, result[0]);
        assertEquals(1, result[1]);
    }

    @Test
    void myTest2() {
        int[] nums = new int[]{-8, -4, -2, 0, 2, 3, 8};
        int target = -5;

        var result = problem.twoSum(nums, target);

        assertEquals(0, result[0]);
        assertEquals(5, result[1]);
    }

    @Test
    void myTest3() {
        int[] nums = new int[]{-8, -4, -2, 0, 2, 3, 8};
        int target = 3;

        var result = problem.twoSum(nums, target);

        assertEquals(3, result[0]);
        assertEquals(5, result[1]);
    }
}
