package dev.drf.leetcode.maximum.repeating.substring;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/maximum-repeating-substring/
 */
public class MaximumRepeatingSubstringProblem implements Problem {
    public int maxRepeating(String sequence, String word) {
        int count = 0;

        var sb = new StringBuilder(word);
        while (sequence.contains(sb)) {
            count++;
            sb.append(word);
        }

        return count;
    }
}
