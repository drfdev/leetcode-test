package dev.drf.leetcode.find.indices.of.stable.mountains;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.empty;

public class FindIndicesOfStableMountainsProblemTest {
    private final FindIndicesOfStableMountainsProblem problem = new FindIndicesOfStableMountainsProblem();

    @Test
    void example1() {
        // Input: height = [1,2,3,4,5], threshold = 2
        // Output: [3,4]
        int[] height = {1, 2, 3, 4, 5};
        int threshold = 2;

        var out = problem.stableMountains(height, threshold);

        assertThat(out, containsInAnyOrder(
                3, 4
        ));
    }

    @Test
    void example2() {
        // Input: height = [10,1,10,1,10], threshold = 3
        // Output: [1,3]
        int[] height = {10, 1, 10, 1, 10};
        int threshold = 3;

        var out = problem.stableMountains(height, threshold);

        assertThat(out, containsInAnyOrder(
                1, 3
        ));
    }

    @Test
    void example3() {
        // Input: height = [10,1,10,1,10], threshold = 10
        // Output: []
        int[] height = {10, 1, 10, 1, 10};
        int threshold = 10;

        var out = problem.stableMountains(height, threshold);

        assertThat(out, empty());
    }
}
