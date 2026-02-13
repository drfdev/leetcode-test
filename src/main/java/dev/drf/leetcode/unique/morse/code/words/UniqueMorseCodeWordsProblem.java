package dev.drf.leetcode.unique.morse.code.words;

import dev.drf.leetcode.Problem;

import java.util.HashSet;

/**
 * https://leetcode.com/problems/unique-morse-code-words/
 */
public class UniqueMorseCodeWordsProblem implements Problem {
    private static final String[] MORSE_CODE = {
            ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..",
            "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-",
            ".--", "-..-", "-.--", "--.."
    };

    public int uniqueMorseRepresentations(String[] words) {
        var set = new HashSet<String>(words.length);

        final var sb = new StringBuilder();
        for (String word : words) {
            final var chars = word.toCharArray();
            for (char ch : chars) {
                int index = ch - 'a';
                sb.append(MORSE_CODE[index]);
            }
            set.add(sb.toString());

            sb.delete(0, sb.length());
        }

        return set.size();
    }
}
