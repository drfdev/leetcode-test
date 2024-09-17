package dev.drf.leetcode.uncommon.words.from.two.sentences;

import dev.drf.leetcode.Problem;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * https://leetcode.com/problems/uncommon-words-from-two-sentences/
 * Used solution:
 * https://leetcode.com/problems/uncommon-words-from-two-sentences/solutions/2594801/java-solution-jw/
 */
public class UncommonWordsFromTwoSentencesProblem implements Problem {
    public String[] uncommonFromSentences(String s1, String s2) {
        var frequency = new HashMap<String, Integer>();

        var arr1 = s1.split(" ");
        for (String word : arr1) {
            frequency.put(word, frequency.getOrDefault(word, 0) + 1);
        }

        var arr2 = s2.split(" ");
        for (String word : arr2) {
            frequency.put(word, frequency.getOrDefault(word, 0) + 1);
        }

        var ans = new ArrayList<String>();
        for (String word : frequency.keySet()) {
            if (frequency.get(word) == 1) {
                ans.add(word);
            }
        }

        return ans.toArray(String[]::new);
    }
}
