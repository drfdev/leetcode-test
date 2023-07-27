package dev.drf.leetcode.isomorphic.strings;

import dev.drf.leetcode.Problem;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/isomorphic-strings/
 */
public class IsomorphicStringsProblem implements Problem {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        final int size = s.length();
        final Map<Character, Character> map = new HashMap<>();

        for (int i = 0; i < size; i++) {
            char sCh = s.charAt(i);
            char tCh = t.charAt(i);

            if (!map.containsKey(sCh)) {
                if (!map.containsValue(tCh)) {
                    map.put(sCh, tCh);
                } else {
                    return false;
                }
            } else {
                char value = map.get(sCh);
                if (value != tCh) {
                    return false;
                }
            }
        }

        return true;
    }
}
