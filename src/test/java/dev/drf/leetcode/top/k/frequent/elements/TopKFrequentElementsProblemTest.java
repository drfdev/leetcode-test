package dev.drf.leetcode.top.k.frequent.elements;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.collection.ArrayMatching.arrayContainingInAnyOrder;

public class TopKFrequentElementsProblemTest {
    private final TopKFrequentElementsProblem problem = new TopKFrequentElementsProblem();

    @Test
    void example1() {
        /*
        Input: nums = [1,1,1,2,2,3], k = 2
        Output: [1,2]
         */
        int[] nums = new int[]{
                1, 1, 1, 2, 2, 3
        };
        int k = 2;

        int[] result = problem.topKFrequent(nums, k);

        Integer[] boxed = Arrays.stream(result)
                .boxed()
                .toArray(Integer[]::new);
        assertThat(boxed, arrayContaining(1, 2));
    }

    @Test
    void example2() {
        /*
        Input: nums = [1], k = 1
        Output: [1]
         */
        int[] nums = new int[]{
                1
        };
        int k = 1;

        int[] result = problem.topKFrequent(nums, k);

        Integer[] boxed = Arrays.stream(result)
                .boxed()
                .toArray(Integer[]::new);
        assertThat(boxed, arrayContaining(1));
    }
}
