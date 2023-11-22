package dev.drf.leetcode.intersection.of.two.arrays.ii;

import dev.drf.leetcode.Problem;

import java.util.*;

/**
 * https://leetcode.com/problems/intersection-of-two-arrays-ii
 */
public class IntersectionOfTwoArraysIIProblem implements Problem {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Count> num1Values = new HashMap<>();

        for (int value : nums1) {
            if (num1Values.containsKey(value)) {
                Count cnt = num1Values.get(value);
                cnt.count++;
            } else {
                num1Values.put(value, new Count());
            }
        }

        List<Integer> result = new ArrayList<>(nums2.length);

        for (int value : nums2) {
            if (num1Values.containsKey(value)) {
                result.add(value);

                Count cnt = num1Values.get(value);
                cnt.count--;

                if (cnt.count == 0) {
                    num1Values.remove(value);
                }
            }
        }

        return result.stream()
                .mapToInt(it -> it)
                .toArray();
    }

    private static class Count {
        private int count = 1;
    }
}
