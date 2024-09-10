package dev.drf.leetcode.first.bad.version;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/first-bad-version/
 * Used solution:
 * https://leetcode.com/problems/first-bad-version/solutions/71311/a-good-warning-to-me-to-use-start-end-start-2-to-avoid-overflow/
 */
public class FirstBadVersionProblem implements Problem {

    public int firstBadVersion(int n) {
        int start = 0;
        int end = n;

        while (end - start > 1) {
            int middle = start + (end - start) / 2;

            if (isBadVersion(middle)) {
                end = middle;
            } else {
                start = middle;
            }
        }

        return end;
    }

    boolean isBadVersion(int version) {
        // extends VersionControl
        /* The isBadVersion API is defined in the parent class VersionControl.
           boolean isBadVersion(int version); */
        return false;
    }
}
