package dev.drf.leetcode.subsets;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SubsetsProblemTest {
    private final SubsetsProblem problem = new SubsetsProblem();

    @Test
    void example1() {
        /*
        Input: nums = [1,2,3]
        Output: [[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]
         */
        int[] nums = new int[]{
                1, 2, 3
        };

        var res = problem.subsets(nums);

        assertEquals(8, res.size());
        assertThat(res, containsInAnyOrder(
                List.of(),
                List.of(1),
                List.of(2),
                List.of(3),
                List.of(1, 2),
                List.of(1, 3),
                List.of(2, 3),
                List.of(1, 2, 3)
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

        var res = problem.subsets(nums);

        assertEquals(2, res.size());
        assertThat(res, containsInAnyOrder(
                List.of(),
                List.of(0)
        ));
    }
}
