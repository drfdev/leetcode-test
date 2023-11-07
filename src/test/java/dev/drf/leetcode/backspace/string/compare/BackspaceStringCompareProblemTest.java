package dev.drf.leetcode.backspace.string.compare;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BackspaceStringCompareProblemTest {
    private final BackspaceStringCompareProblem2 problem = new BackspaceStringCompareProblem2();

    @Test
    void example1() {
        /*
        Input: s = "ab#c", t = "ad#c"
        Output: true
         */
        String s = "ab#c", t = "ad#c";

        var bool = problem.backspaceCompare(s, t);

        assertTrue(bool);
    }

    @Test
    void example2() {
        /*
        Input: s = "ab##", t = "c#d#"
        Output: true
         */
        String s = "ab##", t = "c#d#";

        var bool = problem.backspaceCompare(s, t);

        assertTrue(bool);
    }

    @Test
    void example3() {
        /*
        Input: s = "a#c", t = "b"
        Output: false
         */
        String s = "a#c", t = "b";

        var bool = problem.backspaceCompare(s, t);

        assertFalse(bool);
    }

    @Test
    void failure1() {
        // "xywrrmp"
        // "xywrrmu#p"
        String s = "xywrrmp", t = "xywrrmu#p";

        var bool = problem.backspaceCompare(s, t);

        assertTrue(bool);
    }

    @Test
    void failure2() {
        // "a##c"
        // "#a#c"
        String s = "a##c", t = "#a#c";

        var bool = problem.backspaceCompare(s, t);

        assertTrue(bool);
    }
}
