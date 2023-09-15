package dev.drf.leetcode.longest.increasing.subsequence;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestIncreasingSubsequenceProblemTest {
    private final LongestIncreasingSubsequenceProblem problem = new LongestIncreasingSubsequenceProblem();

    @Test
    void example1() {
        /*
        Input: nums = [10,9,2,5,3,7,101,18]
        Output: 4
         */
        int[] nums = new int[]{
                10, 9, 2, 5, 3, 7, 101, 18
        };

        var res = problem.lengthOfLIS(nums);

        assertEquals(4, res);
    }

    @Test
    void example2() {
        /*
        Input: nums = [0,1,0,3,2,3]
        Output: 4
         */
        int[] nums = new int[]{
                0, 1, 0, 3, 2, 3
        };

        var res = problem.lengthOfLIS(nums);

        assertEquals(4, res);
    }

    @Test
    void example3() {
        /*
        Input: nums = [7,7,7,7,7,7,7]
        Output: 1
         */
        int[] nums = new int[]{
                7, 7, 7, 7, 7, 7, 7
        };

        var res = problem.lengthOfLIS(nums);

        assertEquals(1, res);
    }
}
