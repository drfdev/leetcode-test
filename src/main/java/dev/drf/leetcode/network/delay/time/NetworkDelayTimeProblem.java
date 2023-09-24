package dev.drf.leetcode.network.delay.time;

import dev.drf.leetcode.Problem;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * https://leetcode.com/problems/network-delay-time/
 * Used solution:
 * https://www.youtube.com/watch?v=EaphyqKU4PQ
 */
public class NetworkDelayTimeProblem implements Problem {
    public int networkDelayTime(int[][] times, int n, int k) {
        Map<Integer, Map<Integer, Integer>> map = new HashMap<>();
        for (int[] time : times) {
            map.putIfAbsent(time[0], new HashMap<>());
            map.get(time[0])
                    .put(time[1], time[2]);
        }

        //distance, node into pq
        Queue<int[]> pq = new PriorityQueue<>((a, b) -> (a[0] - b[0]));

        pq.add(new int[]{0, k});

        boolean[] visited = new boolean[n + 1];
        int res = 0;

        while (!pq.isEmpty()) {
            int[] cur = pq.remove();
            int curNode = cur[1];
            int curDist = cur[0];
            if (visited[curNode]) {
                continue;
            }
            visited[curNode] = true;
            res = curDist;
            n--;
            if (map.containsKey(curNode)) {
                Map<Integer, Integer> nodes = map.get(curNode);
                for (int next : nodes.keySet()) {
                    pq.add(new int[]{
                            curDist + nodes.get(next),
                            next
                    });
                }
            }
        }
        return n == 0 ? res : -1;
    }
}
