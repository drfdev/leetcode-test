package dev.drf.leetcode.p4sum;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class P4SumProblemTest {
    private final P4SumProblem problem = new P4SumProblem();

    @Test
    void example1() {
        /*
        Input: nums = [1,0,-1,0,-2,2], target = 0
        Output: [[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]
         */
        int[] nums = new int[]{1, 0, -1, 0, -2, 2};
        int target = 0;

        var result = problem.fourSum(nums, target);

        assertThat(result, containsInAnyOrder(
                containsInAnyOrder(
                        equalTo(-2),
                        equalTo(-1),
                        equalTo(1),
                        equalTo(2)
                ),
                containsInAnyOrder(
                        equalTo(-2),
                        equalTo(0),
                        equalTo(0),
                        equalTo(2)
                ),
                containsInAnyOrder(
                        equalTo(-1),
                        equalTo(0),
                        equalTo(0),
                        equalTo(1)
                )
        ));
    }

    @Test
    void example2() {
        /*
        Input: nums = [2,2,2,2,2], target = 8
        Output: [[2,2,2,2]]
         */
        int[] nums = new int[]{2, 2, 2, 2, 2};
        int target = 8;

        var result = problem.fourSum(nums, target);

        assertThat(result, containsInAnyOrder(
                containsInAnyOrder(
                        equalTo(2),
                        equalTo(2),
                        equalTo(2),
                        equalTo(2)
                )
        ));
    }

    @Test
    void failed1() {
        /*
        value = [2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,
        2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,
        2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,
        2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,
        2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2]
        target = 8
         */

        int[] nums = new int[]{
                2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
                2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
                2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
                2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
                2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2
        };
        int target = 8;

        var result = problem.fourSum(nums, target);

        assertThat(result, containsInAnyOrder(
                containsInAnyOrder(
                        equalTo(2),
                        equalTo(2),
                        equalTo(2),
                        equalTo(2)
                )
        ));
    }

    @Test
    void failed2() {
        int[] nums = new int[]{
                1000000000, 1000000000, 1000000000, 1000000000
        };
        int target = -294967296;

        var result = problem.fourSum(nums, target);

        assertTrue(result.isEmpty());
    }
}
