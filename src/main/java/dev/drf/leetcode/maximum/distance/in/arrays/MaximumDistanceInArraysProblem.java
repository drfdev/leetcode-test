package dev.drf.leetcode.maximum.distance.in.arrays;

import dev.drf.leetcode.Problem;

import java.util.List;

/**
 * https://leetcode.com/problems/maximum-distance-in-arrays/
 */
public class MaximumDistanceInArraysProblem implements Problem {
    public int maxDistance(List<List<Integer>> arrays) {
        var first = arrays.get(0);
        int small = first.get(0);
        int big = first.get(first.size() - 1);
        int maxDistance = 0;

        for (int i = 1; i < arrays.size(); i++) {
            var current = arrays.get(i);
            var cSmall = current.get(0);
            var cBig = current.get(current.size() - 1);

            maxDistance = Math.max(maxDistance, Math.abs(big - cSmall));
            maxDistance = Math.max(maxDistance, Math.abs(cBig - small));

            small = Math.min(cSmall, small);
            big = Math.max(cBig, big);
        }

        return maxDistance;
    }
}
