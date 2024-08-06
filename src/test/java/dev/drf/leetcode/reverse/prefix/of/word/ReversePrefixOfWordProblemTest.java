package dev.drf.leetcode.reverse.prefix.of.word;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReversePrefixOfWordProblemTest {
    private final ReversePrefixOfWordProblem problem = new ReversePrefixOfWordProblem();

    @Test
    void example1() {
        /*
        Input: word = "abcdefd", ch = "d"
        Output: "dcbaefd"
         */
        String word = "abcdefd";
        char ch = 'd';

        var result = problem.reversePrefix(word, ch);

        assertEquals("dcbaefd", result);
    }

    @Test
    void example2() {
        /*
        Input: word = "xyxzxe", ch = "z"
        Output: "zxyxxe"
         */
        String word = "xyxzxe";
        char ch = 'z';

        var result = problem.reversePrefix(word, ch);

        assertEquals("zxyxxe", result);
    }

    @Test
    void example3() {
        /*
        Input: word = "abcd", ch = "z"
        Output: "abcd"
         */
        String word = "abcd";
        char ch = 'z';

        var result = problem.reversePrefix(word, ch);

        assertEquals("abcd", result);
    }
}
