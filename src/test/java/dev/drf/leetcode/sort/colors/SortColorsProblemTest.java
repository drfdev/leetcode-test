package dev.drf.leetcode.sort.colors;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SortColorsProblemTest {
    private final SortColorsProblem problem = new SortColorsProblem();

    @Test
    void example1() {
        /*
        Input: nums = [2,0,2,1,1,0]
        Output: [0,0,1,1,2,2]
         */
        int[] nums = new int[]{
                2, 0, 2, 1, 1, 0
        };

        problem.sortColors(nums);

        assertEquals(0, nums[0]);
        assertEquals(0, nums[1]);
        assertEquals(1, nums[2]);
        assertEquals(1, nums[3]);
        assertEquals(2, nums[4]);
        assertEquals(2, nums[5]);
    }

    @Test
    void example2() {
        /*
        Input: nums = [2,0,1]
        Output: [0,1,2]
         */
        int[] nums = new int[]{
                2, 0, 1
        };

        problem.sortColors(nums);

        assertEquals(0, nums[0]);
        assertEquals(1, nums[1]);
        assertEquals(2, nums[2]);
    }
}
