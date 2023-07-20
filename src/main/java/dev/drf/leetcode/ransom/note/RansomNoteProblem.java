package dev.drf.leetcode.ransom.note;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/ransom-note/
 */
public class RansomNoteProblem implements Problem {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] counts = new int[26];

        char[] magazineChars = magazine.toCharArray();
        for (char magazineChar : magazineChars) {
            int index = magazineChar - 'a';
            counts[index]++;
        }

        char[] ransomNoteChars = ransomNote.toCharArray();
        for (char ransomNoteChar : ransomNoteChars) {
            int index = ransomNoteChar - 'a';
            counts[index]--;
            if (counts[index] < 0) {
                return false;
            }
        }

        return true;
    }
}
