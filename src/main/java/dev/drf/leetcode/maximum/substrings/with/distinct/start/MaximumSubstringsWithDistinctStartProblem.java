package dev.drf.leetcode.maximum.substrings.with.distinct.start;

import dev.drf.leetcode.Problem;

import java.util.HashSet;

/**
 * https://leetcode.com/problems/maximum-substrings-with-distinct-start/
 */
public class MaximumSubstringsWithDistinctStartProblem implements Problem {
    public int maxDistinct(String s) {
        var set = new HashSet<Character>(32);

        final var chars = s.toCharArray();
        for (char ch : chars) {
            set.add(ch);
        }

        return set.size();
    }
}
