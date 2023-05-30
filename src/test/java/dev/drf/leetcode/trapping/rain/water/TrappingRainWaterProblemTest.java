package dev.drf.leetcode.trapping.rain.water;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TrappingRainWaterProblemTest {
    private final TrappingRainWaterProblem problem = new TrappingRainWaterProblem();

    @Test
    void example1() {
        /*
        Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
        Output: 6
                      *
              *       * *   *
        _ * _ * * _ * * * * * *
         */
        int[] height = new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};

        var value = problem.trap(height);

        assertEquals(6, value);
    }

    @Test
    void example2() {
        /*
        Input: height = [4,2,0,3,2,5]
        Output: 9
                  *
        *         *
        *     *   *
        * *   * * *
        * * _ * * *
         */
        int[] height = new int[]{4, 2, 0, 3, 2, 5};

        var value = problem.trap(height);

        assertEquals(9, value);
    }
}
