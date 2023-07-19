package dev.drf.leetcode.rotate.array;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;

public class RotateArrayProblemTest {
    private final RotateArrayProblem problem = new RotateArrayProblem();

    @Test
    void example1() {
        /*
        Input: nums = [1,2,3,4,5,6,7], k = 3
        Output: [5,6,7,1,2,3,4]
         */
        int[] nums = new int[]{
                1, 2, 3, 4, 5, 6, 7
        };
        int k = 3;

        problem.rotate(nums, k);

        var list = Arrays.stream(nums)
                .boxed()
                .toList();
        assertThat(list, contains(
                5, 6, 7, 1, 2, 3, 4
        ));
    }

    @Test
    void example2() {
        /*
        Input: nums = [-1,-100,3,99], k = 2
        Output: [3,99,-1,-100]
         */
        int[] nums = new int[]{
                -1, -100, 3, 99
        };
        int k = 2;

        problem.rotate(nums, k);

        var list = Arrays.stream(nums)
                .boxed()
                .toList();
        assertThat(list, contains(
                3, 99, -1, -100
        ));
    }
}
