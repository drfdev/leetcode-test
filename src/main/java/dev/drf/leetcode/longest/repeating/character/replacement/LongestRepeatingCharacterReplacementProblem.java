package dev.drf.leetcode.longest.repeating.character.replacement;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/longest-repeating-character-replacement/
 * Used solution:
 * https://leetcode.com/problems/longest-repeating-character-replacement/solutions/91271/java-12-lines-o-n-sliding-window-solution-with-explanation/
 */
public class LongestRepeatingCharacterReplacementProblem implements Problem {
    public int characterReplacement(String s, int k) {
        if (s == null) {
            return 0;
        }

        final char[] chars = s.toCharArray();
        final int size = chars.length;

        int[] count = new int[26];
        int start = 0;
        int maxCount = 0;
        int maxLength = 0;

        for (int end = 0; end < size; end++) {
            int index = chars[end] - 'A';
            count[index]++;
            maxCount = Math.max(maxCount, count[index]);

            while (end - start + 1 - maxCount > k) {
                int startIndex = chars[start] - 'A';
                count[startIndex]--;
                start++;
            }

            maxLength = Math.max(maxLength, end - start + 1);
        }

        return maxLength;

    }
}
