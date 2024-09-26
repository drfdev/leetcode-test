package dev.drf.leetcode.merge.similar.items;

import dev.drf.leetcode.Problem;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

/**
 * https://leetcode.com/problems/merge-similar-items/
 */
public class MergeSimilarItemsProblem implements Problem {
    public List<List<Integer>> mergeSimilarItems(int[][] items1,
                                                 int[][] items2) {
        var map = new HashMap<Integer, Integer>();

        for (int[] item : items1) {
            int value = item[0];
            int weight = item[1];

            map.compute(value, (k, w) -> w == null
                    ? weight
                    : w + weight);
        }

        for (int[] item : items2) {
            int value = item[0];
            int weight = item[1];

            map.compute(value, (k, w) -> w == null
                    ? weight
                    : w + weight);
        }

        final int size = map.size();
        List<List<Integer>> result = new ArrayList<>(size);

        for (var entry : map.entrySet()) {
            result.add(List.of(
                    entry.getKey(),
                    entry.getValue()
            ));
        }

        result.sort(Comparator.comparingInt(value -> value.get(0)));
        return result;
    }
}
