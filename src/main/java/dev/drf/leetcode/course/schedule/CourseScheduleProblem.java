package dev.drf.leetcode.course.schedule;

import dev.drf.leetcode.Problem;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * https://leetcode.com/problems/course-schedule/
 * Used solution:
 * https://leetcode.com/problems/course-schedule/solutions/58524/java-dfs-and-bfs-solution/
 * wtf ?
 */
public class CourseScheduleProblem implements Problem {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        ArrayList[] graph = new ArrayList[numCourses];
        int[] degree = new int[numCourses];
        Queue queue = new LinkedList();
        int count = 0;

        for (int i = 0; i < numCourses; i++) {
            graph[i] = new ArrayList();
        }

        for (int i = 0; i < prerequisites.length; i++) {
            degree[prerequisites[i][1]]++;
            graph[prerequisites[i][0]].add(prerequisites[i][1]);
        }
        for (int i = 0; i < degree.length; i++) {
            if (degree[i] == 0) {
                queue.add(i);
                count++;
            }
        }

        while (queue.size() != 0) {
            int course = (int) queue.poll();
            for (int i = 0; i < graph[course].size(); i++) {
                int pointer = (int) graph[course].get(i);
                degree[pointer]--;
                if (degree[pointer] == 0) {
                    queue.add(pointer);
                    count++;
                }
            }
        }
        if (count == numCourses) {
            return true;
        } else {
            return false;
        }
    }
}
