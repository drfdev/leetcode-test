package dev.drf.leetcode.rank.transform.of.an.array;

import dev.drf.leetcode.Problem;

import java.util.Arrays;
import java.util.HashMap;

/**
 * https://leetcode.com/problems/rank-transform-of-an-array/
 */
public class RankTransformOfAnArrayProblem implements Problem {
    public int[] arrayRankTransform(int[] arr) {
        final int size = arr.length;
        var copy = Arrays.copyOf(arr, size);
        Arrays.sort(copy);

        var map = new HashMap<Integer, Integer>(size);
        for (int i = 0; i < size; i++) {
            int v = copy[i];
            int index = map.size() + 1;
            map.putIfAbsent(v, index);
        }

        for (int i = 0; i < size; i++) {
            int v = map.get(arr[i]);
            copy[i] = v;
        }

        return copy;
    }
}
