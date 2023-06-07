package dev.drf.leetcode.letter.combinations.of.a.phone.number;

import dev.drf.leetcode.Problem;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * https://leetcode.com/problems/letter-combinations-of-a-phone-number/
 */
public class LetterCombinationsOfAPhoneNumberProblem implements Problem {
    private static final Map<Character, List<Character>> PHONE = Map.of(
            '2', List.of('a', 'b', 'c'),
            '3', List.of('d', 'e', 'f'),
            '4', List.of('g', 'h', 'i'),
            '5', List.of('j', 'k', 'l'),
            '6', List.of('m', 'n', 'o'),
            '7', List.of('p', 'q', 'r', 's'),
            '8', List.of('t', 'u', 'v'),
            '9', List.of('w', 'x', 'y', 'z'),
            '0', List.of(' ')
    );

    public List<String> letterCombinations(String digits) {
        if (digits == null || digits.isEmpty()) {
            return List.of();
        }

        final char[] chars = digits.toCharArray();
        final int size = chars.length;

        List<String> result = new ArrayList<>();
        buildRecursively(result, 0, size, chars, "");
        return result;
    }

    private void buildRecursively(List<String> result, int index, int size, char[] chars, String base) {
        if (index == size) {
            result.add(base);
            return;
        }
        char ch = chars[index];
        List<Character> nextValues = PHONE.get(ch);

        if (nextValues != null) {
            for (Character nextValue : nextValues) {
                buildRecursively(result, index + 1, size, chars, base + nextValue);
            }
        } else {
            buildRecursively(result, index + 1, size, chars, base);
        }
    }
}
