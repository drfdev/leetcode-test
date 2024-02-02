package dev.drf.leetcode.sort.array.by.parity;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class SortArrayByParityProblemTest {
    private final SortArrayByParityProblem problem = new SortArrayByParityProblem();

    private static boolean isEven(int value) {
        return value % 2 == 0;
    }

    @Test
    void example1() {
        /*
        Input: nums = [3,1,2,4]
        Output: [2,4,3,1]
         */
        int[] nums = new int[]{
                3, 1, 2, 4
        };

        var out = problem.sortArrayByParity(nums);

        assertTrue(isEven(out[0]));
        assertTrue(isEven(out[1]));
        assertFalse(isEven(out[2]));
        assertFalse(isEven(out[3]));

        System.out.println(Arrays.toString(out));
    }

    @Test
    void example2() {
        /*
        Input: nums = [0]
        Output: [0]
         */
        int[] nums = new int[]{
                0
        };

        var out = problem.sortArrayByParity(nums);

        assertEquals(0, out[0]);
    }

    @Test
    void failure1() {
        // [1,3]
        int[] nums = new int[]{
                1, 3
        };

        var out = problem.sortArrayByParity(nums);

        assertFalse(isEven(out[0]));
        assertFalse(isEven(out[1]));
    }
}
