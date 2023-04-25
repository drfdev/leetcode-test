package dev.drf.leetcode.valid.anagram;

import dev.drf.leetcode.Problem;

import java.util.Arrays;

public class ValidAnagramProblem implements Problem {
    public boolean isAnagram(String s, String t) {
        if (s == null || t == null) {
            return false;
        }

        if (s.length() != t.length()) {
            return false;
        }

        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();

        Arrays.sort(sChars);
        Arrays.sort(tChars);

        return Arrays.equals(sChars, tChars);
    }
}
