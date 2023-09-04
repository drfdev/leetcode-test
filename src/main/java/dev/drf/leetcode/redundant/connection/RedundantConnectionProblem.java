package dev.drf.leetcode.redundant.connection;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/redundant-connection/
 * Used solution:
 * https://www.youtube.com/watch?v=FXWRE67PLL0
 */
public class RedundantConnectionProblem implements Problem {
    public int[] findRedundantConnection(int[][] edges) {
        int[] parent = new int[edges.length];

        for (int i = 0; i < edges.length; i++) {
            parent[i] = i + 1;
        }

        for (int[] edge : edges) {
            int find0 = find(parent, edge[0]);
            int find1 = find(parent, edge[1]);

            if (find0 == find1) {
                return edge;
            } else {
                union(parent, edge[0], edge[1]);
            }
        }

        return null;
    }

    private int find(int[] parent, int x) {
        if (x == parent[x - 1]) {
            return x;
        }
        return find(parent, parent[x - 1]);
    }

    private void union(int[] parent, int x, int y) {
        parent[find(parent, y) - 1] = find(parent, x);
    }
}
