package dev.drf.leetcode.extra.characters.in.a.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExtraCharactersInAStringProblemTest {
    private final ExtraCharactersInAStringProblem problem = new ExtraCharactersInAStringProblem();

    @Test
    void example1() {
        /*
        Input: s = "leetscode", dictionary = ["leet","code","leetcode"]
        Output: 1
         */
        String s = "leetscode";
        String[] dictionary = {"leet", "code", "leetcode"};

        var count = problem.minExtraChar(s, dictionary);

        assertEquals(1, count);
    }

    @Test
    void example2() {
        /*
        Input: s = "sayhelloworld", dictionary = ["hello","world"]
        Output: 3
         */
        String s = "sayhelloworld";
        String[] dictionary = {"hello", "world"};

        var count = problem.minExtraChar(s, dictionary);

        assertEquals(3, count);
    }
}
