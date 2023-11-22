package dev.drf.leetcode.intersection.of.two.arrays.ii;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class IntersectionOfTwoArraysIIProblemTest {
    private final IntersectionOfTwoArraysIIProblem problem = new IntersectionOfTwoArraysIIProblem();

    @Test
    void example1() {
        /*
        Input: nums1 = [1,2,2,1], nums2 = [2,2]
        Output: [2,2]
         */
        int[] nums1 = new int[]{
                1, 2, 2, 1
        };
        int[] nums2 = new int[]{
                2, 2
        };

        var res = problem.intersect(nums1, nums2);

        assertEquals(2, res.length);
        var values = Arrays.stream(res)
                .boxed()
                .toList();

        assertThat(values, containsInAnyOrder(
                2, 2
        ));
    }

    @Test
    void example2() {
        /*
        Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
        Output: [4,9]
         */
        int[] nums1 = new int[]{
                4, 9, 5
        };
        int[] nums2 = new int[]{
                9, 4, 9, 8, 4
        };

        var res = problem.intersect(nums1, nums2);

        assertEquals(2, res.length);
        var values = Arrays.stream(res)
                .boxed()
                .toList();

        assertThat(values, containsInAnyOrder(
                4, 9
        ));
    }
}
