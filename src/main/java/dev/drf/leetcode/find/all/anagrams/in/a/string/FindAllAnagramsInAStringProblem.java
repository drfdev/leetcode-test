package dev.drf.leetcode.find.all.anagrams.in.a.string;

import dev.drf.leetcode.Problem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * https://leetcode.com/problems/find-all-anagrams-in-a-string/
 */
public class FindAllAnagramsInAStringProblem implements Problem {
    public List<Integer> findAnagrams(String s, String p) {
        if (s == null || p == null) {
            return Collections.emptyList();
        }
        if (s.length() < p.length()) {
            return Collections.emptyList();
        }

        char[] sChars = s.toCharArray();
        char[] pChars = p.toCharArray();

        int bufSize = pChars.length;
        char[] buffer = new char[bufSize];

        Arrays.sort(pChars);

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < sChars.length - bufSize + 1; i++) {
            System.arraycopy(sChars, i, buffer, 0, bufSize);
            if (isAnagram(buffer, pChars)) {
                result.add(i);
            }
        }

        return result;
    }

    private boolean isAnagram(char[] buff, char[] expected) {
        Arrays.sort(buff);
        return Arrays.equals(buff, expected);
    }
}
