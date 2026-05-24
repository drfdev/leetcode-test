package dev.drf.leetcode.count.asterisks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountAsterisksProblemTest {
    private final CountAsterisksProblem problem = new CountAsterisksProblem();

    @Test
    void example1() {
        // Input: s = "l|*e*et|c**o|*de|"
        // Output: 2
        var s = "l|*e*et|c**o|*de|";

        var cnt = problem.countAsterisks(s);

        assertEquals(2, cnt);
    }

    @Test
    void example2() {
        // Input: s = "iamprogrammer"
        // Output: 0
        var s = "iamprogrammer";

        var cnt = problem.countAsterisks(s);

        assertEquals(0, cnt);
    }

    @Test
    void example3() {
        // Input: s = "yo|uar|e**|b|e***au|tifu|l"
        // Output: 5
        var s = "yo|uar|e**|b|e***au|tifu|l";

        var cnt = problem.countAsterisks(s);

        assertEquals(5, cnt);
    }
}
