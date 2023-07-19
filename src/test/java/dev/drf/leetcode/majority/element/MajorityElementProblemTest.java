package dev.drf.leetcode.majority.element;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MajorityElementProblemTest {
    private final MajorityElementProblem problem = new MajorityElementProblem();

    @Test
    void example1() {
        /*
        Input: nums = [3,2,3]
        Output: 3
         */
        int[] nums = new int[]{
                3, 2, 3
        };

        var res = problem.majorityElement(nums);

        assertEquals(3, res);
    }

    @Test
    void example2() {
        /*
        Input: nums = [2,2,1,1,1,2,2]
        Output: 2
         */
        int[] nums = new int[]{
                2, 2, 1, 1, 1, 2, 2
        };

        var res = problem.majorityElement(nums);

        assertEquals(2, res);
    }
}
