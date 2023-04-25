package dev.drf.leetcode.group.anagrams;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.equalTo;

public class GroupAnagramsProblemTest {
    private final GroupAnagramsProblem problem = new GroupAnagramsProblem();

    @Test
    void example1() {
        /*
        Input: strs = ["eat","tea","tan","ate","nat","bat"]
        Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
         */
        String[] strs = new String[]{
                "eat", "tea", "tan", "ate", "nat", "bat"
        };

        var result = problem.groupAnagrams(strs);

        assertThat(result, containsInAnyOrder(
                containsInAnyOrder(
                        equalTo("bat")
                ),
                containsInAnyOrder(
                        equalTo("nat"),
                        equalTo("tan")
                ),
                containsInAnyOrder(
                        equalTo("ate"),
                        equalTo("eat"),
                        equalTo("tea")
                )
        ));
    }

    @Test
    void example2() {
        /*
        Input: strs = [""]
        Output: [[""]]
         */
        String[] strs = new String[]{
                ""
        };

        var result = problem.groupAnagrams(strs);

        assertThat(result, containsInAnyOrder(
                containsInAnyOrder(
                        equalTo("")
                )
        ));
    }

    @Test
    void example3() {
        /*
        Input: strs = ["a"]
        Output: [["a"]]
         */
        String[] strs = new String[]{
                "a"
        };

        var result = problem.groupAnagrams(strs);

        assertThat(result, containsInAnyOrder(
                containsInAnyOrder(
                        equalTo("a")
                )
        ));
    }

    @Test
    void myTest1() {
        String[] strs = new String[]{
                "abc", "abcde", "dac", "cab", "decab"
        };

        var result = problem.groupAnagrams(strs);

        assertThat(result, containsInAnyOrder(
                containsInAnyOrder(
                        equalTo("abc"),
                        equalTo("cab")
                ),
                containsInAnyOrder(
                        equalTo("abcde"),
                        equalTo("decab")
                ),
                containsInAnyOrder(
                        equalTo("dac")
                )
        ));
    }
}
