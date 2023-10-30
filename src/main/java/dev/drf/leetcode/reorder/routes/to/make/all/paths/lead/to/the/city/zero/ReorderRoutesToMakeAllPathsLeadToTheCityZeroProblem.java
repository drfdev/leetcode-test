package dev.drf.leetcode.reorder.routes.to.make.all.paths.lead.to.the.city.zero;

import dev.drf.leetcode.Problem;

import java.util.LinkedList;
import java.util.Queue;

/**
 * https://leetcode.com/problems/reorder-routes-to-make-all-paths-lead-to-the-city-zero/
 * Used JulesX01 solution, from:
 * https://leetcode.com/problems/reorder-routes-to-make-all-paths-lead-to-the-city-zero/solutions/661672/c-java-track-direction/
 */
@Deprecated /* Time Limit Exceeded */
public class ReorderRoutesToMakeAllPathsLeadToTheCityZeroProblem implements Problem {
    public int minReorder(int n, int[][] connections) {
        int[] destinations = new int[n];
        for (int i = 0; i < n; i++) {
            destinations[i] = i;
        }

        Queue<int[]> connectionList = new LinkedList<>();
        for (int[] connection : connections) {
            connectionList.add(connection);
        }

        destinations[0] = 0;
        int res = 0;
        while (!connectionList.isEmpty()) {
            int[] cur = connectionList.poll();
            int a1 = find(destinations, cur[0]);
            int a2 = find(destinations, cur[1]);
            if (a1 == 0 && a2 != 0) {
                res++;
                destinations[cur[1]] = 0;
            } else if (a1 != 0 && a2 != 0) {
                connectionList.offer(cur);
            } else {
                destinations[cur[0]] = 0;
                destinations[cur[1]] = 0;
            }
        }
        return res;
    }

    private int find(int[] map, int id) {
        while (id != map[id]) {
            map[id] = map[map[id]];
            id = map[id];
        }
        return id;
    }
}
