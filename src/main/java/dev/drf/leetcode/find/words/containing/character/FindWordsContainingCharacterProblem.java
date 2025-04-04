package dev.drf.leetcode.find.words.containing.character;

import dev.drf.leetcode.Problem;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/find-words-containing-character/
 */
public class FindWordsContainingCharacterProblem implements Problem {
    public List<Integer> findWordsContaining(String[] words, char x) {
        var result = new ArrayList<Integer>();
        for (int i = 0; i < words.length; i++) {
            var word = words[i];
            if (word.indexOf(x) > -1) {
                result.add(i);
            }
        }
        return result;
    }
}
