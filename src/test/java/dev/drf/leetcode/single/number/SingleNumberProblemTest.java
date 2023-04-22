package dev.drf.leetcode.single.number;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SingleNumberProblemTest {
    private final SingleNumberProblem problem = new SingleNumberProblem();

    @Test
    void example1() {
        /*
        Input: nums = [2,2,1]
        Output: 1
         */
        int[] nums = new int[]{
                2, 2, 1
        };

        int value = problem.singleNumber(nums);

        assertEquals(1, value);
    }

    @Test
    void example2() {
        /*
        Input: nums = [4,1,2,1,2]
        Output: 4
         */
        int[] nums = new int[]{
                4, 1, 2, 1, 2
        };

        int value = problem.singleNumber(nums);

        assertEquals(4, value);
    }

    @Test
    void example3() {
        /*
        Input: nums = [1]
        Output: 1
         */
        int[] nums = new int[]{
                1
        };

        int value = problem.singleNumber(nums);

        assertEquals(1, value);
    }

    @Test
    void myTest1() {
        int[] nums = new int[]{
                1, 2, 4, 1, 2
        };

        int value = problem.singleNumber(nums);

        assertEquals(4, value);
    }

    @Test
    void myTest2() {
        int[] nums = new int[]{
                1, 2, 3, 4, 3, 2, 1
        };

        int value = problem.singleNumber(nums);

        assertEquals(4, value);
    }

    @Test
    void myTest3() {
        int[] nums = new int[]{
                1, 2, 1, 3, 2, 1, 1
        };

        int value = problem.singleNumber(nums);

        assertEquals(3, value);
    }

    @Test
    void fail1() {
        int[] nums = new int[]{
                -1, -1, -2
        };

        int value = problem.singleNumber(nums);

        assertEquals(-2, value);
    }

    @Test
    void fail2() {
        int[] nums = new int[]{
                1, 3, 1, -1, 3
        };

        int value = problem.singleNumber(nums);

        assertEquals(-1, value);
    }

    @Test
    void fail3() {
        int[] nums = new int[]{
                -80, 48, 777, 423, -435, 349, -988, -379, -197, 192, 13, -496, -787, 94, 329,
                -490, -230, -929, 457, 591, 75, -80, 48, 777, 423, -435, 349, -988, -379, -197,
                192, 13, -496, -787, 94, 329, -490, -230, -929, 457, 591, 75, -477
        };

        int value = problem.singleNumber(nums);

        assertEquals(-477, value);
    }
}
