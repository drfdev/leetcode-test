package dev.drf.leetcode.min.cost.to.connect.all.points;

import dev.drf.leetcode.Problem;

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

/**
 * https://leetcode.com/problems/min-cost-to-connect-all-points/
 * Used solution:
 * https://www.youtube.com/watch?v=f7JOBJIC-NA
 */
public class MinCostToConnectAllPointsProblem implements Problem {
    public int minCostConnectPoints(int[][] points) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        pq.offer(new int[]{0, 0});
        int len = points.length;
        Set<Integer> visited = new HashSet<>();
        int cost = 0;

        while (visited.size() < len) {
            int[] arr = pq.poll();

            int weight = arr[0];
            int currNode = arr[1];

            if (visited.contains(currNode)) {
                continue;
            }

            visited.add(currNode);
            cost += weight;

            int[] currNodeP = points[currNode];
            for (int nextNode = 0; nextNode < len; nextNode++) {
                if (!visited.contains(nextNode)) {
                    int[] nextNodeP = points[nextNode];
                    int nextWeight = Math.abs(nextNodeP[0] - currNodeP[0])
                            + Math.abs(nextNodeP[1] - currNodeP[1]);
                    pq.offer(new int[]{
                            nextWeight, nextNode
                    });
                }
            }
        }

        return cost;
    }
}
