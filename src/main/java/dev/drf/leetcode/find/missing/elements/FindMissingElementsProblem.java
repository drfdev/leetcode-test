package dev.drf.leetcode.find.missing.elements;

import dev.drf.leetcode.Problem;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * https://leetcode.com/problems/find-missing-elements/
 */
public class FindMissingElementsProblem implements Problem {
    public List<Integer> findMissingElements(int[] nums) {
        int max = 0;
        int min = Integer.MAX_VALUE;
        var map = new HashSet<Integer>();

        for (int num : nums) {
            map.add(num);
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }

        final int size = (max - min);
        var list = new ArrayList<Integer>(size);

        for (int i = min; i < max; i++) {
            if (!map.contains(i)) {
                list.add(i);
            }
        }

        return list;
    }
}
