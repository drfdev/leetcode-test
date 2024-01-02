package dev.drf.leetcode.convert.an.array.into.a2d.array.with.conditions;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;

public class ConvertAnArrayIntoA2dArrayWithConditionsProblemTest {
    private final ConvertAnArrayIntoA2dArrayWithConditionsProblem problem = new ConvertAnArrayIntoA2dArrayWithConditionsProblem();

    @Test
    void example1() {
        /*
        Input: nums = [1,3,4,1,2,3,1]
        Output: [[1,3,4,2],[1,3],[1]]
         */
        int[] nums = new int[]{
                1, 3, 4, 1, 2, 3, 1
        };

        var list = problem.findMatrix(nums);

        assertThat(list, containsInAnyOrder(
                containsInAnyOrder(1, 3, 4, 2),
                containsInAnyOrder(1, 3),
                containsInAnyOrder(1)
        ));
    }

    @Test
    void example2() {
        /*
        Input: nums = [1,2,3,4]
        Output: [[4,3,2,1]]
         */
        int[] nums = new int[]{
                1, 2, 3, 4
        };

        var list = problem.findMatrix(nums);

        assertThat(list, containsInAnyOrder(
                containsInAnyOrder(4, 3, 2, 1)
        ));
    }
}
