package dev.drf.leetcode.jump.game.ii;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JumpGameIIProblemTest {
    private final JumpGameIIProblem problem = new JumpGameIIProblem();

    @Test
    void example1() {
        /*
        Input: nums = [2,3,1,1,4]
        Output: 2
         */
        int[] nums = new int[]{
                2, 3, 1, 1, 4
        };

        var steps = problem.jump(nums);

        assertEquals(2, steps);
    }

    @Test
    void example2() {
        /*
        Input: nums = [2,3,0,1,4]
        Output: 2
         */
        int[] nums = new int[]{
                2, 3, 0, 1, 4
        };

        var steps = problem.jump(nums);

        assertEquals(2, steps);
    }

    @Test
    void failed1() {
        /*
        nums = [0]
         */
        int[] nums = new int[]{
                0
        };

        var steps = problem.jump(nums);

        assertEquals(0, steps);
    }
}
