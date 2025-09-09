package dev.drf.leetcode.find.closest.person;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/find-closest-person/
 */
public class FindClosestPersonProblem implements Problem {
    public int findClosest(int x, int y, int z) {
        final int p1Steps = Math.abs(z - x);
        final int p2Steps = Math.abs(z - y);

        if (p1Steps == p2Steps) {
            return 0;
        }

        return p1Steps < p2Steps ? 1 : 2;
    }
}
