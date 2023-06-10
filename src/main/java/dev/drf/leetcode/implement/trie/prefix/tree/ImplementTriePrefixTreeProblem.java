package dev.drf.leetcode.implement.trie.prefix.tree;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/implement-trie-prefix-tree/
 */
public class ImplementTriePrefixTreeProblem implements Problem {
    private static final int ENGLISH_LETTERS_COUNT = 26;

    public static class Trie {
        private TrieNode root;

        public Trie() {
            this.root = new TrieNode();
        }

        public void insert(String word) {
            char[] wordChars = word.toCharArray();
            TrieNode cursor = root;
            for (int i = 0; i < wordChars.length; i++) {
                char value = wordChars[i];
                cursor = cursor.addChar(value);
            }

            cursor.isWord = true;
        }

        public boolean search(String word) {
            char[] wordChars = word.toCharArray();
            TrieNode cursor = root;
            for (int i = 0; i < wordChars.length; i++) {
                char value = wordChars[i];
                cursor = cursor.get(value);
                if (cursor == null) {
                    return false;
                }
            }

            return cursor.isWord;
        }

        public boolean startsWith(String prefix) {
            char[] wordChars = prefix.toCharArray();
            TrieNode cursor = root;
            for (int i = 0; i < wordChars.length; i++) {
                char value = wordChars[i];
                cursor = cursor.get(value);
                if (cursor == null) {
                    return false;
                }
            }

            return cursor != null;
        }
    }

    private static class TrieNode {
        private final TrieNode[] nodes = new TrieNode[ENGLISH_LETTERS_COUNT];
        private boolean isWord;

        public TrieNode addChar(char value) {
            int index = value - 'a';
            TrieNode node = nodes[index];
            if (node == null) {
                node = new TrieNode();
                nodes[index] = node;
            }

            return node;
        }

        public TrieNode get(char value) {
            int index = value - 'a';
            return nodes[index];
        }
    }
}
