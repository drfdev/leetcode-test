package dev.drf.leetcode.find.common.characters;

import dev.drf.leetcode.Problem;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/find-common-characters/
 */
public class FindCommonCharactersProblem implements Problem {
    public List<String> commonChars(String[] words) {
        int[] counts = buildCounts(words[0]);

        for (int i = 1; i < words.length; i++) {
            var nextWord = words[i];
            int[] nextCounts = buildCounts(nextWord);
            checkMin(nextCounts, counts);
        }

        List<String> result = new ArrayList<>();
        var first = words[0];

        for (int i = 0; i < counts.length; i++) {
            int count = counts[i];
            if (count > 0) {
                char ch = (char) ('a' + i);
                var value = String.valueOf(ch);
                while (count > 0) {
                    result.add(value);
                    count--;
                }
            }
        }

        return result;
    }

    private int[] buildCounts(String word) {
        var chars = word.toCharArray();
        int[] counts = new int[26];

        for (char ch : chars) {
            int index = ch - 'a';
            counts[index]++;
        }

        return counts;
    }

    private void checkMin(int[] nextCounts,
                          int[] counts) {
        for (int i = 0; i < 26; i++) {
            if (counts[i] > 0) {
                counts[i] = Math.min(counts[i], nextCounts[i]);
            }
        }
    }
}
