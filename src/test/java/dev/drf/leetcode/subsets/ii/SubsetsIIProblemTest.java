package dev.drf.leetcode.subsets.ii;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;

public class SubsetsIIProblemTest {
    private final SubsetsIIProblem problem = new SubsetsIIProblem();

    @Test
    void example1() {
        /*
        Input: nums = [1,2,2]
        Output: [[],[1],[1,2],[1,2,2],[2],[2,2]]
         */
        int[] nums = new int[]{
                1, 2, 2
        };

        var res = problem.subsetsWithDup(nums);

        assertThat(res, containsInAnyOrder(
                List.of(),
                List.of(1),
                List.of(2),
                List.of(1, 2),
                List.of(2, 2),
                List.of(1, 2, 2)
        ));
    }

    @Test
    void example2() {
        /*
        Input: nums = [0]
        Output: [[],[0]]
         */
        int[] nums = new int[]{
                0
        };

        var res = problem.subsetsWithDup(nums);

        assertThat(res, containsInAnyOrder(
                List.of(),
                List.of(0)
        ));
    }

    @Test
    void myTest1() {
        int[] nums = new int[]{
                1, 2, 2, 3
        };

        var res = problem.subsetsWithDup(nums);

        assertThat(res, containsInAnyOrder(
                List.of(),
                List.of(1),
                List.of(2),
                List.of(3),
                List.of(1, 2),
                List.of(1, 3),
                List.of(2, 2),
                List.of(2, 3),
                List.of(1, 2, 2),
                List.of(1, 2, 3),
                List.of(2, 2, 3),
                List.of(1, 2, 2, 3)
        ));
    }
}
