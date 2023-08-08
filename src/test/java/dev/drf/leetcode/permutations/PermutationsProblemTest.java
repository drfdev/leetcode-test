package dev.drf.leetcode.permutations;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.containsInAnyOrder;

public class PermutationsProblemTest {
    private final PermutationsProblem problem = new PermutationsProblem();

    @Test
    void example1() {
        /*
        Input: nums = [1,2,3]
        Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
         */
        int[] nums = new int[]{
                1, 2, 3
        };

        var result = problem.permute(nums);

        assertThat(result, containsInAnyOrder(
                contains(1, 2, 3),
                contains(1, 3, 2),
                contains(2, 1, 3),
                contains(2, 3, 1),
                contains(3, 1, 2),
                contains(3, 2, 1)
        ));
    }

    @Test
    void example2() {
        /*
        Input: nums = [0,1]
        Output: [[0,1],[1,0]]
         */
        int[] nums = new int[]{
                0, 1
        };

        var result = problem.permute(nums);

        assertThat(result, containsInAnyOrder(
                contains(0, 1),
                contains(1, 0)
        ));
    }

    @Test
    void example3() {
        /*
        Input: nums = [1]
        Output: [[1]]
         */
        int[] nums = new int[]{
                1
        };

        var result = problem.permute(nums);

        assertThat(result, containsInAnyOrder(
                contains(1)
        ));
    }
}
