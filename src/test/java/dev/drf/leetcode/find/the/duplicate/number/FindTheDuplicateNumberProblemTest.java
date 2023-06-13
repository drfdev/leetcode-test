package dev.drf.leetcode.find.the.duplicate.number;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindTheDuplicateNumberProblemTest {
    private final FindTheDuplicateNumberProblem problem = new FindTheDuplicateNumberProblem();

    @Test
    void example1() {
        /*
        Input: nums = [1,3,4,2,2]
        Output: 2
         */
        int[] nums = new int[]{
                1, 3, 4, 2, 2
        };

        var res = problem.findDuplicate(nums);

        assertEquals(2, res);
    }

    @Test
    void example2() {
        /*
        Input: nums = [3,1,3,4,2]
        Output: 3
         */
        int[] nums = new int[]{
                3, 1, 3, 4, 2
        };

        var res = problem.findDuplicate(nums);

        assertEquals(3, res);
    }
}
