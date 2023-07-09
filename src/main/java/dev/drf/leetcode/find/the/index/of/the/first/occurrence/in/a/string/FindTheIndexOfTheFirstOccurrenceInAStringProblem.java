package dev.drf.leetcode.find.the.index.of.the.first.occurrence.in.a.string;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/?envType=featured-list&envId=top-interview-questions
 */
public class FindTheIndexOfTheFirstOccurrenceInAStringProblem implements Problem {
    public int strStr(String haystack, String needle) {
        if (haystack == null || needle == null) {
            return -1;
        }
        final int size = haystack.length();
        final int subSize = needle.length();

        if (subSize > size) {
            return -1;
        }

        if (size == subSize) {
            for (int i = 0; i < size; i++) {
                char ch = haystack.charAt(i);
                char subCh = needle.charAt(i);
                if (ch != subCh) {
                    return  -1;
                }
            }
            return 0;
        }

        int index = 0;
        int iterateSteps = size - subSize + 1;

        while (index < iterateSteps) {
            char ch = haystack.charAt(index);
            char subCh = needle.charAt(0);

            if (ch == subCh) {
                int shift = 1;
                while (shift < subSize) {
                    ch = haystack.charAt(index + shift);
                    subCh = needle.charAt(shift);

                    if (ch != subCh) {
                        break;
                    }
                    shift++;
                }
                if (shift == subSize) {
                    return index;
                }
            }
            index++;
        }

        return -1;
    }
}
