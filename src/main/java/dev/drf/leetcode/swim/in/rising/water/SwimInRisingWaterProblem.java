package dev.drf.leetcode.swim.in.rising.water;

import dev.drf.leetcode.Problem;

import java.util.PriorityQueue;

/**
 * https://leetcode.com/problems/swim-in-rising-water/
 * Used solution:
 * https://www.youtube.com/watch?v=amvrKlMLuGY
 */
public class SwimInRisingWaterProblem implements Problem {
    private static final int[][] DIRECTIONS = {
            {-1, 0},
            {1, 0},
            {0, -1},
            {0, 1}
    };

    public int swimInWater(int[][] grid) {
        final int len = grid.length;

        if (len == 1) {
            return 0;
        }

        var visited = new boolean[len][len];
        visited[0][0] = true;

        var minHeap = new PriorityQueue<Integer[]>((a, b) -> a[0] - b[0]);
        minHeap.add(new Integer[]{
                grid[0][0], 0, 0
        });

        int result = 0;

        while (!minHeap.isEmpty()) {
            var curr = minHeap.poll();

            result = Math.max(result, curr[0]);

            if (curr[1] == len - 1
                    && curr[2] == len - 1) {
                break;
            }

            for (int i = 0; i < 4; i++) {
                int x = curr[1] + DIRECTIONS[i][0];
                int y = curr[2] + DIRECTIONS[i][1];

                if (x < 0 || x >= len
                        || y < 0 || y >= len
                        || visited[x][y]) {
                    continue;
                }

                minHeap.add(new Integer[]{
                        grid[x][y], x, y
                });
                visited[x][y] = true;
            }
        }

        return result;
    }
}
