package dev.drf.leetcode.redistribute.characters.to.make.all.strings.equal;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/redistribute-characters-to-make-all-strings-equal/
 */
public class RedistributeCharactersToMakeAllStringsEqualProblem implements Problem {
    public boolean makeEqual(String[] words) {
        int[] letters = new int[26];

        for (String word : words) {
            char[] wordChars = word.toCharArray();
            for (char wordChar : wordChars) {
                int index = wordChar - 'a';
                letters[index]++;
            }
        }

        final int size = words.length;
        boolean result = true;
        for (int count : letters) {
            if (count > 0) {
                result = result && (count % size == 0);
            }
        }
        return result;
    }
}
