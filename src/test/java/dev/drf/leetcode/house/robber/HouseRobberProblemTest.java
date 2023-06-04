package dev.drf.leetcode.house.robber;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HouseRobberProblemTest {
    private final HouseRobberProblem problem = new HouseRobberProblem();

    @Test
    void example1() {
        /*
        Input: nums = [1,2,3,1]
        Output: 4
         */
        int[] nums = new int[]{
                1, 2, 3, 1
        };

        var res = problem.rob(nums);

        assertEquals(4, res);
    }

    @Test
    void example2() {
        /*
        Input: nums = [2,7,9,3,1]
        Output: 12
         */
        int[] nums = new int[]{
                2, 7, 9, 3, 1
        };

        var res = problem.rob(nums);

        assertEquals(12, res);
    }

    @Test
    void failed1() {
        /*
        [2,1,1,2]
         */
        int[] nums = new int[]{
                2, 1, 1, 2
        };

        var res = problem.rob(nums);

        assertEquals(4, res);
    }
}
