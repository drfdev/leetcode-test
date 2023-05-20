package dev.drf.leetcode.find.the.difference.of.two.arrays;

import dev.drf.leetcode.Problem;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * https://leetcode.com/problems/find-the-difference-of-two-arrays/
 */
public class FindTheDifferenceOfTwoArraysProblem implements Problem {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> num1Set = new HashSet<>(nums1.length);
        for (int value : nums1) {
            num1Set.add(value);
        }

        Set<Integer> num2Set = new HashSet<>(nums2.length);
        for (int value : nums2) {
            num2Set.add(value);
        }

        Set<Integer> num1List = new HashSet<>();
        Set<Integer> num2List = new HashSet<>();
        List<List<Integer>> result = new ArrayList<>();

        for (int value : nums1) {
            boolean contains = num2Set.contains(value);
            if (!contains) {
                num1List.add(value);
            }
        }
        for (int value : nums2) {
            boolean contains = num1Set.contains(value);
            if (!contains) {
                num2List.add(value);
            }
        }

        result.add(new ArrayList<>(num1List));
        result.add(new ArrayList<>(num2List));

        return result;
    }
}
