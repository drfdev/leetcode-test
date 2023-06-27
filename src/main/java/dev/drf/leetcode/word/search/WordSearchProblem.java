package dev.drf.leetcode.word.search;

import dev.drf.leetcode.Problem;

import java.util.HashSet;

/**
 * https://leetcode.com/problems/word-search/
 * Used same as method as {@code dev.drf.leetcode.word.search.ii.WordSearchIIProblem}
 * Time Limit Exceeded 85 / 85
 */
@Deprecated
public class WordSearchProblem implements Problem {
    private static int COLS;
    private static int ROWS;

    public boolean exist(char[][] board, String word) {
        ROWS = board.length;
        COLS = board[0].length;

        HashSet<String> visit = new HashSet<>();

        for (int r = 0; r < ROWS; r++) {
            for (int c = 0; c < COLS; c++) {
                boolean found = dfs(r, c, "", 0, word, visit, board);
                if (found) {
                    return true;
                }
            }
        }

        return false;
    }

    private boolean dfs(int r, int c, String word, int index, String expected,
                        HashSet<String> visit, char[][] board) {
        if (r < 0 || c < 0 ||
                r == ROWS || c == COLS ||
                visit.contains(r + "-" + c)) {
            return false;
        }

        char ch = board[r][c];
        if (ch != expected.charAt(index)) {
            return false;
        }

        visit.add(r + "-" + c);
        word += ch;
        if (expected.equals(word)) {
            return true;
        }

        boolean right = dfs(r + 1, c, word, index + 1, expected, visit, board);
        if (right) {
            return true;
        }
        boolean left = dfs(r - 1, c, word, index + 1, expected, visit, board);
        if (left) {
            return true;
        }
        boolean top = dfs(r, c + 1, word, index + 1, expected, visit, board);
        if (top) {
            return true;
        }
        boolean bottom = dfs(r, c - 1, word, index + 1, expected, visit, board);
        if (bottom) {
            return true;
        }

        visit.remove(r + "-" + c);

        return false;
    }
}
