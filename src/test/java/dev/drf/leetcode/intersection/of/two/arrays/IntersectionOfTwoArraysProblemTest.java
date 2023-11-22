package dev.drf.leetcode.intersection.of.two.arrays;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class IntersectionOfTwoArraysProblemTest {
    private final IntersectionOfTwoArraysProblem problem = new IntersectionOfTwoArraysProblem();

    @Test
    void example1() {
        /*
        Input: nums1 = [1,2,2,1], nums2 = [2,2]
        Output: [2]
         */
        int[] nums1 = new int[]{
                1, 2, 2, 1
        };
        int[] nums2 = new int[]{
                2, 2
        };

        var res = problem.intersection(nums1, nums2);

        assertEquals(1, res.length);
        assertEquals(2, res[0]);
    }

    @Test
    void example2() {
        /*
        Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
        Output: [9,4]
         */
        int[] nums1 = new int[]{
                4, 9, 5
        };
        int[] nums2 = new int[]{
                9, 4, 9, 8, 4
        };

        var res = problem.intersection(nums1, nums2);

        assertEquals(2, res.length);
        var values = Arrays.stream(res)
                .boxed()
                .collect(Collectors.toSet());
        assertTrue(values.contains(4));
        assertTrue(values.contains(9));
    }
}
