package dev.drf.leetcode.reverse.words.in.a.string.iii;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseWordsInAStringIIIProblemTest {
    private final ReverseWordsInAStringIIIProblem problem = new ReverseWordsInAStringIIIProblem();

    @Test
    void example1() {
        /*
        Input: s = "Let's take LeetCode contest"
        Output: "s'teL ekat edoCteeL tsetnoc"
         */
        var s = "Let's take LeetCode contest";

        var res = problem.reverseWords(s);

        assertEquals("s'teL ekat edoCteeL tsetnoc", res);
    }

    @Test
    void example2() {
        /*
        Input: s = "God Ding"
        Output: "doG gniD"
         */
        var s = "God Ding";

        var res = problem.reverseWords(s);

        assertEquals("doG gniD", res);
    }
}
