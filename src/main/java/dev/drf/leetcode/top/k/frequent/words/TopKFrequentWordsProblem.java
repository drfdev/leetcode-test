package dev.drf.leetcode.top.k.frequent.words;

import dev.drf.leetcode.Problem;

import java.util.*;
import java.util.stream.Collectors;

/**
 * https://leetcode.com/problems/top-k-frequent-words/
 */
public class TopKFrequentWordsProblem implements Problem {
    public List<String> topKFrequent(String[] words, int k) {
        if (words == null) {
            return Collections.emptyList();
        }
        if (k < 1) {
            return Collections.emptyList();
        }

        Map<String, MyCounter> map = new HashMap<>();

        for (String word : words) {
            MyCounter counter = map.computeIfAbsent(word, key -> new MyCounter());
            counter.counter++;
        }

        return map.entrySet().stream()
                .map(it -> new MyContainer(it.getValue().counter, it.getKey()))
                .sorted(Comparator
                        .comparing((MyContainer it) -> it.counter, Comparator.reverseOrder())
                        .thenComparing(it -> it.word)
                )
                .limit(k)
                .map(it -> it.word)
                .collect(Collectors.toList());
    }

    private static class MyCounter {
        private int counter = 0;
    }

    private static class MyContainer {
        private final int counter;
        private final String word;

        public MyContainer(int counter, String word) {
            this.counter = counter;
            this.word = word;
        }
    }
}
