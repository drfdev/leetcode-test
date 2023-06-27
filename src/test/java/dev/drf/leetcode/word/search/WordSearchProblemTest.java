package dev.drf.leetcode.word.search;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class WordSearchProblemTest {
    private final WordSearchProblem2 problem = new WordSearchProblem2();

    @Test
    void example1() {
        /*
        Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "ABCCED"
        Output: true
         */
        char[][] board = new char[][]{
                {'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'}
        };
        String word = "ABCCED";

        var found = problem.exist(board, word);

        assertTrue(found);
    }

    @Test
    void example2() {
        /*
        Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "SEE"
        Output: true
         */
        char[][] board = new char[][]{
                {'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'}
        };
        String word = "SEE";

        var found = problem.exist(board, word);

        assertTrue(found);
    }

    @Test
    void example3() {
        /*
        Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "ABCB"
        Output: false
         */
        char[][] board = new char[][]{
                {'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'}
        };
        String word = "ABCB";

        var found = problem.exist(board, word);

        assertFalse(found);
    }

    @Test
    void failed1() {
        /*
        [["a","a","b","a","a","b"],["b","a","b","a","b","b"],["b","a","b","b","b","b"],["a","a","b","a","b","a"],["b","b","a","a","a","b"],["b","b","b","a","b","a"]]
        "aaaababab"
         */
        char[][] board = new char[][]{
                {'a', 'a', 'b', 'a', 'a', 'b'},
                {'b', 'a', 'b', 'a', 'b', 'b'},
                {'b', 'a', 'b', 'b', 'b', 'b'},
                {'a', 'a', 'b', 'a', 'b', 'a'},
                {'b', 'b', 'a', 'a', 'a', 'b'},
                {'b', 'b', 'b', 'a', 'b', 'a'}
        };
        String word = "aaaababab";

        var found = problem.exist(board, word);

        assertTrue(found);
    }
}
