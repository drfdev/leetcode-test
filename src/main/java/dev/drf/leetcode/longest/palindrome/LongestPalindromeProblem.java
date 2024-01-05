package dev.drf.leetcode.longest.palindrome;

import dev.drf.leetcode.Problem;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/longest-palindrome/
 */
public class LongestPalindromeProblem implements Problem {
    public int longestPalindrome(String s) {
        char[] chars = s.toCharArray();
        Map<Character, Integer> countMap = new HashMap<>();

        for (char ch : chars) {
            int prevCount = countMap.getOrDefault(ch, 0);
            countMap.put(ch, prevCount + 1);
        }

        int len = 0;
        boolean canAddSingle = false;

        for (Map.Entry<Character, Integer> entry : countMap.entrySet()) {
            int count = entry.getValue();

            if (count == 1) {
                canAddSingle = true;
                continue;
            }

            int steps = count / 2;
            len = len + (steps * 2);
            if (count % 2 > 0) {
                canAddSingle = true;
            }
        }

        if (canAddSingle) {
            len++;
        }

        return len;
    }
}
