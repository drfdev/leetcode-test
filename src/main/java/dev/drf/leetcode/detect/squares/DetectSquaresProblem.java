package dev.drf.leetcode.detect.squares;

import dev.drf.leetcode.Problem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * https://leetcode.com/problems/detect-squares/
 * User solution:
 * https://www.youtube.com/watch?v=bahebearrDc
 */
public class DetectSquaresProblem implements Problem {
    public static class DetectSquares {
        private final List<int[]> coordinates;
        private final Map<String, Integer> counts;

        public DetectSquares() {
            coordinates = new ArrayList<>();
            counts = new HashMap<>();
        }

        public void add(int[] point) {
            coordinates.add(point);
            String key = point[0] + "@" + point[1];
            int count = counts.getOrDefault(key, 0);
            counts.put(key, count + 1);
        }

        public int count(int[] point) {
            int sum = 0, px = point[0], py = point[1];
            for (int[] coordinate : coordinates) {
                int x = coordinate[0];
                int y = coordinate[1];
                if (px == x || py == y
                        || (Math.abs(px - x) != Math.abs(py - y))) {
                    continue;
                }
                sum += counts.getOrDefault(x + "@" + py, 0)
                        * counts.getOrDefault(px + "@" + y, 0);
            }

            return sum;
        }
    }
}
