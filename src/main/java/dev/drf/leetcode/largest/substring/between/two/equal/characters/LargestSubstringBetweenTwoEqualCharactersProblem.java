package dev.drf.leetcode.largest.substring.between.two.equal.characters;

import dev.drf.leetcode.Problem;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/largest-substring-between-two-equal-characters/
 */
public class LargestSubstringBetweenTwoEqualCharactersProblem implements Problem {
    public int maxLengthBetweenEqualCharacters(String s) {
        final int len = s.length();
        final char[] chars = s.toCharArray();

        if (len < 2) {
            return -1;
        }

        int max = Integer.MIN_VALUE;
        Map<Character, Integer> letterIndex = new HashMap<>();

        for (int i = 0; i < chars.length; i++) {
            char ch = chars[i];
            if (letterIndex.containsKey(ch)) {
                int minIndex = letterIndex.get(ch);
                max = Math.max(max, i - minIndex - 1);
            } else {
                letterIndex.put(ch, i);
            }
        }

        if (max < 0) {
            return -1;
        }
        return max;
    }
}
