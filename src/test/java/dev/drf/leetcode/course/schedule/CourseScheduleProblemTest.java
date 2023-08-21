package dev.drf.leetcode.course.schedule;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CourseScheduleProblemTest {
    private final CourseScheduleProblem problem = new CourseScheduleProblem();
    private final CourseScheduleProblem2 problem2 = new CourseScheduleProblem2();

    @Test
    void example1() {
        /*
        Input: numCourses = 2, prerequisites = [[1,0]]
        Output: true
         */
        int numCourses = 2;
        int[][] prerequisites = new int[][]{
                {1, 0}
        };

        var can = problem.canFinish(numCourses, prerequisites);
        var can2 = problem2.canFinish(numCourses, prerequisites);

        assertTrue(can);
        assertTrue(can2);
    }

    @Test
    void example2() {
        /*
        Input: numCourses = 2, prerequisites = [[1,0],[0,1]]
        Output: false
         */
        int numCourses = 2;
        int[][] prerequisites = new int[][]{
                {1, 0}, {0, 1}
        };

        var can = problem.canFinish(numCourses, prerequisites);
        var can2 = problem2.canFinish(numCourses, prerequisites);

        assertFalse(can);
        assertFalse(can2);
    }

    @Test
    void example3() {
        /*
        Input: numCourses = 5, prerequisites = [[0,1],[0,2],[1,3],[1,4],[3,4]]
        Output: false
         */
        int numCourses = 5;
        int[][] prerequisites = new int[][]{
                {0, 1}, {0, 2}, {1, 3}, {1, 4}, {3, 4}
        };

        var can = problem.canFinish(numCourses, prerequisites);
        var can2 = problem2.canFinish(numCourses, prerequisites);

        assertTrue(can);
        assertTrue(can2);
    }
}
