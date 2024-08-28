package dev.drf.leetcode.find.if_path.exists.in.graph;

import dev.drf.leetcode.Problem;

import java.util.*;

/**
 * https://leetcode.com/problems/find-if-path-exists-in-graph/
 * Used solution:
 * https://leetcode.com/problems/find-if-path-exists-in-graph/solutions/5052207/faster-lesser-4-methods-detailed-approach-dfs-bfs-dsu-std-algorithm-python-java-c/
 */
public class FindIfPathExistsInGraphProblem implements Problem {
    public boolean validPath(int n,
                             int[][] edges,
                             int source,
                             int destination) {
        var graph = new HashMap<Integer, List<Integer>>();
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            graph.computeIfAbsent(u, k -> new ArrayList<>()).add(v);
            graph.computeIfAbsent(v, k -> new ArrayList<>()).add(u);
        }

        final var visited = new HashSet<Integer>();
        return searchPath(source, destination, visited, graph);
    }

    private boolean searchPath(int node,
                               int destination,
                               final Set<Integer> visited,
                               final Map<Integer, List<Integer>> graph) {
        if (node == destination) {
            return true;
        }

        visited.add(node);
        for (int neighbor : graph.getOrDefault(node, Collections.emptyList())) {
            if (!visited.contains(neighbor)) {
                var nextStep = searchPath(neighbor, destination, visited, graph);
                if (nextStep) {
                    return true;
                }
            }
        }
        return false;
    }
}
