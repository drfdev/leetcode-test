package dev.drf.leetcode.longest.consecutive.sequence;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestConsecutiveSequenceProblemTest {
    private final LongestConsecutiveSequenceProblem problem = new LongestConsecutiveSequenceProblem();

    @Test
    void example1() {
        /*
        Input: nums = [100,4,200,1,3,2]
        Output: 4
         */
        int[] nums = new int[]{100, 4, 200, 1, 3, 2};

        var result = problem.longestConsecutive(nums);

        assertEquals(4, result);
    }

    @Test
    void example2() {
        /*
        Input: nums = [0,3,7,2,5,8,4,6,0,1]
        Output: 9
         */
        int[] nums = new int[]{0, 3, 7, 2, 5, 8, 4, 6, 0, 1};

        var result = problem.longestConsecutive(nums);

        assertEquals(9, result);
    }

    @Test
    void failed1() {
        // []
        int[] nums = new int[]{};

        var result = problem.longestConsecutive(nums);

        assertEquals(0, result);
    }

    @Test
    void failed2() {
        // [1,2,0,1]
        int[] nums = new int[]{1, 2, 0, 1};

        var result = problem.longestConsecutive(nums);

        assertEquals(3, result);
    }
}
