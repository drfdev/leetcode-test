package dev.drf.leetcode.task.scheduler;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaskSchedulerProblemTest {
    private final TaskSchedulerProblem problem = new TaskSchedulerProblem();

    @Test
    void example1() {
        /*
        Input: tasks = ["A","A","A","B","B","B"], n = 2
        Output: 8
         */
        char[] tasks = new char[]{
                'A', 'A', 'A', 'B', 'B', 'B'
        };
        int n = 2;

        var result = problem.leastInterval(tasks, n);

        assertEquals(8, result);
    }

    @Test
    void example2() {
        /*
        Input: tasks = ["A","A","A","B","B","B"], n = 0
        Output: 6
         */
        char[] tasks = new char[]{
                'A', 'A', 'A', 'B', 'B', 'B'
        };
        int n = 0;

        var result = problem.leastInterval(tasks, n);

        assertEquals(6, result);
    }
}
