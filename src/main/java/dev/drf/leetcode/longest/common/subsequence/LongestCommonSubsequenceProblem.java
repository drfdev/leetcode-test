package dev.drf.leetcode.longest.common.subsequence;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/longest-common-subsequence/
 */
@Deprecated
public class LongestCommonSubsequenceProblem implements Problem {
    public int longestCommonSubsequence(String text1, String text2) {
        if (text1 == null || text2 == null) {
            return 0;
        }
        if (text1.length() == 0 || text2.length() == 0) {
            return 0;
        }

        final int leftSize = text1.length();
        final int rightSize = text2.length();

        int leftStartIndex = 0;
        int rightStartIndex = 0;

        int leftIndex = 0;
        int rightIndex = 0;

        int nextLeftEqual = 0;
        int nextRightEqual = 0;

        int count = 0;

        while (leftStartIndex < leftSize && rightStartIndex < rightSize) {
            char leftChar = text1.charAt(leftIndex);
            char rightChar = text2.charAt(rightIndex);

            if (leftChar == rightChar) {
                count++;
                leftStartIndex = leftIndex + 1;
                rightStartIndex = rightIndex + 1;

                leftIndex = leftStartIndex;
                rightIndex = rightStartIndex;

                nextLeftEqual = leftStartIndex;
                nextRightEqual = rightStartIndex;
            } else {
                leftIndex++;
                if (leftIndex == leftSize) {
                    leftStartIndex++;
                    if (leftStartIndex == leftSize) {
                        rightStartIndex++;
                        leftStartIndex = nextLeftEqual;
                    }

                    leftIndex = leftStartIndex;
                    rightIndex = rightStartIndex;
                }
            }
        }

        return count;
    }
}
