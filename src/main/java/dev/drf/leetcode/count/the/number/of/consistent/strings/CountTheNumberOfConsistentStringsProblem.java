package dev.drf.leetcode.count.the.number.of.consistent.strings;

import dev.drf.leetcode.Problem;

import java.util.HashSet;
import java.util.Set;

/**
 * https://leetcode.com/problems/count-the-number-of-consistent-strings/
 */
public class CountTheNumberOfConsistentStringsProblem implements Problem {
    public int countConsistentStrings(String allowed,
                                      String[] words) {
        var allowedMap = new HashSet<Character>();
        var chars = allowed.toCharArray();
        for (char ch : chars) {
            allowedMap.add(ch);
        }

        int count = 0;
        for (String word : words) {
            if (isConsistent(allowedMap, word)) {
                count++;
            }
        }

        return count;
    }

    private boolean isConsistent(Set<Character> allowedMap,
                                 String word) {
        var chars = word.toCharArray();
        for (char ch : chars) {
            if (!allowedMap.contains(ch)) {
                return false;
            }
        }
        return true;
    }

}
