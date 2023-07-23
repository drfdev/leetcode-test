package dev.drf.leetcode.sliding.window.median;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;

public class SlidingWindowMedianProblemTest {
    private final SlidingWindowMedianProblem2 problem = new SlidingWindowMedianProblem2();

    @Test
    void example1() {
        /*
        Input: nums = [1,3,-1,-3,5,3,6,7], k = 3
        Output: [1.00000,-1.00000,-1.00000,3.00000,5.00000,6.00000]
         */
        int[] nums = new int[]{
                1, 3, -1, -3, 5, 3, 6, 7
        };
        int k = 3;

        var result = problem.medianSlidingWindow(nums, k);

        var list = Arrays.stream(result)
                .boxed()
                .toList();
        assertThat(list, contains(
                1.00000, -1.00000, -1.00000, 3.00000, 5.00000, 6.00000
        ));
    }

    @Test
    void example2() {
        /*
        Input: nums = [1,2,3,4,2,3,1,4,2], k = 3
        Output: [2.00000,3.00000,3.00000,3.00000,2.00000,3.00000,2.00000]
         */
        int[] nums = new int[]{
                1, 2, 3, 4, 2, 3, 1, 4, 2
        };
        int k = 3;

        var result = problem.medianSlidingWindow(nums, k);

        var list = Arrays.stream(result)
                .boxed()
                .toList();
        assertThat(list, contains(
                2.00000, 3.00000, 3.00000, 3.00000, 2.00000, 3.00000, 2.00000
        ));
    }
}
