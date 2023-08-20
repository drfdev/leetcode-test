package dev.drf.leetcode.house.robber.ii;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HouseRobberIIProblemTest {
    private final HouseRobberIIProblem problem = new HouseRobberIIProblem();

    @Test
    void example1() {
        /*
        Input: nums = [2,3,2]
        Output: 3
         */
        int[] nums = new int[]{
                2, 3, 2
        };

        var sum = problem.rob(nums);

        assertEquals(3, sum);
    }

    @Test
    void example2() {
        /*
        Input: nums = [1,2,3,1]
        Output: 4
         */
        int[] nums = new int[]{
                1, 2, 3, 1
        };

        var sum = problem.rob(nums);

        assertEquals(4, sum);
    }

    @Test
    void example3() {
        /*
        Input: nums = [1,2,3]
        Output: 3
         */
        int[] nums = new int[]{
                1, 2, 3
        };

        var sum = problem.rob(nums);

        assertEquals(3, sum);
    }
}
