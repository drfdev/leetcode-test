package dev.drf.leetcode.course.schedule.ii;

import dev.drf.leetcode.Problem;

import java.util.*;

/**
 * https://leetcode.com/problems/course-schedule-ii/
 */
public class CourseScheduleIIProblem implements Problem {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
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

        Set<Integer> finished = new LinkedHashSet<>();
        Set<Integer> visited = new HashSet<>();

        for (int course = 0; course < numCourses; course++) {
            if (finished.contains(course)) {
                continue;
            }
            boolean canFinish = dfsSearch(preMap, course, visited, finished);
            if (!canFinish) {
                return new int[0];
            }
        }

        if (finished.size() == numCourses) {
            return finished.stream()
                    .mapToInt(it -> it)
                    .toArray();
        }

        return new int[0];
    }

    private boolean dfsSearch(Map<Integer, Set<Integer>> preMap,
                              int key,
                              Set<Integer> visited,
                              Set<Integer> finished) {
        if (visited.contains(key)) {
            return false;
        }
        if (finished.contains(key)) {
            return true;
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
