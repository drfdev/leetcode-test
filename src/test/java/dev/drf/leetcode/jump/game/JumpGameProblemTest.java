package dev.drf.leetcode.jump.game;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class JumpGameProblemTest {
    private final JumpGameProblem problem = new JumpGameProblem();

    @Test
    void example1() {
        /*
        Input: nums = [2,3,1,1,4]
        Output: true
         */
        int[] nums = new int[]{
                2, 3, 1, 1, 4
        };

        var jump = problem.canJump(nums);

        assertTrue(jump);
    }

    @Test
    void example2() {
        /*
        Input: nums = [3,2,1,0,4]
        Output: false
         */
        int[] nums = new int[]{
                3, 2, 1, 0, 4
        };

        var jump = problem.canJump(nums);

        assertFalse(jump);
    }

    @Test
    void failed1() {
        /*
        nums = [2,5,0,0]
        true
         */
        int[] nums = new int[]{
                2, 5, 0, 0
        };

        var jump = problem.canJump(nums);

        assertTrue(jump);
    }
}
