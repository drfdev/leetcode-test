package dev.drf.leetcode.length.of.last.word;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LengthOfLastWordProblemTest {
    private final LengthOfLastWordProblem problem = new LengthOfLastWordProblem();

    @Test
    void example1() {
        /*
        Input: s = "Hello World"
        Output: 5
         */
        String s = "Hello World";

        int len = problem.lengthOfLastWord(s);

        assertEquals(5, len);
    }

    @Test
    void example2() {
        /*
        Input: s = "   fly me   to   the moon  "
        Output: 4
         */
        String s = "   fly me   to   the moon  ";

        int len = problem.lengthOfLastWord(s);

        assertEquals(4, len);
    }

    @Test
    void example3() {
        /*
        Input: s = "luffy is still joyboy"
        Output: 6
         */
        String s = "luffy is still joyboy";

        int len = problem.lengthOfLastWord(s);

        assertEquals(6, len);
    }

    @Test
    void myTest1() {
        String str = "abcdef";

        int len = problem.lengthOfLastWord(str);

        assertEquals(6, len);
    }

    @Test
    void myTest2() {
        String str = "abcdef  ";

        int len = problem.lengthOfLastWord(str);

        assertEquals(6, len);
    }

    @Test
    void myTest3() {
        String str = "  abcdef  ";

        int len = problem.lengthOfLastWord(str);

        assertEquals(6, len);
    }
}
