package dev.drf.leetcode.count.and.say;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountAndSayProblemTest {
    private final CountAndSayProblem problem = new CountAndSayProblem();

    @Test
    void example1() {
        /*
        Input: n = 1
        Output: "1"
         */
        int n = 1;

        var res = problem.countAndSay(n);

        assertEquals("1", res);
    }

    @Test
    void example2() {
        /*
        Input: n = 4
        Output: "1211"
        Explanation:
        countAndSay(1) = "1"
        countAndSay(2) = say "1" = one 1 = "11"
        countAndSay(3) = say "11" = two 1's = "21"
        countAndSay(4) = say "21" = one 2 + one 1 = "12" + "11" = "1211"
         */
        int n = 4;

        var res = problem.countAndSay(n);

        assertEquals("1211", res);
    }
}
