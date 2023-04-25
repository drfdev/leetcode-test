package dev.drf.leetcode.top.k.frequent.elements;

import dev.drf.leetcode.Problem;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class TopKFrequentElementsProblem implements Problem {
    public int[] topKFrequent(int[] nums, int k) {
        if (nums == null) {
            return new int[0];
        }

        if (nums.length <= k) {
            return nums;
        }

        Map<Integer, ByCounter> map = new HashMap<>();

        for (int num : nums) {
            ByCounter counter = map.computeIfAbsent(num, key -> new ByCounter());
            counter.count++;
        }

        return map.entrySet().stream()
                .map(it -> new ByContainer(it.getValue().count, it.getKey()))
                .sorted(Comparator
                        .comparing((ByContainer it) -> it.count, Comparator.reverseOrder())
                )
                .limit(k)
                .map(it -> it.value)
                .mapToInt(it -> it)
                .toArray();
    }

    private static class ByCounter {
        private int count;
    }

    private static class ByContainer {
        private final int count;
        private final int value;

        public ByContainer(int count, int value) {
            this.count = count;
            this.value = value;
        }
    }
}
