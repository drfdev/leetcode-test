package dev.drf.leetcode.palindrome.partitioning;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.containsInAnyOrder;

public class PalindromePartitioningProblemTest {
    private final PalindromePartitioningProblem problem = new PalindromePartitioningProblem();

    @Test
    void example1() {
        /*
        Input: s = "aab"
        Output: [["a","a","b"],["aa","b"]]
         */
        String s = "aab";

        var res = problem.partition(s);

        assertThat(res, containsInAnyOrder(
                contains("a", "a", "b"),
                contains("aa", "b")
        ));
    }

    @Test
    void example2() {
        /*
        Input: s = "a"
        Output: [["a"]]
         */
        String s = "a";

        var res = problem.partition(s);

        assertThat(res, containsInAnyOrder(
                contains("a")
        ));
    }
}
