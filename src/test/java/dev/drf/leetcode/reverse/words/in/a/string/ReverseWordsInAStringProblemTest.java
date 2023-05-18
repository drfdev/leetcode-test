package dev.drf.leetcode.reverse.words.in.a.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseWordsInAStringProblemTest {
    private final ReverseWordsInAStringProblem problem = new ReverseWordsInAStringProblem();

    @Test
    void example1() {
        /*
        Input: s = "the sky is blue"
        Output: "blue is sky the"
         */
        String s = "the sky is blue";

        var value = problem.reverseWords(s);

        assertEquals("blue is sky the", value);
    }

    @Test
    void example2() {
        /*
        Input: s = "  hello world  "
        Output: "world hello"
         */
        String s = "  hello world  ";

        var value = problem.reverseWords(s);

        assertEquals("world hello", value);
    }

    @Test
    void example3() {
        /*
        Input: s = "a good   example"
        Output: "example good a"
         */
        String s = "a good   example";

        var value = problem.reverseWords(s);

        assertEquals("example good a", value);
    }

    @Test
    void myTest1() {
        String s = "abc ab ";

        var value = problem.reverseWords(s);

        assertEquals("ab abc", value);
    }

    @Test
    void myTest2() {
        String s = "d e t";

        var value = problem.reverseWords(s);

        assertEquals("t e d", value);
    }
}
