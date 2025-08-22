package dev.drf.leetcode.find.indices.of.stable.mountains;

import dev.drf.leetcode.Problem;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/find-indices-of-stable-mountains
 */
public class FindIndicesOfStableMountainsProblem implements Problem {
    public List<Integer> stableMountains(int[] height, int threshold) {
        List<Integer> result = new ArrayList<>();

        for (int i = 1; i < height.length; i++) {
            int previous = height[i - 1];
            if (previous > threshold) {
                result.add(i);
            }
        }

        return result;
    }
}
