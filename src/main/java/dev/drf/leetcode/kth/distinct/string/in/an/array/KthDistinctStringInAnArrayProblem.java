package dev.drf.leetcode.kth.distinct.string.in.an.array;

import dev.drf.leetcode.Problem;

import java.util.LinkedHashMap;

/**
 * https://leetcode.com/problems/kth-distinct-string-in-an-array/
 */
public class KthDistinctStringInAnArrayProblem implements Problem {
    public String kthDistinct(String[] arr, int k) {
        var map = new LinkedHashMap<String, Counter>();

        for (var value : arr) {
            var pair = map.get(value);
            if (pair == null) {
                map.put(value, new Counter());
            } else {
                pair.count++;
            }
        }

        int cnt = 0;
        var entries = map.entrySet();
        for (var entry : entries) {
            var key = entry.getKey();
            var pair = entry.getValue();

            if (pair.count == 1) {
                cnt++;

                if (cnt == k) {
                    return key;
                }
            }
        }

        return "";
    }

    private static class Counter {
        public int count = 1;
    }
}
