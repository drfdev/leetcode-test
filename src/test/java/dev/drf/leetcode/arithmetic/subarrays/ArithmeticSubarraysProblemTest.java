package dev.drf.leetcode.arithmetic.subarrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ArithmeticSubarraysProblemTest {
    private final ArithmeticSubarraysProblem problem = new ArithmeticSubarraysProblem();

    @Test
    void example1() {
        /*
        Input: nums = [4,6,5,9,3,7], l = [0,0,2], r = [2,3,5]
        Output: [true,false,true]
         */
        int[] nums = new int[]{
                4, 6, 5, 9, 3, 7
        };
        int[] l = new int[]{
                0, 0, 2
        };
        int[] r = new int[]{
                2, 3, 5
        };

        var res = problem.checkArithmeticSubarrays(nums, l, r);

        assertEquals(3, res.size());
        assertTrue(res.get(0));     // true,
        assertFalse(res.get(1));    // false,
        assertTrue(res.get(2));     // true
    }

    @Test
    void example2() {
        /*
        Input: nums = [-12,-9,-3,-12,-6,15,20,-25,-20,-15,-10], l = [0,1,6,4,8,7], r = [4,4,9,7,9,10]
        Output: [false,true,false,false,true,true]
         */
        int[] nums = new int[]{
                -12, -9, -3, -12, -6, 15, 20, -25, -20, -15, -10
        };
        int[] l = new int[]{
                0, 1, 6, 4, 8, 7
        };
        int[] r = new int[]{
                4, 4, 9, 7, 9, 10
        };

        var res = problem.checkArithmeticSubarrays(nums, l, r);

        assertEquals(6, res.size());
        assertFalse(res.get(0));    // false,
        assertTrue(res.get(1));     // true,
        assertFalse(res.get(2));    // false,
        assertFalse(res.get(3));    // false,
        assertTrue(res.get(4));     // true,
        assertTrue(res.get(5));     // true
    }
}
