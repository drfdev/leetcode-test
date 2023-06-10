package dev.drf.leetcode.search.suggestions.system;

import dev.drf.leetcode.Problem;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * https://leetcode.com/problems/search-suggestions-system/
 */
public class SearchSuggestionsSystemProblem implements Problem {
    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        if (searchWord == null || searchWord.isEmpty()) {
            return List.of();
        }

        Trie trie = new Trie();
        for (String product : products) {
            trie.addWord(product);
        }

        final int size = searchWord.length();
        List<List<String>> result = new ArrayList<>(size);

        for (int i = 0; i < size; i++) {
            String prefix = searchWord.substring(0, i + 1);
            result.add(trie.search(prefix));
        }

        return result;
    }

    private static class Trie {
        private TrieNode root = new TrieNode();

        public void addWord(String word) {
            char[] wordChars = word.toCharArray();
            TrieNode cursor = root;
            for (int i = 0; i < wordChars.length; i++) {
                char value = wordChars[i];
                cursor = cursor.addChar(value);
            }
            cursor.isWord = true;
        }

        public List<String> search(String prefix) {
            char[] wordChars = prefix.toCharArray();
            TrieNode cursor = root;
            for (int i = 0; i < wordChars.length; i++) {
                char value = wordChars[i];
                cursor = cursor.get(value);
                if (cursor == null) {
                    return List.of();
                }
            }
            List<String> result = new ArrayList<>();
            buildListWords(result, prefix, cursor);
            return result;
        }

        private void buildListWords(List<String> result, String prefix, TrieNode cursor) {
            if (result.size() == 3) {
                return;
            }
            if (cursor.isWord) {
                result.add(prefix);
                if (cursor.nodes.isEmpty()) {
                    return;
                }
            }
            for (Map.Entry<Character, TrieNode> entry : cursor.nodes.entrySet()) {
                buildListWords(result, prefix + entry.getKey(), entry.getValue());
            }
        }
    }

    private static class TrieNode {
        private final TreeMap<Character, TrieNode> nodes = new TreeMap<>();
        private boolean isWord;

        public TrieNode addChar(char value) {
            TrieNode node = nodes.get(value);
            if (node == null) {
                node = new TrieNode();
                nodes.put(value, node);
            }

            return node;
        }

        public TrieNode get(char value) {
            return nodes.get(value);
        }
    }
}
