package dev.drf.leetcode.intersection.of.two.arrays;

import dev.drf.leetcode.Problem;

import java.util.HashSet;
import java.util.Set;

/**
 * https://leetcode.com/problems/intersection-of-two-arrays
 */
public class IntersectionOfTwoArraysProblem implements Problem {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> num1Values = new HashSet<>();

        for (int value : nums1) {
            num1Values.add(value);
        }

        Set<Integer> result = new HashSet<>(nums2.length);

        for (int value : nums2) {
            if (num1Values.contains(value)) {
                result.add(value);
            }
        }

        return result.stream()
                .mapToInt(it -> it)
                .toArray();
    }
}
