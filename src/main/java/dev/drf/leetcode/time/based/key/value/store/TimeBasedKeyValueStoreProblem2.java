package dev.drf.leetcode.time.based.key.value.store;

import dev.drf.leetcode.Problem;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * https://leetcode.com/problems/time-based-key-value-store/
 * Used solution:
 * https://leetcode.com/problems/time-based-key-value-store/solutions/226663/treemap-solution-java/
 */
public class TimeBasedKeyValueStoreProblem2 implements Problem {
    public static class TimeMap {
        private Map<String, TreeMap<Integer, String>> map;

        public TimeMap() {
            map = new HashMap<>();
        }

        public void set(String key, String value, int timestamp) {
            if (!map.containsKey(key)) {
                map.put(key, new TreeMap<>());
            }
            map.get(key).put(timestamp, value);
        }

        public String get(String key, int timestamp) {
            TreeMap<Integer, String> treeMap = map.get(key);
            if (treeMap == null) {
                return "";
            }
            Integer floor = treeMap.floorKey(timestamp);
            if (floor == null) {
                return "";
            }
            return treeMap.get(floor);
        }
    }
}
