package dev.drf.leetcode.combination.sum;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CombinationSumProblemTest {
    private final CombinationSumProblem problem = new CombinationSumProblem();

    @Test
    void example1() {
        /*
        Input: candidates = [2,3,6,7], target = 7
        Output: [[2,2,3],[7]]
         */
        int[] candidates = new int[]{
                2, 3, 6, 7
        };
        int target = 7;

        var result = problem.combinationSum(candidates, target);

        assertThat(result, containsInAnyOrder(
                containsInAnyOrder(2, 2, 3),
                containsInAnyOrder(7)
        ));
    }

    @Test
    void example2() {
        /*
        Input: candidates = [2,3,5], target = 8
        Output: [[2,2,2,2],[2,3,3],[3,5]]
         */
        int[] candidates = new int[]{
                2, 3, 5
        };
        int target = 8;

        var result = problem.combinationSum(candidates, target);

        assertThat(result, containsInAnyOrder(
                containsInAnyOrder(2, 2, 2, 2),
                containsInAnyOrder(2, 3, 3),
                containsInAnyOrder(3, 5)
        ));
    }

    @Test
    void example3() {
        /*
        Input: candidates = [2], target = 1
        Output: []
         */
        int[] candidates = new int[]{
                2
        };
        int target = 1;

        var result = problem.combinationSum(candidates, target);

        assertTrue(result.isEmpty());
    }
}
