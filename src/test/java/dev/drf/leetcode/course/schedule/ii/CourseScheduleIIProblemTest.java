package dev.drf.leetcode.course.schedule.ii;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CourseScheduleIIProblemTest {
    private final CourseScheduleIIProblem problem = new CourseScheduleIIProblem();

    @Test
    void example1() {
        /*
        Input: numCourses = 2, prerequisites = [[1,0]]
        Output: [0,1]
         */
        int numCourses = 2;
        int[][] prerequisites = new int[][]{
                {1, 0}
        };

        var result = problem.findOrder(numCourses, prerequisites);

        assertEquals(2, result.length);
        assertEquals(0, result[0]);
        assertEquals(1, result[1]);
    }

    @Test
    void example2() {
        /*
        Input: numCourses = 4, prerequisites = [[1,0],[2,0],[3,1],[3,2]]
        Output: [0,2,1,3]
         */
        int numCourses = 4;
        int[][] prerequisites = new int[][]{
                {1, 0}, {2, 0}, {3, 1}, {3, 2}
        };

        var result = problem.findOrder(numCourses, prerequisites);

        assertEquals(4, result.length);
//        assertEquals(0, result[0]);
//        assertEquals(2, result[1]);
//        assertEquals(1, result[2]);
//        assertEquals(3, result[3]);

        assertEquals(0, result[0]);
        assertEquals(1, result[1]);
        assertEquals(2, result[2]);
        assertEquals(3, result[3]);
    }

    @Test
    void example3() {
        /*
        Input: numCourses = 1, prerequisites = []
        Output: [0]
         */
        int numCourses = 1;
        int[][] prerequisites = new int[][]{
        };

        var result = problem.findOrder(numCourses, prerequisites);

        assertEquals(1, result.length);
        assertEquals(0, result[0]);
    }
}
