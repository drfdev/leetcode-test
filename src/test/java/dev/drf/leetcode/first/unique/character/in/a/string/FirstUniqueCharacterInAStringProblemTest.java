package dev.drf.leetcode.first.unique.character.in.a.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FirstUniqueCharacterInAStringProblemTest {
    private final FirstUniqueCharacterInAStringProblem problem = new FirstUniqueCharacterInAStringProblem();

    @Test
    void example1() {
        /*
        Input: s = "leetcode"
        Output: 0
         */
        var s = "leetcode";

        var index = problem.firstUniqChar(s);

        assertEquals(0, index);
    }

    @Test
    void example2() {
        /*
        Input: s = "loveleetcode"
        Output: 2
         */
        var s = "loveleetcode";

        var index = problem.firstUniqChar(s);

        assertEquals(2, index);
    }

    @Test
    void example3() {
        /*
        Input: s = "aabb"
        Output: -1
         */
        var s = "aabb";

        var index = problem.firstUniqChar(s);

        assertEquals(-1, index);
    }

    @Test
    void failed1() {
        // "dddccdbba"
        // 8
        var s = "dddccdbba";

        var index = problem.firstUniqChar(s);

        assertEquals(8, index);
    }
}
