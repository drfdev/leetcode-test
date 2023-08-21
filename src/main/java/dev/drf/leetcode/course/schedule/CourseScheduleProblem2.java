package dev.drf.leetcode.course.schedule;

import dev.drf.leetcode.Problem;

import java.util.*;

/**
 * https://leetcode.com/problems/course-schedule/
 */
public class CourseScheduleProblem2 implements Problem {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        Map<Integer, Set<Integer>> preMap = new HashMap<>();

        for (int[] prerequisite : prerequisites) {
            int key = prerequisite[0];
            int value = prerequisite[1];
            preMap.compute(key, (k, v) -> {
                if (v == null) {
                    v = new HashSet<>();
                }
                v.add(value);
                return v;
            });
        }

        Set<Integer> finished = new HashSet<>();
        Set<Integer> visited = new HashSet<>();
        for (int i = 0; i < numCourses; i++) {
            if (finished.contains(i)) {
                continue;
            }
            boolean canFinish = dfsSearch(preMap, i, visited, finished);
            if (!canFinish) {
                return false;
            }
        }

        return finished.size() == numCourses;
    }

    private boolean dfsSearch(Map<Integer, Set<Integer>> preMap,
                              int key,
                              Set<Integer> visited,
                              Set<Integer> finished) {
        if (visited.contains(key)) {
            return false;
        }
        Set<Integer> prerequisites = preMap.get(key);
        if (prerequisites == null
                || prerequisites.isEmpty()) {
            finished.add(key);
            return true;
        }
        visited.add(key);
        Iterator<Integer> it = prerequisites.iterator();
        while (it.hasNext()) {
            Integer value = it.next();
            boolean result = dfsSearch(preMap, value, visited, finished);
            if (result) {
                it.remove();
            } else {
                return false;
            }
        }
        visited.remove(key);

        if (prerequisites.isEmpty()) {
            finished.add(key);
            return true;
        }

        return false;
    }
}
