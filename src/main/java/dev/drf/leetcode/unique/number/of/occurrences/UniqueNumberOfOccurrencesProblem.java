package dev.drf.leetcode.unique.number.of.occurrences;

import dev.drf.leetcode.Problem;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * https://leetcode.com/problems/unique-number-of-occurrences/
 */
public class UniqueNumberOfOccurrencesProblem implements Problem {
    public boolean uniqueOccurrences(int[] arr) {
        if (arr == null) {
            return false;
        }

        Map<Integer, Counter> map = new HashMap<>(arr.length);

        for (int item : arr) {
            Counter counter = map.get(item);
            if (counter == null) {
                counter = new Counter();
                map.put(item, counter);
            }

            counter.value++;
        }

        Collection<Counter> values = map.values();
        Set<Integer> unique = values.stream()
                .map(it -> it.value)
                .collect(Collectors.toSet());

        return values.size() == unique.size();
    }

    private static class Counter {
        private int value = 0;
    }
}
