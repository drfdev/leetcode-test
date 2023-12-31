package dev.drf.leetcode.largest.substring.between.two.equal.characters;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LargestSubstringBetweenTwoEqualCharactersProblemTest {
    private final LargestSubstringBetweenTwoEqualCharactersProblem problem = new LargestSubstringBetweenTwoEqualCharactersProblem();

    @Test
    void example1() {
        /*
        Input: s = "aa"
        Output: 0
         */
        var s = "aa";

        var len = problem.maxLengthBetweenEqualCharacters(s);

        assertEquals(0, len);
    }

    @Test
    void example2() {
        /*
        Input: s = "abca"
        Output: 2
         */
        var s = "abca";

        var len = problem.maxLengthBetweenEqualCharacters(s);

        assertEquals(2, len);
    }

    @Test
    void example3() {
        /*
        Input: s = "cbzxy"
        Output: -1
         */
        var s = "cbzxy";

        var len = problem.maxLengthBetweenEqualCharacters(s);

        assertEquals(-1, len);
    }
}
