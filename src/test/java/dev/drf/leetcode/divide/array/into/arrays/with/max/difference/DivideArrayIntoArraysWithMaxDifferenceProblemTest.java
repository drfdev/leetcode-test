package dev.drf.leetcode.divide.array.into.arrays.with.max.difference;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DivideArrayIntoArraysWithMaxDifferenceProblemTest {
    private final DivideArrayIntoArraysWithMaxDifferenceProblem problem = new DivideArrayIntoArraysWithMaxDifferenceProblem();

    @Test
    void example1() {
        /*
        Input: nums = [1,3,4,8,7,9,3,5,1], k = 2
        Output: [[1,1,3],[3,4,5],[7,8,9]]
         */
        int[] nums = new int[]{
                1, 3, 4, 8, 7, 9, 3, 5, 1
        };
        int k = 2;

        var out = problem.divideArray(nums, k);

        assertArrayEquals(out[0], new int[]{1, 1, 3});
        assertArrayEquals(out[1], new int[]{3, 4, 5});
        assertArrayEquals(out[2], new int[]{7, 8, 9});
    }

    @Test
    void example2() {
        /*
        Input: nums = [1,3,3,2,7,3], k = 3
        Output: []
         */
        int[] nums = new int[]{
                1, 3, 3, 2, 7, 3
        };
        int k = 2;

        var out = problem.divideArray(nums, k);

        assertEquals(0, out.length);
    }
}
