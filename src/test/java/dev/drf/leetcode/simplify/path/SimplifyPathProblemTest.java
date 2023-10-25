package dev.drf.leetcode.simplify.path;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimplifyPathProblemTest {
    private final SimplifyPathProblem problem = new SimplifyPathProblem();

    @Test
    void example1() {
        /*
        Input: path = "/home/"
        Output: "/home"
         */
        var path = "/home/";

        var out = problem.simplifyPath(path);

        assertEquals("/home", out);
    }

    @Test
    void example2() {
        /*
        Input: path = "/../"
        Output: "/"
         */
        var path = "/../";

        var out = problem.simplifyPath(path);

        assertEquals("/", out);
    }

    @Test
    void example3() {
        /*
        Input: path = "/home//foo/"
        Output: "/home/foo"
         */
        var path = "/home//foo/";

        var out = problem.simplifyPath(path);

        assertEquals("/home/foo", out);
    }
}
