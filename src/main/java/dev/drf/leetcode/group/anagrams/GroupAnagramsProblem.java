package dev.drf.leetcode.group.anagrams;

import dev.drf.leetcode.Problem;

import java.util.*;

/**
 * https://leetcode.com/problems/group-anagrams/
 */
public class GroupAnagramsProblem implements Problem {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null) {
            return null;
        }
        if (strs.length == 0) {
            return Collections.emptyList();
        }

        Map<AnagramKey, List<String>> anagramMap = new HashMap<>(strs.length);
        for (String str : strs) {
            AnagramKey key = new AnagramKey(str.toCharArray());

            List<String> values = anagramMap.get(key);
            if (values == null) {
                values = new ArrayList<>();
                anagramMap.put(key, values);
            }

            values.add(str);
        }

        return new ArrayList<>(anagramMap.values());
    }

    private static class AnagramKey {
        private final char[] key;
        private int hash;

        public AnagramKey(char[] key) {
            Arrays.sort(key);
            this.key = key;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            AnagramKey that = (AnagramKey) o;
            return Arrays.equals(key, that.key);
        }

        @Override
        public int hashCode() {
            int h = hash;
            if (h == 0) {
                h = Arrays.hashCode(key);
                hash = h;
            }
            return h;
        }
    }
}
