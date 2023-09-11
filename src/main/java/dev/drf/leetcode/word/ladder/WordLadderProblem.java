package dev.drf.leetcode.word.ladder;

import dev.drf.leetcode.Problem;

import java.util.*;

/**
 * https://leetcode.com/problems/word-ladder/
 * Used solution:
 * https://www.youtube.com/watch?v=h9iTnkgv05E
 */
public class WordLadderProblem implements Problem {
    public int ladderLength(String beginWord,
                            String endWord,
                            List<String> wl) {
        List<String> wordList = new ArrayList<>(wl);
        Map<String, List<String>> adjlist = new HashMap<>();
        wordList.add(beginWord);
        for (String word : wordList) {
            StringBuilder string;
            for (int i = 0; i < word.length(); i++) {
                string = new StringBuilder(word);
                string.setCharAt(i, '*');
                List<String> wordlist = adjlist.getOrDefault(string.toString(), new ArrayList<>());
                wordlist.add(word);
                adjlist.put(string.toString(), wordlist);
            }
        }

        Queue<String> queue = new LinkedList<>();
        queue.offer(beginWord);
        Set<String> visited = new HashSet<>();
        visited.add(beginWord);
        int step = 1;
        StringBuilder string;
        while (!queue.isEmpty()) {
            step++;
            int size = queue.size();
            for (int j = 0; j < size; j++) {
                String str = queue.poll();

                for (int i = 0; i < str.length(); i++) {
                    string = new StringBuilder(str);
                    string.setCharAt(i, '*');
                    for (String pat : adjlist.get(string.toString())) {
                        if (pat.equals(endWord)) {
                            return step;
                        }
                        if (visited.contains(pat)) {
                            continue;
                        }
                        queue.offer(pat);
                        visited.add(pat);
                    }
                }
            }
            // step++;
        }
        return 0;
    }
}
