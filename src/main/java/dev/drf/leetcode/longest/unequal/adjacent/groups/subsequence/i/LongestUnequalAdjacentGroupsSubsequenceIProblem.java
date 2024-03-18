package dev.drf.leetcode.longest.unequal.adjacent.groups.subsequence.i;

import dev.drf.leetcode.Problem;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/longest-unequal-adjacent-groups-subsequence-i/
 */
public class LongestUnequalAdjacentGroupsSubsequenceIProblem implements Problem {
    public List<String> getLongestSubsequence(String[] words, int[] groups) {
        List<String> result = new ArrayList<>();

        result.add(words[0]);
        int last = groups[0];

        for (int i = 1; i < words.length; i++) {
            int current = groups[i];

            if (current != last) {
                last = current;
                result.add(words[i]);
            }
        }

        return result;
    }
}
