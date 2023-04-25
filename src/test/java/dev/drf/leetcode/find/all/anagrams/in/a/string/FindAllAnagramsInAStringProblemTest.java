package dev.drf.leetcode.find.all.anagrams.in.a.string;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.equalTo;

public class FindAllAnagramsInAStringProblemTest {
    private final FindAllAnagramsInAStringProblem problem = new FindAllAnagramsInAStringProblem();

    @Test
    void example1() {
        /*
        Input: s = "cbaebabacd", p = "abc"
        Output: [0,6]
        Explanation:
        The substring with start index = 0 is "cba", which is an anagram of "abc".
        The substring with start index = 6 is "bac", which is an anagram of "abc".
         */
        String s = "cbaebabacd";
        String p = "abc";

        var result = problem.findAnagrams(s, p);

        assertThat(result, containsInAnyOrder(
                equalTo(0),
                equalTo(6)
        ));
    }

    @Test
    void example2() {
        /*
        Input: s = "abab", p = "ab"
        Output: [0,1,2]
        Explanation:
        The substring with start index = 0 is "ab", which is an anagram of "ab".
        The substring with start index = 1 is "ba", which is an anagram of "ab".
        The substring with start index = 2 is "ab", which is an anagram of "ab".
         */
        String s = "abab";
        String p = "ab";

        var result = problem.findAnagrams(s, p);

        assertThat(result, containsInAnyOrder(
                equalTo(0),
                equalTo(1),
                equalTo(2)
        ));
    }
}
