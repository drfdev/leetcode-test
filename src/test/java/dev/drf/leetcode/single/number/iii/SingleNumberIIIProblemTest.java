package dev.drf.leetcode.single.number.iii;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SingleNumberIIIProblemTest {
    private final SingleNumberIIIProblem problem = new SingleNumberIIIProblem();

    @Test
    void example1() {
        /*
        Input: nums = [1,2,1,3,2,5]
        Output: [3,5]
         */
        int[] nums = new int[]{
                1, 2, 1, 3, 2, 5
        };

        var out = problem.singleNumber(nums);

        Arrays.sort(out);
        int[] expected = new int[]{
                3, 5
        };
        assertArrayEquals(expected, out);
    }

    @Test
    void example2() {
        /*
        Input: nums = [-1,0]
        Output: [-1,0]
         */
        int[] nums = new int[]{
                -1, 0
        };

        var out = problem.singleNumber(nums);

        Arrays.sort(out);
        int[] expected = new int[]{
                -1, 0
        };
        assertArrayEquals(expected, out);
    }

    @Test
    void example3() {
        /*
        Input: nums = [0,1]
        Output: [1,0]
         */
        int[] nums = new int[]{
                0, 1
        };

        var out = problem.singleNumber(nums);

        Arrays.sort(out);
        int[] expected = new int[]{
                0, 1
        };
        assertArrayEquals(expected, out);
    }
}
