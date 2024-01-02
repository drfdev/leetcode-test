package dev.drf.leetcode.sort.characters.by.frequency;

import dev.drf.leetcode.Problem;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * https://leetcode.com/problems/sort-characters-by-frequency/
 */
public class SortCharactersByFrequencyProblem implements Problem {
    public String frequencySort(String s) {
        if (s.length() < 2) {
            return s;
        }

        Map<Character, AtomicInteger> counterMap = new HashMap<>();
        char[] chars = s.toCharArray();

        for (char ch : chars) {
            AtomicInteger counter = counterMap.computeIfAbsent(ch, unused -> new AtomicInteger());
            counter.incrementAndGet();
        }

        final int len = chars.length;
        PriorityQueue<Character>[] frequencyArray = new PriorityQueue[len + 1];
        for (Map.Entry<Character, AtomicInteger> entry : counterMap.entrySet()) {
            Character key = entry.getKey();
            int count = entry.getValue().get();

            if (frequencyArray[count] == null) {
                frequencyArray[count] = new PriorityQueue<>(Character::compare);
            }
            frequencyArray[count].add(key);
        }

        StringBuilder sb = new StringBuilder();
        for (int i = len; i > 0; i--) {
            PriorityQueue<Character> characters = frequencyArray[i];
            if (characters != null) {
                while (!characters.isEmpty()) {
                    Character ch = characters.poll();
                    for (int r = 0; r < i; r++) {
                        sb.append(ch);
                    }
                }
            }
        }

        return sb.toString();
    }
}
