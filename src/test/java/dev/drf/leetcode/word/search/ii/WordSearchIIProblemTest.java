package dev.drf.leetcode.word.search.ii;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class WordSearchIIProblemTest {
    private final WordSearchIIProblem problem = new WordSearchIIProblem();

    @Test
    void example1() {
        /*
        Input: board = [["o","a","a","n"],["e","t","a","e"],["i","h","k","r"],["i","f","l","v"]],
        words = ["oath","pea","eat","rain"]
        Output: ["eat","oath"]
         */

        char[][] board = new char[][]{
                {'o', 'a', 'a', 'n'},
                {'e', 't', 'a', 'e'},
                {'i', 'h', 'k', 'r'},
                {'i', 'f', 'l', 'v'}
        };
        String[] words = new String[]{
                "oath", "pea", "eat", "rain"
        };

        var result = problem.findWords(board, words);

        assertThat(result, containsInAnyOrder(
                "eat", "oath"
        ));
    }

    @Test
    void example2() {
        /*
        Input: board = [["a","b"],["c","d"]], words = ["abcb"]
        Output: []
         */
        char[][] board = new char[][]{
                {'a', 'b'},
                {'c', 'd'}
        };
        String[] words = new String[]{
                "abcb"
        };

        var result = problem.findWords(board, words);

        assertTrue(result.isEmpty());
    }
}
