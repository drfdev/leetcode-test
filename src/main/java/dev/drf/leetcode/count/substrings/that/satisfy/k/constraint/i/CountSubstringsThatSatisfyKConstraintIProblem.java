package dev.drf.leetcode.count.substrings.that.satisfy.k.constraint.i;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/count-substrings-that-satisfy-k-constraint-i/
 * Used solution:
 * https://leetcode.com/problems/count-substrings-that-satisfy-k-constraint-i/solutions/5653819/o-n-sliding-window-most-optimized-c/
 */
public class CountSubstringsThatSatisfyKConstraintIProblem implements Problem {
    public int countKConstraintSubstrings(String s, int k) {
        if (s == null || s.isEmpty()) {
            return 0;
        }

        int zeroCount = 0;
        int oneCount = 0;

        final char[] chars = s.toCharArray();

        int result = 0;
        int left = 0;
        int right = 0;
        for (char ch : chars) {
            // add
            if (ch == '1') {
                oneCount++;
            } else {
                zeroCount++;
            }

            while (zeroCount > k && oneCount > k) {
                // remove
                if (chars[left] == '1') {
                    oneCount--;
                } else {
                    zeroCount--;
                }

                left++;
            }

            result += (right - left + 1);
            right++;
        }

        return result;
    }
}
