package dev.drf.leetcode.divide.array.in.sets.of.k.consecutive.numbers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DivideArrayInSetsOfKConsecutiveNumbersProblemTest {
    private final DivideArrayInSetsOfKConsecutiveNumbersProblem problem = new DivideArrayInSetsOfKConsecutiveNumbersProblem();

    @Test
    void example1() {
        /*
        Input: nums = [1,2,3,3,4,4,5,6], k = 4
        Output: true
         */
        int[] nums = new int[]{
                1, 2, 3, 3, 4, 4, 5, 6
        };
        int k = 4;

        var correct = problem.isPossibleDivide(nums, k);

        assertTrue(correct);
    }

    @Test
    void example2() {
        /*
        Input: nums = [3,2,1,2,3,4,3,4,5,9,10,11], k = 3
        Output: true
         */
        int[] nums = new int[]{
                3, 2, 1, 2, 3, 4, 3, 4, 5, 9, 10, 11
        };
        int k = 3;

        var correct = problem.isPossibleDivide(nums, k);

        assertTrue(correct);
    }

    @Test
    void example3() {
        /*
        Input: nums = [1,2,3,4], k = 3
        Output: false
         */
        int[] nums = new int[]{
                1, 2, 3, 4
        };
        int k = 3;

        var correct = problem.isPossibleDivide(nums, k);

        assertFalse(correct);
    }
}
