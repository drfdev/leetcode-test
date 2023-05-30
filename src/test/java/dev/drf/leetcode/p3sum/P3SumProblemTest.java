package dev.drf.leetcode.p3sum;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class P3SumProblemTest {
    private final P3SumProblem problem = new P3SumProblem();

    @Test
    void example1() {
        /*
        Input: nums = [-1,0,1,2,-1,-4]
        Output: [[-1,-1,2],[-1,0,1]]
         */
        int[] nums = new int[]{-1, 0, 1, 2, -1, -4};

        var list = problem.threeSum(nums);

        assertThat(list, containsInAnyOrder(
                containsInAnyOrder(-1, -1, 2),
                containsInAnyOrder(-1, 0, 1)
        ));
    }

    @Test
    void example2() {
        /*
        Input: nums = [0,1,1]
        Output: []
         */
        int[] nums = new int[]{0, 1, 1};

        var list = problem.threeSum(nums);

        assertTrue(list.isEmpty());
    }

    @Test
    void example3() {
        /*
        Input: nums = [0,0,0]
        Output: [[0,0,0]]
         */
        int[] nums = new int[]{0, 0, 0};

        var list = problem.threeSum(nums);

        assertThat(list, containsInAnyOrder(
                containsInAnyOrder(0, 0, 0)
        ));
    }

    @Test
    void failed1() {
        /*
        [4,0,2,3,-1]
         */
        int[] nums = new int[]{4, 0, 2, 3, -1};

        var list = problem.threeSum(nums);

        assertTrue(list.isEmpty());
    }
}
