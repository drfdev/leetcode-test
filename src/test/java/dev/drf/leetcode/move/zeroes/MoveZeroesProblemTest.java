package dev.drf.leetcode.move.zeroes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MoveZeroesProblemTest {
    private final MoveZeroesProblem problem = new MoveZeroesProblem();

    private void assertArray(int[] nums, int... values) {
        assertEquals(values.length, nums.length);
        for (int i = 0; i < nums.length; i++) {
            assertEquals(values[i], nums[i]);
        }
    }

    @Test
    void example1() {
        /*
        Input: nums = [0,1,0,3,12]
        Output: [1,3,12,0,0]
         */
        int[] nums = new int[]{0, 1, 0, 3, 12};

        problem.moveZeroes(nums);

        assertArray(nums, 1, 3, 12, 0, 0);
    }

    @Test
    void example2() {
        /*
        Input: nums = [0]
        Output: [0]
         */
        int[] nums = new int[]{0};

        problem.moveZeroes(nums);

        assertArray(nums, 0);
    }
}
