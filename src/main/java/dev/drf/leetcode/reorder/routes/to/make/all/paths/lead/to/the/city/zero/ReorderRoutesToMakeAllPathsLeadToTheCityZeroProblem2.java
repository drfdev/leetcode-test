package dev.drf.leetcode.reorder.routes.to.make.all.paths.lead.to.the.city.zero;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/reorder-routes-to-make-all-paths-lead-to-the-city-zero/
 * solution:
 * https://leetcode.com/problems/reorder-routes-to-make-all-paths-lead-to-the-city-zero/solutions/661672/c-java-track-direction/
 */
public class ReorderRoutesToMakeAllPathsLeadToTheCityZeroProblem2 {

    public int minReorder(int n, int[][] connections) {
        List<List<Integer>> al = new ArrayList<>();
        for (int i = 0; i < n; ++i) {
            al.add(new ArrayList<>());
        }
        for (var c : connections) {
            al.get(c[0]).add(c[1]);
            al.get(c[1]).add(-c[0]);
        }
        return dfs(al, new boolean[n], 0);
    }

    private int dfs(List<List<Integer>> al, boolean[] visited, int from) {
        int change = 0;
        visited[from] = true;
        for (var to : al.get(from)) {
            if (!visited[Math.abs(to)]) {
                change += dfs(al, visited, Math.abs(to)) + (to > 0 ? 1 : 0);
            }
        }
        return change;
    }
}
