package dev.drf.leetcode.first.unique.character.in.a.string;

import dev.drf.leetcode.Problem;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/first-unique-character-in-a-string/
 */
public class FirstUniqueCharacterInAStringProblem implements Problem {
    public int firstUniqChar(String s) {
        if (s == null || s.isEmpty()) {
            return -1;
        }

        Map<Character, int[]> charMap = new LinkedHashMap<>();
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char ch = chars[i];
            if (charMap.containsKey(ch)) {
                int[] vals = charMap.get(ch);
                vals[0]++;
            } else {
                int[] vals = new int[2];
                vals[0] = 1;
                vals[1] = i;
                charMap.put(ch, vals);
            }
        }

        for (Map.Entry<Character, int[]> entry : charMap.entrySet()) {
            int[] vals = entry.getValue();
            if (vals[0] == 1) {
                return vals[1];
            }
        }

        return -1;
    }
}
