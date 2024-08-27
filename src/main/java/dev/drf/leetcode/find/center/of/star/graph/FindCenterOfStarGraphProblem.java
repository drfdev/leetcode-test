package dev.drf.leetcode.find.center.of.star.graph;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/find-center-of-star-graph/
 */
public class FindCenterOfStarGraphProblem implements Problem {
    public int findCenter(int[][] edges) {
        final int len = edges.length;

        if (len < 2) {
            int[] first = edges[0];
            return Math.min(first[0], first[1]);
        }

        int[] first = edges[0];
        int[] second = edges[1];

        int first0 = first[0];
        int first1 = first[1];

        int second0 = second[0];
        int second1 = second[1];

        if (first0 == second0 || first0 == second1) {
            return first0;
        } else {
            return first1;
        }
    }
}
