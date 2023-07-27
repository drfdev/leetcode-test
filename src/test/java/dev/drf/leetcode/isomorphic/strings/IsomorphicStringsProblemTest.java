package dev.drf.leetcode.isomorphic.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class IsomorphicStringsProblemTest {
    private final IsomorphicStringsProblem problem = new IsomorphicStringsProblem();

    @Test
    void example1() {
        /*
        Input: s = "egg", t = "add"
        Output: true
         */
        String s = "egg", t = "add";

        var is = problem.isIsomorphic(s, t);

        assertTrue(is);
    }

    @Test
    void example2() {
        /*
        Input: s = "foo", t = "bar"
        Output: false
         */
        String s = "foo", t = "bar";

        var is = problem.isIsomorphic(s, t);

        assertFalse(is);
    }

    @Test
    void example3() {
        /*
        Input: s = "paper", t = "title"
        Output: true
         */
        String s = "paper", t = "title";

        var is = problem.isIsomorphic(s, t);

        assertTrue(is);
    }

    @Test
    void failed1() {
        // s = "badc"
        // t = "baba"
        String s = "badc", t = "baba";

        var is = problem.isIsomorphic(s, t);

        assertFalse(is);
    }
}
