package dev.drf.leetcode.combination.sum.ii;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;

public class CombinationSumIIProblemTest {
    private final CombinationSumIIProblem problem = new CombinationSumIIProblem();

    @Test
    void example1() {
        /*
        Input: candidates = [10,1,2,7,6,1,5], target = 8
        Output:
        [
        [1,1,6],
        [1,2,5],
        [1,7],
        [2,6]
        ]
         */
        int[] candidates = new int[]{
                10, 1, 2, 7, 6, 1, 5
        };
        int target = 8;

        var result = problem.combinationSum2(candidates, target);

        assertThat(result, containsInAnyOrder(
                containsInAnyOrder(1, 1, 6),
                containsInAnyOrder(1, 2, 5),
                containsInAnyOrder(1, 7),
                containsInAnyOrder(2, 6)
        ));
    }

    @Test
    void example2() {
        /*
        Input: candidates = [2,5,2,1,2], target = 5
        Output:
        [
        [1,2,2],
        [5]
        ]
         */
        int[] candidates = new int[]{
                2, 5, 2, 1, 2
        };
        int target = 5;

        var result = problem.combinationSum2(candidates, target);

        assertThat(result, containsInAnyOrder(
                containsInAnyOrder(1, 2, 2),
                containsInAnyOrder(5)
        ));
    }
}
