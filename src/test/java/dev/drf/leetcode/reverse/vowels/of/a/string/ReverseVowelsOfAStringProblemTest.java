package dev.drf.leetcode.reverse.vowels.of.a.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseVowelsOfAStringProblemTest {
    private final ReverseVowelsOfAStringProblem problem = new ReverseVowelsOfAStringProblem();

    @Test
    void example1() {
        /*
        Input: s = "hello"
        Output: "holle"
         */
        String s = "hello";

        var r = problem.reverseVowels(s);

        assertEquals("holle", r);
    }

    @Test
    void example2() {
        /*
        Input: s = "leetcode"
        Output: "leotcede"
         */
        String s = "leetcode";

        var r = problem.reverseVowels(s);

        assertEquals("leotcede", r);
    }

    @Test
    void mtTest1() {
        String s = "dud";

        var r = problem.reverseVowels(s);

        assertEquals("dud", r);
    }

    @Test
    void mtTest3() {
        String s = "aue";

        var r = problem.reverseVowels(s);

        assertEquals("eua", r);
    }
}
