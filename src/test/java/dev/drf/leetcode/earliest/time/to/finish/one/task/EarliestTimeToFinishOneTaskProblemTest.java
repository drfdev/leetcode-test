package dev.drf.leetcode.earliest.time.to.finish.one.task;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EarliestTimeToFinishOneTaskProblemTest {
    private final EarliestTimeToFinishOneTaskProblem problem = new EarliestTimeToFinishOneTaskProblem();

    @Test
    void example1() {
        // Input: tasks = [[1,6],[2,3]]
        // Output: 5
        int[][] tasks = {
                {1, 6}, {2, 3}
        };

        int out = problem.earliestTime(tasks);

        assertEquals(5, out);
    }

    @Test
    void example2() {
        // Input: tasks = [[100,100],[100,100],[100,100]]
        // Output: 200
        int[][] tasks = {
                {100, 100}, {100, 100}, {100, 100}
        };

        int out = problem.earliestTime(tasks);

        assertEquals(200, out);
    }
}
