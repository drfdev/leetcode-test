package dev.drf.leetcode.find.common.elements.between.two.arrays;

import dev.drf.leetcode.Problem;

import java.util.HashMap;

/**
 * https://leetcode.com/problems/find-common-elements-between-two-arrays/
 */
public class FindCommonElementsBetweenTwoArraysProblem implements Problem {
    public int[] findIntersectionValues(int[] nums1,
                                        int[] nums2) {
        var firstMap = new HashMap<Integer, Count>(nums1.length);
        for (int value : nums1) {
            firstMap.compute(value, (key, count) -> {
                if (count == null) {
                    count = new Count();
                }
                count.cnt++;
                return count;
            });
        }

        int[] result = new int[2];
        for (int value : nums2) {
            if (firstMap.containsKey(value)) {
                Count firstIndexes = firstMap.get(value);
                result[0] += firstIndexes.cnt;
                result[1]++;

                firstIndexes.cnt = 0;
            }
        }
        return result;
    }

    private final class Count {
        public int cnt = 0;
    }
}
