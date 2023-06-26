package dev.drf.leetcode.design.add.and.search.words.data.structure;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/design-add-and-search-words-data-structure/
 */
public class DesignAddAndSearchWordsDataStructureProblem implements Problem {
    public static class WordDictionary {
        private static final int ENGLISH_LETTERS = 26;
        private static final char ANY = '.';
        private final CharNode root;

        public WordDictionary() {
            this.root = new CharNode();
        }

        public void addWord(String word) {
            char[] chars = word.toCharArray();
            CharNode cursor = root;

            for (int i = 0; i < chars.length; i++) {
                char ch = chars[i];
                int index = ch - 'a';
                CharNode node = cursor.nodes[index];
                if (node == null) {
                    node = new CharNode();
                    cursor.nodes[index] = node;
                }
                cursor = node;
            }
            cursor.word = true;
        }

        public boolean search(String word) {
            char[] chars = word.toCharArray();
            CharNode cursor = root;
            int index = 0;
            return recursiveSearch(cursor, chars, index);
        }

        private boolean recursiveSearch(CharNode cursor, char[] chars, int index) {
            if (cursor == null) {
                return false;
            }
            if (index == chars.length) {
                return cursor.word;
            }

            char ch = chars[index];
            if (ch == ANY) {
                for (CharNode node : cursor.nodes) {
                    if (node != null) {
                        boolean res = recursiveSearch(node, chars, index + 1);
                        if (res) {
                            return true;
                        }
                    }
                }
                return false;
            }

            int nodeIndex = ch - 'a';
            CharNode node = cursor.nodes[nodeIndex];
            return recursiveSearch(node, chars, index + 1);
        }

        private static class CharNode {
            private final CharNode[] nodes = new CharNode[ENGLISH_LETTERS];
            private boolean word = false;
        }
    }
}
